## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / entry/exit API



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
    logger.entry(argument1, argument2)
entry(argument1, argument2)
    logger.entry(argument1, argument2)
entry(argument1, argument2)
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
    logger.exit(resultValue)
exit(resultValue)
    return logger.exit(resultValue)
exit(resultValue)
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
    
    
    
    logger.exit()
exit()
    logger.exit()
exit()
  }
  
}


```
