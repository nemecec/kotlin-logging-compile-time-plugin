package dev.nemecec.kotlinlogging.compiletimeplugin

import kotlin.test.assertEquals
import org.jetbrains.kotlin.utils.addToStdlib.zipWithNulls
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.function.Executable

class ExecutedTest(val compiledTest: CompiledTest, val actualExecutionResult: TestExecutionResult) :
  TestLeaf by compiledTest {

  fun assertResults() = assertResult(compiledTest.expectedExecutionResult, actualExecutionResult)
}

private fun assertResult(
  expectedExecutionResult: TestExecutionResult,
  actualExecutionResult: TestExecutionResult,
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
    assertLoggedEvents(expectedExecutionResult.loggedEvents, actualExecutionResult.loggedEvents)
  )
  return assertions
}

private fun assertLoggedEvents(
  expectedTestLoggingEvent: List<TestLoggingEvent>,
  actualTestLoggingEvent: List<TestLoggingEvent>,
): List<Executable> {
  val assertions = mutableListOf<Executable>()
  assertions.add(
    Executable {
      assertEquals(
        expectedTestLoggingEvent.size,
        actualTestLoggingEvent.size,
        "number of logged events",
      )
    }
  )
  assertions.addAll(
    expectedTestLoggingEvent
      .zipWithNulls(actualTestLoggingEvent)
      .map { (expectedTestLoggingEvent, actualTestLoggingEvent) ->
        assertLoggedEvent(expectedTestLoggingEvent, actualTestLoggingEvent)
      }
      .flatten()
  )
  return assertions
}

private fun assertLoggedEvent(
  expectedTestLoggingEvent: TestLoggingEvent?,
  actualTestLoggingEvent: TestLoggingEvent?,
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
