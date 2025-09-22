## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info(marker) { "info messageBuilder" } at Test616Kt.main(test616.kt:12)

User code:
```kotlin
package test616
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.info(marker) { "info messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test616
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker) { "info messageBuilder $i" } at Test617Kt.main(test617.kt:12)

User code:
```kotlin
package test617
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.info(marker) { "info messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test617
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker) { "info messageBuilder $i ${helper()}" } at Test618Kt.main(test618.kt:12)

User code:
```kotlin
package test618
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.info(marker) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test618
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {}") at Test619Kt.main(test619.kt:12)

User code:
```kotlin
package test619
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.info(marker, "info message {}")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test619
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message = "info message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, message) at Test620Kt.main(test620.kt:12)

User code:
```kotlin
package test620
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val message = "info message as variable"
  logger.info(marker, message)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test620
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val message = "info message as variable"
  logger.at(Level.INFO, marker) { message = "info message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
