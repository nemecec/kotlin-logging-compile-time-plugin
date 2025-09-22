## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  error("error message {}", arg, throwable) at Test1561Kt.main(test1561.kt:12)

User code:
```kotlin
package test1561
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.error("error message {}", arg, throwable)
  logger.error("error message {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test1561
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.ERROR) { message = "error message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1561.Test1561Kt", methodName = "main", fileName = "test1561.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1561.Test1561Kt", methodName = "main", fileName = "test1561.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1561.Test1561Kt", methodName = "main", fileName = "test1561.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1561.Test1561Kt", methodName = "main", fileName = "test1561.kt", lineNumber = 13)
}




```

###  error("error message with concatenation $arg {}", arg, throwable) at Test1562Kt.main(test1562.kt:12)

User code:
```kotlin
package test1562
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.error("error message with concatenation $arg {}", arg, throwable)
  logger.error("error message with concatenation $arg {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test1562
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"", className = "test1562.Test1562Kt", methodName = "main", fileName = "test1562.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"", className = "test1562.Test1562Kt", methodName = "main", fileName = "test1562.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"", className = "test1562.Test1562Kt", methodName = "main", fileName = "test1562.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"", className = "test1562.Test1562Kt", methodName = "main", fileName = "test1562.kt", lineNumber = 13)
}




```

###  error("error with extension function {} interval", arg.minutes, throwable) at Test1563Kt.main(test1563.kt:12)

User code:
```kotlin
package test1563
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error("error with extension function {} interval", arg.minutes, throwable)
  logger.error("error with extension function {} interval", arg.minutes, throwable)
}




```
  
Transformed into:
```kotlin
package test1563
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message = "error with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"", className = "test1563.Test1563Kt", methodName = "main", fileName = "test1563.kt", lineNumber = 12)
at(Level.ERROR) { message = "error with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"", className = "test1563.Test1563Kt", methodName = "main", fileName = "test1563.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"", className = "test1563.Test1563Kt", methodName = "main", fileName = "test1563.kt", lineNumber = 12)
at(Level.ERROR) { message = "error with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"", className = "test1563.Test1563Kt", methodName = "main", fileName = "test1563.kt", lineNumber = 13)
}




```

###  error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test1564Kt.main(test1564.kt:12)

User code:
```kotlin
package test1564
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  logger.error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1564
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.ERROR) { message = "error message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1564.Test1564Kt", methodName = "main", fileName = "test1564.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1564.Test1564Kt", methodName = "main", fileName = "test1564.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1564.Test1564Kt", methodName = "main", fileName = "test1564.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1564.Test1564Kt", methodName = "main", fileName = "test1564.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test1565Kt.main(test1565.kt:12)

User code:
```kotlin
package test1565
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  logger.error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test1565
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"", className = "test1565.Test1565Kt", methodName = "main", fileName = "test1565.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"", className = "test1565.Test1565Kt", methodName = "main", fileName = "test1565.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"", className = "test1565.Test1565Kt", methodName = "main", fileName = "test1565.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"", className = "test1565.Test1565Kt", methodName = "main", fileName = "test1565.kt", lineNumber = 13)
}
fun ab() = 12



```
