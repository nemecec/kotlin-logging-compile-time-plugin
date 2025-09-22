## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}", throwable) at MainTest.main(test924.kt:12)

User code:
```kotlin
package test924
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug("debug message {}", throwable)
    logger.debug("debug message {}", throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test924
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug("debug message {}", throwable)
debug("debug message {}", throwable)
    logger.debug("debug message {}", throwable)
debug("debug message {}", throwable)
  }
  
}


```

###  debug(message, throwable) at MainTest.main(test925.kt:12)

User code:
```kotlin
package test925
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "debug message as variable"
    logger.debug(message, throwable)
    logger.debug(message, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test925
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "debug message as variable"
    logger.debug(message, throwable)
debug(message, throwable)
    logger.debug(message, throwable)
debug(message, throwable)
  }
  
}


```
