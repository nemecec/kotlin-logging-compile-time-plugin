## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}", throwable) at Test1489Kt.main(test1489.kt:12)

User code:
```kotlin
package test1489
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn("warn message {}", throwable)
  logger.warn("warn message {}", throwable)
}




```
  
Remains as-is:
```kotlin
package test1489
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn("warn message {}", throwable)
  logger.warn("warn message {}", throwable)
}




```

###  warn(message, throwable) at Test1490Kt.main(test1490.kt:12)

User code:
```kotlin
package test1490
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "warn message as variable"
  logger.warn(message, throwable)
  logger.warn(message, throwable)
}




```
  
Remains as-is:
```kotlin
package test1490
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "warn message as variable"
  logger.warn(message, throwable)
  logger.warn(message, throwable)
}




```
