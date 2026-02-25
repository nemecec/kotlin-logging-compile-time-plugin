package dev.nemecec.kotlinlogging.compiletimeplugin

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
                      code {
                        useClass = withClass
                        useThrowable = withThrowable
                        useMarker = withMarker
                        logStatement =
                          LogStatement(
                            funName = withLogLevel.levelName,
                            arguments = listOf(MARKER_PLACEHOLDER, THROWABLE_PLACEHOLDER),
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
                        initCode =
                          "val messageLambda: () -> Any = { \"${withLogLevel.levelName} messageBuilder\" }"
                        logStatement =
                          LogStatement(
                            funName = withLogLevel.levelName,
                            arguments =
                              listOf(MARKER_PLACEHOLDER, THROWABLE_PLACEHOLDER, "messageLambda"),
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
