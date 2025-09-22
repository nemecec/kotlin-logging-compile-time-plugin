## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}") at MainTest.main(test1124.kt:12)

User code:
```kotlin
package test1124
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.warn("warn message {}")
    logger.warn("warn message {}")
  }
  
}


```
  
Transformed into:
```kotlin
package test1124
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.warn("warn message {}")
warn("warn message {}")
    logger.warn("warn message {}")
warn("warn message {}")
  }
  
}


```

###  warn(message) at MainTest.main(test1125.kt:12)

User code:
```kotlin
package test1125
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "warn message as variable"
    logger.warn(message)
    logger.warn(message)
  }
  
}


```
  
Transformed into:
```kotlin
package test1125
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "warn message as variable"
    logger.warn(message)
warn(message)
    logger.warn(message)
warn(message)
  }
  
}


```
