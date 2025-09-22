## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info("info message {}", throwable) at Test1409Kt.main(test1409.kt:12)

User code:
```kotlin
package test1409
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info("info message {}", throwable)
  logger.info("info message {}", throwable)
}




```
  
Transformed into:
```kotlin
package test1409
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1409.Test1409Kt", methodName = "main", fileName = "test1409.kt", lineNumber = 12)
at(Level.INFO) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1409.Test1409Kt", methodName = "main", fileName = "test1409.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1409.Test1409Kt", methodName = "main", fileName = "test1409.kt", lineNumber = 12)
at(Level.INFO) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1409.Test1409Kt", methodName = "main", fileName = "test1409.kt", lineNumber = 13)
}




```

###  info(message, throwable) at Test1410Kt.main(test1410.kt:12)

User code:
```kotlin
package test1410
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "info message as variable"
  logger.info(message, throwable)
  logger.info(message, throwable)
}




```
  
Transformed into:
```kotlin
package test1410
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "info message as variable"
  logger.at(Level.INFO) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1410.Test1410Kt", methodName = "main", fileName = "test1410.kt", lineNumber = 12)
at(Level.INFO) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1410.Test1410Kt", methodName = "main", fileName = "test1410.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1410.Test1410Kt", methodName = "main", fileName = "test1410.kt", lineNumber = 12)
at(Level.INFO) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1410.Test1410Kt", methodName = "main", fileName = "test1410.kt", lineNumber = 13)
}




```
