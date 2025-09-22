## featureFlag=DEFAULT / With 1 log statement(s) / with class=true / throwing/catching API



###  throwing(throwable) at MainTest.main(test4.kt:12)

User code:
```kotlin
package test4
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    throw logger.throwing(throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test4
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    throw logger.throwingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "throwing(throwable)", className = "test4.MainTest", methodName = "main", fileName = "test4.kt", lineNumber = 12), throwable)
  }
  
}


```

###  catching(throwable) at MainTest.main(test5.kt:12)

User code:
```kotlin
package test5
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.catching(throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test5
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.catchingWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "catching(throwable)", className = "test5.MainTest", methodName = "main", fileName = "test5.kt", lineNumber = 12), throwable)
  }
  
}


```
