## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / throwing/catching API



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
  
Transformed into:
```kotlin
package test619
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test619.Test619Kt", methodName = "main", fileName = "test619.kt", lineNumber = 12), throwable)
  throw logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test619.Test619Kt", methodName = "main", fileName = "test619.kt", lineNumber = 13), throwable)
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
  
Transformed into:
```kotlin
package test620
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test620.Test620Kt", methodName = "main", fileName = "test620.kt", lineNumber = 12), throwable)
  logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test620.Test620Kt", methodName = "main", fileName = "test620.kt", lineNumber = 13), throwable)
}




```
