package dev.nemecec.kotlinlogging.compiletimeplugin

import io.github.oshai.kotlinlogging.KLogger
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeAsciiOnly
import org.jetbrains.kotlin.util.capitalizeDecapitalize.toUpperCaseAsciiOnly
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicContainer
import org.junit.jupiter.api.DynamicNode
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

const val MARKER_PLACEHOLDER = "{marker}"
const val MARKER_VARIABLE_NAME = "marker"
const val THROWABLE_PLACEHOLDER = "{throwable}"
const val THROWABLE_VARIABLE_NAME = "throwable"
const val EXCEPTION_MESSAGE = "expected!"

class KotlinLoggingIrGenerationExtensionTest {

  private val testDefinitionsTemplate = rootCollection {
    label = "definitions"
    filename = "definitions"
    sequenceOf(true, false).forEach { withClass ->
      collection {
        label = "with class=$withClass"
        filename = "class-$withClass"
        collection {
          label = "entry/exit API"
          filename = "entry-exit-$withClass"
          featureFlagExpectationAdjuster {
            featureFlags(FeatureFlag.DISABLE_TRANSFORMING_ENTRY_EXIT_API)
            adjuster {
              loggedEvent {
                message = formattedMessage
                callerDataFirstElement = null
              }
            }
          }
          test {
            code {
              useClass = withClass
              useThrowable = false
              useMarker = false
              initCode = "val argument1 = 42; val argument2 = true"
              logStatement =
                LogStatement(funName = "entry", arguments = listOf("argument1", "argument2"))
            }
            expect {
              loggedEvent {
                level = TestLoggingLevel.TRACE
                message = "entry(argument1, argument2)"
                formattedMessage = "entry(42, true)"
                hasMarker = false
                hasThrowable = false
              }
            }
          }
          test {
            code {
              useClass = withClass
              useThrowable = false
              useMarker = false
              initCode = "val resultValue = 42"
              funReturnType = Int::class
              logStatement = LogStatement(funName = "exit", arguments = listOf("resultValue"))
            }
            expect {
              returnedValue = 42
              loggedEvent {
                level = TestLoggingLevel.TRACE
                message = "exit(resultValue)"
                formattedMessage = "exit(42)"
                hasMarker = false
                hasThrowable = false
              }
            }
          }
          test {
            code {
              useClass = withClass
              useThrowable = false
              useMarker = false
              logStatement = LogStatement(funName = "exit")
            }
            expect {
              loggedEvent {
                level = TestLoggingLevel.TRACE
                message = "exit"
                formattedMessage = "exit"
                hasMarker = false
                hasThrowable = false
              }
            }
          }
        }
        collection {
          label = "throwing/catching API"
          filename = "throwing-catching"
          featureFlagExpectationAdjuster {
            featureFlags(FeatureFlag.DISABLE_TRANSFORMING_THROWING_CATCHING_API)
            adjuster {
              loggedEvent {
                message = formattedMessage
                callerDataFirstElement = null
              }
            }
          }
          test {
            code {
              useClass = withClass
              useThrowable = true
              useMarker = false
              logStatement =
                LogStatement(funName = "throwing", arguments = listOf(THROWABLE_PLACEHOLDER))
              throwReturnValueFromLogStatement = true
            }
            expect {
              thrownExceptionToString = "java.lang.Exception: expected!"
              loggedEvent {
                level = TestLoggingLevel.ERROR
                message = "throwing(throwable)"
                formattedMessage = "throwing(java.lang.Exception: expected!)"
                hasMarker = false
                hasThrowable = true
              }
            }
          }
          test {
            code {
              useClass = withClass
              useThrowable = true
              useMarker = false
              logStatement =
                LogStatement(funName = "catching", arguments = listOf(THROWABLE_PLACEHOLDER))
            }
            expect {
              loggedEvent {
                level = TestLoggingLevel.ERROR
                message = "catching(throwable)"
                formattedMessage = "catching(java.lang.Exception: expected!)"
                hasMarker = false
                hasThrowable = true
              }
            }
          }
        }
        TestLoggingLevel.entries.forEach { withLogLevel ->
          collection {
            label = "with log level=${withLogLevel.levelEnum}"
            filename = "log-level-${withLogLevel.levelName}"
            sequenceOf(true, false).forEach { withThrowable ->
              collection {
                label = "with throwable=$withThrowable"
                filename = "throwable-$withThrowable"
                sequenceOf(true, false).forEach { withMarker ->
                  collection {
                    label = "with marker=$withMarker"
                    filename = "marker-$withMarker"
                    test {
                      skip =
                        (withMarker &&
                          !withThrowable) // skip variant with only marker and message builder --
                      // that is handled in deprecated API container
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
                    test {
                      skip =
                        (withMarker &&
                          !withThrowable) // skip variant with only marker and message builder --
                      // that is handled in deprecated API container
                      code {
                        useClass = withClass
                        useThrowable = withThrowable
                        useMarker = withMarker
                        initCode = "val i = 42"
                        logStatement =
                          LogStatement(
                            funName = withLogLevel.levelName,
                            arguments = listOf(THROWABLE_PLACEHOLDER, MARKER_PLACEHOLDER),
                            lastArgumentLambda =
                              """ "${withLogLevel.levelName} messageBuilder ${expression("i")}" """,
                          )
                      }
                      expect {
                        loggedEvent {
                          level = withLogLevel
                          message =
                            "\"${withLogLevel.levelName} messageBuilder ${expression("i")}\""
                          formattedMessage = "${withLogLevel.levelName} messageBuilder 42"
                          hasMarker = withMarker
                          hasThrowable = withThrowable
                        }
                      }
                    }
                    test {
                      skip =
                        (withMarker &&
                          !withThrowable) // skip variant with only marker and message builder --
                      // that is handled in deprecated API container
                      code {
                        useClass = withClass
                        useThrowable = withThrowable
                        useMarker = withMarker
                        initCode = "val i = 42"
                        logStatement =
                          LogStatement(
                            funName = withLogLevel.levelName,
                            arguments = listOf(THROWABLE_PLACEHOLDER, MARKER_PLACEHOLDER),
                            lastArgumentLambda =
                              """ "${withLogLevel.levelName} messageBuilder ${expression("i")} ${expression("helper()")}" """,
                          )
                        extraMethodCode = """fun helper() = "Hello!""""
                      }
                      expect {
                        loggedEvent {
                          level = withLogLevel
                          message =
                            "\"${withLogLevel.levelName} messageBuilder ${expression("i")} ${expression("helper()")}\""
                          formattedMessage = "${withLogLevel.levelName} messageBuilder 42 Hello!"
                          hasMarker = withMarker
                          hasThrowable = withThrowable
                        }
                      }
                    }
                    test {
                      skip =
                        (withMarker &&
                          !withThrowable) // skip variant with only marker and message builder --
                      // that is handled in deprecated API container
                      code {
                        useClass = withClass
                        useThrowable = withThrowable
                        useMarker = withMarker
                        initCode =
                          "val messageLambda: () -> Any = { \"${withLogLevel.levelName} messageBuilder\" }"
                        logStatement =
                          LogStatement(
                            funName = withLogLevel.levelName,
                            arguments =
                              listOf(THROWABLE_PLACEHOLDER, MARKER_PLACEHOLDER, "messageLambda"),
                          )
                      }
                      expect {
                        loggedEvent {
                          level = withLogLevel
                          message = "messageLambda"
                          formattedMessage = "${withLogLevel.levelName} messageBuilder"
                          hasMarker = withMarker
                          hasThrowable = withThrowable
                        }
                      }
                    }
                    collection {
                      label = "deprecated ${KLogger::class.simpleName} API"
                      filename = "deprecated-${KLogger::class.simpleName}"
                      featureFlagExpectationAdjuster {
                        featureFlags(FeatureFlag.DISABLE_TRANSFORMING_DEPRECATED_API)
                        adjuster {
                          loggedEvent {
                            message = formattedMessage
                            callerDataFirstElement = null
                          }
                        }
                      }
                      test {
                        skip = !withMarker // skip variants without marker -- those are handled in
                        // non-deprecated API tests
                        code {
                          useClass = withClass
                          useThrowable = withThrowable
                          useMarker = withMarker
                          logStatement =
                            LogStatement(
                              funName = withLogLevel.levelName,
                              arguments = listOf(MARKER_PLACEHOLDER, THROWABLE_PLACEHOLDER),
                              lastArgumentLambda =
                                """ "${withLogLevel.levelName} messageBuilder" """,
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
                      test {
                        skip = !withMarker // skip variants without marker -- those are handled in
                        // non-deprecated API tests
                        code {
                          useClass = withClass
                          useThrowable = withThrowable
                          useMarker = withMarker
                          initCode = "val i = 42"
                          logStatement =
                            LogStatement(
                              funName = withLogLevel.levelName,
                              arguments = listOf(MARKER_PLACEHOLDER, THROWABLE_PLACEHOLDER),
                              lastArgumentLambda =
                                """ "${withLogLevel.levelName} messageBuilder ${expression("i")}" """,
                            )
                        }
                        expect {
                          loggedEvent {
                            level = withLogLevel
                            message =
                              "\"${withLogLevel.levelName} messageBuilder ${expression("i")}\""
                            formattedMessage = "${withLogLevel.levelName} messageBuilder 42"
                            hasMarker = withMarker
                            hasThrowable = withThrowable
                          }
                        }
                      }
                      test {
                        skip = !withMarker // skip variants without marker -- those are handled in
                        // non-deprecated API tests
                        code {
                          useClass = withClass
                          useThrowable = withThrowable
                          useMarker = withMarker
                          initCode = "val i = 42"
                          logStatement =
                            LogStatement(
                              funName = withLogLevel.levelName,
                              arguments = listOf(MARKER_PLACEHOLDER, THROWABLE_PLACEHOLDER),
                              lastArgumentLambda =
                                """ "${withLogLevel.levelName} messageBuilder ${expression("i")} ${expression("helper()")}" """,
                            )
                          extraMethodCode = """fun helper() = "Hello!""""
                        }
                        expect {
                          loggedEvent {
                            level = withLogLevel
                            message =
                              "\"${withLogLevel.levelName} messageBuilder ${expression("i")} ${expression("helper()")}\""
                            formattedMessage = "${withLogLevel.levelName} messageBuilder 42 Hello!"
                            hasMarker = withMarker
                            hasThrowable = withThrowable
                          }
                        }
                      }
                      test {
                        code {
                          useClass = withClass
                          useThrowable = withThrowable
                          useMarker = withMarker
                          logStatement =
                            LogStatement(
                              funName = withLogLevel.levelName,
                              arguments =
                                listOf(
                                  MARKER_PLACEHOLDER,
                                  """ "${withLogLevel.levelName} message {}" """.trim(),
                                  THROWABLE_PLACEHOLDER,
                                ),
                            )
                        }
                        expect {
                          loggedEvent {
                            level = withLogLevel
                            message = "\"${withLogLevel.levelName} message {}\""
                            formattedMessage = "${withLogLevel.levelName} message {}"
                            hasMarker = withMarker
                            hasThrowable = withThrowable
                          }
                        }
                      }
                      test {
                        code {
                          useClass = withClass
                          useThrowable = withThrowable
                          useMarker = withMarker
                          initCode =
                            "val message = \"${withLogLevel.levelName} message as variable\""
                          logStatement =
                            LogStatement(
                              funName = withLogLevel.levelName,
                              arguments =
                                listOf(MARKER_PLACEHOLDER, "message", THROWABLE_PLACEHOLDER),
                            )
                        }
                        expect {
                          loggedEvent {
                            level = withLogLevel
                            message = "message"
                            slf4jMessage = "${withLogLevel.levelName} message as variable"
                            formattedMessage = "${withLogLevel.levelName} message as variable"
                            hasMarker = withMarker
                            hasThrowable = withThrowable
                          }
                        }
                      }
                      collection {
                        label = "deprecated API with SLF4J placeholders"
                        filename = "deprecated-slf4j-placeholders"
                        featureFlagExpectationAdjuster {
                          featureFlags(
                            FeatureFlag.DISABLE_ALL,
                            FeatureFlag.DISABLE_TRANSFORMING_DEPRECATED_API,
                          )
                          adjuster {
                            loggedEvent {
                              message = slf4jMessage
                              formattedMessage = slf4jFormattedMessage
                              callerDataFirstElement = null
                              hasThrowable = withThrowable
                            }
                          }
                        }
                        test {
                          code {
                            useClass = withClass
                            useThrowable = withThrowable
                            useMarker = withMarker
                            initCode = "val arg = 42"
                            logStatement =
                              LogStatement(
                                funName = withLogLevel.levelName,
                                arguments =
                                  listOf(
                                    MARKER_PLACEHOLDER,
                                    """ "${withLogLevel.levelName} message {}" """.trim(),
                                    "arg",
                                    THROWABLE_PLACEHOLDER,
                                  ),
                              )
                          }
                          expect {
                            loggedEvent {
                              level = withLogLevel
                              message = "\"${withLogLevel.levelName} message {}\""
                              slf4jMessage = "${withLogLevel.levelName} message {}"
                              formattedMessage = "${withLogLevel.levelName} message 42"
                              hasMarker = withMarker
                              hasThrowable = withThrowable
                            }
                          }
                        }
                        test {
                          code {
                            useClass = withClass
                            useThrowable = withThrowable
                            useMarker = withMarker
                            initCode = "val arg = 42"
                            logStatement =
                              LogStatement(
                                funName = withLogLevel.levelName,
                                arguments =
                                  listOf(
                                    MARKER_PLACEHOLDER,
                                    """ "${withLogLevel.levelName} message with concatenation ${expression("arg")} {}" """
                                      .trim(),
                                    "arg",
                                    THROWABLE_PLACEHOLDER,
                                  ),
                              )
                          }
                          expect {
                            loggedEvent {
                              level = withLogLevel
                              message =
                                "\"${withLogLevel.levelName} message with concatenation ${expression("arg")} {}\""
                              slf4jMessage =
                                "${withLogLevel.levelName} message with concatenation 42 {}"
                              formattedMessage =
                                "${withLogLevel.levelName} message with concatenation 42 42"
                              hasMarker = withMarker
                              hasThrowable = withThrowable
                            }
                          }
                        }
                        test {
                          code {
                            useClass = withClass
                            useThrowable = withThrowable
                            useMarker = withMarker
                            extraImportCode = "import kotlin.time.Duration.Companion.minutes"
                            extraCodeBeforeMethod = "private var arg: Long = 42"
                            logStatement =
                              LogStatement(
                                funName = withLogLevel.levelName,
                                arguments =
                                  listOf(
                                    MARKER_PLACEHOLDER,
                                    """ "${withLogLevel.levelName} with extension function {} interval" """
                                      .trim(),
                                    "arg.minutes",
                                    THROWABLE_PLACEHOLDER,
                                  ),
                              )
                          }
                          expect {
                            loggedEvent {
                              level = withLogLevel
                              message =
                                "\"${withLogLevel.levelName} with extension function {} interval\""
                              slf4jMessage =
                                "${withLogLevel.levelName} with extension function {} interval"
                              formattedMessage =
                                "${withLogLevel.levelName} with extension function 42m interval"
                              hasMarker = withMarker
                              hasThrowable = withThrowable
                            }
                          }
                        }
                        test {
                          code {
                            useClass = withClass
                            useThrowable = withThrowable
                            useMarker = withMarker
                            initCode = "val arg = 42"
                            logStatement =
                              LogStatement(
                                funName = withLogLevel.levelName,
                                arguments =
                                  listOf(
                                    MARKER_PLACEHOLDER,
                                    """ "${withLogLevel.levelName} message {} " + "" + "{}" + "{}" + " abc" + " {}" """
                                      .trim(),
                                    "arg",
                                    "helper()",
                                    THROWABLE_PLACEHOLDER,
                                  ),
                              )
                            extraMethodCode = """fun helper() = "Hello!""""
                          }
                          expect {
                            loggedEvent {
                              level = withLogLevel
                              message =
                                """"${withLogLevel.levelName} message {} " + "" + "{}" + "{}" + " abc" + " {}""""
                              slf4jMessage = "${withLogLevel.levelName} message {} {}{} abc {}"
                              formattedMessage =
                                if (withThrowable)
                                  "${withLogLevel.levelName} message 42 Hello!java.lang.Exception: expected! abc {}"
                                else "${withLogLevel.levelName} message 42 Hello!{} abc {}"
                              slf4jFormattedMessage =
                                "${withLogLevel.levelName} message 42 Hello!{} abc {}"
                              hasMarker = withMarker
                              hasThrowable = false
                            }
                          }
                        }
                        test {
                          code {
                            useClass = withClass
                            useThrowable = withThrowable
                            useMarker = withMarker
                            initCode = "val a = 1; val b = 2"
                            logStatement =
                              LogStatement(
                                funName = withLogLevel.levelName,
                                arguments =
                                  listOf(
                                    MARKER_PLACEHOLDER,
                                    """ "${withLogLevel.levelName} message {}a" + " {}b" + " {}ab" + " ab" """
                                      .trim(),
                                    "a",
                                    "b",
                                    "ab()",
                                    THROWABLE_PLACEHOLDER,
                                  ),
                              )
                            extraMethodCode = """fun ab() = 12"""
                          }
                          expect {
                            loggedEvent {
                              level = withLogLevel
                              message =
                                """"${withLogLevel.levelName} message {}a" + " {}b" + " {}ab" + " ab""""
                              slf4jMessage = "${withLogLevel.levelName} message {}a {}b {}ab ab"
                              formattedMessage = "${withLogLevel.levelName} message 1a 2b 12ab ab"
                              hasMarker = withMarker
                              hasThrowable = withThrowable
                            }
                          }
                        }
                      }
                    }
                    test {
                      code {
                        useClass = withClass
                        useThrowable = withThrowable
                        useMarker = withMarker
                        logStatement =
                          LogStatement(
                            funName = "at${withLogLevel.levelName.capitalizeAsciiOnly()}",
                            arguments = listOf(MARKER_PLACEHOLDER),
                            lastArgumentLambda =
                              """ message="${withLogLevel.levelName} eventBuilder"; cause=$THROWABLE_PLACEHOLDER """,
                          )
                      }
                      expect {
                        loggedEvent {
                          level = withLogLevel
                          message = "\"${withLogLevel.levelName} eventBuilder\""
                          formattedMessage = "${withLogLevel.levelName} eventBuilder"
                          hasMarker = withMarker
                          hasThrowable = withThrowable
                        }
                      }
                    }
                    test {
                      code {
                        useClass = withClass
                        useThrowable = withThrowable
                        useMarker = withMarker
                        initCode = "val i = 42"
                        logStatement =
                          LogStatement(
                            funName = "at${withLogLevel.levelName.capitalizeAsciiOnly()}",
                            arguments = listOf(MARKER_PLACEHOLDER),
                            lastArgumentLambda =
                              """ message="${withLogLevel.levelName} eventBuilder ${expression("i")}"; cause=$THROWABLE_PLACEHOLDER """,
                          )
                      }
                      expect {
                        loggedEvent {
                          level = withLogLevel
                          message = "\"${withLogLevel.levelName} eventBuilder ${expression("i")}\""
                          formattedMessage = "${withLogLevel.levelName} eventBuilder 42"
                          hasMarker = withMarker
                          hasThrowable = withThrowable
                        }
                      }
                    }
                    test {
                      code {
                        useClass = withClass
                        useThrowable = withThrowable
                        useMarker = withMarker
                        initCode = "val i = 42"
                        logStatement =
                          LogStatement(
                            funName = "at${withLogLevel.levelName.capitalizeAsciiOnly()}",
                            arguments = listOf(MARKER_PLACEHOLDER),
                            lastArgumentLambda =
                              """ message="${withLogLevel.levelName} eventBuilder ${expression("i")} ${
                            expression(
                              "helper()"
                            )
                          }"; cause=$THROWABLE_PLACEHOLDER """,
                          )
                        extraMethodCode = """fun helper() = "Hello!""""
                      }
                      expect {
                        loggedEvent {
                          level = withLogLevel
                          message =
                            "\"${withLogLevel.levelName} eventBuilder ${expression("i")} ${expression("helper()")}\""
                          formattedMessage = "${withLogLevel.levelName} eventBuilder 42 Hello!"
                          hasMarker = withMarker
                          hasThrowable = withThrowable
                        }
                      }
                    }
                    test {
                      code {
                        useClass = withClass
                        useThrowable = withThrowable
                        useMarker = withMarker
                        logStatement =
                          LogStatement(
                            funName = "at",
                            arguments =
                              listOf(
                                "Level.${withLogLevel.levelName.toUpperCaseAsciiOnly()}",
                                MARKER_PLACEHOLDER,
                              ),
                            lastArgumentLambda =
                              """ message="${withLogLevel.levelName} eventBuilder"; cause=$THROWABLE_PLACEHOLDER """,
                          )
                      }
                      expect {
                        loggedEvent {
                          level = withLogLevel
                          message = "\"${withLogLevel.levelName} eventBuilder\""
                          formattedMessage = "${withLogLevel.levelName} eventBuilder"
                          hasMarker = withMarker
                          hasThrowable = withThrowable
                        }
                      }
                    }
                    test {
                      code {
                        useClass = withClass
                        useThrowable = withThrowable
                        useMarker = withMarker
                        initCode = "val i = 42"
                        logStatement =
                          LogStatement(
                            funName = "at",
                            arguments =
                              listOf(
                                "Level.${withLogLevel.levelName.toUpperCaseAsciiOnly()}",
                                MARKER_PLACEHOLDER,
                              ),
                            lastArgumentLambda =
                              """ message="${withLogLevel.levelName} eventBuilder ${
                            expression(
                              "i"
                            )
                          }"; cause=$THROWABLE_PLACEHOLDER """,
                          )
                      }
                      expect {
                        loggedEvent {
                          level = withLogLevel
                          message = "\"${withLogLevel.levelName} eventBuilder ${expression("i")}\""
                          formattedMessage = "${withLogLevel.levelName} eventBuilder 42"
                          hasMarker = withMarker
                          hasThrowable = withThrowable
                        }
                      }
                    }
                    test {
                      code {
                        useClass = withClass
                        useThrowable = withThrowable
                        useMarker = withMarker
                        initCode = "val i = 42"
                        logStatement =
                          LogStatement(
                            funName = "at",
                            arguments =
                              listOf(
                                "Level.${withLogLevel.levelName.toUpperCaseAsciiOnly()}",
                                MARKER_PLACEHOLDER,
                              ),
                            lastArgumentLambda =
                              """ message="${withLogLevel.levelName} eventBuilder ${
                            expression(
                              "i"
                            )
                          } ${expression("helper()")}"; cause=$THROWABLE_PLACEHOLDER """,
                          )
                        extraMethodCode = """fun helper() = "Hello!""""
                      }
                      expect {
                        loggedEvent {
                          level = withLogLevel
                          message =
                            "\"${withLogLevel.levelName} eventBuilder ${expression("i")} ${expression("helper()")}\""
                          formattedMessage = "${withLogLevel.levelName} eventBuilder 42 Hello!"
                          hasMarker = withMarker
                          hasThrowable = withThrowable
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  private fun expression(variableName: String) =
    if (variableName.matches(Regex("[A-Za-z0-9_]*"))) "${'$'}$variableName"
    else "${'$'}{$variableName}"

  @TestFactory
  fun `generate code, compile it, run it and assert resulting log event(s)`(): List<DynamicNode> {
    var testCounter = 0
    val testDefinitions =
      TestCollection(
        label = "root",
        filename = "root",
        childCollections =
          (1..2).map { numberOfLogStatementInvocations ->
            this.testDefinitionsTemplate.cloneWithNewName(
              newLabel = "With $numberOfLogStatementInvocations log statement(s)",
              newFilename = "statements-$numberOfLogStatementInvocations",
            ) { def ->
              def.copyWithNewNumberOfLogStatements(numberOfLogStatementInvocations)
            }
          },
      )
    val preparedTests = testDefinitions.map { it.prepare(++testCounter) }
    val compilationResults = compileTests(FeatureFlag.entries, preparedTests)

    val samplesDir = Paths.get("code-samples-from-tests")
    Files.createDirectories(samplesDir)
    val rootDoc = MarkDownDocument(samplesDir, hasChildCollections = true)
    val docs =
      compilationResults.map { compiledTests ->
        compiledTests.toMarkDown(rootDoc) { childDoc, contents ->
          val filePath = childDoc.getFullPath()
          Files.createDirectories(filePath.parent)
          filePath.toFile().bufferedWriter().use { writer -> writer.write(contents) }
        }
      }
    samplesDir.resolve("index.md").toFile().bufferedWriter().use { writer ->
      writer.write("# Code samples from tests\n\n")
      writer.write(
        """
        |All the test cases that the plugin is tested against with before+after code snippets and how different feature
        |flags affect the transformation. Organized on the top level by feature flags, then by number of log statements
        |and finally by groups of test cases.
        |
        |${docs.joinToString(separator = "\n") { "* ${it.getLinkFromParentPerspective()}" }}
        |
        |"""
          .trimMargin()
      )
      writer.write("\n")
    }

    return compilationResults.map {
      DynamicContainer.dynamicContainer(
        it.label,
        it
          .toDynamicTests {
            DynamicTest.dynamicTest(preparedTest.testCode.testName) {
              Assertions.assertAll(execute().assertResults())
            }
          }
          .children,
      )
    }
  }
}

data class MarkDownDocument(
  val path: Path,
  val localName: String = "",
  val title: String = "",
  val titleWithParents: String = "",
  val hasChildCollections: Boolean,
) {
  fun newChild(newLocalName: String, newTitle: String, hasChildCollections: Boolean) =
    MarkDownDocument(
      path = if (localName.isNotEmpty()) path.resolve(localName) else path,
      localName = newLocalName,
      title = newTitle,
      titleWithParents =
        if (titleWithParents.isNotEmpty()) "$titleWithParents / $newTitle" else newTitle,
      hasChildCollections = hasChildCollections,
    )

  fun getFullPath(): Path =
    if (hasChildCollections) path.resolve(localName).resolve("index.md")
    else path.resolve("$localName.md")

  fun getLinkFromParentPerspective() =
    if (hasChildCollections) "[${title}](${localName}/index.md)" else "[${title}](${localName}.md)"
}
