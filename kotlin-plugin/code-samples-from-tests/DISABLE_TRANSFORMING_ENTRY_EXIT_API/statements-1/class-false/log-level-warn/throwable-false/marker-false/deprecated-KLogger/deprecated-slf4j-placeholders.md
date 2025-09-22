## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  warn("warn message {}", arg) at Test711Kt.main(test711.kt:12)

User code:
```kotlin
package test711
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.warn("warn message {}", arg)
}




```
  
Transformed into:
```kotlin
package test711
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.WARN) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test711.Test711Kt", methodName = "main", fileName = "test711.kt", lineNumber = 12)
}




```

###  warn("warn message with concatenation $arg {}", arg) at Test712Kt.main(test712.kt:12)

User code:
```kotlin
package test712
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.warn("warn message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test712
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.WARN) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message with concatenation $arg {}\"", className = "test712.Test712Kt", methodName = "main", fileName = "test712.kt", lineNumber = 12)
}




```

###  warn("warn with extension function {} interval", arg.minutes) at Test713Kt.main(test713.kt:12)

User code:
```kotlin
package test713
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.warn("warn with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test713
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn with extension function {} interval\"", className = "test713.Test713Kt", methodName = "main", fileName = "test713.kt", lineNumber = 12)
}




```

###  warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test714Kt.main(test714.kt:12)

User code:
```kotlin
package test714
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test714
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.WARN) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test714.Test714Kt", methodName = "main", fileName = "test714.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test715Kt.main(test715.kt:12)

User code:
```kotlin
package test715
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test715
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test715.Test715Kt", methodName = "main", fileName = "test715.kt", lineNumber = 12)
}
fun ab() = 12



```
