## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug("debug message {}") at MainTest.main(test964.kt:12)

User code:
```kotlin
package test964
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug("debug message {}")
    logger.debug("debug message {}")
  }
  
}


```
  
Transformed into:
```kotlin
package test964
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"")
at(Level.DEBUG) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"")
    logger.at(Level.DEBUG) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"")
at(Level.DEBUG) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"")
  }
  
}


```

###  debug(message) at MainTest.main(test965.kt:12)

User code:
```kotlin
package test965
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "debug message as variable"
    logger.debug(message)
    logger.debug(message)
  }
  
}


```
  
Transformed into:
```kotlin
package test965
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val message = "debug message as variable"
    logger.at(Level.DEBUG) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
at(Level.DEBUG) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
    logger.at(Level.DEBUG) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
at(Level.DEBUG) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
  }
  
}


```
