## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=false



###  debug(throwable) { "debug messageBuilder" } at Test671Kt.main(test671.kt:12)

User code:
```kotlin
package test671
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug(throwable) { "debug messageBuilder" }
  logger.debug(throwable) { "debug messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test671
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"")
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"")
}




```

###  debug(throwable) { "debug messageBuilder $i" } at Test672Kt.main(test672.kt:12)

User code:
```kotlin
package test672
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable) { "debug messageBuilder $i" }
  logger.debug(throwable) { "debug messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test672
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"")
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"")
}




```

###  debug(throwable) { "debug messageBuilder $i ${helper()}" } at Test673Kt.main(test673.kt:12)

User code:
```kotlin
package test673
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
  logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test673
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"")
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"



```

###  debug(throwable, messageLambda) at Test674Kt.main(test674.kt:12)

User code:
```kotlin
package test674
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(throwable, messageLambda)
  logger.debug(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test674
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
}




```

###  atDebug() { message="debug eventBuilder"; cause=throwable } at Test675Kt.main(test675.kt:12)

User code:
```kotlin
package test675
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atDebug() { message="debug eventBuilder"; cause=throwable }
  logger.atDebug() { message="debug eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test675
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"")
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"")
}




```

###  atDebug() { message="debug eventBuilder $i"; cause=throwable } at Test676Kt.main(test676.kt:12)

User code:
```kotlin
package test676
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
  logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test676
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"")
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"")
}




```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test677Kt.main(test677.kt:12)

User code:
```kotlin
package test677
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test677
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"")
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"



```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable } at Test678Kt.main(test678.kt:12)

User code:
```kotlin
package test678
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test678
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"")
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"")
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable } at Test679Kt.main(test679.kt:12)

User code:
```kotlin
package test679
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test679
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"")
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"")
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test680Kt.main(test680.kt:12)

User code:
```kotlin
package test680
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test680
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"")
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"



```
