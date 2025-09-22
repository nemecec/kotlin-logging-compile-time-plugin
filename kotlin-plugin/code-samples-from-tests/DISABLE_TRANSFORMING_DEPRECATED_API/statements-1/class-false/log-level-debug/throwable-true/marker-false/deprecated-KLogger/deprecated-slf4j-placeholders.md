## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  debug("debug message {}", arg, throwable) at Test511Kt.main(test511.kt:12)

User code:
```kotlin
package test511
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.debug("debug message {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test511
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.DEBUG) { message = "debug message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "debug message {}")
}




```

###  debug("debug message with concatenation $arg {}", arg, throwable) at Test512Kt.main(test512.kt:12)

User code:
```kotlin
package test512
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.debug("debug message with concatenation $arg {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test512
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.DEBUG) { message = "debug message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "debug message with concatenation 42 {}")
}




```

###  debug("debug with extension function {} interval", arg.minutes, throwable) at Test513Kt.main(test513.kt:12)

User code:
```kotlin
package test513
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug("debug with extension function {} interval", arg.minutes, throwable)
}




```
  
Transformed into:
```kotlin
package test513
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "debug with extension function {} interval")
}




```

###  debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test514Kt.main(test514.kt:12)

User code:
```kotlin
package test514
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test514
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.DEBUG) { message = "debug message 42 Hello!{} abc {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "debug message {} {}{} abc {}")
}
fun helper() = "Hello!"



```

###  debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test515Kt.main(test515.kt:12)

User code:
```kotlin
package test515
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test515
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "debug message {}a {}b {}ab ab")
}
fun ab() = 12



```
