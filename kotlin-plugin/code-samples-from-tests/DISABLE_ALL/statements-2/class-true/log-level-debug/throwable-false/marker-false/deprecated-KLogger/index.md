## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}") at MainTest.main(test964.kt:12)

User code:
```kotlin
package test964
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug("debug message {}")
    logger.debug("debug message {}")
  }
  
}


```
  
Remains as-is:
```kotlin
package test964
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug("debug message {}")
    logger.debug("debug message {}")
  }
  
}


```

###  debug(message) at MainTest.main(test965.kt:12)

User code:
```kotlin
package test965
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "debug message as variable"
    logger.debug(message)
    logger.debug(message)
  }
  
}


```
  
Remains as-is:
```kotlin
package test965
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "debug message as variable"
    logger.debug(message)
    logger.debug(message)
  }
  
}


```
