## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=INFO / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info("info message {}", throwable) at MainTest.main(test194.kt:12)

User code:
```kotlin
package test194
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.info("info message {}", throwable)
  }
  
}


```
  
Remains as-is:
```kotlin
package test194
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.info("info message {}", throwable)
  }
  
}


```

###  info(message, throwable) at MainTest.main(test195.kt:12)

User code:
```kotlin
package test195
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "info message as variable"
    logger.info(message, throwable)
  }
  
}


```
  
Remains as-is:
```kotlin
package test195
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "info message as variable"
    logger.info(message, throwable)
  }
  
}


```
