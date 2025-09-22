## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  warn("warn message {}", arg, throwable) at Test671Kt.main(test671.kt:12)

User code:
```kotlin
package test671
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.warn("warn message {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test671
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.WARN) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {}")
}




```

###  warn("warn message with concatenation $arg {}", arg, throwable) at Test672Kt.main(test672.kt:12)

User code:
```kotlin
package test672
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.warn("warn message with concatenation $arg {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test672
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.WARN) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message with concatenation 42 {}")
}




```

###  warn("warn with extension function {} interval", arg.minutes, throwable) at Test673Kt.main(test673.kt:12)

User code:
```kotlin
package test673
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn("warn with extension function {} interval", arg.minutes, throwable)
}




```
  
Transformed into:
```kotlin
package test673
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn with extension function {} interval")
}




```

###  warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test674Kt.main(test674.kt:12)

User code:
```kotlin
package test674
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test674
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.WARN) { message = "warn message 42 Hello!{} abc {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {} {}{} abc {}")
}
fun helper() = "Hello!"



```

###  warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test675Kt.main(test675.kt:12)

User code:
```kotlin
package test675
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test675
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {}a {}b {}ab ab")
}
fun ab() = 12



```
