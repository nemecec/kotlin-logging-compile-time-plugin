## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=true / throwing/catching API



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
    
    logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)"), throwable)
    throw logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)"), throwable)
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
    
    logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)"), throwable)
    logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)"), throwable)
  }
  
}


```
