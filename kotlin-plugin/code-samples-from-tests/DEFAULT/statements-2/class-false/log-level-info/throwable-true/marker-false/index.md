## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  info(throwable) { "info messageBuilder" } at Test1411Kt.main(test1411.kt:12)

User code:
```kotlin
package test1411
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info(throwable) { "info messageBuilder" }
  logger.info(throwable) { "info messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test1411
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test1411.Test1411Kt", methodName = "main", fileName = "test1411.kt", lineNumber = 12)
at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test1411.Test1411Kt", methodName = "main", fileName = "test1411.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test1411.Test1411Kt", methodName = "main", fileName = "test1411.kt", lineNumber = 12)
at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test1411.Test1411Kt", methodName = "main", fileName = "test1411.kt", lineNumber = 13)
}




```

###  info(throwable) { "info messageBuilder $i" } at Test1412Kt.main(test1412.kt:12)

User code:
```kotlin
package test1412
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i" }
  logger.info(throwable) { "info messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test1412
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test1412.Test1412Kt", methodName = "main", fileName = "test1412.kt", lineNumber = 12)
at(Level.INFO) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test1412.Test1412Kt", methodName = "main", fileName = "test1412.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test1412.Test1412Kt", methodName = "main", fileName = "test1412.kt", lineNumber = 12)
at(Level.INFO) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test1412.Test1412Kt", methodName = "main", fileName = "test1412.kt", lineNumber = 13)
}




```

###  info(throwable) { "info messageBuilder $i ${helper()}" } at Test1413Kt.main(test1413.kt:12)

User code:
```kotlin
package test1413
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1413
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test1413.Test1413Kt", methodName = "main", fileName = "test1413.kt", lineNumber = 12)
at(Level.INFO) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test1413.Test1413Kt", methodName = "main", fileName = "test1413.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test1413.Test1413Kt", methodName = "main", fileName = "test1413.kt", lineNumber = 12)
at(Level.INFO) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test1413.Test1413Kt", methodName = "main", fileName = "test1413.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  info(throwable, messageLambda) at Test1414Kt.main(test1414.kt:12)

User code:
```kotlin
package test1414
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(throwable, messageLambda)
  logger.info(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test1414
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1414.Test1414Kt", methodName = "main", fileName = "test1414.kt", lineNumber = 12)
at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1414.Test1414Kt", methodName = "main", fileName = "test1414.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1414.Test1414Kt", methodName = "main", fileName = "test1414.kt", lineNumber = 12)
at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1414.Test1414Kt", methodName = "main", fileName = "test1414.kt", lineNumber = 13)
}




```

###  atInfo() { message="info eventBuilder"; cause=throwable } at Test1415Kt.main(test1415.kt:12)

User code:
```kotlin
package test1415
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1415
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1415.Test1415Kt", methodName = "main", fileName = "test1415.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1415.Test1415Kt", methodName = "main", fileName = "test1415.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1415.Test1415Kt", methodName = "main", fileName = "test1415.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1415.Test1415Kt", methodName = "main", fileName = "test1415.kt", lineNumber = 13)
}




```

###  atInfo() { message="info eventBuilder $i"; cause=throwable } at Test1416Kt.main(test1416.kt:12)

User code:
```kotlin
package test1416
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1416
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1416.Test1416Kt", methodName = "main", fileName = "test1416.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1416.Test1416Kt", methodName = "main", fileName = "test1416.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1416.Test1416Kt", methodName = "main", fileName = "test1416.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1416.Test1416Kt", methodName = "main", fileName = "test1416.kt", lineNumber = 13)
}




```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test1417Kt.main(test1417.kt:12)

User code:
```kotlin
package test1417
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1417
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1417.Test1417Kt", methodName = "main", fileName = "test1417.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1417.Test1417Kt", methodName = "main", fileName = "test1417.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1417.Test1417Kt", methodName = "main", fileName = "test1417.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1417.Test1417Kt", methodName = "main", fileName = "test1417.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  at(Level.INFO) { message="info eventBuilder"; cause=throwable } at Test1418Kt.main(test1418.kt:12)

User code:
```kotlin
package test1418
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1418
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1418.Test1418Kt", methodName = "main", fileName = "test1418.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1418.Test1418Kt", methodName = "main", fileName = "test1418.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1418.Test1418Kt", methodName = "main", fileName = "test1418.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1418.Test1418Kt", methodName = "main", fileName = "test1418.kt", lineNumber = 13)
}




```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=throwable } at Test1419Kt.main(test1419.kt:12)

User code:
```kotlin
package test1419
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1419
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1419.Test1419Kt", methodName = "main", fileName = "test1419.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1419.Test1419Kt", methodName = "main", fileName = "test1419.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1419.Test1419Kt", methodName = "main", fileName = "test1419.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1419.Test1419Kt", methodName = "main", fileName = "test1419.kt", lineNumber = 13)
}




```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test1420Kt.main(test1420.kt:12)

User code:
```kotlin
package test1420
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1420
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1420.Test1420Kt", methodName = "main", fileName = "test1420.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1420.Test1420Kt", methodName = "main", fileName = "test1420.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1420.Test1420Kt", methodName = "main", fileName = "test1420.kt", lineNumber = 12)
at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1420.Test1420Kt", methodName = "main", fileName = "test1420.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```
