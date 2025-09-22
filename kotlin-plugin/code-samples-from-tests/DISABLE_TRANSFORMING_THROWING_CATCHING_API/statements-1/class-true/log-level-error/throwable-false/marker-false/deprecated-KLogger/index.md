## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error("error message {}") at MainTest.main(test394.kt:12)

User code:
```kotlin
package test394
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.error("error message {}")
  }
  
}


```
  
Transformed into:
```kotlin
package test394
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test394.MainTest", methodName = "main", fileName = "test394.kt", lineNumber = 12)
  }
  
}


```

###  error(message) at MainTest.main(test395.kt:12)

User code:
```kotlin
package test395
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "error message as variable"
    logger.error(message)
  }
  
}


```
  
Transformed into:
```kotlin
package test395
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "error message as variable"
    logger.at(Level.ERROR) { message = "error message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test395.MainTest", methodName = "main", fileName = "test395.kt", lineNumber = 12)
  }
  
}


```
