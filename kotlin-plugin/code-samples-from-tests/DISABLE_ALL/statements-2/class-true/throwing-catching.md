## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / throwing/catching API



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
  
Remains as-is:
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
  
Remains as-is:
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
