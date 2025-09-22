## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn("warn message {}", throwable) at MainTest.main(test274.kt:12)

User code:
```kotlin
package test274
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.warn("warn message {}", throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test274
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test274.MainTest", methodName = "main", fileName = "test274.kt", lineNumber = 12)
  }
  
}


```

###  warn(message, throwable) at MainTest.main(test275.kt:12)

User code:
```kotlin
package test275
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "warn message as variable"
    logger.warn(message, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test275
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "warn message as variable"
    logger.at(Level.WARN) { message = "warn message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test275.MainTest", methodName = "main", fileName = "test275.kt", lineNumber = 12)
  }
  
}


```
