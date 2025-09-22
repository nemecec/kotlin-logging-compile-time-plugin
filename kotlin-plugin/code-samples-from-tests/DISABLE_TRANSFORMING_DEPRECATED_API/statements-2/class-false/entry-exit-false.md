## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / entry/exit API



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
  logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test1216.Test1216Kt", methodName = "main", fileName = "test1216.kt", lineNumber = 12))
entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test1216.Test1216Kt", methodName = "main", fileName = "test1216.kt", lineNumber = 13))
  logger.entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test1216.Test1216Kt", methodName = "main", fileName = "test1216.kt", lineNumber = 12))
entryWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "entry(argument1, argument2)", className = "test1216.Test1216Kt", methodName = "main", fileName = "test1216.kt", lineNumber = 13))
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
  logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test1217.Test1217Kt", methodName = "main", fileName = "test1217.kt", lineNumber = 12))
exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test1217.Test1217Kt", methodName = "main", fileName = "test1217.kt", lineNumber = 13))
  return logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test1217.Test1217Kt", methodName = "main", fileName = "test1217.kt", lineNumber = 12))
exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(messageTemplate = "exit(resultValue)", className = "test1217.Test1217Kt", methodName = "main", fileName = "test1217.kt", lineNumber = 13))
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
  
  
  
  logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test1218.Test1218Kt", methodName = "main", fileName = "test1218.kt", lineNumber = 12))
exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test1218.Test1218Kt", methodName = "main", fileName = "test1218.kt", lineNumber = 13))
  logger.exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test1218.Test1218Kt", methodName = "main", fileName = "test1218.kt", lineNumber = 12))
exitWithCompilerData(KLoggingEventBuilder.InternalCompilerData(className = "test1218.Test1218Kt", methodName = "main", fileName = "test1218.kt", lineNumber = 13))
}




```
