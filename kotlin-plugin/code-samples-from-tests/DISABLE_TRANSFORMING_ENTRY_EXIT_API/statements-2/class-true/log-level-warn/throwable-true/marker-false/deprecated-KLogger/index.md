## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}", throwable) at MainTest.main(test1084.kt:12)

User code:
```kotlin
package test1084
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.warn("warn message {}", throwable)
    logger.warn("warn message {}", throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test1084
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1084.MainTest", methodName = "main", fileName = "test1084.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1084.MainTest", methodName = "main", fileName = "test1084.kt", lineNumber = 13)
  }
  
}


```

###  warn(message, throwable) at MainTest.main(test1085.kt:12)

User code:
```kotlin
package test1085
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "warn message as variable"
    logger.warn(message, throwable)
    logger.warn(message, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test1085
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "warn message as variable"
    logger.at(Level.WARN) { message = "warn message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1085.MainTest", methodName = "main", fileName = "test1085.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1085.MainTest", methodName = "main", fileName = "test1085.kt", lineNumber = 13)
  }
  
}


```
