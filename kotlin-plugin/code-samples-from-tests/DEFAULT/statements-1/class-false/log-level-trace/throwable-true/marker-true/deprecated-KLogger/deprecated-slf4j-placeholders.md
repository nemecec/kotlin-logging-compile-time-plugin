## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace(marker, "trace message {}", arg, throwable) at Test411Kt.main(test411.kt:12)

User code:
```kotlin
package test411
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace(marker, "trace message {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test411
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test411.Test411Kt", methodName = "main", fileName = "test411.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message with concatenation $arg {}", arg, throwable) at Test412Kt.main(test412.kt:12)

User code:
```kotlin
package test412
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace(marker, "trace message with concatenation $arg {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test412
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message with concatenation $arg {}"", className = "test412.Test412Kt", methodName = "main", fileName = "test412.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace with extension function {} interval", arg.minutes, throwable) at Test413Kt.main(test413.kt:12)

User code:
```kotlin
package test413
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.trace(marker, "trace with extension function {} interval", arg.minutes, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test413
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace with extension function {} interval"", className = "test413.Test413Kt", methodName = "main", fileName = "test413.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test414Kt.main(test414.kt:12)

User code:
```kotlin
package test414
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test414
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test414.Test414Kt", methodName = "main", fileName = "test414.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test415Kt.main(test415.kt:12)

User code:
```kotlin
package test415
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test415
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.TRACE, marker) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}a" + " {}b" + " {}ab" + " ab"", className = "test415.Test415Kt", methodName = "main", fileName = "test415.kt", lineNumber = 12)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
