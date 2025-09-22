## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / throwing/catching API



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
  
Remains as-is:
```kotlin
package test409
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  throw logger.throwing(throwable)
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
  
Remains as-is:
```kotlin
package test410
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catching(throwable)
}




```
