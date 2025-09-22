## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / throwing/catching API



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
    
    logger.throwing(throwable)
throwing(throwable)
    throw logger.throwing(throwable)
throwing(throwable)
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
    
    logger.catching(throwable)
catching(throwable)
    logger.catching(throwable)
catching(throwable)
  }
  
}


```
