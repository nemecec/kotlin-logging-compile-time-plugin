## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info("info message {}", arg, throwable) at Test591Kt.main(test591.kt:12)

User code:
```kotlin
package test591
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.info("info message {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test591
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.INFO) { message = "info message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}")
}




```

###  info("info message with concatenation $arg {}", arg, throwable) at Test592Kt.main(test592.kt:12)

User code:
```kotlin
package test592
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.info("info message with concatenation $arg {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test592
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.INFO) { message = "info message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message with concatenation 42 {}")
}




```

###  info("info with extension function {} interval", arg.minutes, throwable) at Test593Kt.main(test593.kt:12)

User code:
```kotlin
package test593
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info("info with extension function {} interval", arg.minutes, throwable)
}




```
  
Transformed into:
```kotlin
package test593
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message = "info with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info with extension function {} interval")
}




```

###  info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test594Kt.main(test594.kt:12)

User code:
```kotlin
package test594
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test594
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.INFO) { message = "info message 42 Hello!{} abc {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {} {}{} abc {}")
}
fun helper() = "Hello!"



```

###  info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test595Kt.main(test595.kt:12)

User code:
```kotlin
package test595
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test595
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.INFO) { message = "info message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}a {}b {}ab ab")
}
fun ab() = 12



```
