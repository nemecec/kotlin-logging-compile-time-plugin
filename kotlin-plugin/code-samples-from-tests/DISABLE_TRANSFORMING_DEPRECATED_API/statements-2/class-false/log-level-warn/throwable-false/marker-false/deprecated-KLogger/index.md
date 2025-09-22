## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}") at Test1529Kt.main(test1529.kt:12)

User code:
```kotlin
package test1529
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn("warn message {}")
  logger.warn("warn message {}")
}




```
  
Transformed into:
```kotlin
package test1529
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn("warn message {}")
warn("warn message {}")
  logger.warn("warn message {}")
warn("warn message {}")
}




```

###  warn(message) at Test1530Kt.main(test1530.kt:12)

User code:
```kotlin
package test1530
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "warn message as variable"
  logger.warn(message)
  logger.warn(message)
}




```
  
Transformed into:
```kotlin
package test1530
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "warn message as variable"
  logger.warn(message)
warn(message)
  logger.warn(message)
warn(message)
}




```
