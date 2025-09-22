## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}", throwable) at Test679Kt.main(test679.kt:12)

User code:
```kotlin
package test679
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn("warn message {}", throwable)
}




```
  
Transformed into:
```kotlin
package test679
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message = "warn message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test679.Test679Kt", methodName = "main", fileName = "test679.kt", lineNumber = 12)
}




```

###  warn(message, throwable) at Test680Kt.main(test680.kt:12)

User code:
```kotlin
package test680
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "warn message as variable"
  logger.warn(message, throwable)
}




```
  
Transformed into:
```kotlin
package test680
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "warn message as variable"
  logger.at(Level.WARN) { message = "warn message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test680.Test680Kt", methodName = "main", fileName = "test680.kt", lineNumber = 12)
}




```
