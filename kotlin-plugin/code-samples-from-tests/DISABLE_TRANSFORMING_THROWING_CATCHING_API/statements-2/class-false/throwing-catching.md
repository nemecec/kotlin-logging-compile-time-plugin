## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / throwing/catching API



###  throwing(throwable) at Test1219Kt.main(test1219.kt:12)

User code:
```kotlin
package test1219
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.throwing(throwable)
  throw logger.throwing(throwable)
}




```
  
Transformed into:
```kotlin
package test1219
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.throwing(throwable)
throwing(throwable)
  throw logger.throwing(throwable)
throwing(throwable)
}




```

###  catching(throwable) at Test1220Kt.main(test1220.kt:12)

User code:
```kotlin
package test1220
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catching(throwable)
  logger.catching(throwable)
}




```
  
Transformed into:
```kotlin
package test1220
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catching(throwable)
catching(throwable)
  logger.catching(throwable)
catching(throwable)
}




```
