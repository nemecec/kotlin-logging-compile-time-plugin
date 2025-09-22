## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}", throwable) at Test1329Kt.main(test1329.kt:12)

User code:
```kotlin
package test1329
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug("debug message {}", throwable)
  logger.debug("debug message {}", throwable)
}




```
  
Transformed into:
```kotlin
package test1329
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1329.Test1329Kt", methodName = "main", fileName = "test1329.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1329.Test1329Kt", methodName = "main", fileName = "test1329.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1329.Test1329Kt", methodName = "main", fileName = "test1329.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1329.Test1329Kt", methodName = "main", fileName = "test1329.kt", lineNumber = 13)
}




```

###  debug(message, throwable) at Test1330Kt.main(test1330.kt:12)

User code:
```kotlin
package test1330
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.debug(message, throwable)
  logger.debug(message, throwable)
}




```
  
Transformed into:
```kotlin
package test1330
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.at(Level.DEBUG) { message = "debug message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1330.Test1330Kt", methodName = "main", fileName = "test1330.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1330.Test1330Kt", methodName = "main", fileName = "test1330.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1330.Test1330Kt", methodName = "main", fileName = "test1330.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1330.Test1330Kt", methodName = "main", fileName = "test1330.kt", lineNumber = 13)
}




```
