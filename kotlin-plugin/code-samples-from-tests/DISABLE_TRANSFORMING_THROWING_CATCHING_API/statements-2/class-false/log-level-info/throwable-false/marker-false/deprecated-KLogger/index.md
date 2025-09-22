## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=false / deprecated KLogger API

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
  
  
  
  logger.at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1449.Test1449Kt", methodName = "main", fileName = "test1449.kt", lineNumber = 12)
at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1449.Test1449Kt", methodName = "main", fileName = "test1449.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1449.Test1449Kt", methodName = "main", fileName = "test1449.kt", lineNumber = 12)
at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1449.Test1449Kt", methodName = "main", fileName = "test1449.kt", lineNumber = 13)
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
  logger.at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1450.Test1450Kt", methodName = "main", fileName = "test1450.kt", lineNumber = 12)
at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1450.Test1450Kt", methodName = "main", fileName = "test1450.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1450.Test1450Kt", methodName = "main", fileName = "test1450.kt", lineNumber = 12)
at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1450.Test1450Kt", methodName = "main", fileName = "test1450.kt", lineNumber = 13)
}




```
