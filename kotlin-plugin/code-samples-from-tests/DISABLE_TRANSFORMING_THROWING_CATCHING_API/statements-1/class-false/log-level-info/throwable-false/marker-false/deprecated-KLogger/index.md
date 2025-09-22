## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info("info message {}") at Test639Kt.main(test639.kt:12)

User code:
```kotlin
package test639
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.info("info message {}")
}




```
  
Transformed into:
```kotlin
package test639
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test639.Test639Kt", methodName = "main", fileName = "test639.kt", lineNumber = 12)
}




```

###  info(message) at Test640Kt.main(test640.kt:12)

User code:
```kotlin
package test640
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "info message as variable"
  logger.info(message)
}




```
  
Transformed into:
```kotlin
package test640
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "info message as variable"
  logger.at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test640.Test640Kt", methodName = "main", fileName = "test640.kt", lineNumber = 12)
}




```
