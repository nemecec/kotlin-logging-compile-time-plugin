## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  debug(throwable) { "debug messageBuilder" } at Test521Kt.main(test521.kt:12)

User code:
```kotlin
package test521
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug(throwable) { "debug messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test521
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test521.Test521Kt", methodName = "main", fileName = "test521.kt", lineNumber = 12)
}




```

###  debug(throwable) { "debug messageBuilder $i" } at Test522Kt.main(test522.kt:12)

User code:
```kotlin
package test522
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable) { "debug messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test522
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test522.Test522Kt", methodName = "main", fileName = "test522.kt", lineNumber = 12)
}




```

###  debug(throwable) { "debug messageBuilder $i ${helper()}" } at Test523Kt.main(test523.kt:12)

User code:
```kotlin
package test523
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test523
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test523.Test523Kt", methodName = "main", fileName = "test523.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  debug(throwable, messageLambda) at Test524Kt.main(test524.kt:12)

User code:
```kotlin
package test524
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test524
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test524.Test524Kt", methodName = "main", fileName = "test524.kt", lineNumber = 12)
}




```

###  atDebug() { message="debug eventBuilder"; cause=throwable } at Test525Kt.main(test525.kt:12)

User code:
```kotlin
package test525
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atDebug() { message="debug eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test525
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test525.Test525Kt", methodName = "main", fileName = "test525.kt", lineNumber = 12)
}




```

###  atDebug() { message="debug eventBuilder $i"; cause=throwable } at Test526Kt.main(test526.kt:12)

User code:
```kotlin
package test526
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test526
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test526.Test526Kt", methodName = "main", fileName = "test526.kt", lineNumber = 12)
}




```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test527Kt.main(test527.kt:12)

User code:
```kotlin
package test527
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test527
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test527.Test527Kt", methodName = "main", fileName = "test527.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable } at Test528Kt.main(test528.kt:12)

User code:
```kotlin
package test528
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test528
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test528.Test528Kt", methodName = "main", fileName = "test528.kt", lineNumber = 12)
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable } at Test529Kt.main(test529.kt:12)

User code:
```kotlin
package test529
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test529
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test529.Test529Kt", methodName = "main", fileName = "test529.kt", lineNumber = 12)
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test530Kt.main(test530.kt:12)

User code:
```kotlin
package test530
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test530
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test530.Test530Kt", methodName = "main", fileName = "test530.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```
