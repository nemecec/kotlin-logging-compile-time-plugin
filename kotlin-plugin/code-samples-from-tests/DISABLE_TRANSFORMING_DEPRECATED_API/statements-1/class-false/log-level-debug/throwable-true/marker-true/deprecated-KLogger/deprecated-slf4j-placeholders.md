## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  debug(marker, "debug message {}", arg, throwable) at Test491Kt.main(test491.kt:12)

User code:
```kotlin
package test491
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.debug(marker, "debug message {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test491
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.DEBUG, marker) { message = "debug message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "debug message {}")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message with concatenation $arg {}", arg, throwable) at Test492Kt.main(test492.kt:12)

User code:
```kotlin
package test492
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.debug(marker, "debug message with concatenation $arg {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test492
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "debug message with concatenation 42 {}")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug with extension function {} interval", arg.minutes, throwable) at Test493Kt.main(test493.kt:12)

User code:
```kotlin
package test493
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.debug(marker, "debug with extension function {} interval", arg.minutes, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test493
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "debug with extension function {} interval")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test494Kt.main(test494.kt:12)

User code:
```kotlin
package test494
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test494
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.DEBUG, marker) { message = "debug message 42 Hello!{} abc {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "debug message {} {}{} abc {}")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test495Kt.main(test495.kt:12)

User code:
```kotlin
package test495
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test495
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "debug message {}a {}b {}ab ab")
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
