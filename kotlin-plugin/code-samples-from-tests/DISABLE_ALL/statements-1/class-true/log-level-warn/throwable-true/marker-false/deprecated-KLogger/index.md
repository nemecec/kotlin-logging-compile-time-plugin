## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}", throwable) at MainTest.main(test274.kt:12)

User code:
```kotlin
package test274
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.warn("warn message {}", throwable)
  }
  
}


```
  
Remains as-is:
```kotlin
package test274
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.warn("warn message {}", throwable)
  }
  
}


```

###  warn(message, throwable) at MainTest.main(test275.kt:12)

User code:
```kotlin
package test275
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "warn message as variable"
    logger.warn(message, throwable)
  }
  
}


```
  
Remains as-is:
```kotlin
package test275
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "warn message as variable"
    logger.warn(message, throwable)
  }
  
}


```
