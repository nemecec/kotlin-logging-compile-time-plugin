## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error("error message {}", throwable) at Test759Kt.main(test759.kt:12)

User code:
```kotlin
package test759
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error("error message {}", throwable)
}




```
  
Remains as-is:
```kotlin
package test759
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error("error message {}", throwable)
}




```

###  error(message, throwable) at Test760Kt.main(test760.kt:12)

User code:
```kotlin
package test760
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "error message as variable"
  logger.error(message, throwable)
}




```
  
Remains as-is:
```kotlin
package test760
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val message = "error message as variable"
  logger.error(message, throwable)
}




```
