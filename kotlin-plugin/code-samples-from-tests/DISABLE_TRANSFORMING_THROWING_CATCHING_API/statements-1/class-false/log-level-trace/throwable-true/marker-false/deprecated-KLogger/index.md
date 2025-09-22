## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace("trace message {}", throwable) at Test439Kt.main(test439.kt:12)

User code:
```kotlin
package test439
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace("trace message {}", throwable)
}




```
  
Transformed into:
```kotlin
package test439
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test439.Test439Kt", methodName = "main", fileName = "test439.kt", lineNumber = 12)
}




```

###  trace(message, throwable) at Test440Kt.main(test440.kt:12)

User code:
```kotlin
package test440
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "trace message as variable"
  logger.trace(message, throwable)
}




```
  
Transformed into:
```kotlin
package test440
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "trace message as variable"
  logger.at(Level.TRACE) { message = "trace message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test440.Test440Kt", methodName = "main", fileName = "test440.kt", lineNumber = 12)
}




```
