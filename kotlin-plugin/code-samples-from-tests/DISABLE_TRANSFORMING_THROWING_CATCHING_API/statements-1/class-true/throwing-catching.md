## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=true / throwing/catching API



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
  
Remains as-is:
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
  
Remains as-is:
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
