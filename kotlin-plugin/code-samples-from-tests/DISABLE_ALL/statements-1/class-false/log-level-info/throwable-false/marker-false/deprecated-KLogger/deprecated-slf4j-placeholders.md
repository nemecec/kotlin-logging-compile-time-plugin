## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info("info message {}", arg) at Test631Kt.main(test631.kt:12)

User code:
```kotlin
package test631
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.info("info message {}", arg)
}




```
  
Transformed into:
```kotlin
package test631
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.INFO) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}")
}




```

###  info("info message with concatenation $arg {}", arg) at Test632Kt.main(test632.kt:12)

User code:
```kotlin
package test632
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.info("info message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test632
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.INFO) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message with concatenation 42 {}")
}




```

###  info("info with extension function {} interval", arg.minutes) at Test633Kt.main(test633.kt:12)

User code:
```kotlin
package test633
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.info("info with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test633
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info with extension function {} interval")
}




```

###  info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test634Kt.main(test634.kt:12)

User code:
```kotlin
package test634
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test634
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.INFO) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {} {}{} abc {}")
}
fun helper() = "Hello!"



```

###  info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test635Kt.main(test635.kt:12)

User code:
```kotlin
package test635
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test635
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.INFO) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "info message {}a {}b {}ab ab")
}
fun ab() = 12



```
