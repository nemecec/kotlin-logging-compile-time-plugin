## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



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
  logger.at(Level.TRACE) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test1281.Test1281Kt", methodName = "main", fileName = "test1281.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test1281.Test1281Kt", methodName = "main", fileName = "test1281.kt", lineNumber = 13)
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
  logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test1282.Test1282Kt", methodName = "main", fileName = "test1282.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test1282.Test1282Kt", methodName = "main", fileName = "test1282.kt", lineNumber = 13)
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
  
  
  
  logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test1283.Test1283Kt", methodName = "main", fileName = "test1283.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test1283.Test1283Kt", methodName = "main", fileName = "test1283.kt", lineNumber = 13)
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
  logger.at(Level.TRACE) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1284.Test1284Kt", methodName = "main", fileName = "test1284.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1284.Test1284Kt", methodName = "main", fileName = "test1284.kt", lineNumber = 13)
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
  logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1285.Test1285Kt", methodName = "main", fileName = "test1285.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1285.Test1285Kt", methodName = "main", fileName = "test1285.kt", lineNumber = 13)
}
fun ab() = 12



```
