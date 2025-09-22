## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API

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
  
Transformed into:
```kotlin
package test154
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test154.MainTest", methodName = "main", fileName = "test154.kt", lineNumber = 12)
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
  
Transformed into:
```kotlin
package test155
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "debug message as variable"
    logger.at(Level.DEBUG) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test155.MainTest", methodName = "main", fileName = "test155.kt", lineNumber = 12)
  }
  
}


```
