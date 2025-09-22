## featureFlag=DEFAULT / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace("trace message {}", throwable) at MainTest.main(test34.kt:12)

User code:
```kotlin
package test34
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.trace("trace message {}", throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test34
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message = "trace message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test34.MainTest", methodName = "main", fileName = "test34.kt", lineNumber = 12)
  }
  
}


```

###  trace(message, throwable) at MainTest.main(test35.kt:12)

User code:
```kotlin
package test35
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "trace message as variable"
    logger.trace(message, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test35
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "trace message as variable"
    logger.at(Level.TRACE) { message = "trace message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test35.MainTest", methodName = "main", fileName = "test35.kt", lineNumber = 12)
  }
  
}


```
