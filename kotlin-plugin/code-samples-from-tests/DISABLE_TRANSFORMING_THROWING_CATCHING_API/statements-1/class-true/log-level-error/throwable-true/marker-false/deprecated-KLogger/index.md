## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=true / with log level=ERROR / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error("error message {}", throwable) at MainTest.main(test354.kt:12)

User code:
```kotlin
package test354
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.error("error message {}", throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test354
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message = "error message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test354.MainTest", methodName = "main", fileName = "test354.kt", lineNumber = 12)
  }
  
}


```

###  error(message, throwable) at MainTest.main(test355.kt:12)

User code:
```kotlin
package test355
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "error message as variable"
    logger.error(message, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test355
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "error message as variable"
    logger.at(Level.ERROR) { message = "error message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test355.MainTest", methodName = "main", fileName = "test355.kt", lineNumber = 12)
  }
  
}


```
