## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=TRACE / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace("trace message {}") at MainTest.main(test884.kt:12)

User code:
```kotlin
package test884
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.trace("trace message {}")
    logger.trace("trace message {}")
  }
  
}


```
  
Transformed into:
```kotlin
package test884
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message = "trace message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test884.MainTest", methodName = "main", fileName = "test884.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test884.MainTest", methodName = "main", fileName = "test884.kt", lineNumber = 13)
    logger.at(Level.TRACE) { message = "trace message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test884.MainTest", methodName = "main", fileName = "test884.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test884.MainTest", methodName = "main", fileName = "test884.kt", lineNumber = 13)
  }
  
}


```

###  trace(message) at MainTest.main(test885.kt:12)

User code:
```kotlin
package test885
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "trace message as variable"
    logger.trace(message)
    logger.trace(message)
  }
  
}


```
  
Transformed into:
```kotlin
package test885
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "trace message as variable"
    logger.at(Level.TRACE) { message = "trace message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test885.MainTest", methodName = "main", fileName = "test885.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test885.MainTest", methodName = "main", fileName = "test885.kt", lineNumber = 13)
    logger.at(Level.TRACE) { message = "trace message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test885.MainTest", methodName = "main", fileName = "test885.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test885.MainTest", methodName = "main", fileName = "test885.kt", lineNumber = 13)
  }
  
}


```
