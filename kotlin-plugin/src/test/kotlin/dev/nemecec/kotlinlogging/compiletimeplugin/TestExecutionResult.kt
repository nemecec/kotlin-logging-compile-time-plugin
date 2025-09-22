package dev.nemecec.kotlinlogging.compiletimeplugin

import org.jetbrains.kotlin.utils.addToStdlib.zipWithNulls

data class TestExecutionResult(
  val returnedValue: Any? = null,
  val thrownExceptionToString: String? = null,
  val loggedEvents: List<TestLoggingEvent> = emptyList(),
) {
  fun copyWithNewNumberOfLogStatements(newNumberOfLogStatements: Int): TestExecutionResult {
    val firstEvent = loggedEvents.first()
    var callerDataLineNumber = firstEvent.callerDataFirstElement?.lineNumber ?: 0
    return this.copy(
      loggedEvents =
        loggedEvents +
          List(newNumberOfLogStatements - loggedEvents.size) {
            firstEvent.copy(
              callerDataFirstElement =
                firstEvent.callerDataFirstElement?.copyWithLineNumber(++callerDataLineNumber)
            )
          }
    )
  }
}

private fun StackTraceElement.copyWithLineNumber(callerDataLineNumber: Int): StackTraceElement {
  return StackTraceElement(className, methodName, fileName, callerDataLineNumber)
}

class TestExecutionResultBuilder(sourceTestExecutionResult: TestExecutionResult? = null) {
  var returnedValue: Any? = sourceTestExecutionResult?.returnedValue
  var thrownExceptionToString: String? = sourceTestExecutionResult?.thrownExceptionToString
  private var loggedEvents =
    (sourceTestExecutionResult?.loggedEvents ?: emptyList()).toMutableList()

  fun loggedEvent(block: (TestLoggingEventBuilder.() -> Unit)?) {
    if (block != null) {
      if (loggedEvents.isNotEmpty()) {
        loggedEvents =
          loggedEvents.map { TestLoggingEventBuilder(it).apply(block).build() }.toMutableList()
      } else {
        loggedEvents.add(TestLoggingEventBuilder().apply(block).build())
      }
    }
  }

  fun build(): TestExecutionResult {
    return TestExecutionResult(
      returnedValue = returnedValue,
      thrownExceptionToString = thrownExceptionToString,
      loggedEvents = loggedEvents,
    )
  }
}

fun TestDefinition.toExpectedTestExecutionResult(
  expectedStackTraceElements: List<StackTraceElement>
) =
  expectedResult.copy(
    loggedEvents =
      expectedResult.loggedEvents.zipWithNulls(expectedStackTraceElements).mapNotNull { (event, ste)
        ->
        event?.copy(callerDataFirstElement = ste)
      }
  )

data class TestLoggingEvent(
  val level: TestLoggingLevel,
  val message: String,
  val slf4jMessage: String,
  val formattedMessage: String,
  val slf4jFormattedMessage: String,
  val hasMarker: Boolean,
  val hasThrowable: Boolean,
  val callerDataFirstElement: StackTraceElement?,
)

class TestLoggingEventBuilder(sourceEvent: TestLoggingEvent? = null) {
  var level: TestLoggingLevel? = sourceEvent?.level
  var message: String? = sourceEvent?.message
  var slf4jMessage: String? = sourceEvent?.slf4jMessage
  var formattedMessage: String? = sourceEvent?.formattedMessage
  var slf4jFormattedMessage: String? = sourceEvent?.slf4jFormattedMessage
  var hasMarker: Boolean? = sourceEvent?.hasMarker
  var hasThrowable: Boolean? = sourceEvent?.hasThrowable
  var callerDataFirstElement: StackTraceElement? = sourceEvent?.callerDataFirstElement

  fun build(): TestLoggingEvent {
    return TestLoggingEvent(
      level = level!!,
      message = message!!,
      slf4jMessage = if (slf4jMessage != null) slf4jMessage!! else message!!,
      formattedMessage = formattedMessage!!,
      slf4jFormattedMessage =
        if (slf4jFormattedMessage != null) slf4jFormattedMessage!! else formattedMessage!!,
      hasMarker = hasMarker!!,
      hasThrowable = hasThrowable!!,
      callerDataFirstElement = callerDataFirstElement,
    )
  }
}
