## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  info() { "info messageBuilder" } at Test1451Kt.main(test1451.kt:12)

User code:
```kotlin
package test1451
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.info() { "info messageBuilder" }
  logger.info() { "info messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test1451
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test1451.Test1451Kt", methodName = "main", fileName = "test1451.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test1451.Test1451Kt", methodName = "main", fileName = "test1451.kt", lineNumber = 13)
}




```

###  info() { "info messageBuilder $i" } at Test1452Kt.main(test1452.kt:12)

User code:
```kotlin
package test1452
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.info() { "info messageBuilder $i" }
  logger.info() { "info messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test1452
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test1452.Test1452Kt", methodName = "main", fileName = "test1452.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test1452.Test1452Kt", methodName = "main", fileName = "test1452.kt", lineNumber = 13)
}




```

###  info() { "info messageBuilder $i ${helper()}" } at Test1453Kt.main(test1453.kt:12)

User code:
```kotlin
package test1453
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.info() { "info messageBuilder $i ${helper()}" }
  logger.info() { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1453
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test1453.Test1453Kt", methodName = "main", fileName = "test1453.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test1453.Test1453Kt", methodName = "main", fileName = "test1453.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  info(messageLambda) at Test1454Kt.main(test1454.kt:12)

User code:
```kotlin
package test1454
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(messageLambda)
  logger.info(messageLambda)
}




```
  
Transformed into:
```kotlin
package test1454
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.at(Level.INFO) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1454.Test1454Kt", methodName = "main", fileName = "test1454.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1454.Test1454Kt", methodName = "main", fileName = "test1454.kt", lineNumber = 13)
}




```

###  atInfo() { message="info eventBuilder"; cause=null } at Test1455Kt.main(test1455.kt:12)

User code:
```kotlin
package test1455
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atInfo() { message="info eventBuilder"; cause=null }
  logger.atInfo() { message="info eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1455
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1455.Test1455Kt", methodName = "main", fileName = "test1455.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1455.Test1455Kt", methodName = "main", fileName = "test1455.kt", lineNumber = 13)
}




```

###  atInfo() { message="info eventBuilder $i"; cause=null } at Test1456Kt.main(test1456.kt:12)

User code:
```kotlin
package test1456
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=null }
  logger.atInfo() { message="info eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1456
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1456.Test1456Kt", methodName = "main", fileName = "test1456.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1456.Test1456Kt", methodName = "main", fileName = "test1456.kt", lineNumber = 13)
}




```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=null } at Test1457Kt.main(test1457.kt:12)

User code:
```kotlin
package test1457
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1457
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1457.Test1457Kt", methodName = "main", fileName = "test1457.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1457.Test1457Kt", methodName = "main", fileName = "test1457.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  at(Level.INFO) { message="info eventBuilder"; cause=null } at Test1458Kt.main(test1458.kt:12)

User code:
```kotlin
package test1458
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
  logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1458
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1458.Test1458Kt", methodName = "main", fileName = "test1458.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test1458.Test1458Kt", methodName = "main", fileName = "test1458.kt", lineNumber = 13)
}




```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=null } at Test1459Kt.main(test1459.kt:12)

User code:
```kotlin
package test1459
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1459
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1459.Test1459Kt", methodName = "main", fileName = "test1459.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test1459.Test1459Kt", methodName = "main", fileName = "test1459.kt", lineNumber = 13)
}




```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null } at Test1460Kt.main(test1460.kt:12)

User code:
```kotlin
package test1460
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1460
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1460.Test1460Kt", methodName = "main", fileName = "test1460.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test1460.Test1460Kt", methodName = "main", fileName = "test1460.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```
