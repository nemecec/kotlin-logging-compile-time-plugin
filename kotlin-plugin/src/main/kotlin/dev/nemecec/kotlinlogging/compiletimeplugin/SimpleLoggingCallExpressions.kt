package dev.nemecec.kotlinlogging.compiletimeplugin

import com.javiersc.kotlin.compiler.extensions.ir.toIrGetEnumValue
import org.jetbrains.kotlin.backend.common.ScopeWithIr
import org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder
import org.jetbrains.kotlin.ir.builders.irCall
import org.jetbrains.kotlin.ir.expressions.IrCall
import org.jetbrains.kotlin.ir.expressions.IrExpression
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression
import org.jetbrains.kotlin.ir.expressions.IrGetEnumValue
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
  private fun getLevelEnumExpression(levelString: String): IrGetEnumValue {
    val levelEnumEntry = typesHelper.levelClassSymbol.owner.enumEntry(levelString)
    val levelExpression =
      typesHelper.levelClassSymbol.createType(false, listOf()).toIrGetEnumValue(levelEnumEntry!!)
    return levelExpression
  }

  @OptIn(UnsafeDuringIrConstructionAPI::class)
  fun getExpressions(originalLogExpression: IrCall): SimpleLoggingCallExpressions {
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
}
