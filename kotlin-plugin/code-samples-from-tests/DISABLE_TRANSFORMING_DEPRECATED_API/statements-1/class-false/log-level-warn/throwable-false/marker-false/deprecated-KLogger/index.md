## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}") at Test719Kt.main(test719.kt:12)

User code:
```kotlin
package test719
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn("warn message {}")
}




```
  
Remains as-is:
```kotlin
package test719
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn("warn message {}")
}




```

###  warn(message) at Test720Kt.main(test720.kt:12)

User code:
```kotlin
package test720
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "warn message as variable"
  logger.warn(message)
}




```
  
Remains as-is:
```kotlin
package test720
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "warn message as variable"
  logger.warn(message)
}




```
