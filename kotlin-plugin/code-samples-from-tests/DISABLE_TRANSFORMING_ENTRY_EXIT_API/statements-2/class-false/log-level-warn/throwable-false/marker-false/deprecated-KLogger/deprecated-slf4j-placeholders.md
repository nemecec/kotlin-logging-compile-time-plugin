## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  warn("warn message {}", arg) at Test1521Kt.main(test1521.kt:12)

User code:
```kotlin
package test1521
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.warn("warn message {}", arg)
  logger.warn("warn message {}", arg)
}




```
  
Transformed into:
```kotlin
package test1521
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.WARN) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1521.Test1521Kt", methodName = "main", fileName = "test1521.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1521.Test1521Kt", methodName = "main", fileName = "test1521.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1521.Test1521Kt", methodName = "main", fileName = "test1521.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1521.Test1521Kt", methodName = "main", fileName = "test1521.kt", lineNumber = 13)
}




```

###  warn("warn message with concatenation $arg {}", arg) at Test1522Kt.main(test1522.kt:12)

User code:
```kotlin
package test1522
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.warn("warn message with concatenation $arg {}", arg)
  logger.warn("warn message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test1522
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.WARN) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"", className = "test1522.Test1522Kt", methodName = "main", fileName = "test1522.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"", className = "test1522.Test1522Kt", methodName = "main", fileName = "test1522.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"", className = "test1522.Test1522Kt", methodName = "main", fileName = "test1522.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"", className = "test1522.Test1522Kt", methodName = "main", fileName = "test1522.kt", lineNumber = 13)
}




```

###  warn("warn with extension function {} interval", arg.minutes) at Test1523Kt.main(test1523.kt:12)

User code:
```kotlin
package test1523
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.warn("warn with extension function {} interval", arg.minutes)
  logger.warn("warn with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test1523
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"", className = "test1523.Test1523Kt", methodName = "main", fileName = "test1523.kt", lineNumber = 12)
at(Level.WARN) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"", className = "test1523.Test1523Kt", methodName = "main", fileName = "test1523.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"", className = "test1523.Test1523Kt", methodName = "main", fileName = "test1523.kt", lineNumber = 12)
at(Level.WARN) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"", className = "test1523.Test1523Kt", methodName = "main", fileName = "test1523.kt", lineNumber = 13)
}




```

###  warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test1524Kt.main(test1524.kt:12)

User code:
```kotlin
package test1524
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  logger.warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1524
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.WARN) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1524.Test1524Kt", methodName = "main", fileName = "test1524.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1524.Test1524Kt", methodName = "main", fileName = "test1524.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1524.Test1524Kt", methodName = "main", fileName = "test1524.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1524.Test1524Kt", methodName = "main", fileName = "test1524.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test1525Kt.main(test1525.kt:12)

User code:
```kotlin
package test1525
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  logger.warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test1525
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"", className = "test1525.Test1525Kt", methodName = "main", fileName = "test1525.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"", className = "test1525.Test1525Kt", methodName = "main", fileName = "test1525.kt", lineNumber = 13)
  logger.at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"", className = "test1525.Test1525Kt", methodName = "main", fileName = "test1525.kt", lineNumber = 12)
at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"", className = "test1525.Test1525Kt", methodName = "main", fileName = "test1525.kt", lineNumber = 13)
}
fun ab() = 12



```
