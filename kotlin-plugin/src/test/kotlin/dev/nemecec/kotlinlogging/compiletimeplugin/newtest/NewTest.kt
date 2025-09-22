package dev.nemecec.kotlinlogging.compiletimeplugin.newtest

import dev.nemecec.kotlinlogging.compiletimeplugin.FeatureFlag
import dev.nemecec.kotlinlogging.compiletimeplugin.LogStatement
import dev.nemecec.kotlinlogging.compiletimeplugin.MARKER_PLACEHOLDER
import dev.nemecec.kotlinlogging.compiletimeplugin.THROWABLE_PLACEHOLDER
import dev.nemecec.kotlinlogging.compiletimeplugin.TestDefinitionBuilder
import dev.nemecec.kotlinlogging.compiletimeplugin.TestLoggingLevel

@KotlinCompilerTests(
  [
    FeatureFlag.DEFAULT,
    FeatureFlag.DISABLE_ALL,
    FeatureFlag.DISABLE_TRANSFORMING_DEPRECATED_API,
    FeatureFlag.DISABLE_TRANSFORMING_THROWING_CATCHING_API,
    FeatureFlag.DISABLE_TRANSFORMING_ENTRY_EXIT_API,
    FeatureFlag.DISABLE_COLLECTING_CALL_SITE_INFORMATION,
  ]
)
class NewTest(private val featureFlag: FeatureFlag?, private val collector: TestCallbackCollector) {

  fun test(init: TestDefinitionBuilder.() -> Unit) =
    collector.call(TestDefinitionBuilder().apply(init).build())

  @KotlinCompilerTest
  fun test(withClass: Boolean, withLogLevel: TestLoggingLevel, withMarker: Boolean, withThrowable: Boolean) {
    println("test: $featureFlag")
    test {
      code {
        useClass = withClass
        useThrowable = withThrowable
        useMarker = withMarker
        logStatement =
          LogStatement(
            funName = withLogLevel.levelName,
            arguments = listOf(THROWABLE_PLACEHOLDER, MARKER_PLACEHOLDER),
            lastArgumentLambda = """ "${withLogLevel.levelName} messageBuilder" """,
          )
      }
      expect {
        loggedEvent {
          level = withLogLevel
          message = "\"${withLogLevel.levelName} messageBuilder\""
          formattedMessage = "${withLogLevel.levelName} messageBuilder"
          hasMarker = withMarker
          hasThrowable = withThrowable
        }
      }
    }
  }

  @KotlinCompilerTest
  fun test2(withClass: Boolean, withLogLevel: TestLoggingLevel, withMarker: Boolean, withThrowable: Boolean) {
    println("test2: $featureFlag")
    test {
      code {
        useClass = withClass
        useThrowable = withThrowable
        useMarker = withMarker
        logStatement =
          LogStatement(
            funName = withLogLevel.levelName,
            arguments = listOf(THROWABLE_PLACEHOLDER, MARKER_PLACEHOLDER),
            lastArgumentLambda = """ "${withLogLevel.levelName} messageBuilder" """,
          )
      }
      expect {
        loggedEvent {
          level = withLogLevel
          message = "\"${withLogLevel.levelName} messageBuilder\""
          formattedMessage = "${withLogLevel.levelName} messageBuilder"
          hasMarker = withMarker
          hasThrowable = withThrowable
        }
      }
    }
  }

}
