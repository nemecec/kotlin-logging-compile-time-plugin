## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace("trace message {}", arg, throwable) at Test1241Kt.main(test1241.kt:12)

User code:
```kotlin
package test1241
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace("trace message {}", arg, throwable)
  logger.trace("trace message {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test1241
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test1241.Test1241Kt", methodName = "main", fileName = "test1241.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test1241.Test1241Kt", methodName = "main", fileName = "test1241.kt", lineNumber = 13)
}




```

###  trace("trace message with concatenation $arg {}", arg, throwable) at Test1242Kt.main(test1242.kt:12)

User code:
```kotlin
package test1242
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace("trace message with concatenation $arg {}", arg, throwable)
  logger.trace("trace message with concatenation $arg {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test1242
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test1242.Test1242Kt", methodName = "main", fileName = "test1242.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test1242.Test1242Kt", methodName = "main", fileName = "test1242.kt", lineNumber = 13)
}




```

###  trace("trace with extension function {} interval", arg.minutes, throwable) at Test1243Kt.main(test1243.kt:12)

User code:
```kotlin
package test1243
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace("trace with extension function {} interval", arg.minutes, throwable)
  logger.trace("trace with extension function {} interval", arg.minutes, throwable)
}




```
  
Transformed into:
```kotlin
package test1243
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test1243.Test1243Kt", methodName = "main", fileName = "test1243.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test1243.Test1243Kt", methodName = "main", fileName = "test1243.kt", lineNumber = 13)
}




```

###  trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test1244Kt.main(test1244.kt:12)

User code:
```kotlin
package test1244
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  logger.trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1244
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1244.Test1244Kt", methodName = "main", fileName = "test1244.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1244.Test1244Kt", methodName = "main", fileName = "test1244.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test1245Kt.main(test1245.kt:12)

User code:
```kotlin
package test1245
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  logger.trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test1245
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1245.Test1245Kt", methodName = "main", fileName = "test1245.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1245.Test1245Kt", methodName = "main", fileName = "test1245.kt", lineNumber = 13)
}
fun ab() = 12



```
