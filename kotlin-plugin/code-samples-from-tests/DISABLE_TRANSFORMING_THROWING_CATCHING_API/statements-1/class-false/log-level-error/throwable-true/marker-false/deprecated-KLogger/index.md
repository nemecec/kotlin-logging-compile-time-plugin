## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error("error message {}", throwable) at Test759Kt.main(test759.kt:12)

User code:
```kotlin
package test759
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error("error message {}", throwable)
}




```
  
Transformed into:
```kotlin
package test759
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message = "error message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test759.Test759Kt", methodName = "main", fileName = "test759.kt", lineNumber = 12)
}




```

###  error(message, throwable) at Test760Kt.main(test760.kt:12)

User code:
```kotlin
package test760
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "error message as variable"
  logger.error(message, throwable)
}




```
  
Transformed into:
```kotlin
package test760
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "error message as variable"
  logger.at(Level.ERROR) { message = "error message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test760.Test760Kt", methodName = "main", fileName = "test760.kt", lineNumber = 12)
}




```
