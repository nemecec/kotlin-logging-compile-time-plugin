## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn(throwable) { "warn messageBuilder" } at Test681Kt.main(test681.kt:12)

User code:
```kotlin
package test681
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn(throwable) { "warn messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test681
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test681.Test681Kt", methodName = "main", fileName = "test681.kt", lineNumber = 12)
}




```

###  warn(throwable) { "warn messageBuilder $i" } at Test682Kt.main(test682.kt:12)

User code:
```kotlin
package test682
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test682
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test682.Test682Kt", methodName = "main", fileName = "test682.kt", lineNumber = 12)
}




```

###  warn(throwable) { "warn messageBuilder $i ${helper()}" } at Test683Kt.main(test683.kt:12)

User code:
```kotlin
package test683
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test683
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test683.Test683Kt", methodName = "main", fileName = "test683.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  warn(throwable, messageLambda) at Test684Kt.main(test684.kt:12)

User code:
```kotlin
package test684
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test684
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.at(Level.WARN) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test684.Test684Kt", methodName = "main", fileName = "test684.kt", lineNumber = 12)
}




```

###  atWarn() { message="warn eventBuilder"; cause=throwable } at Test685Kt.main(test685.kt:12)

User code:
```kotlin
package test685
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atWarn() { message="warn eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test685
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test685.Test685Kt", methodName = "main", fileName = "test685.kt", lineNumber = 12)
}




```

###  atWarn() { message="warn eventBuilder $i"; cause=throwable } at Test686Kt.main(test686.kt:12)

User code:
```kotlin
package test686
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test686
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test686.Test686Kt", methodName = "main", fileName = "test686.kt", lineNumber = 12)
}




```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable } at Test687Kt.main(test687.kt:12)

User code:
```kotlin
package test687
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test687
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test687.Test687Kt", methodName = "main", fileName = "test687.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  at(Level.WARN) { message="warn eventBuilder"; cause=throwable } at Test688Kt.main(test688.kt:12)

User code:
```kotlin
package test688
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test688
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test688.Test688Kt", methodName = "main", fileName = "test688.kt", lineNumber = 12)
}




```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable } at Test689Kt.main(test689.kt:12)

User code:
```kotlin
package test689
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test689
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test689.Test689Kt", methodName = "main", fileName = "test689.kt", lineNumber = 12)
}




```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at Test690Kt.main(test690.kt:12)

User code:
```kotlin
package test690
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test690
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test690.Test690Kt", methodName = "main", fileName = "test690.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```
