## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace("trace message {}") at Test479Kt.main(test479.kt:12)

User code:
```kotlin
package test479
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace("trace message {}")
}




```
  
Remains as-is:
```kotlin
package test479
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace("trace message {}")
}




```

###  trace(message) at Test480Kt.main(test480.kt:12)

User code:
```kotlin
package test480
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "trace message as variable"
  logger.trace(message)
}




```
  
Remains as-is:
```kotlin
package test480
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "trace message as variable"
  logger.trace(message)
}




```
