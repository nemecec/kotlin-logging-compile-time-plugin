## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / throwing/catching API



###  throwing(throwable) at Test209Kt.main(test209.kt:12)

User code:
```kotlin
package test209
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  throw logger.throwing(throwable)
}




```
  
Transformed into:
```kotlin
package test209
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  throw logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)"), throwable)
}




```

###  catching(throwable) at Test210Kt.main(test210.kt:12)

User code:
```kotlin
package test210
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catching(throwable)
}




```
  
Transformed into:
```kotlin
package test210
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)"), throwable)
}




```
