## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace("trace message {}") at Test479Kt.main(test479.kt:12)

User code:
```kotlin
package test479
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace("trace message {}")
}




```
  
Transformed into:
```kotlin
package test479
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message = "trace message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test479.Test479Kt", methodName = "main", fileName = "test479.kt", lineNumber = 12)
}




```

###  trace(message) at Test480Kt.main(test480.kt:12)

User code:
```kotlin
package test480
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "trace message as variable"
  logger.trace(message)
}




```
  
Transformed into:
```kotlin
package test480
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "trace message as variable"
  logger.at(Level.TRACE) { message = "trace message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test480.Test480Kt", methodName = "main", fileName = "test480.kt", lineNumber = 12)
}




```
