package dev.nemecec.kotlinlogging.compiletimeplugin

import org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder
import org.jetbrains.kotlin.ir.IrElement
import org.jetbrains.kotlin.ir.builders.irCall
import org.jetbrains.kotlin.ir.builders.irString
import org.jetbrains.kotlin.ir.expressions.IrCall
import org.jetbrains.kotlin.ir.expressions.IrConst
import org.jetbrains.kotlin.ir.expressions.IrExpression
import org.jetbrains.kotlin.ir.expressions.IrStringConcatenation
import org.jetbrains.kotlin.ir.symbols.UnsafeDuringIrConstructionAPI

class PlaceholderReplacer(
  private val typesHelper: KotlinLoggingIrGenerationExtension.TypesHelper,
  private val builder: DeclarationIrBuilder,
) {
  data class ReplaceResult(val newExpression: IrExpression, val newArgIndex: Int)

  @OptIn(UnsafeDuringIrConstructionAPI::class)
  fun replace(
    msgExp: IrExpression,
    valueArguments: List<IrElement?>,
    currentArgIndex: Int,
    placeholder: String,
  ): ReplaceResult {
    var newArgIndex = currentArgIndex

    when (msgExp) {
      is IrConst -> {
        val value = msgExp.value
        if (value is String && value.contains(placeholder)) {
          val (newExpression, argIndexAfterReplace) =
            replacePlaceholdersInStringConstant(value, valueArguments, newArgIndex, placeholder)
          return ReplaceResult(newExpression!!, argIndexAfterReplace)
        }
      }
      is IrCall -> {
        val dispatchResult =
          replace(msgExp.dispatchReceiver!!, valueArguments, newArgIndex, placeholder)
        msgExp.dispatchReceiver = dispatchResult.newExpression
        newArgIndex = dispatchResult.newArgIndex
        msgExp.regularArguments.forEachIndexed { index, valueArgument ->
          val argResult = replace(valueArgument!!, valueArguments, newArgIndex, placeholder)
          msgExp.setRegularArgument(index, argResult.newExpression)
          newArgIndex = argResult.newArgIndex
        }
      }
      is IrStringConcatenation -> {
        msgExp.arguments.forEachIndexed { index, argument ->
          val argResult = replace(argument, valueArguments, newArgIndex, placeholder)
          msgExp.arguments[index] = argResult.newExpression
          newArgIndex = argResult.newArgIndex
        }
      }
      else -> {
        // Other cases do not require any post-processing, return as-is
      }
    }
    return ReplaceResult(msgExp, newArgIndex)
  }

  private fun replacePlaceholdersInStringConstant(
    msg: String,
    valueArguments: List<IrElement?>,
    currentArgIndex: Int,
    placeholder: String,
  ): Pair<IrExpression?, Int> {
    val plusFunctionSymbol = typesHelper.context.irBuiltIns.extensionStringPlus
    var newArgIndex = currentArgIndex
    if (msg == placeholder) {
      return Pair(
        if (valueArguments.size > newArgIndex) valueArguments[newArgIndex++] as IrExpression
        else builder.irString(placeholder),
        newArgIndex,
      )
    }
    val msgParts = msg.split(placeholder)
    val newExpression =
      msgParts.foldIndexed(null as IrExpression?) { index, accumulator, msgPart ->
        if (index < msgParts.size - 1) {
          val arg =
            if (valueArguments.size > newArgIndex) valueArguments[newArgIndex++]
            else builder.irString(placeholder)
          if (index == 0) {
            // first element
            builder.irCall(plusFunctionSymbol).apply {
              insertDispatchReceiver(builder.irString(msgPart))
              setRegularArgument(0, arg!! as IrExpression)
            }
          } else {
            // in-between elements
            builder.irCall(plusFunctionSymbol).apply {
              insertDispatchReceiver(accumulator)
              setRegularArgument(
                0,
                builder.irCall(plusFunctionSymbol).apply {
                  insertDispatchReceiver(builder.irString(msgPart))
                  setRegularArgument(0, arg!! as IrExpression)
                },
              )
            }
          }
        } else {
          // last element
          builder.irCall(plusFunctionSymbol).apply {
            insertDispatchReceiver(accumulator)
            setRegularArgument(0, builder.irString(msgPart))
          }
        }
      }
    return Pair(newExpression, newArgIndex)
  }
}
