## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / entry/exit API



###  entry(argument1, argument2) at MainTest.main(test811.kt:12)

User code:
```kotlin
package test811
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
package test811
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val argument1 = 42; val argument2 = true
    logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test811.MainTest", methodName = "main", fileName = "test811.kt", lineNumber = 12))
entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test811.MainTest", methodName = "main", fileName = "test811.kt", lineNumber = 13))
    logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test811.MainTest", methodName = "main", fileName = "test811.kt", lineNumber = 12))
entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test811.MainTest", methodName = "main", fileName = "test811.kt", lineNumber = 13))
  }
  
}


```

###  exit(resultValue) at MainTest.main(test812.kt:12)

User code:
```kotlin
package test812
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
package test812
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main(): Int {
    
    
    val resultValue = 42
    logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test812.MainTest", methodName = "main", fileName = "test812.kt", lineNumber = 12))
exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test812.MainTest", methodName = "main", fileName = "test812.kt", lineNumber = 13))
    return logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test812.MainTest", methodName = "main", fileName = "test812.kt", lineNumber = 12))
exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test812.MainTest", methodName = "main", fileName = "test812.kt", lineNumber = 13))
  }
  
}


```

###  exit() at MainTest.main(test813.kt:12)

User code:
```kotlin
package test813
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
package test813
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test813.MainTest", methodName = "main", fileName = "test813.kt", lineNumber = 12))
exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test813.MainTest", methodName = "main", fileName = "test813.kt", lineNumber = 13))
    logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test813.MainTest", methodName = "main", fileName = "test813.kt", lineNumber = 12))
exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test813.MainTest", methodName = "main", fileName = "test813.kt", lineNumber = 13))
  }
  
}


```
