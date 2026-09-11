/*
 * Copyright (C) Javier Segovia Córdoba
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Adapted from https://github.com/JavierSegoviaCordoba/kotlin-compiler-extensions. The published
// helpers are inline, so their bodies carry the compiler API of the Kotlin version that the library
// was built against into this plugin. That breaks whenever the two versions differ, and the library
// releases separately from Kotlin. These copies compile against the Kotlin version of this build.

package dev.nemecec.kotlinlogging.compiletimeplugin

import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities
import org.jetbrains.kotlin.descriptors.DescriptorVisibility
import org.jetbrains.kotlin.descriptors.Modality
import org.jetbrains.kotlin.descriptors.SourceElement
import org.jetbrains.kotlin.ir.UNDEFINED_OFFSET
import org.jetbrains.kotlin.ir.declarations.IrConstructor
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin
import org.jetbrains.kotlin.ir.declarations.IrEnumEntry
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction
import org.jetbrains.kotlin.ir.expressions.IrBlockBody
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall
import org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression
import org.jetbrains.kotlin.ir.expressions.IrGetEnumValue
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin
import org.jetbrains.kotlin.ir.expressions.impl.IrConstructorCallImpl
import org.jetbrains.kotlin.ir.expressions.impl.IrFunctionExpressionImpl
import org.jetbrains.kotlin.ir.expressions.impl.IrGetEnumValueImpl
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol
import org.jetbrains.kotlin.ir.symbols.UnsafeDuringIrConstructionAPI
import org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl
import org.jetbrains.kotlin.ir.types.IrType
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.name.SpecialNames
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedContainerSource

internal fun IrPluginContext.createIrBlockBody(
  startOffset: Int = UNDEFINED_OFFSET,
  endOffset: Int = UNDEFINED_OFFSET,
  initializer: IrBlockBody.() -> Unit,
): IrBlockBody = irFactory.createBlockBody(startOffset, endOffset).apply(initializer)

@Suppress("LongParameterList")
internal fun IrPluginContext.createLambdaIrSimpleFunction(
  startOffset: Int = UNDEFINED_OFFSET,
  endOffset: Int = UNDEFINED_OFFSET,
  origin: IrDeclarationOrigin = IrDeclarationOrigin.LOCAL_FUNCTION_FOR_LAMBDA,
  name: Name = SpecialNames.ANONYMOUS,
  visibility: DescriptorVisibility = DescriptorVisibilities.LOCAL,
  isInline: Boolean = false,
  isExpect: Boolean = false,
  returnType: IrType = irBuiltIns.nothingType,
  modality: Modality = Modality.FINAL,
  symbol: IrSimpleFunctionSymbol = IrSimpleFunctionSymbolImpl(),
  isTailrec: Boolean = false,
  isSuspend: Boolean = false,
  isOperator: Boolean = false,
  isInfix: Boolean = false,
  isExternal: Boolean = false,
  containerSource: DeserializedContainerSource? = null,
  isFakeOverride: Boolean = origin == IrDeclarationOrigin.FAKE_OVERRIDE,
  block: IrSimpleFunction.() -> Unit = {},
): IrSimpleFunction =
  irFactory
    .createSimpleFunction(
      startOffset = startOffset,
      endOffset = endOffset,
      origin = origin,
      name = name,
      visibility = visibility,
      isInline = isInline,
      isExpect = isExpect,
      returnType = returnType,
      modality = modality,
      symbol = symbol,
      isTailrec = isTailrec,
      isSuspend = isSuspend,
      isOperator = isOperator,
      isInfix = isInfix,
      isExternal = isExternal,
      containerSource = containerSource,
      isFakeOverride = isFakeOverride,
    )
    .apply(block)

internal fun createIrFunctionExpression(
  startOffset: Int = UNDEFINED_OFFSET,
  endOffset: Int = UNDEFINED_OFFSET,
  type: IrType,
  function: IrSimpleFunction,
  origin: IrStatementOrigin,
): IrFunctionExpression =
  IrFunctionExpressionImpl(
    startOffset = startOffset,
    endOffset = endOffset,
    type = type,
    function = function,
    origin = origin,
  )

@OptIn(UnsafeDuringIrConstructionAPI::class)
internal fun IrConstructor.toIrConstructorCall(
  startOffset: Int = UNDEFINED_OFFSET,
  endOffset: Int = UNDEFINED_OFFSET,
  symbol: IrConstructorSymbol = this.symbol,
  type: IrType = symbol.owner.returnType,
  typeArgumentsCount: Int = symbol.owner.typeParameters.size,
  origin: IrStatementOrigin? = null,
  source: SourceElement = SourceElement.NO_SOURCE,
  block: IrFunctionAccessExpression.() -> Unit = {},
): IrConstructorCall =
  IrConstructorCallImpl(
      startOffset = startOffset,
      endOffset = endOffset,
      type = type,
      symbol = symbol,
      typeArgumentsCount = typeArgumentsCount,
      constructorTypeArgumentsCount = typeArgumentsCount,
      origin = origin,
      source = source,
    )
    .apply(block)

internal fun IrType.toIrGetEnumValue(enumEntry: IrEnumEntry): IrGetEnumValue =
  IrGetEnumValueImpl(
    startOffset = enumEntry.startOffset,
    endOffset = enumEntry.endOffset,
    type = this,
    symbol = enumEntry.symbol,
  )
