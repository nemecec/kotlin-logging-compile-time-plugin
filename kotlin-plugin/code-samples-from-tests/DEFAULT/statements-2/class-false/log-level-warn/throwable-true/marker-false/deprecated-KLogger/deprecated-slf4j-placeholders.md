## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  warn("warn message {}", arg, throwable) at Test1481Kt.main(test1481.kt:12)

User code:
```kotlin
package test1481
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.warn("warn message {}", arg, throwable)
  logger.warn("warn message {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test1481
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.WARN) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1481.Test1481Kt", methodName = "main", fileName = "test1481.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1481.Test1481Kt", methodName = "main", fileName = "test1481.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1481.Test1481Kt", methodName = "main", fileName = "test1481.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1481.Test1481Kt", methodName = "main", fileName = "test1481.kt", lineNumber = 13)
}




```

###  warn("warn message with concatenation $arg {}", arg, throwable) at Test1482Kt.main(test1482.kt:12)

User code:
```kotlin
package test1482
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.warn("warn message with concatenation $arg {}", arg, throwable)
  logger.warn("warn message with concatenation $arg {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test1482
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.WARN) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message with concatenation $arg {}\"", className = "test1482.Test1482Kt", methodName = "main", fileName = "test1482.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message with concatenation $arg {}\"", className = "test1482.Test1482Kt", methodName = "main", fileName = "test1482.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message with concatenation $arg {}\"", className = "test1482.Test1482Kt", methodName = "main", fileName = "test1482.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message with concatenation $arg {}\"", className = "test1482.Test1482Kt", methodName = "main", fileName = "test1482.kt", lineNumber = 13)
}




```

###  warn("warn with extension function {} interval", arg.minutes, throwable) at Test1483Kt.main(test1483.kt:12)

User code:
```kotlin
package test1483
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn("warn with extension function {} interval", arg.minutes, throwable)
  logger.warn("warn with extension function {} interval", arg.minutes, throwable)
}




```
  
Transformed into:
```kotlin
package test1483
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn with extension function {} interval\"", className = "test1483.Test1483Kt", methodName = "main", fileName = "test1483.kt", lineNumber = 12)
at(Level.WARN) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn with extension function {} interval\"", className = "test1483.Test1483Kt", methodName = "main", fileName = "test1483.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn with extension function {} interval\"", className = "test1483.Test1483Kt", methodName = "main", fileName = "test1483.kt", lineNumber = 12)
at(Level.WARN) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn with extension function {} interval\"", className = "test1483.Test1483Kt", methodName = "main", fileName = "test1483.kt", lineNumber = 13)
}




```

###  warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test1484Kt.main(test1484.kt:12)

User code:
```kotlin
package test1484
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  logger.warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1484
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.WARN) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1484.Test1484Kt", methodName = "main", fileName = "test1484.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1484.Test1484Kt", methodName = "main", fileName = "test1484.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1484.Test1484Kt", methodName = "main", fileName = "test1484.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1484.Test1484Kt", methodName = "main", fileName = "test1484.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test1485Kt.main(test1485.kt:12)

User code:
```kotlin
package test1485
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  logger.warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test1485
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1485.Test1485Kt", methodName = "main", fileName = "test1485.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1485.Test1485Kt", methodName = "main", fileName = "test1485.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1485.Test1485Kt", methodName = "main", fileName = "test1485.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1485.Test1485Kt", methodName = "main", fileName = "test1485.kt", lineNumber = 13)
}
fun ab() = 12



```
