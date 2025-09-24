## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=true / throwing/catching API



###  throwing(throwable) at MainTest.main(test814.kt:12)

User code:
```kotlin
package test814
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
package test814
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test814.MainTest", methodName = "main", fileName = "test814.kt", lineNumber = 12), throwable)
    throw logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test814.MainTest", methodName = "main", fileName = "test814.kt", lineNumber = 13), throwable)
  }
  
}


```

###  catching(throwable) at MainTest.main(test815.kt:12)

User code:
```kotlin
package test815
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
package test815
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test815.MainTest", methodName = "main", fileName = "test815.kt", lineNumber = 12), throwable)
    logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test815.MainTest", methodName = "main", fileName = "test815.kt", lineNumber = 13), throwable)
  }
  
}


```
