## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error("error message {}", throwable) at Test1569Kt.main(test1569.kt:12)

User code:
```kotlin
package test1569
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error("error message {}", throwable)
  logger.error("error message {}", throwable)
}




```
  
Transformed into:
```kotlin
package test1569
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error("error message {}", throwable)
error("error message {}", throwable)
  logger.error("error message {}", throwable)
error("error message {}", throwable)
}




```

###  error(message, throwable) at Test1570Kt.main(test1570.kt:12)

User code:
```kotlin
package test1570
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "error message as variable"
  logger.error(message, throwable)
  logger.error(message, throwable)
}




```
  
Transformed into:
```kotlin
package test1570
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "error message as variable"
  logger.error(message, throwable)
error(message, throwable)
  logger.error(message, throwable)
error(message, throwable)
}




```
