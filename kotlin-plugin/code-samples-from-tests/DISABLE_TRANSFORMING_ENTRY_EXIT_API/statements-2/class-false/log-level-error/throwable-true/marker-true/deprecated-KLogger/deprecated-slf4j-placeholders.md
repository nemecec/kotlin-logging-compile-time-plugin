## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  error(marker, "error message {}", arg, throwable) at Test1541Kt.main(test1541.kt:12)

User code:
```kotlin
package test1541
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.error(marker, "error message {}", arg, throwable)
  logger.error(marker, "error message {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1541
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.ERROR, marker) { message = "error message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test1541.Test1541Kt", methodName = "main", fileName = "test1541.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}\"", className = "test1541.Test1541Kt", methodName = "main", fileName = "test1541.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message with concatenation $arg {}", arg, throwable) at Test1542Kt.main(test1542.kt:12)

User code:
```kotlin
package test1542
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.error(marker, "error message with concatenation $arg {}", arg, throwable)
  logger.error(marker, "error message with concatenation $arg {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1542
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.ERROR, marker) { message = "error message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message with concatenation $arg {}\"", className = "test1542.Test1542Kt", methodName = "main", fileName = "test1542.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message with concatenation $arg {}\"", className = "test1542.Test1542Kt", methodName = "main", fileName = "test1542.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error with extension function {} interval", arg.minutes, throwable) at Test1543Kt.main(test1543.kt:12)

User code:
```kotlin
package test1543
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.error(marker, "error with extension function {} interval", arg.minutes, throwable)
  logger.error(marker, "error with extension function {} interval", arg.minutes, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1543
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR, marker) { message = "error with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error with extension function {} interval\"", className = "test1543.Test1543Kt", methodName = "main", fileName = "test1543.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error with extension function {} interval\"", className = "test1543.Test1543Kt", methodName = "main", fileName = "test1543.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test1544Kt.main(test1544.kt:12)

User code:
```kotlin
package test1544
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.error(marker, "error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  logger.error(marker, "error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1544
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.ERROR, marker) { message = "error message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1544.Test1544Kt", methodName = "main", fileName = "test1544.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1544.Test1544Kt", methodName = "main", fileName = "test1544.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test1545Kt.main(test1545.kt:12)

User code:
```kotlin
package test1545
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.error(marker, "error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  logger.error(marker, "error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1545
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.ERROR, marker) { message = "error message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1545.Test1545Kt", methodName = "main", fileName = "test1545.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1545.Test1545Kt", methodName = "main", fileName = "test1545.kt", lineNumber = 13)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
