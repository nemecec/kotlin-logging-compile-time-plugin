## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / throwing/catching API



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
  
  logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test1219.Test1219Kt", methodName = "main", fileName = "test1219.kt", lineNumber = 12), throwable)
throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test1219.Test1219Kt", methodName = "main", fileName = "test1219.kt", lineNumber = 13), throwable)
  throw logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test1219.Test1219Kt", methodName = "main", fileName = "test1219.kt", lineNumber = 12), throwable)
throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test1219.Test1219Kt", methodName = "main", fileName = "test1219.kt", lineNumber = 13), throwable)
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
  
  logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test1220.Test1220Kt", methodName = "main", fileName = "test1220.kt", lineNumber = 12), throwable)
catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test1220.Test1220Kt", methodName = "main", fileName = "test1220.kt", lineNumber = 13), throwable)
  logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test1220.Test1220Kt", methodName = "main", fileName = "test1220.kt", lineNumber = 12), throwable)
catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test1220.Test1220Kt", methodName = "main", fileName = "test1220.kt", lineNumber = 13), throwable)
}




```
