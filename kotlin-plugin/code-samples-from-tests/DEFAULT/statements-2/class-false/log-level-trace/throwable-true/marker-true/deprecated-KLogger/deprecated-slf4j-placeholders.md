## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace(marker, "trace message {}", arg, throwable) at Test1221Kt.main(test1221.kt:12)

User code:
```kotlin
package test1221
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace(marker, "trace message {}", arg, throwable)
  logger.trace(marker, "trace message {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1221
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test1221.Test1221Kt", methodName = "main", fileName = "test1221.kt", lineNumber = 12)
  logger.at(Level.TRACE, marker) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test1221.Test1221Kt", methodName = "main", fileName = "test1221.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message with concatenation $arg {}", arg, throwable) at Test1222Kt.main(test1222.kt:12)

User code:
```kotlin
package test1222
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace(marker, "trace message with concatenation $arg {}", arg, throwable)
  logger.trace(marker, "trace message with concatenation $arg {}", arg, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1222
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test1222.Test1222Kt", methodName = "main", fileName = "test1222.kt", lineNumber = 12)
  logger.at(Level.TRACE, marker) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test1222.Test1222Kt", methodName = "main", fileName = "test1222.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace with extension function {} interval", arg.minutes, throwable) at Test1223Kt.main(test1223.kt:12)

User code:
```kotlin
package test1223
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.trace(marker, "trace with extension function {} interval", arg.minutes, throwable)
  logger.trace(marker, "trace with extension function {} interval", arg.minutes, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1223
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test1223.Test1223Kt", methodName = "main", fileName = "test1223.kt", lineNumber = 12)
  logger.at(Level.TRACE, marker) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test1223.Test1223Kt", methodName = "main", fileName = "test1223.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at Test1224Kt.main(test1224.kt:12)

User code:
```kotlin
package test1224
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  logger.trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1224
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1224.Test1224Kt", methodName = "main", fileName = "test1224.kt", lineNumber = 12)
  logger.at(Level.TRACE, marker) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1224.Test1224Kt", methodName = "main", fileName = "test1224.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at Test1225Kt.main(test1225.kt:12)

User code:
```kotlin
package test1225
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  logger.trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1225
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val a = 1; val b = 2
  logger.at(Level.TRACE, marker) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1225.Test1225Kt", methodName = "main", fileName = "test1225.kt", lineNumber = 12)
  logger.at(Level.TRACE, marker) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1225.Test1225Kt", methodName = "main", fileName = "test1225.kt", lineNumber = 13)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
