## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=false / entry/exit API



###  entry(argument1, argument2) at Test406Kt.main(test406.kt:12)

User code:
```kotlin
package test406
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entry(argument1, argument2)
}




```
  
Remains as-is:
```kotlin
package test406
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entry(argument1, argument2)
}




```

###  exit(resultValue) at Test407Kt.main(test407.kt:12)

User code:
```kotlin
package test407
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  return logger.exit(resultValue)
}




```
  
Remains as-is:
```kotlin
package test407
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  return logger.exit(resultValue)
}




```

###  exit() at Test408Kt.main(test408.kt:12)

User code:
```kotlin
package test408
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.exit()
}




```
  
Remains as-is:
```kotlin
package test408
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.exit()
}




```
