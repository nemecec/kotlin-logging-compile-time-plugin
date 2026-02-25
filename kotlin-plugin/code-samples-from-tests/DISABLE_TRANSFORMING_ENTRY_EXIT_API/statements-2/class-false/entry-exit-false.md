## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / entry/exit API



###  entry(argument1, argument2) at Test616Kt.main(test616.kt:12)

User code:
```kotlin
package test616
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entry(argument1, argument2)
  logger.entry(argument1, argument2)
}




```
  
Remains as-is:
```kotlin
package test616
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entry(argument1, argument2)
  logger.entry(argument1, argument2)
}




```

###  exit(resultValue) at Test617Kt.main(test617.kt:12)

User code:
```kotlin
package test617
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  logger.exit(resultValue)
  return logger.exit(resultValue)
}




```
  
Remains as-is:
```kotlin
package test617
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  logger.exit(resultValue)
  return logger.exit(resultValue)
}




```

###  exit() at Test618Kt.main(test618.kt:12)

User code:
```kotlin
package test618
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.exit()
  logger.exit()
}




```
  
Remains as-is:
```kotlin
package test618
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.exit()
  logger.exit()
}




```
