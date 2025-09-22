package dev.nemecec.kotlinlogging.compiletimeplugin.newtest

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolver
import kotlin.reflect.KClass

class NamedParameterResolver<T : Any>(
  private val parameterName: String,
  private val parameterType: KClass<T>,
  private val parameterValue: T
) : ParameterResolver {

  override fun supportsParameter(
    parameterContext: ParameterContext,
    extensionContext: ExtensionContext
  ) =
    parameterContext.parameter.type.isAssignableFrom(parameterType.java) && parameterContext.parameter.name == parameterName

  override fun resolveParameter(
    parameterContext: ParameterContext?,
    extensionContext: ExtensionContext?
  ) = parameterValue

}