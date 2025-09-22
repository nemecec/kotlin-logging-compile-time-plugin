## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace("trace message {}", arg, throwable) at Test431Kt.main(test431.kt:12)

User code:
```kotlin
package test431
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace("trace message {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test431
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test431.Test431Kt", methodName = "main", fileName = "test431.kt", lineNumber = 12)
}




```

###  trace("trace message with concatenation $arg {}", arg, throwable) at Test432Kt.main(test432.kt:12)

User code:
```kotlin
package test432
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace("trace message with concatenation $arg {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test432
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message with concatenation $arg {}"", className = "test432.Test432Kt", methodName = "main", fileName = "test432.kt", lineNumber = 12)
}




```

###  trace("trace with extension function {} interval", arg.minutes, throwable) at Test433Kt.main(test433.kt:12)

User code:
```kotlin
package test433
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace("trace with extension function {} interval", arg.minutes, throwable)
}




```
  
Transformed into:
```kotlin
package test433
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace with extension function {} interval"", className = "test433.Test433Kt", methodName = "main", fileName = "test433.kt", lineNumber = 12)
}




```

###  trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test434Kt.main(test434.kt:12)

User code:
```kotlin
package test434
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test434
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test434.Test434Kt", methodName = "main", fileName = "test434.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test435Kt.main(test435.kt:12)

User code:
```kotlin
package test435
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test435
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}a" + " {}b" + " {}ab" + " ab"", className = "test435.Test435Kt", methodName = "main", fileName = "test435.kt", lineNumber = 12)
}
fun ab() = 12



```
