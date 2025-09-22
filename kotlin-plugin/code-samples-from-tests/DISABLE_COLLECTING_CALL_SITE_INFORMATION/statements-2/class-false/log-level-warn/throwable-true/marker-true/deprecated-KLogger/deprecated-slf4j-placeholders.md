## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  warn(marker, "warn message {}", arg, throwable) at Test1461Kt.main(test1461.kt:12)

User code:
```kotlin
package test1461
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.warn(marker, "warn message {}", arg, throwable)
  logger.warn(marker, "warn message {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1461
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.WARN, marker) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"")
at(Level.WARN, marker) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"")
  logger.at(Level.WARN, marker) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"")
at(Level.WARN, marker) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message with concatenation $arg {}", arg, throwable) at Test1462Kt.main(test1462.kt:12)

User code:
```kotlin
package test1462
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.warn(marker, "warn message with concatenation $arg {}", arg, throwable)
  logger.warn(marker, "warn message with concatenation $arg {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1462
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"")
at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"")
  logger.at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"")
at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn with extension function {} interval", arg.minutes, throwable) at Test1463Kt.main(test1463.kt:12)

User code:
```kotlin
package test1463
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.warn(marker, "warn with extension function {} interval", arg.minutes, throwable)
  logger.warn(marker, "warn with extension function {} interval", arg.minutes, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1463
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN, marker) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"")
at(Level.WARN, marker) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"")
  logger.at(Level.WARN, marker) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"")
at(Level.WARN, marker) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test1464Kt.main(test1464.kt:12)

User code:
```kotlin
package test1464
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  logger.warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1464
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.WARN, marker) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"")
at(Level.WARN, marker) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"")
  logger.at(Level.WARN, marker) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"")
at(Level.WARN, marker) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test1465Kt.main(test1465.kt:12)

User code:
```kotlin
package test1465
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  logger.warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1465
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"")
at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"")
  logger.at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"")
at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"")
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
