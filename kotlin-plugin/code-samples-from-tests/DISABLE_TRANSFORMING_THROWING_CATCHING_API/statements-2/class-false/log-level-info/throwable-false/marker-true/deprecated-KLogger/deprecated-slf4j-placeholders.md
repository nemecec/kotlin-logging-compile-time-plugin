## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info(marker, "info message {}", arg) at Test1421Kt.main(test1421.kt:12)

User code:
```kotlin
package test1421
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.info(marker, "info message {}", arg)
  logger.info(marker, "info message {}", arg)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1421
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.INFO, marker) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"", className = "test1421.Test1421Kt", methodName = "main", fileName = "test1421.kt", lineNumber = 12)
  logger.at(Level.INFO, marker) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"", className = "test1421.Test1421Kt", methodName = "main", fileName = "test1421.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message with concatenation $arg {}", arg) at Test1422Kt.main(test1422.kt:12)

User code:
```kotlin
package test1422
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.info(marker, "info message with concatenation $arg {}", arg)
  logger.info(marker, "info message with concatenation $arg {}", arg)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1422
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.INFO, marker) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message with concatenation $arg {}\"", className = "test1422.Test1422Kt", methodName = "main", fileName = "test1422.kt", lineNumber = 12)
  logger.at(Level.INFO, marker) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message with concatenation $arg {}\"", className = "test1422.Test1422Kt", methodName = "main", fileName = "test1422.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info with extension function {} interval", arg.minutes) at Test1423Kt.main(test1423.kt:12)

User code:
```kotlin
package test1423
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.info(marker, "info with extension function {} interval", arg.minutes)
  logger.info(marker, "info with extension function {} interval", arg.minutes)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1423
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info with extension function {} interval\"", className = "test1423.Test1423Kt", methodName = "main", fileName = "test1423.kt", lineNumber = 12)
  logger.at(Level.INFO, marker) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info with extension function {} interval\"", className = "test1423.Test1423Kt", methodName = "main", fileName = "test1423.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test1424Kt.main(test1424.kt:12)

User code:
```kotlin
package test1424
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  logger.info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1424
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.INFO, marker) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1424.Test1424Kt", methodName = "main", fileName = "test1424.kt", lineNumber = 12)
  logger.at(Level.INFO, marker) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1424.Test1424Kt", methodName = "main", fileName = "test1424.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test1425Kt.main(test1425.kt:12)

User code:
```kotlin
package test1425
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val a = 1; val b = 2
  logger.info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  logger.info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1425
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val a = 1; val b = 2
  logger.at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1425.Test1425Kt", methodName = "main", fileName = "test1425.kt", lineNumber = 12)
  logger.at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1425.Test1425Kt", methodName = "main", fileName = "test1425.kt", lineNumber = 13)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
