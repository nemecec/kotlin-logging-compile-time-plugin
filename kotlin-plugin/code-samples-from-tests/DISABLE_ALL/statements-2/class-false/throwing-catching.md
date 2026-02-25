## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / throwing/catching API



###  throwing(throwable) at Test619Kt.main(test619.kt:12)

User code:
```kotlin
package test619
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.throwing(throwable)
  throw logger.throwing(throwable)
}




```
  
Remains as-is:
```kotlin
package test619
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.throwing(throwable)
  throw logger.throwing(throwable)
}




```

###  catching(throwable) at Test620Kt.main(test620.kt:12)

User code:
```kotlin
package test620
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catching(throwable)
  logger.catching(throwable)
}




```
  
Remains as-is:
```kotlin
package test620
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catching(throwable)
  logger.catching(throwable)
}




```
