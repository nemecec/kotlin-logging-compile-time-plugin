## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn() { "warn messageBuilder" } at Test1531Kt.main(test1531.kt:12)

User code:
```kotlin
package test1531
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn() { "warn messageBuilder" }
  logger.warn() { "warn messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test1531
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test1531.Test1531Kt", methodName = "main", fileName = "test1531.kt", lineNumber = 12)
at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test1531.Test1531Kt", methodName = "main", fileName = "test1531.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test1531.Test1531Kt", methodName = "main", fileName = "test1531.kt", lineNumber = 12)
at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test1531.Test1531Kt", methodName = "main", fileName = "test1531.kt", lineNumber = 13)
}




```

###  warn() { "warn messageBuilder $i" } at Test1532Kt.main(test1532.kt:12)

User code:
```kotlin
package test1532
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i" }
  logger.warn() { "warn messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test1532
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test1532.Test1532Kt", methodName = "main", fileName = "test1532.kt", lineNumber = 12)
at(Level.WARN) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test1532.Test1532Kt", methodName = "main", fileName = "test1532.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test1532.Test1532Kt", methodName = "main", fileName = "test1532.kt", lineNumber = 12)
at(Level.WARN) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test1532.Test1532Kt", methodName = "main", fileName = "test1532.kt", lineNumber = 13)
}




```

###  warn() { "warn messageBuilder $i ${helper()}" } at Test1533Kt.main(test1533.kt:12)

User code:
```kotlin
package test1533
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i ${helper()}" }
  logger.warn() { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1533
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test1533.Test1533Kt", methodName = "main", fileName = "test1533.kt", lineNumber = 12)
at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test1533.Test1533Kt", methodName = "main", fileName = "test1533.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test1533.Test1533Kt", methodName = "main", fileName = "test1533.kt", lineNumber = 12)
at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test1533.Test1533Kt", methodName = "main", fileName = "test1533.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  warn(messageLambda) at Test1534Kt.main(test1534.kt:12)

User code:
```kotlin
package test1534
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(messageLambda)
  logger.warn(messageLambda)
}




```
  
Transformed into:
```kotlin
package test1534
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1534.Test1534Kt", methodName = "main", fileName = "test1534.kt", lineNumber = 12)
at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1534.Test1534Kt", methodName = "main", fileName = "test1534.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1534.Test1534Kt", methodName = "main", fileName = "test1534.kt", lineNumber = 12)
at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1534.Test1534Kt", methodName = "main", fileName = "test1534.kt", lineNumber = 13)
}




```

###  atWarn() { message="warn eventBuilder"; cause=null } at Test1535Kt.main(test1535.kt:12)

User code:
```kotlin
package test1535
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atWarn() { message="warn eventBuilder"; cause=null }
  logger.atWarn() { message="warn eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1535
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test1535.Test1535Kt", methodName = "main", fileName = "test1535.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test1535.Test1535Kt", methodName = "main", fileName = "test1535.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test1535.Test1535Kt", methodName = "main", fileName = "test1535.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test1535.Test1535Kt", methodName = "main", fileName = "test1535.kt", lineNumber = 13)
}




```

###  atWarn() { message="warn eventBuilder $i"; cause=null } at Test1536Kt.main(test1536.kt:12)

User code:
```kotlin
package test1536
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1536
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test1536.Test1536Kt", methodName = "main", fileName = "test1536.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test1536.Test1536Kt", methodName = "main", fileName = "test1536.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test1536.Test1536Kt", methodName = "main", fileName = "test1536.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test1536.Test1536Kt", methodName = "main", fileName = "test1536.kt", lineNumber = 13)
}




```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null } at Test1537Kt.main(test1537.kt:12)

User code:
```kotlin
package test1537
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1537
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test1537.Test1537Kt", methodName = "main", fileName = "test1537.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test1537.Test1537Kt", methodName = "main", fileName = "test1537.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test1537.Test1537Kt", methodName = "main", fileName = "test1537.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test1537.Test1537Kt", methodName = "main", fileName = "test1537.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  at(Level.WARN) { message="warn eventBuilder"; cause=null } at Test1538Kt.main(test1538.kt:12)

User code:
```kotlin
package test1538
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1538
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test1538.Test1538Kt", methodName = "main", fileName = "test1538.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test1538.Test1538Kt", methodName = "main", fileName = "test1538.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test1538.Test1538Kt", methodName = "main", fileName = "test1538.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test1538.Test1538Kt", methodName = "main", fileName = "test1538.kt", lineNumber = 13)
}




```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=null } at Test1539Kt.main(test1539.kt:12)

User code:
```kotlin
package test1539
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1539
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test1539.Test1539Kt", methodName = "main", fileName = "test1539.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test1539.Test1539Kt", methodName = "main", fileName = "test1539.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test1539.Test1539Kt", methodName = "main", fileName = "test1539.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test1539.Test1539Kt", methodName = "main", fileName = "test1539.kt", lineNumber = 13)
}




```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null } at Test1540Kt.main(test1540.kt:12)

User code:
```kotlin
package test1540
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1540
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test1540.Test1540Kt", methodName = "main", fileName = "test1540.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test1540.Test1540Kt", methodName = "main", fileName = "test1540.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test1540.Test1540Kt", methodName = "main", fileName = "test1540.kt", lineNumber = 12)
at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test1540.Test1540Kt", methodName = "main", fileName = "test1540.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```
