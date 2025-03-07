package dev.nemecec.kotlinlogging.compiletimeplugin

import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase

class EventCollectingLogbackAppender<T : ILoggingEvent> : AppenderBase<T>() {

  val events = mutableListOf<TestLoggingEvent>()

  override fun append(event: T) {
    events.add(
      TestLoggingEvent(
        level = TestLoggingLevel.valueOf(event.level.levelStr),
        message = event.message,
        slf4jMessage = event.message,
        formattedMessage = event.formattedMessage,
        slf4jFormattedMessage = event.formattedMessage,
        hasMarker = event.markerList != null && event.markerList.isNotEmpty(),
        hasThrowable = event.throwableProxy != null,
        callerDataFirstElement =
          if (event.hasCallerData() && event.callerData != null && event.callerData.isNotEmpty())
            event.callerData[0]
          else null,
      )
    )
  }
}
