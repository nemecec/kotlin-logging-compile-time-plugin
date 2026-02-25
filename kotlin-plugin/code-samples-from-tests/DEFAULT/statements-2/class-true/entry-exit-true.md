## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / entry/exit API



###  entry(argument1, argument2) at MainTest.main(test411.kt:12)

User code:
```kotlin
package test411
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val argument1 = 42; val argument2 = true
    logger.entry(argument1, argument2)
    logger.entry(argument1, argument2)
  }
  
}


```
  
Transformed into:
```kotlin
package test411
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val argument1 = 42; val argument2 = true
    logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test411.MainTest", methodName = "main", fileName = "test411.kt", lineNumber = 12))
    logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test411.MainTest", methodName = "main", fileName = "test411.kt", lineNumber = 13))
  }
  
}


```

###  exit(resultValue) at MainTest.main(test412.kt:12)

User code:
```kotlin
package test412
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main(): Int {
    
    
    val resultValue = 42
    logger.exit(resultValue)
    return logger.exit(resultValue)
  }
  
}


```
  
Transformed into:
```kotlin
package test412
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main(): Int {
    
    
    val resultValue = 42
    logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test412.MainTest", methodName = "main", fileName = "test412.kt", lineNumber = 12))
    return logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test412.MainTest", methodName = "main", fileName = "test412.kt", lineNumber = 13))
  }
  
}


```

###  exit() at MainTest.main(test413.kt:12)

User code:
```kotlin
package test413
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.exit()
    logger.exit()
  }
  
}


```
  
Transformed into:
```kotlin
package test413
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test413.MainTest", methodName = "main", fileName = "test413.kt", lineNumber = 12))
    logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test413.MainTest", methodName = "main", fileName = "test413.kt", lineNumber = 13))
  }
  
}


```
