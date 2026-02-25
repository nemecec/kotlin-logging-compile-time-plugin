## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=false



###  error(throwable) { "error messageBuilder" } at Test381Kt.main(test381.kt:12)

User code:
```kotlin
package test381
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error(throwable) { "error messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test381
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"")
}




```

###  error(throwable) { "error messageBuilder $i" } at Test382Kt.main(test382.kt:12)

User code:
```kotlin
package test382
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test382
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"")
}




```

###  error(throwable) { "error messageBuilder $i ${helper()}" } at Test383Kt.main(test383.kt:12)

User code:
```kotlin
package test383
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test383
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"



```

###  error(throwable, messageLambda) at Test384Kt.main(test384.kt:12)

User code:
```kotlin
package test384
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test384
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
}




```

###  atError() { message="error eventBuilder"; cause=throwable } at Test385Kt.main(test385.kt:12)

User code:
```kotlin
package test385
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atError() { message="error eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test385
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"")
}




```

###  atError() { message="error eventBuilder $i"; cause=throwable } at Test386Kt.main(test386.kt:12)

User code:
```kotlin
package test386
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test386
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"")
}




```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test387Kt.main(test387.kt:12)

User code:
```kotlin
package test387
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test387
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"



```

###  at(Level.ERROR) { message="error eventBuilder"; cause=throwable } at Test388Kt.main(test388.kt:12)

User code:
```kotlin
package test388
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test388
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"")
}




```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable } at Test389Kt.main(test389.kt:12)

User code:
```kotlin
package test389
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test389
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"")
}




```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test390Kt.main(test390.kt:12)

User code:
```kotlin
package test390
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test390
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"



```
