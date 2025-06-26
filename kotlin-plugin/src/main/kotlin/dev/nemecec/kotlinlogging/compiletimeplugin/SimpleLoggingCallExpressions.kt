package dev.nemecec.kotlinlogging.compiletimeplugin

import com.javiersc.kotlin.compiler.extensions.ir.toIrGetEnumValue
import org.jetbrains.kotlin.backend.common.ScopeWithIr
import org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder
import org.jetbrains.kotlin.ir.builders.irCall
import org.jetbrains.kotlin.ir.expressions.IrCall
import org.jetbrains.kotlin.ir.expressions.IrExpression
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression
import org.jetbrains.kotlin.ir.expressions.IrGetEnumValue
import org.jetbrains.kotlin.ir.expressions.IrVararg
import org.jetbrains.kotlin.ir.symbols.UnsafeDuringIrConstructionAPI
import org.jetbrains.kotlin.ir.types.classifierOrFail
import org.jetbrains.kotlin.ir.types.createType
import org.jetbrains.kotlin.util.capitalizeDecapitalize.toUpperCaseAsciiOnly

data class SimpleLoggingCallExpressions(
  val levelExpression: IrExpression,
  val markerExpression: IrExpression? = null,
  val messageExpression: IrExpression,
  val causeExpression: IrExpression? = null,
  val messageTemplate: String,
)

class SimpleLoggingCallExpressionsBuilder(
  private val typesHelper: KotlinLoggingIrGenerationExtension.TypesHelper,
  private val currentScope: ScopeWithIr,
  private val sourceFile: SourceFile,
) {

  @OptIn(UnsafeDuringIrConstructionAPI::class)
  fun getExpressions(originalLogExpression: IrCall) =
    if (
      originalLogExpression.symbol.owner.regularParameters.last().type.classifierOrFail ==
        typesHelper.messageBuilderLambdaType.classifierOrFail
    ) {
      getExpressionsFromCodeWithMessageBuilder(originalLogExpression)
    } else {
      getExpressionsFromCodeWithMessage(originalLogExpression)
    }

  @OptIn(UnsafeDuringIrConstructionAPI::class)
  private fun getExpressionsFromCodeWithMessage(
    originalLogExpression: IrCall
  ): SimpleLoggingCallExpressions {
    val symbol = currentScope.scope.scopeOwnerSymbol
    val builder =
      DeclarationIrBuilder(
        typesHelper.context,
        symbol,
        originalLogExpression.startOffset,
        originalLogExpression.endOffset,
      )
    val function = originalLogExpression.symbol.owner
    val functionParameters = function.regularParameters
    var markerExpression: IrExpression? = null
    val messageExpression: IrExpression?
    val originalMessageExpression: IrExpression?
    var causeExpression: IrExpression? = null
    if (
      functionParameters.last().type.classifierOrFail == typesHelper.throwableType.classifierOrFail
    ) {
      // arguments: message, throwable
      // arguments: marker, message, throwable
      causeExpression = originalLogExpression.regularArguments.last()
    }
    when (functionParameters.first().type.classifierOrFail) {
      typesHelper.markerType.classifierOrFail -> {
        markerExpression = originalLogExpression.getRegularArgument(0)
        originalMessageExpression = originalLogExpression.getRegularArgument(1)
        if (causeExpression != null) {
          // arguments: marker, message, throwable
          messageExpression = originalLogExpression.getRegularArgument(1)
        } else {
          if (functionParameters.size == 2) {
            // arguments: marker, message
            messageExpression = originalLogExpression.getRegularArgument(1)
          } else {
            // arguments: marker, message, arg - not supported by KLogger API
            // arguments: marker, message, arg1, arg2 - not supported by KLogger API
            // arguments: marker, message, vararg - not supported by KLogger API
            val messageExpressionResult =
              createMessageExpressionByReplacingPlaceholders(builder, originalLogExpression, 1)
            messageExpression = messageExpressionResult.newExpression
            causeExpression = messageExpressionResult.causeExpression
          }
        }
      }
      typesHelper.stringType.classifierOrFail -> {
        originalMessageExpression = originalLogExpression.getRegularArgument(0)
        if (causeExpression != null || functionParameters.size == 1) {
          // arguments: message
          // arguments: message, throwable
          messageExpression = originalLogExpression.getRegularArgument(0)
        } else {
          // arguments: message, arg - not supported by KLogger API
          // arguments: message, arg1, arg2 - not supported by KLogger API
          // arguments: message, vararg - not supported by KLogger API
          val messageExpressionResult =
            createMessageExpressionByReplacingPlaceholders(builder, originalLogExpression, 0)
          messageExpression = messageExpressionResult.newExpression
          causeExpression = messageExpressionResult.causeExpression
        }
      }
      else ->
        error("Unsupported log statement first argument type: ${functionParameters.first().type}")
    }
    return SimpleLoggingCallExpressions(
      levelExpression = getLevelEnumExpression(function.name.asString().toUpperCaseAsciiOnly()),
      markerExpression = markerExpression,
      messageExpression = messageExpression!!,
      causeExpression = causeExpression,
      messageTemplate = sourceFile.getText(originalMessageExpression!!),
    )
  }

  @OptIn(UnsafeDuringIrConstructionAPI::class)
  private fun getLevelEnumExpression(levelString: String): IrGetEnumValue {
    val levelEnumEntry = typesHelper.levelClassSymbol.owner.enumEntry(levelString)
    val levelExpression =
      typesHelper.levelClassSymbol.createType(false, listOf()).toIrGetEnumValue(levelEnumEntry!!)
    return levelExpression
  }

  @OptIn(UnsafeDuringIrConstructionAPI::class)
  private fun getExpressionsFromCodeWithMessageBuilder(
    originalLogExpression: IrCall
  ): SimpleLoggingCallExpressions {
    // arguments: messageBuilder
    // arguments: cause, messageBuilder
    // arguments: cause, marker, messageBuilder
    // arguments: marker, messageBuilder
    // arguments: marker, cause, messageBuilder
    val symbol = currentScope.scope.scopeOwnerSymbol
    val builder =
      DeclarationIrBuilder(
        typesHelper.context,
        symbol,
        originalLogExpression.startOffset,
        originalLogExpression.endOffset,
      )
    val function = originalLogExpression.symbol.owner
    var markerExpression: IrExpression? = null
    var messageExpression: IrExpression? = null
    var causeExpression: IrExpression? = null
    val originalMessageExpression = originalLogExpression.regularArguments.last()

    val messageTemplate =
      if (originalMessageExpression is IrFunctionExpression)
        originalMessageExpression.function.body?.let { sourceFile.getText(it) }!!
      else sourceFile.getText(originalMessageExpression!!)

    function.regularParameters.forEachIndexed { index, parameter ->
      if (
        parameter.type.classifierOrFail == typesHelper.messageBuilderLambdaType.classifierOrFail
      ) {
        messageExpression =
          builder.irCall(typesHelper.toStringFunctionSymbol).apply {
            insertExtensionReceiver(originalLogExpression.getRegularArgument(index))
          }
      } else {
        if (parameter.type.classifierOrFail == typesHelper.throwableType.classifierOrFail) {
          causeExpression = originalLogExpression.getRegularArgument(index)
        } else {
          if (parameter.type.classifierOrFail == typesHelper.markerType.classifierOrFail) {
            markerExpression = originalLogExpression.getRegularArgument(index)
          }
        }
      }
    }
    return SimpleLoggingCallExpressions(
      levelExpression = getLevelEnumExpression(function.name.asString().toUpperCaseAsciiOnly()),
      markerExpression = markerExpression,
      messageExpression = messageExpression!!,
      causeExpression = causeExpression,
      messageTemplate = messageTemplate,
    )
  }

  data class MessageExpressionResult(
    val newExpression: IrExpression,
    val causeExpression: IrExpression?,
  )

  private fun createMessageExpressionByReplacingPlaceholders(
    builder: DeclarationIrBuilder,
    originalLogExpression: IrCall,
    messageArgumentIndex: Int,
  ): MessageExpressionResult {
    val replaceResult: PlaceholderReplacer.ReplaceResult
    val placeholderReplacer = PlaceholderReplacer(typesHelper, builder)
    var causeExpression: IrExpression? = null
    if (originalLogExpression.getRegularArgument(messageArgumentIndex + 1) is IrVararg) {
      val varArgs =
        (originalLogExpression.getRegularArgument(messageArgumentIndex + 1) as IrVararg)
          .elements
          .toList()
      replaceResult =
        placeholderReplacer.replace(
          originalLogExpression.getRegularArgument(messageArgumentIndex)!!,
          varArgs,
          0,
          "{}",
        )
      if (replaceResult.newArgIndex < varArgs.size) {
        causeExpression =
          builder.irCall(typesHelper.castToThrowableFunctionSymbol).apply {
            insertExtensionReceiver(varArgs.last() as IrExpression?)
          }
      }
    } else {
      replaceResult =
        placeholderReplacer.replace(
          originalLogExpression.getRegularArgument(messageArgumentIndex)!!,
          originalLogExpression.regularArguments,
          messageArgumentIndex + 1,
          "{}",
        )
      if (replaceResult.newArgIndex < originalLogExpression.regularArguments.size) {
        causeExpression =
          builder.irCall(typesHelper.castToThrowableFunctionSymbol).apply {
            insertExtensionReceiver(originalLogExpression.regularArguments.last())
          }
      }
    }
    return MessageExpressionResult(replaceResult.newExpression, causeExpression)
  }
}
