## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  warn(marker, "warn message {}", arg) at Test1501Kt.main(test1501.kt:12)

User code:
```kotlin
package test1501
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.warn(marker, "warn message {}", arg)
  logger.warn(marker, "warn message {}", arg)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1501
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.WARN, marker) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1501.Test1501Kt", methodName = "main", fileName = "test1501.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1501.Test1501Kt", methodName = "main", fileName = "test1501.kt", lineNumber = 13)
  logger.at(Level.WARN, marker) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1501.Test1501Kt", methodName = "main", fileName = "test1501.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1501.Test1501Kt", methodName = "main", fileName = "test1501.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message with concatenation $arg {}", arg) at Test1502Kt.main(test1502.kt:12)

User code:
```kotlin
package test1502
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.warn(marker, "warn message with concatenation $arg {}", arg)
  logger.warn(marker, "warn message with concatenation $arg {}", arg)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1502
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"", className = "test1502.Test1502Kt", methodName = "main", fileName = "test1502.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"", className = "test1502.Test1502Kt", methodName = "main", fileName = "test1502.kt", lineNumber = 13)
  logger.at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"", className = "test1502.Test1502Kt", methodName = "main", fileName = "test1502.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"", className = "test1502.Test1502Kt", methodName = "main", fileName = "test1502.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn with extension function {} interval", arg.minutes) at Test1503Kt.main(test1503.kt:12)

User code:
```kotlin
package test1503
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.warn(marker, "warn with extension function {} interval", arg.minutes)
  logger.warn(marker, "warn with extension function {} interval", arg.minutes)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1503
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.WARN, marker) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"", className = "test1503.Test1503Kt", methodName = "main", fileName = "test1503.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"", className = "test1503.Test1503Kt", methodName = "main", fileName = "test1503.kt", lineNumber = 13)
  logger.at(Level.WARN, marker) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"", className = "test1503.Test1503Kt", methodName = "main", fileName = "test1503.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"", className = "test1503.Test1503Kt", methodName = "main", fileName = "test1503.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test1504Kt.main(test1504.kt:12)

User code:
```kotlin
package test1504
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  logger.warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1504
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.WARN, marker) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1504.Test1504Kt", methodName = "main", fileName = "test1504.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1504.Test1504Kt", methodName = "main", fileName = "test1504.kt", lineNumber = 13)
  logger.at(Level.WARN, marker) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1504.Test1504Kt", methodName = "main", fileName = "test1504.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1504.Test1504Kt", methodName = "main", fileName = "test1504.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test1505Kt.main(test1505.kt:12)

User code:
```kotlin
package test1505
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val a = 1; val b = 2
  logger.warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  logger.warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1505
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val a = 1; val b = 2
  logger.at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"", className = "test1505.Test1505Kt", methodName = "main", fileName = "test1505.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"", className = "test1505.Test1505Kt", methodName = "main", fileName = "test1505.kt", lineNumber = 13)
  logger.at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"", className = "test1505.Test1505Kt", methodName = "main", fileName = "test1505.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"", className = "test1505.Test1505Kt", methodName = "main", fileName = "test1505.kt", lineNumber = 13)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
