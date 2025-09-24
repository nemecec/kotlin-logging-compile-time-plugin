## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace("trace message {}", throwable) at MainTest.main(test844.kt:12)

User code:
```kotlin
package test844
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.trace("trace message {}", throwable)
    logger.trace("trace message {}", throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test844
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message = "trace message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test844.MainTest", methodName = "main", fileName = "test844.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test844.MainTest", methodName = "main", fileName = "test844.kt", lineNumber = 13)
  }
  
}


```

###  trace(message, throwable) at MainTest.main(test845.kt:12)

User code:
```kotlin
package test845
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "trace message as variable"
    logger.trace(message, throwable)
    logger.trace(message, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test845
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "trace message as variable"
    logger.at(Level.TRACE) { message = "trace message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test845.MainTest", methodName = "main", fileName = "test845.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test845.MainTest", methodName = "main", fileName = "test845.kt", lineNumber = 13)
  }
  
}


```
