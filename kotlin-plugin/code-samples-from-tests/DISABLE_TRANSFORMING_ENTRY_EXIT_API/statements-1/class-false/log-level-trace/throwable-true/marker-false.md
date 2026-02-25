## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=false



###  trace(throwable) { "trace messageBuilder" } at Test221Kt.main(test221.kt:12)

User code:
```kotlin
package test221
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace(throwable) { "trace messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test221
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test221.Test221Kt", methodName = "main", fileName = "test221.kt", lineNumber = 12)
}




```

###  trace(throwable) { "trace messageBuilder $i" } at Test222Kt.main(test222.kt:12)

User code:
```kotlin
package test222
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
package test222
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test222.Test222Kt", methodName = "main", fileName = "test222.kt", lineNumber = 12)
}




```

###  trace(throwable) { "trace messageBuilder $i ${helper()}" } at Test223Kt.main(test223.kt:12)

User code:
```kotlin
package test223
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
package test223
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test223.Test223Kt", methodName = "main", fileName = "test223.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  trace(throwable, messageLambda) at Test224Kt.main(test224.kt:12)

User code:
```kotlin
package test224
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
package test224
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test224.Test224Kt", methodName = "main", fileName = "test224.kt", lineNumber = 12)
}




```

###  atTrace() { message="trace eventBuilder"; cause=throwable } at Test225Kt.main(test225.kt:12)

User code:
```kotlin
package test225
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atTrace() { message="trace eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test225
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test225.Test225Kt", methodName = "main", fileName = "test225.kt", lineNumber = 12)
}




```

###  atTrace() { message="trace eventBuilder $i"; cause=throwable } at Test226Kt.main(test226.kt:12)

User code:
```kotlin
package test226
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
package test226
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test226.Test226Kt", methodName = "main", fileName = "test226.kt", lineNumber = 12)
}




```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test227Kt.main(test227.kt:12)

User code:
```kotlin
package test227
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
package test227
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test227.Test227Kt", methodName = "main", fileName = "test227.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=throwable } at Test228Kt.main(test228.kt:12)

User code:
```kotlin
package test228
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test228
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test228.Test228Kt", methodName = "main", fileName = "test228.kt", lineNumber = 12)
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable } at Test229Kt.main(test229.kt:12)

User code:
```kotlin
package test229
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
package test229
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test229.Test229Kt", methodName = "main", fileName = "test229.kt", lineNumber = 12)
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test230Kt.main(test230.kt:12)

User code:
```kotlin
package test230
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
package test230
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test230.Test230Kt", methodName = "main", fileName = "test230.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```
