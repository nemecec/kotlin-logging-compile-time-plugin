## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=true / with log level=INFO / with throwable=true / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info("info message {}", throwable) at MainTest.main(test194.kt:12)

User code:
```kotlin
package test194
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.info("info message {}", throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test194
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test194.MainTest", methodName = "main", fileName = "test194.kt", lineNumber = 12)
  }
  
}


```

###  info(message, throwable) at MainTest.main(test195.kt:12)

User code:
```kotlin
package test195
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "info message as variable"
    logger.info(message, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test195
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val message = "info message as variable"
    logger.at(Level.INFO) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test195.MainTest", methodName = "main", fileName = "test195.kt", lineNumber = 12)
  }
  
}


```
