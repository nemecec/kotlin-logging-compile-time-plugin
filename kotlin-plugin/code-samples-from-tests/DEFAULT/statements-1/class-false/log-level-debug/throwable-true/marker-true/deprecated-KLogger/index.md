## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug(marker, throwable) { "debug messageBuilder" } at Test496Kt.main(test496.kt:12)

User code:
```kotlin
package test496
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.debug(marker, throwable) { "debug messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test496
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test496.Test496Kt", methodName = "main", fileName = "test496.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, throwable) { "debug messageBuilder $i" } at Test497Kt.main(test497.kt:12)

User code:
```kotlin
package test497
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(marker, throwable) { "debug messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test497
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test497.Test497Kt", methodName = "main", fileName = "test497.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, throwable) { "debug messageBuilder $i ${helper()}" } at Test498Kt.main(test498.kt:12)

User code:
```kotlin
package test498
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test498
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test498.Test498Kt", methodName = "main", fileName = "test498.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {}", throwable) at Test499Kt.main(test499.kt:12)

User code:
```kotlin
package test499
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.debug(marker, "debug message {}", throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test499
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG, marker) { message = "debug message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test499.Test499Kt", methodName = "main", fileName = "test499.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, message, throwable) at Test500Kt.main(test500.kt:12)

User code:
```kotlin
package test500
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.debug(marker, message, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test500
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.at(Level.DEBUG, marker) { message = "debug message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test500.Test500Kt", methodName = "main", fileName = "test500.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
