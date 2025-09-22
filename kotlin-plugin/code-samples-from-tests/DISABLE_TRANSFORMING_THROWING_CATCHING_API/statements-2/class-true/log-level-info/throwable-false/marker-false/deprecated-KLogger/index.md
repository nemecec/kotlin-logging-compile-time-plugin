## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info("info message {}") at MainTest.main(test1044.kt:12)

User code:
```kotlin
package test1044
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.info("info message {}")
    logger.info("info message {}")
  }
  
}


```
  
Transformed into:
```kotlin
package test1044
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"", className = "test1044.MainTest", methodName = "main", fileName = "test1044.kt", lineNumber = 12)
at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"", className = "test1044.MainTest", methodName = "main", fileName = "test1044.kt", lineNumber = 13)
    logger.at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"", className = "test1044.MainTest", methodName = "main", fileName = "test1044.kt", lineNumber = 12)
at(Level.INFO) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"", className = "test1044.MainTest", methodName = "main", fileName = "test1044.kt", lineNumber = 13)
  }
  
}


```

###  info(message) at MainTest.main(test1045.kt:12)

User code:
```kotlin
package test1045
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "info message as variable"
    logger.info(message)
    logger.info(message)
  }
  
}


```
  
Transformed into:
```kotlin
package test1045
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "info message as variable"
    logger.at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1045.MainTest", methodName = "main", fileName = "test1045.kt", lineNumber = 12)
at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1045.MainTest", methodName = "main", fileName = "test1045.kt", lineNumber = 13)
    logger.at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1045.MainTest", methodName = "main", fileName = "test1045.kt", lineNumber = 12)
at(Level.INFO) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1045.MainTest", methodName = "main", fileName = "test1045.kt", lineNumber = 13)
  }
  
}


```
