## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn(marker) { "warn messageBuilder" } at Test696Kt.main(test696.kt:12)

User code:
```kotlin
package test696
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.warn(marker) { "warn messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test696
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker) { "warn messageBuilder $i" } at Test697Kt.main(test697.kt:12)

User code:
```kotlin
package test697
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.warn(marker) { "warn messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test697
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker) { "warn messageBuilder $i ${helper()}" } at Test698Kt.main(test698.kt:12)

User code:
```kotlin
package test698
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.warn(marker) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test698
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i ${helper()}"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {}") at Test699Kt.main(test699.kt:12)

User code:
```kotlin
package test699
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.warn(marker, "warn message {}")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test699
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.WARN, marker) { message = "warn message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, message) at Test700Kt.main(test700.kt:12)

User code:
```kotlin
package test700
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val message = "warn message as variable"
  logger.warn(marker, message)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test700
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val message = "warn message as variable"
  logger.at(Level.WARN, marker) { message = "warn message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
