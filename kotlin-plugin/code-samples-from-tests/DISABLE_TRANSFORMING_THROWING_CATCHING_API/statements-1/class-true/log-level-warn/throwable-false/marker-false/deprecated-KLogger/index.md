## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}") at MainTest.main(test314.kt:12)

User code:
```kotlin
package test314
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.warn("warn message {}")
  }
  
}


```
  
Transformed into:
```kotlin
package test314
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message = "warn message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test314.MainTest", methodName = "main", fileName = "test314.kt", lineNumber = 12)
  }
  
}


```

###  warn(message) at MainTest.main(test315.kt:12)

User code:
```kotlin
package test315
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "warn message as variable"
    logger.warn(message)
  }
  
}


```
  
Transformed into:
```kotlin
package test315
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "warn message as variable"
    logger.at(Level.WARN) { message = "warn message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test315.MainTest", methodName = "main", fileName = "test315.kt", lineNumber = 12)
  }
  
}


```
