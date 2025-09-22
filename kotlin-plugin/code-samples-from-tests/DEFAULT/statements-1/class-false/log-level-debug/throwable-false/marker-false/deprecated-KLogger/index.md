## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}") at Test559Kt.main(test559.kt:12)

User code:
```kotlin
package test559
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.debug("debug message {}")
}




```
  
Transformed into:
```kotlin
package test559
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test559.Test559Kt", methodName = "main", fileName = "test559.kt", lineNumber = 12)
}




```

###  debug(message) at Test560Kt.main(test560.kt:12)

User code:
```kotlin
package test560
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "debug message as variable"
  logger.debug(message)
}




```
  
Transformed into:
```kotlin
package test560
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "debug message as variable"
  logger.at(Level.DEBUG) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test560.Test560Kt", methodName = "main", fileName = "test560.kt", lineNumber = 12)
}




```
