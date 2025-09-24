## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info(marker, "info message {}", arg, throwable) at Test1381Kt.main(test1381.kt:12)

User code:
```kotlin
package test1381
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.info(marker, "info message {}", arg, throwable)
  logger.info(marker, "info message {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1381
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.INFO, marker) { message = "info message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"")
  logger.at(Level.INFO, marker) { message = "info message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message with concatenation $arg {}", arg, throwable) at Test1382Kt.main(test1382.kt:12)

User code:
```kotlin
package test1382
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.info(marker, "info message with concatenation $arg {}", arg, throwable)
  logger.info(marker, "info message with concatenation $arg {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1382
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.INFO, marker) { message = "info message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message with concatenation $arg {}\"")
  logger.at(Level.INFO, marker) { message = "info message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message with concatenation $arg {}\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info with extension function {} interval", arg.minutes, throwable) at Test1383Kt.main(test1383.kt:12)

User code:
```kotlin
package test1383
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.info(marker, "info with extension function {} interval", arg.minutes, throwable)
  logger.info(marker, "info with extension function {} interval", arg.minutes, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1383
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO, marker) { message = "info with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info with extension function {} interval\"")
  logger.at(Level.INFO, marker) { message = "info with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info with extension function {} interval\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test1384Kt.main(test1384.kt:12)

User code:
```kotlin
package test1384
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  logger.info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1384
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.INFO, marker) { message = "info message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"")
  logger.at(Level.INFO, marker) { message = "info message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test1385Kt.main(test1385.kt:12)

User code:
```kotlin
package test1385
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  logger.info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1385
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"")
  logger.at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"")
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
