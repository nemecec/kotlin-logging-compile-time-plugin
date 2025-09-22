## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn(marker, throwable) { "warn messageBuilder" } at Test1466Kt.main(test1466.kt:12)

User code:
```kotlin
package test1466
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.warn(marker, throwable) { "warn messageBuilder" }
  logger.warn(marker, throwable) { "warn messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1466
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN, marker) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder"", className = "test1466.Test1466Kt", methodName = "main", fileName = "test1466.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder"", className = "test1466.Test1466Kt", methodName = "main", fileName = "test1466.kt", lineNumber = 13)
  logger.at(Level.WARN, marker) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder"", className = "test1466.Test1466Kt", methodName = "main", fileName = "test1466.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder"", className = "test1466.Test1466Kt", methodName = "main", fileName = "test1466.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable) { "warn messageBuilder $i" } at Test1467Kt.main(test1467.kt:12)

User code:
```kotlin
package test1467
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(marker, throwable) { "warn messageBuilder $i" }
  logger.warn(marker, throwable) { "warn messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1467
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN, marker) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i"", className = "test1467.Test1467Kt", methodName = "main", fileName = "test1467.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i"", className = "test1467.Test1467Kt", methodName = "main", fileName = "test1467.kt", lineNumber = 13)
  logger.at(Level.WARN, marker) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i"", className = "test1467.Test1467Kt", methodName = "main", fileName = "test1467.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i"", className = "test1467.Test1467Kt", methodName = "main", fileName = "test1467.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable) { "warn messageBuilder $i ${helper()}" } at Test1468Kt.main(test1468.kt:12)

User code:
```kotlin
package test1468
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(marker, throwable) { "warn messageBuilder $i ${helper()}" }
  logger.warn(marker, throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1468
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i ${helper()}"", className = "test1468.Test1468Kt", methodName = "main", fileName = "test1468.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i ${helper()}"", className = "test1468.Test1468Kt", methodName = "main", fileName = "test1468.kt", lineNumber = 13)
  logger.at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i ${helper()}"", className = "test1468.Test1468Kt", methodName = "main", fileName = "test1468.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i ${helper()}"", className = "test1468.Test1468Kt", methodName = "main", fileName = "test1468.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {}", throwable) at Test1469Kt.main(test1469.kt:12)

User code:
```kotlin
package test1469
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.warn(marker, "warn message {}", throwable)
  logger.warn(marker, "warn message {}", throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1469
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN, marker) { message = "warn message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1469.Test1469Kt", methodName = "main", fileName = "test1469.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1469.Test1469Kt", methodName = "main", fileName = "test1469.kt", lineNumber = 13)
  logger.at(Level.WARN, marker) { message = "warn message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1469.Test1469Kt", methodName = "main", fileName = "test1469.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test1469.Test1469Kt", methodName = "main", fileName = "test1469.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, message, throwable) at Test1470Kt.main(test1470.kt:12)

User code:
```kotlin
package test1470
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "warn message as variable"
  logger.warn(marker, message, throwable)
  logger.warn(marker, message, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1470
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "warn message as variable"
  logger.at(Level.WARN, marker) { message = "warn message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1470.Test1470Kt", methodName = "main", fileName = "test1470.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1470.Test1470Kt", methodName = "main", fileName = "test1470.kt", lineNumber = 13)
  logger.at(Level.WARN, marker) { message = "warn message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1470.Test1470Kt", methodName = "main", fileName = "test1470.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1470.Test1470Kt", methodName = "main", fileName = "test1470.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
