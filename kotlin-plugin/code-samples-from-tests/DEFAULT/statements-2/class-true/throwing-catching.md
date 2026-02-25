## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / throwing/catching API



###  throwing(throwable) at MainTest.main(test414.kt:12)

User code:
```kotlin
package test414
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.throwing(throwable)
    throw logger.throwing(throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test414
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test414.MainTest", methodName = "main", fileName = "test414.kt", lineNumber = 12), throwable)
    throw logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test414.MainTest", methodName = "main", fileName = "test414.kt", lineNumber = 13), throwable)
  }
  
}


```

###  catching(throwable) at MainTest.main(test415.kt:12)

User code:
```kotlin
package test415
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.catching(throwable)
    logger.catching(throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test415
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test415.MainTest", methodName = "main", fileName = "test415.kt", lineNumber = 12), throwable)
    logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test415.MainTest", methodName = "main", fileName = "test415.kt", lineNumber = 13), throwable)
  }
  
}


```
