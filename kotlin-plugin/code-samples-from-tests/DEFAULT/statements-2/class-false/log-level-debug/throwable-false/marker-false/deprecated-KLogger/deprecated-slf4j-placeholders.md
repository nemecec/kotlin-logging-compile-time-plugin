## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  debug("debug message {}", arg) at Test1361Kt.main(test1361.kt:12)

User code:
```kotlin
package test1361
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.debug("debug message {}", arg)
  logger.debug("debug message {}", arg)
}




```
  
Transformed into:
```kotlin
package test1361
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.DEBUG) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1361.Test1361Kt", methodName = "main", fileName = "test1361.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1361.Test1361Kt", methodName = "main", fileName = "test1361.kt", lineNumber = 13)
}




```

###  debug("debug message with concatenation $arg {}", arg) at Test1362Kt.main(test1362.kt:12)

User code:
```kotlin
package test1362
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.debug("debug message with concatenation $arg {}", arg)
  logger.debug("debug message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test1362
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.DEBUG) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message with concatenation $arg {}\"", className = "test1362.Test1362Kt", methodName = "main", fileName = "test1362.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message with concatenation $arg {}\"", className = "test1362.Test1362Kt", methodName = "main", fileName = "test1362.kt", lineNumber = 13)
}




```

###  debug("debug with extension function {} interval", arg.minutes) at Test1363Kt.main(test1363.kt:12)

User code:
```kotlin
package test1363
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.debug("debug with extension function {} interval", arg.minutes)
  logger.debug("debug with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test1363
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug with extension function {} interval\"", className = "test1363.Test1363Kt", methodName = "main", fileName = "test1363.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug with extension function {} interval\"", className = "test1363.Test1363Kt", methodName = "main", fileName = "test1363.kt", lineNumber = 13)
}




```

###  debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test1364Kt.main(test1364.kt:12)

User code:
```kotlin
package test1364
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  logger.debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1364
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.DEBUG) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1364.Test1364Kt", methodName = "main", fileName = "test1364.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1364.Test1364Kt", methodName = "main", fileName = "test1364.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test1365Kt.main(test1365.kt:12)

User code:
```kotlin
package test1365
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  logger.debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test1365
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1365.Test1365Kt", methodName = "main", fileName = "test1365.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1365.Test1365Kt", methodName = "main", fileName = "test1365.kt", lineNumber = 13)
}
fun ab() = 12



```
