## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info("info message {}", arg) at Test1441Kt.main(test1441.kt:12)

User code:
```kotlin
package test1441
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.info("info message {}", arg)
  logger.info("info message {}", arg)
}




```
  
Transformed into:
```kotlin
package test1441
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.INFO) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}")
at(Level.INFO) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}")
  logger.at(Level.INFO) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}")
at(Level.INFO) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}")
}




```

###  info("info message with concatenation $arg {}", arg) at Test1442Kt.main(test1442.kt:12)

User code:
```kotlin
package test1442
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.info("info message with concatenation $arg {}", arg)
  logger.info("info message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test1442
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.INFO) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message with concatenation 42 {}")
at(Level.INFO) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message with concatenation 42 {}")
  logger.at(Level.INFO) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message with concatenation 42 {}")
at(Level.INFO) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message with concatenation 42 {}")
}




```

###  info("info with extension function {} interval", arg.minutes) at Test1443Kt.main(test1443.kt:12)

User code:
```kotlin
package test1443
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.info("info with extension function {} interval", arg.minutes)
  logger.info("info with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test1443
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info with extension function {} interval")
at(Level.INFO) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info with extension function {} interval")
  logger.at(Level.INFO) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info with extension function {} interval")
at(Level.INFO) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info with extension function {} interval")
}




```

###  info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test1444Kt.main(test1444.kt:12)

User code:
```kotlin
package test1444
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  logger.info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1444
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.INFO) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {} {}{} abc {}")
at(Level.INFO) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {} {}{} abc {}")
  logger.at(Level.INFO) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {} {}{} abc {}")
at(Level.INFO) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {} {}{} abc {}")
}
fun helper() = "Hello!"



```

###  info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test1445Kt.main(test1445.kt:12)

User code:
```kotlin
package test1445
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  logger.info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test1445
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.INFO) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}a {}b {}ab ab")
at(Level.INFO) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}a {}b {}ab ab")
  logger.at(Level.INFO) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}a {}b {}ab ab")
at(Level.INFO) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}a {}b {}ab ab")
}
fun ab() = 12



```
