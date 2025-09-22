## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error("error message {}") at Test799Kt.main(test799.kt:12)

User code:
```kotlin
package test799
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.error("error message {}")
}




```
  
Transformed into:
```kotlin
package test799
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test799.Test799Kt", methodName = "main", fileName = "test799.kt", lineNumber = 12)
}




```

###  error(message) at Test800Kt.main(test800.kt:12)

User code:
```kotlin
package test800
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "error message as variable"
  logger.error(message)
}




```
  
Transformed into:
```kotlin
package test800
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "error message as variable"
  logger.at(Level.ERROR) { message = "error message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test800.Test800Kt", methodName = "main", fileName = "test800.kt", lineNumber = 12)
}




```
