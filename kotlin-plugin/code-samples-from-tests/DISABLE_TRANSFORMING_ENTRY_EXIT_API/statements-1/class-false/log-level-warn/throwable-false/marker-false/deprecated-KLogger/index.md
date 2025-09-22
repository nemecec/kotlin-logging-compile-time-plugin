## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}") at Test719Kt.main(test719.kt:12)

User code:
```kotlin
package test719
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn("warn message {}")
}




```
  
Transformed into:
```kotlin
package test719
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test719.Test719Kt", methodName = "main", fileName = "test719.kt", lineNumber = 12)
}




```

###  warn(message) at Test720Kt.main(test720.kt:12)

User code:
```kotlin
package test720
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "warn message as variable"
  logger.warn(message)
}




```
  
Transformed into:
```kotlin
package test720
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "warn message as variable"
  logger.at(Level.WARN) { message = "warn message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test720.Test720Kt", methodName = "main", fileName = "test720.kt", lineNumber = 12)
}




```
