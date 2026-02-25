## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=false



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
  
  logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"")
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
  logger.at(Level.TRACE) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"")
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
  logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"")
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
  logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
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
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"")
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
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"")
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
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"")
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
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"")
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
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"")
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
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"



```
