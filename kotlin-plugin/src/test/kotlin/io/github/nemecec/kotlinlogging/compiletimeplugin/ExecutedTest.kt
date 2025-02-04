package io.github.nemecec.kotlinlogging.compiletimeplugin

import kotlin.test.assertEquals
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.function.Executable

class ExecutedTest(val compiledTest: io.github.nemecec.kotlinlogging.compiletimeplugin.CompiledTest, val actualExecutionResult: io.github.nemecec.kotlinlogging.compiletimeplugin.TestExecutionResult) :
  io.github.nemecec.kotlinlogging.compiletimeplugin.TestLeaf by compiledTest {

  fun assertResults() = io.github.nemecec.kotlinlogging.compiletimeplugin.assertResult(
    compiledTest.expectedExecutionResult,
    actualExecutionResult
  )
}

private fun assertResult(
  expectedExecutionResult: io.github.nemecec.kotlinlogging.compiletimeplugin.TestExecutionResult,
  actualExecutionResult: io.github.nemecec.kotlinlogging.compiletimeplugin.TestExecutionResult,
): List<Executable> {
  val assertions = mutableListOf<Executable>()
  assertions.add(
    Executable {
      assertEquals(
        expectedExecutionResult.returnedValue,
        actualExecutionResult.returnedValue,
        "returned value",
      )
    }
  )
  assertions.add(
    Executable {
      assertEquals(
        expectedExecutionResult.thrownExceptionToString,
        actualExecutionResult.thrownExceptionToString,
        "thrown exception",
      )
    }
  )
  assertions.addAll(
    io.github.nemecec.kotlinlogging.compiletimeplugin.assertLoggedEvent(
      expectedExecutionResult.loggedEvent,
      actualExecutionResult.loggedEvent
    )
  )
  return assertions
}

private fun assertLoggedEvent(
  expectedTestLoggingEvent: io.github.nemecec.kotlinlogging.compiletimeplugin.TestLoggingEvent?,
  actualTestLoggingEvent: io.github.nemecec.kotlinlogging.compiletimeplugin.TestLoggingEvent?,
): List<Executable> {
  val assertions = mutableListOf<Executable>()
  if (expectedTestLoggingEvent != null && actualTestLoggingEvent != null) {
    assertions.add(
      Executable {
        assertEquals(expectedTestLoggingEvent.level, actualTestLoggingEvent.level, "level")
      }
    )
    assertions.add(
      Executable {
        assertEquals(expectedTestLoggingEvent.message, actualTestLoggingEvent.message, "message")
      }
    )
    assertions.add(
      Executable {
        assertEquals(
          expectedTestLoggingEvent.formattedMessage,
          actualTestLoggingEvent.formattedMessage,
          "formatted message",
        )
      }
    )
    assertions.add(
      Executable {
        assertEquals(
          expectedTestLoggingEvent.hasMarker,
          actualTestLoggingEvent.hasMarker,
          "has marker",
        )
      }
    )
    assertions.add(
      Executable {
        assertEquals(
          expectedTestLoggingEvent.hasThrowable,
          actualTestLoggingEvent.hasThrowable,
          "has throwable",
        )
      }
    )
    assertions.add(
      Executable {
        assertEquals(
          expectedTestLoggingEvent.callerDataFirstElement,
          actualTestLoggingEvent.callerDataFirstElement,
          "caller data",
        )
      }
    )
  }
  if (expectedTestLoggingEvent != null && actualTestLoggingEvent == null) {
    assertions.add(
      Executable { fail("Expected logged event ($expectedTestLoggingEvent) but none was logged") }
    )
  }
  if (expectedTestLoggingEvent == null && actualTestLoggingEvent != null) {
    assertions.add(
      Executable { fail("Did not expect an event to be logged: $actualTestLoggingEvent") }
    )
  }
  return assertions
}
