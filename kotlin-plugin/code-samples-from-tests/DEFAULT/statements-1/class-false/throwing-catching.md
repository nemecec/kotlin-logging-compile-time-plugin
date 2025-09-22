## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / throwing/catching API



###  throwing(throwable) at Test409Kt.main(test409.kt:12)

User code:
```kotlin
package test409
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  throw logger.throwing(throwable)
}




```
  
Transformed into:
```kotlin
package test409
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  throw logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test409.Test409Kt", methodName = "main", fileName = "test409.kt", lineNumber = 12), throwable)
}




```

###  catching(throwable) at Test410Kt.main(test410.kt:12)

User code:
```kotlin
package test410
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catching(throwable)
}




```
  
Transformed into:
```kotlin
package test410
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test410.Test410Kt", methodName = "main", fileName = "test410.kt", lineNumber = 12), throwable)
}




```
