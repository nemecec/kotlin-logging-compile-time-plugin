## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}", throwable) at Test1489Kt.main(test1489.kt:12)

User code:
```kotlin
package test1489
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn("warn message {}", throwable)
  logger.warn("warn message {}", throwable)
}




```
  
Transformed into:
```kotlin
package test1489
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message = "warn message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1489.Test1489Kt", methodName = "main", fileName = "test1489.kt", lineNumber = 12)
  logger.at(Level.WARN) { message = "warn message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1489.Test1489Kt", methodName = "main", fileName = "test1489.kt", lineNumber = 13)
}




```

###  warn(message, throwable) at Test1490Kt.main(test1490.kt:12)

User code:
```kotlin
package test1490
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "warn message as variable"
  logger.warn(message, throwable)
  logger.warn(message, throwable)
}




```
  
Transformed into:
```kotlin
package test1490
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "warn message as variable"
  logger.at(Level.WARN) { message = "warn message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1490.Test1490Kt", methodName = "main", fileName = "test1490.kt", lineNumber = 12)
  logger.at(Level.WARN) { message = "warn message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1490.Test1490Kt", methodName = "main", fileName = "test1490.kt", lineNumber = 13)
}




```
