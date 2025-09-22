## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace("trace message {}", arg) at Test1281Kt.main(test1281.kt:12)

User code:
```kotlin
package test1281
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.trace("trace message {}", arg)
  logger.trace("trace message {}", arg)
}




```
  
Transformed into:
```kotlin
package test1281
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"")
at(Level.TRACE) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"")
  logger.at(Level.TRACE) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"")
at(Level.TRACE) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"")
}




```

###  trace("trace message with concatenation $arg {}", arg) at Test1282Kt.main(test1282.kt:12)

User code:
```kotlin
package test1282
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.trace("trace message with concatenation $arg {}", arg)
  logger.trace("trace message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test1282
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message with concatenation $arg {}"")
at(Level.TRACE) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message with concatenation $arg {}"")
  logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message with concatenation $arg {}"")
at(Level.TRACE) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message with concatenation $arg {}"")
}




```

###  trace("trace with extension function {} interval", arg.minutes) at Test1283Kt.main(test1283.kt:12)

User code:
```kotlin
package test1283
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.trace("trace with extension function {} interval", arg.minutes)
  logger.trace("trace with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test1283
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace with extension function {} interval"")
at(Level.TRACE) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace with extension function {} interval"")
  logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace with extension function {} interval"")
at(Level.TRACE) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace with extension function {} interval"")
}




```

###  trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test1284Kt.main(test1284.kt:12)

User code:
```kotlin
package test1284
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  logger.trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1284
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {} " + "" + "{}" + "{}" + " abc" + " {}"")
at(Level.TRACE) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {} " + "" + "{}" + "{}" + " abc" + " {}"")
  logger.at(Level.TRACE) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {} " + "" + "{}" + "{}" + " abc" + " {}"")
at(Level.TRACE) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {} " + "" + "{}" + "{}" + " abc" + " {}"")
}
fun helper() = "Hello!"



```

###  trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test1285Kt.main(test1285.kt:12)

User code:
```kotlin
package test1285
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  logger.trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test1285
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}a" + " {}b" + " {}ab" + " ab"")
at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}a" + " {}b" + " {}ab" + " ab"")
  logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}a" + " {}b" + " {}ab" + " ab"")
at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}a" + " {}b" + " {}ab" + " ab"")
}
fun ab() = 12



```
