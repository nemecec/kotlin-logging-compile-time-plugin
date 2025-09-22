## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  trace(throwable) { "trace messageBuilder" } at Test441Kt.main(test441.kt:12)

User code:
```kotlin
package test441
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace(throwable) { "trace messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test441
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder"", className = "test441.Test441Kt", methodName = "main", fileName = "test441.kt", lineNumber = 12)
}




```

###  trace(throwable) { "trace messageBuilder $i" } at Test442Kt.main(test442.kt:12)

User code:
```kotlin
package test442
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test442
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i"", className = "test442.Test442Kt", methodName = "main", fileName = "test442.kt", lineNumber = 12)
}




```

###  trace(throwable) { "trace messageBuilder $i ${helper()}" } at Test443Kt.main(test443.kt:12)

User code:
```kotlin
package test443
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test443
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i ${helper()}"", className = "test443.Test443Kt", methodName = "main", fileName = "test443.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  trace(throwable, messageLambda) at Test444Kt.main(test444.kt:12)

User code:
```kotlin
package test444
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test444
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test444.Test444Kt", methodName = "main", fileName = "test444.kt", lineNumber = 12)
}




```

###  atTrace() { message="trace eventBuilder"; cause=throwable } at Test445Kt.main(test445.kt:12)

User code:
```kotlin
package test445
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atTrace() { message="trace eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test445
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test445.Test445Kt", methodName = "main", fileName = "test445.kt", lineNumber = 12)
}




```

###  atTrace() { message="trace eventBuilder $i"; cause=throwable } at Test446Kt.main(test446.kt:12)

User code:
```kotlin
package test446
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test446
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test446.Test446Kt", methodName = "main", fileName = "test446.kt", lineNumber = 12)
}




```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test447Kt.main(test447.kt:12)

User code:
```kotlin
package test447
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test447
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test447.Test447Kt", methodName = "main", fileName = "test447.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=throwable } at Test448Kt.main(test448.kt:12)

User code:
```kotlin
package test448
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test448
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test448.Test448Kt", methodName = "main", fileName = "test448.kt", lineNumber = 12)
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable } at Test449Kt.main(test449.kt:12)

User code:
```kotlin
package test449
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test449
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test449.Test449Kt", methodName = "main", fileName = "test449.kt", lineNumber = 12)
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test450Kt.main(test450.kt:12)

User code:
```kotlin
package test450
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test450
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test450.Test450Kt", methodName = "main", fileName = "test450.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```
