## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / entry/exit API



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
  
Transformed into:
```kotlin
package test406
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)"))
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
  
Transformed into:
```kotlin
package test407
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  return logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)"))
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
