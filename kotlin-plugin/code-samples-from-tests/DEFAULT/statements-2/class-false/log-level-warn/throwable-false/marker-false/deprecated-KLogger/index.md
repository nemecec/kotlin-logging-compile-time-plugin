## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}") at Test1529Kt.main(test1529.kt:12)

User code:
```kotlin
package test1529
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn("warn message {}")
  logger.warn("warn message {}")
}




```
  
Transformed into:
```kotlin
package test1529
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1529.Test1529Kt", methodName = "main", fileName = "test1529.kt", lineNumber = 12)
  logger.at(Level.WARN) { message = "warn message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1529.Test1529Kt", methodName = "main", fileName = "test1529.kt", lineNumber = 13)
}




```

###  warn(message) at Test1530Kt.main(test1530.kt:12)

User code:
```kotlin
package test1530
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "warn message as variable"
  logger.warn(message)
  logger.warn(message)
}




```
  
Transformed into:
```kotlin
package test1530
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "warn message as variable"
  logger.at(Level.WARN) { message = "warn message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1530.Test1530Kt", methodName = "main", fileName = "test1530.kt", lineNumber = 12)
  logger.at(Level.WARN) { message = "warn message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1530.Test1530Kt", methodName = "main", fileName = "test1530.kt", lineNumber = 13)
}




```
