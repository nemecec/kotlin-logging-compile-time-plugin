## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=true / with log level=DEBUG / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}", throwable) at MainTest.main(test114.kt:12)

User code:
```kotlin
package test114
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug("debug message {}", throwable)
  }
  
}


```
  
Remains as-is:
```kotlin
package test114
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug("debug message {}", throwable)
  }
  
}


```

###  debug(message, throwable) at MainTest.main(test115.kt:12)

User code:
```kotlin
package test115
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "debug message as variable"
    logger.debug(message, throwable)
  }
  
}


```
  
Remains as-is:
```kotlin
package test115
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "debug message as variable"
    logger.debug(message, throwable)
  }
  
}


```
