## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / throwing/catching API



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
  
Remains as-is:
```kotlin
package test209
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  throw logger.throwing(throwable)
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
  
Remains as-is:
```kotlin
package test210
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catching(throwable)
}




```
