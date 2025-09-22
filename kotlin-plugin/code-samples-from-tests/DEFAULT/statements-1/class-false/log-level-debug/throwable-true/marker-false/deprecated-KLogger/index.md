## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}", throwable) at Test519Kt.main(test519.kt:12)

User code:
```kotlin
package test519
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug("debug message {}", throwable)
}




```
  
Transformed into:
```kotlin
package test519
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test519.Test519Kt", methodName = "main", fileName = "test519.kt", lineNumber = 12)
}




```

###  debug(message, throwable) at Test520Kt.main(test520.kt:12)

User code:
```kotlin
package test520
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.debug(message, throwable)
}




```
  
Transformed into:
```kotlin
package test520
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.at(Level.DEBUG) { message = "debug message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test520.Test520Kt", methodName = "main", fileName = "test520.kt", lineNumber = 12)
}




```
