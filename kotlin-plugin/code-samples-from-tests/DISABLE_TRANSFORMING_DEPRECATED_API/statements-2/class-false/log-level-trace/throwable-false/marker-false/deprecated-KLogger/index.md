## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace("trace message {}") at Test1289Kt.main(test1289.kt:12)

User code:
```kotlin
package test1289
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace("trace message {}")
  logger.trace("trace message {}")
}




```
  
Remains as-is:
```kotlin
package test1289
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace("trace message {}")
  logger.trace("trace message {}")
}




```

###  trace(message) at Test1290Kt.main(test1290.kt:12)

User code:
```kotlin
package test1290
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "trace message as variable"
  logger.trace(message)
  logger.trace(message)
}




```
  
Remains as-is:
```kotlin
package test1290
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val message = "trace message as variable"
  logger.trace(message)
  logger.trace(message)
}




```
