## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info("info message {}") at Test639Kt.main(test639.kt:12)

User code:
```kotlin
package test639
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.info("info message {}")
}




```
  
Remains as-is:
```kotlin
package test639
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.info("info message {}")
}




```

###  info(message) at Test640Kt.main(test640.kt:12)

User code:
```kotlin
package test640
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "info message as variable"
  logger.info(message)
}




```
  
Remains as-is:
```kotlin
package test640
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "info message as variable"
  logger.info(message)
}




```
