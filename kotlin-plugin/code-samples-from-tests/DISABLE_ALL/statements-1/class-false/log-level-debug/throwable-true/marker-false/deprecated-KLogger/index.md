## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}", throwable) at Test519Kt.main(test519.kt:12)

User code:
```kotlin
package test519
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug("debug message {}", throwable)
}




```
  
Remains as-is:
```kotlin
package test519
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug("debug message {}", throwable)
}




```

###  debug(message, throwable) at Test520Kt.main(test520.kt:12)

User code:
```kotlin
package test520
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.debug(message, throwable)
}




```
  
Remains as-is:
```kotlin
package test520
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.debug(message, throwable)
}




```
