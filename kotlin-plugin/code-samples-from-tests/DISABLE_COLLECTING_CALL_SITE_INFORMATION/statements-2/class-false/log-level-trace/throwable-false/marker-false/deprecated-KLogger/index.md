## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace("trace message {}") at Test1289Kt.main(test1289.kt:12)

User code:
```kotlin
package test1289
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace("trace message {}")
  logger.trace("trace message {}")
}




```
  
Transformed into:
```kotlin
package test1289
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message = "trace message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"")
at(Level.TRACE) { message = "trace message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"")
  logger.at(Level.TRACE) { message = "trace message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"")
at(Level.TRACE) { message = "trace message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"")
}




```

###  trace(message) at Test1290Kt.main(test1290.kt:12)

User code:
```kotlin
package test1290
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "trace message as variable"
  logger.trace(message)
  logger.trace(message)
}




```
  
Transformed into:
```kotlin
package test1290
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "trace message as variable"
  logger.at(Level.TRACE) { message = "trace message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
at(Level.TRACE) { message = "trace message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
  logger.at(Level.TRACE) { message = "trace message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
at(Level.TRACE) { message = "trace message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
}




```
