## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  error("error message {}", arg) at Test791Kt.main(test791.kt:12)

User code:
```kotlin
package test791
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.error("error message {}", arg)
}




```
  
Transformed into:
```kotlin
package test791
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}")
}




```

###  error("error message with concatenation $arg {}", arg) at Test792Kt.main(test792.kt:12)

User code:
```kotlin
package test792
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.error("error message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test792
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message with concatenation 42 {}")
}




```

###  error("error with extension function {} interval", arg.minutes) at Test793Kt.main(test793.kt:12)

User code:
```kotlin
package test793
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.error("error with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test793
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error with extension function {} interval")
}




```

###  error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test794Kt.main(test794.kt:12)

User code:
```kotlin
package test794
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test794
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {} {}{} abc {}")
}
fun helper() = "Hello!"



```

###  error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test795Kt.main(test795.kt:12)

User code:
```kotlin
package test795
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test795
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}a {}b {}ab ab")
}
fun ab() = 12



```
