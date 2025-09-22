package dev.nemecec.kotlinlogging.compiletimeplugin

import java.io.BufferedReader
import java.io.StringReader
import java.util.stream.Collectors
import kotlin.reflect.KClass
import org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeAsciiOnly

data class TestDefinition(
  override val skip: Boolean,
  val codeDescription: TestCodeDescription,
  val expectedResult: TestExecutionResult,
) : TestLeaf {

  fun copyWithNewNumberOfLogStatements(newNumberOfLogStatements: Int) =
    copy(
      codeDescription = codeDescription.copyWithNewNumberOfLogStatements(newNumberOfLogStatements),
      expectedResult = expectedResult.copyWithNewNumberOfLogStatements(newNumberOfLogStatements),
    )

  fun prepare(uniqueTestNumber: Int): PreparedTest {
    return PreparedTest(
      definition = this,
      uniqueTestNumber = uniqueTestNumber,
      testCode = codeDescription.prepare(uniqueTestNumber),
    )
  }
}

class TestDefinitionBuilder {
  var skip: Boolean? = null
  private var codeDescription: TestCodeDescription? = null
  private var expectedResult: TestExecutionResult? = null

  fun code(init: TestCodeDescriptionBuilder.() -> Unit) {
    codeDescription = TestCodeDescriptionBuilder().apply(init).build()
  }

  fun expect(init: TestExecutionResultBuilder.() -> Unit) {
    expectedResult = TestExecutionResultBuilder().apply(init).build()
  }

  fun build(): TestDefinition {
    return TestDefinition(
      skip = skip ?: false,
      codeDescription = codeDescription!!,
      expectedResult = expectedResult!!,
    )
  }
}

data class TestCodeDescription(
  val useClass: Boolean,
  val useThrowable: Boolean,
  val useMarker: Boolean,
  val funName: String = "main",
  val funReturnType: KClass<*>?,
  val initCode: String,
  val logStatements: List<LogStatement>,
  val throwReturnValueFromLastLogStatement: Boolean,
  val extraImportCode: String,
  val extraCodeBeforeMethod: String,
  val extraMethodCode: String,
) {
  fun copyWithNewNumberOfLogStatements(newNumberOfLogStatements: Int): TestCodeDescription {
    val currentNumberOfLogStatements = logStatements.size
    check(newNumberOfLogStatements >= currentNumberOfLogStatements)
    if (newNumberOfLogStatements == currentNumberOfLogStatements) {
      return this
    }
    return copy(
      logStatements =
        logStatements +
          List(newNumberOfLogStatements - currentNumberOfLogStatements) { logStatements.last() }
    )
  }

  fun prepare(uniqueTestNumber: Int) =
    prepare(uniqueTestNumber) { makeSource(useMarker, useThrowable) }

  fun prepareTransformed(uniqueTestNumber: Int, expectedResult: TestExecutionResult) =
    if (expectedResult.loggedEvents.isNotEmpty())
      prepare(uniqueTestNumber) { makeTransformedSource(expectedResult) }
    else null

  private fun prepare(
    uniqueTestNumber: Int,
    logStatementSourceCodeMaker: LogStatement.() -> String,
  ): PreparedTestCode {
    val fileName = "test${uniqueTestNumber}.kt"
    val packageName = "test${uniqueTestNumber}"
    val className: String
    val classDeclareStart: String
    val classDeclareEnd: String
    val needsInstance: Boolean
    val classIndent: String
    if (useClass) {
      className = "MainTest"
      classDeclareStart = "public class $className {"
      classDeclareEnd = "}"
      needsInstance = true
      classIndent = "  "
    } else {
      className = fileName.capitalizeAsciiOnly().substringBefore(".kt") + "Kt"
      classDeclareStart = ""
      classDeclareEnd = ""
      needsInstance = false
      classIndent = ""
    }
    val fqClassName = "$packageName.$className"
    val initMarkerSourceCode =
      if (useMarker) "val $MARKER_VARIABLE_NAME = MyMarker(\"markerName\")" else ""
    val declareMarkerSourceCode =
      if (useMarker)
        "class MyMarker(private val name: String): Marker { override fun getName() = name }"
      else ""
    val initThrowableSourceCode =
      if (useThrowable) "val $THROWABLE_VARIABLE_NAME = Exception(\"$EXCEPTION_MESSAGE\")" else ""
    val logStatementPrefix: String
    val funReturnTypeSuffix: String
    if (funReturnType != null) {
      logStatementPrefix = "return "
      funReturnTypeSuffix = ": " + funReturnType.qualifiedName?.removePrefix("kotlin.")
    } else {
      funReturnTypeSuffix = ""
      if (throwReturnValueFromLastLogStatement) {
        logStatementPrefix = "throw "
      } else {
        logStatementPrefix = ""
      }
    }
    // line number depends on the generated source code template (see below)
    val firstLogStatementLineNumber = 12
    val logStatementLineNumbers =
      (firstLogStatementLineNumber until firstLogStatementLineNumber + logStatements.size).toList()
    val logStatementSources = logStatements.map { logStatementSourceCodeMaker.invoke(it) }
    val logStatementStrings =
      logStatementSources.take(logStatements.size - 1).map { "$classIndent  logger.$it" } +
        logStatementSources.last().let { "$classIndent  ${logStatementPrefix}logger.$it" }
    val logStatements = logStatementStrings.joinToString("\n")
    val fullSourceCode =
      """
      |package $packageName
      |import io.github.oshai.kotlinlogging.*
      |$extraImportCode
      |
      |$classDeclareStart
      |private val logger = KotlinLogging.logger {}
      |$extraCodeBeforeMethod
      |${classIndent}fun ${funName}()$funReturnTypeSuffix {
      |$classIndent  $initMarkerSourceCode
      |$classIndent  $initThrowableSourceCode
      |$classIndent  $initCode
      |$logStatements
      |${classIndent}}
      |${classIndent}$extraMethodCode
      |$classDeclareEnd
      |$declareMarkerSourceCode
      |"""
        .trimMargin()
    return PreparedTestCode(
      testName =
        " ${logStatementSources.first()} at $className.${funName}($fileName:${logStatementLineNumbers.first()})",
      fileName = fileName,
      packageName = packageName,
      className = className,
      classDeclareStart = classDeclareStart,
      classDeclareEnd = classDeclareEnd,
      fqClassName = fqClassName,
      funName = funName,
      needsInstance = needsInstance,
      logStatementLineNumbers = logStatementLineNumbers,
      sourceCode = PreparedTest.SourceCode(fileName, fullSourceCode),
      sourceCodeForDebugging = stringWithLineNumbers(fullSourceCode),
    )
  }

  private fun stringWithLineNumbers(source: String): String {
    val buffer = BufferedReader(StringReader(source))
    var lineNumber = 1
    return buffer.lines().map { line -> "${lineNumber++}: $line" }.collect(Collectors.joining("\n"))
  }
}

private fun LogStatement.makeSource(useMarker: Boolean, useThrowable: Boolean): String {
  return "${funName}${makeArgumentList(useMarker, useThrowable)}${makeLastArgumentLambda(useThrowable)}"
}

private fun LogStatement.makeTransformedSource(expectedResult: TestExecutionResult) =
  expectedResult.loggedEvents.joinToString("\n") { makeTransformedSource(it) }

private fun LogStatement.makeTransformedSource(loggedEvent: TestLoggingEvent): String {
  val useMarker = loggedEvent.hasMarker
  val useThrowable = loggedEvent.hasThrowable
  val compilerDataValues = makeCompilerDataValues(loggedEvent)
  if (compilerDataValues.isEmpty()) {
    return makeSource(useMarker, useThrowable)
  }

  if (funName in listOf("entry", "exit", "throwing", "catching")) {
    val arguments = mutableListOf<String>()
    arguments.add(
      "KLoggingEventBuilder.InternalCompilerData(${compilerDataValues.joinToString(", ")})"
    )
    if (useThrowable) arguments.add(THROWABLE_VARIABLE_NAME)
    return "${funName}WithCompilerData(${arguments.joinToString(", ")})"
  } else {
    val arguments = mutableListOf<String>()
    arguments.add("Level.${loggedEvent.level.name}")
    if (useMarker) arguments.add(MARKER_VARIABLE_NAME)

    val lambdaValues = mutableListOf<String>()
    lambdaValues.add("message = \"${escapeQuotes(loggedEvent.formattedMessage)}\"")
    if (useThrowable) lambdaValues.add("cause = $THROWABLE_VARIABLE_NAME")
    lambdaValues.add(
      "internalCompilerData = KLoggingEventBuilder.InternalCompilerData(${compilerDataValues.joinToString(", ")})"
    )

    return "at(${arguments.joinToString(", ")}) { ${lambdaValues.joinToString("; ")}"
  }
}

private fun makeCompilerDataValues(loggedEvent: TestLoggingEvent): MutableList<String> {
  val compilerDataValues = mutableListOf<String>()
  if (loggedEvent.message != loggedEvent.formattedMessage) {
    compilerDataValues.add("messageTemplate = \"${escapeQuotes(loggedEvent.message)}\"")
  }
  val callerDataFirstElement = loggedEvent.callerDataFirstElement
  if (callerDataFirstElement != null) {
    compilerDataValues.add("className = \"${escapeQuotes(callerDataFirstElement.className)}\"")
    compilerDataValues.add("methodName = \"${escapeQuotes(callerDataFirstElement.methodName)}\"")
    compilerDataValues.add("fileName = \"${escapeQuotes(callerDataFirstElement.fileName)}\"")
    compilerDataValues.add("lineNumber = ${callerDataFirstElement.lineNumber}")
  }
  return compilerDataValues
}

private fun escapeQuotes(message: String?) = message?.replace("\"", "\\\"")

private fun LogStatement.makeArgumentList(useMarker: Boolean, useThrowable: Boolean): String {
  val arguments =
    arguments
      .map {
        when (it) {
          MARKER_PLACEHOLDER -> if (useMarker) MARKER_VARIABLE_NAME else ""
          THROWABLE_PLACEHOLDER -> if (useThrowable) THROWABLE_VARIABLE_NAME else ""
          else -> it
        }
      }
      .filter { it.isNotEmpty() }
  return "(${arguments.joinToString(", ")})"
}

private fun LogStatement.makeLastArgumentLambda(useThrowable: Boolean): String {
  val throwableValue = if (useThrowable) THROWABLE_VARIABLE_NAME else "null"
  return if (lastArgumentLambda != null)
    " {${lastArgumentLambda.replace(THROWABLE_PLACEHOLDER, throwableValue)}}"
  else ""
}

class TestCodeDescriptionBuilder {
  var useClass: Boolean? = null
  var useThrowable: Boolean? = null
  var useMarker: Boolean? = null
  var initCode: String = ""
  var funReturnType: KClass<*>? = null
  var logStatement: LogStatement? = null
  var logStatements: List<LogStatement> = emptyList()
  var throwReturnValueFromLogStatement: Boolean? = null
  var extraImportCode: String = ""
  var extraCodeBeforeMethod: String = ""
  var extraMethodCode: String = ""

  fun build(): TestCodeDescription {
    return TestCodeDescription(
      useClass = useClass ?: false,
      useThrowable = useThrowable ?: false,
      useMarker = useMarker ?: false,
      initCode = initCode,
      funReturnType = funReturnType,
      logStatements = if (logStatement != null) logStatements + logStatement!! else logStatements,
      throwReturnValueFromLastLogStatement = throwReturnValueFromLogStatement ?: false,
      extraImportCode = extraImportCode,
      extraCodeBeforeMethod = extraCodeBeforeMethod,
      extraMethodCode = extraMethodCode,
    )
  }
}
