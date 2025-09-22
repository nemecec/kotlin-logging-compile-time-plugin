## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}") at MainTest.main(test154.kt:12)

User code:
```kotlin
package test154
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug("debug message {}")
  }
  
}


```
  
Remains as-is:
```kotlin
package test154
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug("debug message {}")
  }
  
}


```

###  debug(message) at MainTest.main(test155.kt:12)

User code:
```kotlin
package test155
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "debug message as variable"
    logger.debug(message)
  }
  
}


```
  
Remains as-is:
```kotlin
package test155
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "debug message as variable"
    logger.debug(message)
  }
  
}


```
