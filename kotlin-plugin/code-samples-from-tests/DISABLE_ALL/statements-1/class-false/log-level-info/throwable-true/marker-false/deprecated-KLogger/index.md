## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info("info message {}", throwable) at Test599Kt.main(test599.kt:12)

User code:
```kotlin
package test599
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info("info message {}", throwable)
}




```
  
Remains as-is:
```kotlin
package test599
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info("info message {}", throwable)
}




```

###  info(message, throwable) at Test600Kt.main(test600.kt:12)

User code:
```kotlin
package test600
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "info message as variable"
  logger.info(message, throwable)
}




```
  
Remains as-is:
```kotlin
package test600
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "info message as variable"
  logger.info(message, throwable)
}




```
