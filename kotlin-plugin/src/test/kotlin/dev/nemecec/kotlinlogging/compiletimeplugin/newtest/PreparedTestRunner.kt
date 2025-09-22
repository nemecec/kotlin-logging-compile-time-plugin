package dev.nemecec.kotlinlogging.compiletimeplugin.newtest

import dev.nemecec.kotlinlogging.compiletimeplugin.ExecutedTest
import dev.nemecec.kotlinlogging.compiletimeplugin.TestLoggingLevel
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.Extension
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolver
import org.junit.jupiter.api.extension.TestTemplateInvocationContext
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider
import java.util.stream.Stream

//class PreparedTestRunner(private val executedTest: ExecutedTest?) {
interface PreparedTestRunner {

  fun run()

}

class PreparedTestRunnerContextProvider : TestTemplateInvocationContextProvider {
  override fun supportsTestTemplate(context: ExtensionContext?) = true

  override fun provideTestTemplateInvocationContexts(context: ExtensionContext?): Stream<TestTemplateInvocationContext?>? {
    return Stream.of(
      object: TestTemplateInvocationContext {
        override fun getDisplayName(invocationIndex: Int) = "test"
        override fun getAdditionalExtensions(): List<Extension> {
          return listOf(
            //TODO replace with a real implementation. Better not expose all of this to the user
            NamedParameterResolver("withClass", Boolean::class, true),
            NamedParameterResolver("withLogLevel", TestLoggingLevel::class, TestLoggingLevel.INFO),
            NamedParameterResolver("withMarker", Boolean::class, true),
            NamedParameterResolver("withThrowable", Boolean::class, true),
          )
        }

        //listOf(PreparedTestRunner(executedTest = context!!.getStore(ExtensionContext.Namespace.GLOBAL).get("preparedTest") as ExecutedTest))
      },
    )
  }

}