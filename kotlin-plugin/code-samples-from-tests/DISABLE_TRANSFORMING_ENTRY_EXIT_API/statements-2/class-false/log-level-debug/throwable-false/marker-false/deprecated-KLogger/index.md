## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}") at Test1369Kt.main(test1369.kt:12)

User code:
```kotlin
package test1369
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.debug("debug message {}")
  logger.debug("debug message {}")
}




```
  
Transformed into:
```kotlin
package test1369
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1369.Test1369Kt", methodName = "main", fileName = "test1369.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1369.Test1369Kt", methodName = "main", fileName = "test1369.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1369.Test1369Kt", methodName = "main", fileName = "test1369.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1369.Test1369Kt", methodName = "main", fileName = "test1369.kt", lineNumber = 13)
}




```

###  debug(message) at Test1370Kt.main(test1370.kt:12)

User code:
```kotlin
package test1370
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "debug message as variable"
  logger.debug(message)
  logger.debug(message)
}




```
  
Transformed into:
```kotlin
package test1370
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "debug message as variable"
  logger.at(Level.DEBUG) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1370.Test1370Kt", methodName = "main", fileName = "test1370.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1370.Test1370Kt", methodName = "main", fileName = "test1370.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1370.Test1370Kt", methodName = "main", fileName = "test1370.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1370.Test1370Kt", methodName = "main", fileName = "test1370.kt", lineNumber = 13)
}




```
