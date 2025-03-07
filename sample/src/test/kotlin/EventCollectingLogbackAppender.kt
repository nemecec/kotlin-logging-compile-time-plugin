import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase

class EventCollectingLogbackAppender<T : ILoggingEvent> : AppenderBase<T>() {

  val events = mutableListOf<TestLoggingEvent>()

  override fun append(event: T) {
    events.add(
      TestLoggingEvent(
        level = event.level.levelStr,
        message = event.message,
        formattedMessage = event.formattedMessage,
        hasMarker = event.markerList != null && event.markerList.isNotEmpty(),
        hasThrowable = event.throwableProxy != null,
        callerDataFirstElement =
          if (event.callerData != null && event.callerData.isNotEmpty()) event.callerData[0]
          else null,
      )
    )
  }
}

data class TestLoggingEvent(
  val level: String,
  val message: String,
  val formattedMessage: String,
  val hasMarker: Boolean,
  val hasThrowable: Boolean,
  val callerDataFirstElement: StackTraceElement?,
)
