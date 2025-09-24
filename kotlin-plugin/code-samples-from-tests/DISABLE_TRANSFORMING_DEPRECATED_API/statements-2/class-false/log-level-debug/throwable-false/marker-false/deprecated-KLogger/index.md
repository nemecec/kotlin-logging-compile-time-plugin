## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API

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
  
Remains as-is:
```kotlin
package test1369
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.debug("debug message {}")
  logger.debug("debug message {}")
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
  
Remains as-is:
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
