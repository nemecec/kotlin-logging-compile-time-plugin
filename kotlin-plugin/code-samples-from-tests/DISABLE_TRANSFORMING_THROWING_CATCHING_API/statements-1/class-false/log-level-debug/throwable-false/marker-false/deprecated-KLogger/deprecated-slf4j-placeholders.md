## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  debug("debug message {}", arg) at Test551Kt.main(test551.kt:12)

User code:
```kotlin
package test551
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.debug("debug message {}", arg)
}




```
  
Transformed into:
```kotlin
package test551
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.DEBUG) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test551.Test551Kt", methodName = "main", fileName = "test551.kt", lineNumber = 12)
}




```

###  debug("debug message with concatenation $arg {}", arg) at Test552Kt.main(test552.kt:12)

User code:
```kotlin
package test552
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.debug("debug message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test552
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.DEBUG) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"", className = "test552.Test552Kt", methodName = "main", fileName = "test552.kt", lineNumber = 12)
}




```

###  debug("debug with extension function {} interval", arg.minutes) at Test553Kt.main(test553.kt:12)

User code:
```kotlin
package test553
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.debug("debug with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test553
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"", className = "test553.Test553Kt", methodName = "main", fileName = "test553.kt", lineNumber = 12)
}




```

###  debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test554Kt.main(test554.kt:12)

User code:
```kotlin
package test554
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test554
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.DEBUG) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test554.Test554Kt", methodName = "main", fileName = "test554.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test555Kt.main(test555.kt:12)

User code:
```kotlin
package test555
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test555
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"", className = "test555.Test555Kt", methodName = "main", fileName = "test555.kt", lineNumber = 12)
}
fun ab() = 12



```
