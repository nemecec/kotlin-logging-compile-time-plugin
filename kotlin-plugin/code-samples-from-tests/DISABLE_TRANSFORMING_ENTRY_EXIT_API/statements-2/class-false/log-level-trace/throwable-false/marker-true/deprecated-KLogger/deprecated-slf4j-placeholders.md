## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace(marker, "trace message {}", arg) at Test1261Kt.main(test1261.kt:12)

User code:
```kotlin
package test1261
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.trace(marker, "trace message {}", arg)
  logger.trace(marker, "trace message {}", arg)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1261
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test1261.Test1261Kt", methodName = "main", fileName = "test1261.kt", lineNumber = 12)
  logger.at(Level.TRACE, marker) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test1261.Test1261Kt", methodName = "main", fileName = "test1261.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message with concatenation $arg {}", arg) at Test1262Kt.main(test1262.kt:12)

User code:
```kotlin
package test1262
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.trace(marker, "trace message with concatenation $arg {}", arg)
  logger.trace(marker, "trace message with concatenation $arg {}", arg)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1262
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test1262.Test1262Kt", methodName = "main", fileName = "test1262.kt", lineNumber = 12)
  logger.at(Level.TRACE, marker) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test1262.Test1262Kt", methodName = "main", fileName = "test1262.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace with extension function {} interval", arg.minutes) at Test1263Kt.main(test1263.kt:12)

User code:
```kotlin
package test1263
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.trace(marker, "trace with extension function {} interval", arg.minutes)
  logger.trace(marker, "trace with extension function {} interval", arg.minutes)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1263
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.TRACE, marker) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test1263.Test1263Kt", methodName = "main", fileName = "test1263.kt", lineNumber = 12)
  logger.at(Level.TRACE, marker) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test1263.Test1263Kt", methodName = "main", fileName = "test1263.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test1264Kt.main(test1264.kt:12)

User code:
```kotlin
package test1264
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  logger.trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1264
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1264.Test1264Kt", methodName = "main", fileName = "test1264.kt", lineNumber = 12)
  logger.at(Level.TRACE, marker) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1264.Test1264Kt", methodName = "main", fileName = "test1264.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test1265Kt.main(test1265.kt:12)

User code:
```kotlin
package test1265
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val a = 1; val b = 2
  logger.trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  logger.trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1265
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val a = 1; val b = 2
  logger.at(Level.TRACE, marker) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1265.Test1265Kt", methodName = "main", fileName = "test1265.kt", lineNumber = 12)
  logger.at(Level.TRACE, marker) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1265.Test1265Kt", methodName = "main", fileName = "test1265.kt", lineNumber = 13)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
