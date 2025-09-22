## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace("trace message {}") at MainTest.main(test74.kt:12)

User code:
```kotlin
package test74
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.trace("trace message {}")
  }
  
}


```
  
Remains as-is:
```kotlin
package test74
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.trace("trace message {}")
  }
  
}


```

###  trace(message) at MainTest.main(test75.kt:12)

User code:
```kotlin
package test75
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "trace message as variable"
    logger.trace(message)
  }
  
}


```
  
Remains as-is:
```kotlin
package test75
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "trace message as variable"
    logger.trace(message)
  }
  
}


```
