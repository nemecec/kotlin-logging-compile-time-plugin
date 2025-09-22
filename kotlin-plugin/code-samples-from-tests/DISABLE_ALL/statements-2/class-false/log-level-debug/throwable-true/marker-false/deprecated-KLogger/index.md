## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}", throwable) at Test1329Kt.main(test1329.kt:12)

User code:
```kotlin
package test1329
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug("debug message {}", throwable)
  logger.debug("debug message {}", throwable)
}




```
  
Transformed into:
```kotlin
package test1329
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug("debug message {}", throwable)
debug("debug message {}", throwable)
  logger.debug("debug message {}", throwable)
debug("debug message {}", throwable)
}




```

###  debug(message, throwable) at Test1330Kt.main(test1330.kt:12)

User code:
```kotlin
package test1330
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.debug(message, throwable)
  logger.debug(message, throwable)
}




```
  
Transformed into:
```kotlin
package test1330
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.debug(message, throwable)
debug(message, throwable)
  logger.debug(message, throwable)
debug(message, throwable)
}




```
