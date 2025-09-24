## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=false / deprecated KLogger API

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
  
Remains as-is:
```kotlin
package test1609
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.error("error message {}")
  logger.error("error message {}")
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
  
Remains as-is:
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
