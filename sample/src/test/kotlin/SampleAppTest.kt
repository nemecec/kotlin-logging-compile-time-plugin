import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotNull
import ch.qos.logback.classic.Level
import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.spi.ILoggingEvent
import io.github.oshai.kotlinlogging.logback.internal.LogbackLoggerFactory
import kotlin.test.Test
import kotlin.test.fail

class SampleAppTest {

  @Test
  fun test() {
    val appender = configureLogging()
    main("World")
    appender.events.single().let {
      assertAll {
        assertThat(it.formattedMessage).isEqualTo("Hello, World!")
        assertThat(it.message).isEqualTo(""""Hello, ${'$'}world!"""")
        assertThat(it.level).isEqualTo("INFO")
        assertThat(it.callerDataFirstElement).isNotNull()
        assertThat(it.callerDataFirstElement?.fileName).isEqualTo("SampleApp.kt")
        assertThat(it.callerDataFirstElement?.methodName).isEqualTo("main")
        assertThat(it.callerDataFirstElement?.lineNumber).isEqualTo(5)
        assertThat(it.callerDataFirstElement?.className).isEqualTo("<root>.SampleAppKt")
        assertThat(it.callerDataFirstElement?.isNativeMethod).isEqualTo(false)
        assertThat(it.hasMarker).isEqualTo(false)
        assertThat(it.hasThrowable).isEqualTo(false)
      }
    }
  }

  private fun configureLogging(): EventCollectingLogbackAppender<ILoggingEvent> {
    val loggerContext =
      LogbackLoggerFactory.getLoggerContext() ?: fail("Logback logger context not found")
    loggerContext.reset()
    val appender = EventCollectingLogbackAppender<ILoggingEvent>()
    appender.name = "EventCollectingLogbackAppender"
    appender.context = loggerContext
    appender.start()

    val rootLogger = loggerContext.getLogger(Logger.ROOT_LOGGER_NAME)
    rootLogger.addAppender(appender)
    rootLogger.level = Level.TRACE
    return appender
  }
}
