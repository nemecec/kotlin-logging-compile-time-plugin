## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  error("error message {}", arg, throwable) at Test751Kt.main(test751.kt:12)

User code:
```kotlin
package test751
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.error("error message {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test751
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.ERROR) { message = "error message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test751.Test751Kt", methodName = "main", fileName = "test751.kt", lineNumber = 12)
}




```

###  error("error message with concatenation $arg {}", arg, throwable) at Test752Kt.main(test752.kt:12)

User code:
```kotlin
package test752
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.error("error message with concatenation $arg {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test752
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"", className = "test752.Test752Kt", methodName = "main", fileName = "test752.kt", lineNumber = 12)
}




```

###  error("error with extension function {} interval", arg.minutes, throwable) at Test753Kt.main(test753.kt:12)

User code:
```kotlin
package test753
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error("error with extension function {} interval", arg.minutes, throwable)
}




```
  
Transformed into:
```kotlin
package test753
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message = "error with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"", className = "test753.Test753Kt", methodName = "main", fileName = "test753.kt", lineNumber = 12)
}




```

###  error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test754Kt.main(test754.kt:12)

User code:
```kotlin
package test754
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test754
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.ERROR) { message = "error message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test754.Test754Kt", methodName = "main", fileName = "test754.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test755Kt.main(test755.kt:12)

User code:
```kotlin
package test755
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test755
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"", className = "test755.Test755Kt", methodName = "main", fileName = "test755.kt", lineNumber = 12)
}
fun ab() = 12



```
