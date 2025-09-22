## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=true / entry/exit API



###  entry(argument1, argument2) at MainTest.main(test1.kt:12)

User code:
```kotlin
package test1
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val argument1 = 42; val argument2 = true
    logger.entry(argument1, argument2)
  }
  
}


```
  
Transformed into:
```kotlin
package test1
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val argument1 = 42; val argument2 = true
    logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)"))
  }
  
}


```

###  exit(resultValue) at MainTest.main(test2.kt:12)

User code:
```kotlin
package test2
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main(): Int {
    
    
    val resultValue = 42
    return logger.exit(resultValue)
  }
  
}


```
  
Transformed into:
```kotlin
package test2
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main(): Int {
    
    
    val resultValue = 42
    return logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)"))
  }
  
}


```

###  exit() at MainTest.main(test3.kt:12)

User code:
```kotlin
package test3
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.exit()
  }
  
}


```
  
Remains as-is:
```kotlin
package test3
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.exit()
  }
  
}


```
