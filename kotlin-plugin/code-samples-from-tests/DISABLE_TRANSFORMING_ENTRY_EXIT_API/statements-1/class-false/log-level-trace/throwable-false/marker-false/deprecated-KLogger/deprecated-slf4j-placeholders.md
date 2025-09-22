## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace("trace message {}", arg) at Test471Kt.main(test471.kt:12)

User code:
```kotlin
package test471
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.trace("trace message {}", arg)
}




```
  
Transformed into:
```kotlin
package test471
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test471.Test471Kt", methodName = "main", fileName = "test471.kt", lineNumber = 12)
}




```

###  trace("trace message with concatenation $arg {}", arg) at Test472Kt.main(test472.kt:12)

User code:
```kotlin
package test472
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.trace("trace message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test472
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message with concatenation $arg {}"", className = "test472.Test472Kt", methodName = "main", fileName = "test472.kt", lineNumber = 12)
}




```

###  trace("trace with extension function {} interval", arg.minutes) at Test473Kt.main(test473.kt:12)

User code:
```kotlin
package test473
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.trace("trace with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test473
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace with extension function {} interval"", className = "test473.Test473Kt", methodName = "main", fileName = "test473.kt", lineNumber = 12)
}




```

###  trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test474Kt.main(test474.kt:12)

User code:
```kotlin
package test474
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test474
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.TRACE) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test474.Test474Kt", methodName = "main", fileName = "test474.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test475Kt.main(test475.kt:12)

User code:
```kotlin
package test475
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test475
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}a" + " {}b" + " {}ab" + " ab"", className = "test475.Test475Kt", methodName = "main", fileName = "test475.kt", lineNumber = 12)
}
fun ab() = 12



```
