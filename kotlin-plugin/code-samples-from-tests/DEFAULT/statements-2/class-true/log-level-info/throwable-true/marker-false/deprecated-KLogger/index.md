## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info("info message {}", throwable) at MainTest.main(test1004.kt:12)

User code:
```kotlin
package test1004
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.info("info message {}", throwable)
    logger.info("info message {}", throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test1004
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1004.MainTest", methodName = "main", fileName = "test1004.kt", lineNumber = 12)
at(Level.INFO) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1004.MainTest", methodName = "main", fileName = "test1004.kt", lineNumber = 13)
    logger.at(Level.INFO) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1004.MainTest", methodName = "main", fileName = "test1004.kt", lineNumber = 12)
at(Level.INFO) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1004.MainTest", methodName = "main", fileName = "test1004.kt", lineNumber = 13)
  }
  
}


```

###  info(message, throwable) at MainTest.main(test1005.kt:12)

User code:
```kotlin
package test1005
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "info message as variable"
    logger.info(message, throwable)
    logger.info(message, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test1005
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "info message as variable"
    logger.at(Level.INFO) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1005.MainTest", methodName = "main", fileName = "test1005.kt", lineNumber = 12)
at(Level.INFO) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1005.MainTest", methodName = "main", fileName = "test1005.kt", lineNumber = 13)
    logger.at(Level.INFO) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1005.MainTest", methodName = "main", fileName = "test1005.kt", lineNumber = 12)
at(Level.INFO) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1005.MainTest", methodName = "main", fileName = "test1005.kt", lineNumber = 13)
  }
  
}


```
