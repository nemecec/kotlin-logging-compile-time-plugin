## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  error("error message {}", arg) at Test1601Kt.main(test1601.kt:12)

User code:
```kotlin
package test1601
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.error("error message {}", arg)
  logger.error("error message {}", arg)
}




```
  
Transformed into:
```kotlin
package test1601
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test1601.Test1601Kt", methodName = "main", fileName = "test1601.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test1601.Test1601Kt", methodName = "main", fileName = "test1601.kt", lineNumber = 13)
}




```

###  error("error message with concatenation $arg {}", arg) at Test1602Kt.main(test1602.kt:12)

User code:
```kotlin
package test1602
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.error("error message with concatenation $arg {}", arg)
  logger.error("error message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test1602
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message with concatenation $arg {}\"", className = "test1602.Test1602Kt", methodName = "main", fileName = "test1602.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message with concatenation $arg {}\"", className = "test1602.Test1602Kt", methodName = "main", fileName = "test1602.kt", lineNumber = 13)
}




```

###  error("error with extension function {} interval", arg.minutes) at Test1603Kt.main(test1603.kt:12)

User code:
```kotlin
package test1603
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.error("error with extension function {} interval", arg.minutes)
  logger.error("error with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test1603
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error with extension function {} interval\"", className = "test1603.Test1603Kt", methodName = "main", fileName = "test1603.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error with extension function {} interval\"", className = "test1603.Test1603Kt", methodName = "main", fileName = "test1603.kt", lineNumber = 13)
}




```

###  error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test1604Kt.main(test1604.kt:12)

User code:
```kotlin
package test1604
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  logger.error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1604
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1604.Test1604Kt", methodName = "main", fileName = "test1604.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1604.Test1604Kt", methodName = "main", fileName = "test1604.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test1605Kt.main(test1605.kt:12)

User code:
```kotlin
package test1605
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  logger.error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test1605
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1605.Test1605Kt", methodName = "main", fileName = "test1605.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1605.Test1605Kt", methodName = "main", fileName = "test1605.kt", lineNumber = 13)
}
fun ab() = 12



```
