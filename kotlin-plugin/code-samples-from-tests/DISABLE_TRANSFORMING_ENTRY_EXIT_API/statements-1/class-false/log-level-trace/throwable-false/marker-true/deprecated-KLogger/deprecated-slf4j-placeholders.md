## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace(marker, "trace message {}", arg) at Test451Kt.main(test451.kt:12)

User code:
```kotlin
package test451
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.trace(marker, "trace message {}", arg)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test451
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test451.Test451Kt", methodName = "main", fileName = "test451.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message with concatenation $arg {}", arg) at Test452Kt.main(test452.kt:12)

User code:
```kotlin
package test452
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.trace(marker, "trace message with concatenation $arg {}", arg)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test452
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message with concatenation $arg {}"", className = "test452.Test452Kt", methodName = "main", fileName = "test452.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace with extension function {} interval", arg.minutes) at Test453Kt.main(test453.kt:12)

User code:
```kotlin
package test453
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.trace(marker, "trace with extension function {} interval", arg.minutes)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test453
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes


private val logger = KotlinLogging.logger {}
private var arg: Long = 42
fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.TRACE, marker) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace with extension function {} interval"", className = "test453.Test453Kt", methodName = "main", fileName = "test453.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at Test454Kt.main(test454.kt:12)

User code:
```kotlin
package test454
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test454
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val arg = 42
  logger.at(Level.TRACE, marker) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test454.Test454Kt", methodName = "main", fileName = "test454.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at Test455Kt.main(test455.kt:12)

User code:
```kotlin
package test455
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val a = 1; val b = 2
  logger.trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test455
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val a = 1; val b = 2
  logger.at(Level.TRACE, marker) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}a" + " {}b" + " {}ab" + " ab"", className = "test455.Test455Kt", methodName = "main", fileName = "test455.kt", lineNumber = 12)
}
fun ab() = 12

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
