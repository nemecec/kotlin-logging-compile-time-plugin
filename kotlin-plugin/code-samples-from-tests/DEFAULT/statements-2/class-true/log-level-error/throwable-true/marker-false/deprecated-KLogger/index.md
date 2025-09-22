## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error("error message {}", throwable) at MainTest.main(test1164.kt:12)

User code:
```kotlin
package test1164
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.error("error message {}", throwable)
    logger.error("error message {}", throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test1164
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message = "error message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test1164.MainTest", methodName = "main", fileName = "test1164.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test1164.MainTest", methodName = "main", fileName = "test1164.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test1164.MainTest", methodName = "main", fileName = "test1164.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test1164.MainTest", methodName = "main", fileName = "test1164.kt", lineNumber = 13)
  }
  
}


```

###  error(message, throwable) at MainTest.main(test1165.kt:12)

User code:
```kotlin
package test1165
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "error message as variable"
    logger.error(message, throwable)
    logger.error(message, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test1165
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "error message as variable"
    logger.at(Level.ERROR) { message = "error message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1165.MainTest", methodName = "main", fileName = "test1165.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1165.MainTest", methodName = "main", fileName = "test1165.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1165.MainTest", methodName = "main", fileName = "test1165.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1165.MainTest", methodName = "main", fileName = "test1165.kt", lineNumber = 13)
  }
  
}


```
