## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace("trace message {}", throwable) at Test439Kt.main(test439.kt:12)

User code:
```kotlin
package test439
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace("trace message {}", throwable)
}




```
  
Remains as-is:
```kotlin
package test439
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace("trace message {}", throwable)
}




```

###  trace(message, throwable) at Test440Kt.main(test440.kt:12)

User code:
```kotlin
package test440
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "trace message as variable"
  logger.trace(message, throwable)
}




```
  
Remains as-is:
```kotlin
package test440
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "trace message as variable"
  logger.trace(message, throwable)
}




```
