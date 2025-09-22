## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info("info message {}", arg, throwable) at Test591Kt.main(test591.kt:12)

User code:
```kotlin
package test591
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.info("info message {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test591
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.INFO) { message = "info message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test591.Test591Kt", methodName = "main", fileName = "test591.kt", lineNumber = 12)
}




```

###  info("info message with concatenation $arg {}", arg, throwable) at Test592Kt.main(test592.kt:12)

User code:
```kotlin
package test592
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.info("info message with concatenation $arg {}", arg, throwable)
}




```
  
Transformed into:
```kotlin
package test592
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.INFO) { message = "info message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"", className = "test592.Test592Kt", methodName = "main", fileName = "test592.kt", lineNumber = 12)
}




```

###  info("info with extension function {} interval", arg.minutes, throwable) at Test593Kt.main(test593.kt:12)

User code:
```kotlin
package test593
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info("info with extension function {} interval", arg.minutes, throwable)
}




```
  
Transformed into:
```kotlin
package test593
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message = "info with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"", className = "test593.Test593Kt", methodName = "main", fileName = "test593.kt", lineNumber = 12)
}




```

###  info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test594Kt.main(test594.kt:12)

User code:
```kotlin
package test594
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test594
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.INFO) { message = "info message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test594.Test594Kt", methodName = "main", fileName = "test594.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test595Kt.main(test595.kt:12)

User code:
```kotlin
package test595
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test595
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.INFO) { message = "info message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"", className = "test595.Test595Kt", methodName = "main", fileName = "test595.kt", lineNumber = 12)
}
fun ab() = 12



```
