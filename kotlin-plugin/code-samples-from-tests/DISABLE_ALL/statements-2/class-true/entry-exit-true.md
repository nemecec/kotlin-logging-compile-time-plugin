## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / entry/exit API



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
  
Remains as-is:
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
  
Remains as-is:
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
  
Remains as-is:
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
