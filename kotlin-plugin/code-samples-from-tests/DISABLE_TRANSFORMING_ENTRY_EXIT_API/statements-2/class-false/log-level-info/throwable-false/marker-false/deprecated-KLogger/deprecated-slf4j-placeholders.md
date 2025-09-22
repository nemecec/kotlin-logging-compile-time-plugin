## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info("info message {}", arg) at Test1441Kt.main(test1441.kt:12)

User code:
```kotlin
package test1441
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.info("info message {}", arg)
  logger.info("info message {}", arg)
}




```
  
Transformed into:
```kotlin
package test1441
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.INFO) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1441.Test1441Kt", methodName = "main", fileName = "test1441.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1441.Test1441Kt", methodName = "main", fileName = "test1441.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1441.Test1441Kt", methodName = "main", fileName = "test1441.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1441.Test1441Kt", methodName = "main", fileName = "test1441.kt", lineNumber = 13)
}




```

###  info("info message with concatenation $arg {}", arg) at Test1442Kt.main(test1442.kt:12)

User code:
```kotlin
package test1442
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.info("info message with concatenation $arg {}", arg)
  logger.info("info message with concatenation $arg {}", arg)
}




```
  
Transformed into:
```kotlin
package test1442
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.INFO) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"", className = "test1442.Test1442Kt", methodName = "main", fileName = "test1442.kt", lineNumber = 12)
at(Level.INFO) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"", className = "test1442.Test1442Kt", methodName = "main", fileName = "test1442.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"", className = "test1442.Test1442Kt", methodName = "main", fileName = "test1442.kt", lineNumber = 12)
at(Level.INFO) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"", className = "test1442.Test1442Kt", methodName = "main", fileName = "test1442.kt", lineNumber = 13)
}




```

###  info("info with extension function {} interval", arg.minutes) at Test1443Kt.main(test1443.kt:12)

User code:
```kotlin
package test1443
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.info("info with extension function {} interval", arg.minutes)
  logger.info("info with extension function {} interval", arg.minutes)
}




```
  
Transformed into:
```kotlin
package test1443
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"", className = "test1443.Test1443Kt", methodName = "main", fileName = "test1443.kt", lineNumber = 12)
at(Level.INFO) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"", className = "test1443.Test1443Kt", methodName = "main", fileName = "test1443.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"", className = "test1443.Test1443Kt", methodName = "main", fileName = "test1443.kt", lineNumber = 12)
at(Level.INFO) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"", className = "test1443.Test1443Kt", methodName = "main", fileName = "test1443.kt", lineNumber = 13)
}




```

###  info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test1444Kt.main(test1444.kt:12)

User code:
```kotlin
package test1444
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  logger.info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1444
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val arg = 42
  logger.at(Level.INFO) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1444.Test1444Kt", methodName = "main", fileName = "test1444.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1444.Test1444Kt", methodName = "main", fileName = "test1444.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1444.Test1444Kt", methodName = "main", fileName = "test1444.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1444.Test1444Kt", methodName = "main", fileName = "test1444.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test1445Kt.main(test1445.kt:12)

User code:
```kotlin
package test1445
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  logger.info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12



```
  
Transformed into:
```kotlin
package test1445
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val a = 1; val b = 2
  logger.at(Level.INFO) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"", className = "test1445.Test1445Kt", methodName = "main", fileName = "test1445.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"", className = "test1445.Test1445Kt", methodName = "main", fileName = "test1445.kt", lineNumber = 13)
  logger.at(Level.INFO) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"", className = "test1445.Test1445Kt", methodName = "main", fileName = "test1445.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"", className = "test1445.Test1445Kt", methodName = "main", fileName = "test1445.kt", lineNumber = 13)
}
fun ab() = 12



```
