## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info("info message {}") at Test1449Kt.main(test1449.kt:12)

User code:
```kotlin
package test1449
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.info("info message {}")
  logger.info("info message {}")
}




```
  
Transformed into:
```kotlin
package test1449
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"")
at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"")
  logger.at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"")
at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"")
}




```

###  info(message) at Test1450Kt.main(test1450.kt:12)

User code:
```kotlin
package test1450
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "info message as variable"
  logger.info(message)
  logger.info(message)
}




```
  
Transformed into:
```kotlin
package test1450
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "info message as variable"
  logger.at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
  logger.at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
}




```
