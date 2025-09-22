## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  debug(marker, "debug message {}", arg) at Test1341Kt.main(test1341.kt:12)

User code:
```kotlin
package test1341
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.debug(marker, "debug message {}", arg)
  logger.debug(marker, "debug message {}", arg)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1341
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.DEBUG, marker) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test1341.Test1341Kt", methodName = "main", fileName = "test1341.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test1341.Test1341Kt", methodName = "main", fileName = "test1341.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test1341.Test1341Kt", methodName = "main", fileName = "test1341.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test1341.Test1341Kt", methodName = "main", fileName = "test1341.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message with concatenation $arg {}", arg) at Test1342Kt.main(test1342.kt:12)

User code:
```kotlin
package test1342
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.debug(marker, "debug message with concatenation $arg {}", arg)
  logger.debug(marker, "debug message with concatenation $arg {}", arg)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1342
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"", className = "test1342.Test1342Kt", methodName = "main", fileName = "test1342.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"", className = "test1342.Test1342Kt", methodName = "main", fileName = "test1342.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"", className = "test1342.Test1342Kt", methodName = "main", fileName = "test1342.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"", className = "test1342.Test1342Kt", methodName = "main", fileName = "test1342.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug with extension function {} interval", arg.minutes) at Test1343Kt.main(test1343.kt:12)

User code:
```kotlin
package test1343
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.debug(marker, "debug with extension function {} interval", arg.minutes)
  logger.debug(marker, "debug with extension function {} interval", arg.minutes)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1343
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"", className = "test1343.Test1343Kt", methodName = "main", fileName = "test1343.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"", className = "test1343.Test1343Kt", methodName = "main", fileName = "test1343.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"", className = "test1343.Test1343Kt", methodName = "main", fileName = "test1343.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"", className = "test1343.Test1343Kt", methodName = "main", fileName = "test1343.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test1344Kt.main(test1344.kt:12)

User code:
```kotlin
package test1344
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  logger.debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1344
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.DEBUG, marker) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1344.Test1344Kt", methodName = "main", fileName = "test1344.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1344.Test1344Kt", methodName = "main", fileName = "test1344.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1344.Test1344Kt", methodName = "main", fileName = "test1344.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1344.Test1344Kt", methodName = "main", fileName = "test1344.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test1345Kt.main(test1345.kt:12)

User code:
```kotlin
package test1345
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val a = 1; val b = 2
  logger.debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  logger.debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1345
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val a = 1; val b = 2
  logger.at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"", className = "test1345.Test1345Kt", methodName = "main", fileName = "test1345.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"", className = "test1345.Test1345Kt", methodName = "main", fileName = "test1345.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"", className = "test1345.Test1345Kt", methodName = "main", fileName = "test1345.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"", className = "test1345.Test1345Kt", methodName = "main", fileName = "test1345.kt", lineNumber = 13)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
