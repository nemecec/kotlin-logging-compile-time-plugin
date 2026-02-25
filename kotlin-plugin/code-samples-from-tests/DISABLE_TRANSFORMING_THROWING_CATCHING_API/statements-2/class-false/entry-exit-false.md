## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / entry/exit API



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
  
Transformed into:
```kotlin
package test616
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val argument1 = 42; val argument2 = true
  logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test616.Test616Kt", methodName = "main", fileName = "test616.kt", lineNumber = 12))
  logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test616.Test616Kt", methodName = "main", fileName = "test616.kt", lineNumber = 13))
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
  
Transformed into:
```kotlin
package test617
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main(): Int {
  
  
  val resultValue = 42
  logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test617.Test617Kt", methodName = "main", fileName = "test617.kt", lineNumber = 12))
  return logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test617.Test617Kt", methodName = "main", fileName = "test617.kt", lineNumber = 13))
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
  
Transformed into:
```kotlin
package test618
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test618.Test618Kt", methodName = "main", fileName = "test618.kt", lineNumber = 12))
  logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test618.Test618Kt", methodName = "main", fileName = "test618.kt", lineNumber = 13))
}




```
