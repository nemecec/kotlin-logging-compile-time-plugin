package dev.nemecec.kotlinlogging.compiletimeplugin

data class TestExecutionResult(
  val returnedValue: Any? = null,
  val thrownExceptionToString: String? = null,
  val loggedEvent: TestLoggingEvent? = null,
)

class TestExecutionResultBuilder(sourceTestExecutionResult: TestExecutionResult? = null) {
  var returnedValue: Any? = sourceTestExecutionResult?.returnedValue
  var thrownExceptionToString: String? = sourceTestExecutionResult?.thrownExceptionToString
  private var loggedEvent: TestLoggingEvent? = sourceTestExecutionResult?.loggedEvent

  fun loggedEvent(block: (TestLoggingEventBuilder.() -> Unit)?) {
    loggedEvent =
      if (block != null) TestLoggingEventBuilder(loggedEvent).apply(block).build() else null
  }

  fun build(): TestExecutionResult {
    return TestExecutionResult(
      returnedValue = returnedValue,
      thrownExceptionToString = thrownExceptionToString,
      loggedEvent = loggedEvent,
    )
  }
}

fun TestDefinition.toExpectedTestExecutionResult(
  expectedStackTraceElement: StackTraceElement?
): TestExecutionResult {
  return expectedResult.copy(
    loggedEvent =
      expectedResult.loggedEvent?.copy(callerDataFirstElement = expectedStackTraceElement)
  )
}

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
