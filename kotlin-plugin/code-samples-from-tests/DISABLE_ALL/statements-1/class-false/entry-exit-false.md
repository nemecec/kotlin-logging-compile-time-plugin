## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / entry/exit API



###  entry(argument1, argument2) at Test206Kt.main(test206.kt:12)

User code:
```kotlin
package test206
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entry(argument1, argument2)
}




```
  
Remains as-is:
```kotlin
package test206
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entry(argument1, argument2)
}




```

###  exit(resultValue) at Test207Kt.main(test207.kt:12)

User code:
```kotlin
package test207
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  return logger.exit(resultValue)
}




```
  
Remains as-is:
```kotlin
package test207
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  return logger.exit(resultValue)
}




```

###  exit() at Test208Kt.main(test208.kt:12)

User code:
```kotlin
package test208
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.exit()
}




```
  
Remains as-is:
```kotlin
package test208
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.exit()
}




```
