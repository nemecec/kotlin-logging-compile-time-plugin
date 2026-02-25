## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=false



###  debug(throwable) { "debug messageBuilder" } at Test261Kt.main(test261.kt:12)

User code:
```kotlin
package test261
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug(throwable) { "debug messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test261
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test261.Test261Kt", methodName = "main", fileName = "test261.kt", lineNumber = 12)
}




```

###  debug(throwable) { "debug messageBuilder $i" } at Test262Kt.main(test262.kt:12)

User code:
```kotlin
package test262
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
package test262
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test262.Test262Kt", methodName = "main", fileName = "test262.kt", lineNumber = 12)
}




```

###  debug(throwable) { "debug messageBuilder $i ${helper()}" } at Test263Kt.main(test263.kt:12)

User code:
```kotlin
package test263
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
package test263
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test263.Test263Kt", methodName = "main", fileName = "test263.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  debug(throwable, messageLambda) at Test264Kt.main(test264.kt:12)

User code:
```kotlin
package test264
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
package test264
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test264.Test264Kt", methodName = "main", fileName = "test264.kt", lineNumber = 12)
}




```

###  atDebug() { message="debug eventBuilder"; cause=throwable } at Test265Kt.main(test265.kt:12)

User code:
```kotlin
package test265
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atDebug() { message="debug eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test265
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test265.Test265Kt", methodName = "main", fileName = "test265.kt", lineNumber = 12)
}




```

###  atDebug() { message="debug eventBuilder $i"; cause=throwable } at Test266Kt.main(test266.kt:12)

User code:
```kotlin
package test266
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
package test266
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test266.Test266Kt", methodName = "main", fileName = "test266.kt", lineNumber = 12)
}




```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test267Kt.main(test267.kt:12)

User code:
```kotlin
package test267
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
package test267
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test267.Test267Kt", methodName = "main", fileName = "test267.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable } at Test268Kt.main(test268.kt:12)

User code:
```kotlin
package test268
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test268
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test268.Test268Kt", methodName = "main", fileName = "test268.kt", lineNumber = 12)
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable } at Test269Kt.main(test269.kt:12)

User code:
```kotlin
package test269
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
package test269
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test269.Test269Kt", methodName = "main", fileName = "test269.kt", lineNumber = 12)
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test270Kt.main(test270.kt:12)

User code:
```kotlin
package test270
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
package test270
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test270.Test270Kt", methodName = "main", fileName = "test270.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```
