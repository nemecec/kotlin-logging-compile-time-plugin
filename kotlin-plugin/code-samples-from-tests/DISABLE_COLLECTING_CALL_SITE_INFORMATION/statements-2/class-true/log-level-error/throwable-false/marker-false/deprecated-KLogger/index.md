## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error("error message {}") at MainTest.main(test1204.kt:12)

User code:
```kotlin
package test1204
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.error("error message {}")
    logger.error("error message {}")
  }
  
}


```
  
Transformed into:
```kotlin
package test1204
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"")
    logger.at(Level.ERROR) { message = "error message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"")
  }
  
}


```

###  error(message) at MainTest.main(test1205.kt:12)

User code:
```kotlin
package test1205
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "error message as variable"
    logger.error(message)
    logger.error(message)
  }
  
}


```
  
Transformed into:
```kotlin
package test1205
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "error message as variable"
    logger.at(Level.ERROR) { message = "error message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
    logger.at(Level.ERROR) { message = "error message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
  }
  
}


```
