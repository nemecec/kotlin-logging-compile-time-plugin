package io.github.nemecec.kotlinlogging.compiletimeplugin

import io.github.nemecec.kotlinlogging.compiletimeplugin.PreparedTest.SourceCode

data class PreparedTest(
  val definition: io.github.nemecec.kotlinlogging.compiletimeplugin.TestDefinition,
  val uniqueTestNumber: Int,
  val testCode: io.github.nemecec.kotlinlogging.compiletimeplugin.PreparedTestCode,
) : io.github.nemecec.kotlinlogging.compiletimeplugin.TestLeaf by definition {

  data class SourceCode(val fileName: String, val text: String)

  fun compiled(
    classLoader: ClassLoader,
    expectationAdjusters: List<io.github.nemecec.kotlinlogging.compiletimeplugin.TestExecutionResultBuilder.() -> Unit>,
  ): io.github.nemecec.kotlinlogging.compiletimeplugin.CompiledTest {
    return io.github.nemecec.kotlinlogging.compiletimeplugin.CompiledTest(
      preparedTest = this,
      classLoader = classLoader,
      expectedExecutionResult =
        adjustExpectations(
          expectationAdjusters,
          definition.toExpectedTestExecutionResult(makeExpectedStackTraceElement()),
        ),
    )
  }

  private fun adjustExpectations(
    expectationAdjusters: List<io.github.nemecec.kotlinlogging.compiletimeplugin.TestExecutionResultBuilder.() -> Unit>,
    originalExpectedTestExecutionResult: io.github.nemecec.kotlinlogging.compiletimeplugin.TestExecutionResult,
  ): io.github.nemecec.kotlinlogging.compiletimeplugin.TestExecutionResult {
    val result =
      io.github.nemecec.kotlinlogging.compiletimeplugin.TestExecutionResultBuilder(originalExpectedTestExecutionResult)
    for (adjuster in expectationAdjusters) {
      adjuster.invoke(result)
    }
    return result.build()
  }

  private fun makeExpectedStackTraceElement(): StackTraceElement {
    return StackTraceElement(
      testCode.fqClassName,
      testCode.funName,
      testCode.fileName,
      testCode.logStatementLineNumber,
    )
  }

  fun prepareTransformed(expectedExecutionResult: io.github.nemecec.kotlinlogging.compiletimeplugin.TestExecutionResult): io.github.nemecec.kotlinlogging.compiletimeplugin.PreparedTestCode? {
    return definition.codeDescription.prepareTransformed(uniqueTestNumber, expectedExecutionResult)
  }
}

data class PreparedTestCode(
  val testName: String,
  val fileName: String,
  val packageName: String,
  val className: String,
  val classDeclareStart: String,
  val classDeclareEnd: String,
  val fqClassName: String,
  val funName: String,
  val logStatementLineNumber: Int,
  val needsInstance: Boolean,
  val sourceCode: SourceCode,
  val sourceCodeForDebugging: String = "",
)
