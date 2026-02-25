## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / entry/exit API



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
  
Transformed into:
```kotlin
package test206
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test206.Test206Kt", methodName = "main", fileName = "test206.kt", lineNumber = 12))
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
  
Transformed into:
```kotlin
package test207
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  return logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test207.Test207Kt", methodName = "main", fileName = "test207.kt", lineNumber = 12))
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
  
Transformed into:
```kotlin
package test208
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test208.Test208Kt", methodName = "main", fileName = "test208.kt", lineNumber = 12))
}




```
