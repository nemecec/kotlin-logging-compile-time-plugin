## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=true / with log level=INFO / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info("info message {}") at MainTest.main(test234.kt:12)

User code:
```kotlin
package test234
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.info("info message {}")
  }
  
}


```
  
Remains as-is:
```kotlin
package test234
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.info("info message {}")
  }
  
}


```

###  info(message) at MainTest.main(test235.kt:12)

User code:
```kotlin
package test235
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "info message as variable"
    logger.info(message)
  }
  
}


```
  
Remains as-is:
```kotlin
package test235
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "info message as variable"
    logger.info(message)
  }
  
}


```
