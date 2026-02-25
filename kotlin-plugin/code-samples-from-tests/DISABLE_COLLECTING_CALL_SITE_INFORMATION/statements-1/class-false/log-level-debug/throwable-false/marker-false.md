## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=false



###  debug() { "debug messageBuilder" } at Test281Kt.main(test281.kt:12)

User code:
```kotlin
package test281
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.debug() { "debug messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test281
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"")
}




```

###  debug() { "debug messageBuilder $i" } at Test282Kt.main(test282.kt:12)

User code:
```kotlin
package test282
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test282
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"")
}




```

###  debug() { "debug messageBuilder $i ${helper()}" } at Test283Kt.main(test283.kt:12)

User code:
```kotlin
package test283
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test283
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"



```

###  debug(messageLambda) at Test284Kt.main(test284.kt:12)

User code:
```kotlin
package test284
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(messageLambda)
}




```
  
Transformed into:
```kotlin
package test284
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
}




```

###  atDebug() { message="debug eventBuilder"; cause=null } at Test285Kt.main(test285.kt:12)

User code:
```kotlin
package test285
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atDebug() { message="debug eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test285
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"")
}




```

###  atDebug() { message="debug eventBuilder $i"; cause=null } at Test286Kt.main(test286.kt:12)

User code:
```kotlin
package test286
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test286
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"")
}




```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null } at Test287Kt.main(test287.kt:12)

User code:
```kotlin
package test287
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test287
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"



```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=null } at Test288Kt.main(test288.kt:12)

User code:
```kotlin
package test288
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test288
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"")
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null } at Test289Kt.main(test289.kt:12)

User code:
```kotlin
package test289
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test289
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"")
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null } at Test290Kt.main(test290.kt:12)

User code:
```kotlin
package test290
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test290
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"



```
