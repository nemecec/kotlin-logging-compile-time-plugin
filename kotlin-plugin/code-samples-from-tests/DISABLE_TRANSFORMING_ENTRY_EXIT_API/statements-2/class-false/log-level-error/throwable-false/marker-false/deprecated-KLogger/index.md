## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error("error message {}") at Test1609Kt.main(test1609.kt:12)

User code:
```kotlin
package test1609
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.error("error message {}")
  logger.error("error message {}")
}




```
  
Transformed into:
```kotlin
package test1609
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1609.Test1609Kt", methodName = "main", fileName = "test1609.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1609.Test1609Kt", methodName = "main", fileName = "test1609.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1609.Test1609Kt", methodName = "main", fileName = "test1609.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1609.Test1609Kt", methodName = "main", fileName = "test1609.kt", lineNumber = 13)
}




```

###  error(message) at Test1610Kt.main(test1610.kt:12)

User code:
```kotlin
package test1610
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "error message as variable"
  logger.error(message)
  logger.error(message)
}




```
  
Transformed into:
```kotlin
package test1610
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "error message as variable"
  logger.at(Level.ERROR) { message = "error message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1610.Test1610Kt", methodName = "main", fileName = "test1610.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1610.Test1610Kt", methodName = "main", fileName = "test1610.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1610.Test1610Kt", methodName = "main", fileName = "test1610.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1610.Test1610Kt", methodName = "main", fileName = "test1610.kt", lineNumber = 13)
}




```
