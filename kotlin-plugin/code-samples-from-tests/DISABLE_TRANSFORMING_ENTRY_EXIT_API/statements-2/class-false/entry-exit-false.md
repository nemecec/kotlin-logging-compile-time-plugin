## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / entry/exit API



###  entry(argument1, argument2) at Test1216Kt.main(test1216.kt:12)

User code:
```kotlin
package test1216
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entry(argument1, argument2)
  logger.entry(argument1, argument2)
}




```
  
Transformed into:
```kotlin
package test1216
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entry(argument1, argument2)
entry(argument1, argument2)
  logger.entry(argument1, argument2)
entry(argument1, argument2)
}




```

###  exit(resultValue) at Test1217Kt.main(test1217.kt:12)

User code:
```kotlin
package test1217
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  logger.exit(resultValue)
  return logger.exit(resultValue)
}




```
  
Transformed into:
```kotlin
package test1217
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  logger.exit(resultValue)
exit(resultValue)
  return logger.exit(resultValue)
exit(resultValue)
}




```

###  exit() at Test1218Kt.main(test1218.kt:12)

User code:
```kotlin
package test1218
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.exit()
  logger.exit()
}




```
  
Transformed into:
```kotlin
package test1218
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.exit()
exit()
  logger.exit()
exit()
}




```
