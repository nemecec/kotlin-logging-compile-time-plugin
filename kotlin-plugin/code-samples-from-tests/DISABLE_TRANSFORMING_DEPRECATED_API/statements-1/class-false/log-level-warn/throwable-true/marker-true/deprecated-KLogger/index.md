## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn(marker, throwable) { "warn messageBuilder" } at Test656Kt.main(test656.kt:12)

User code:
```kotlin
package test656
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.warn(marker, throwable) { "warn messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test656
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.warn(marker, throwable) { "warn messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable) { "warn messageBuilder $i" } at Test657Kt.main(test657.kt:12)

User code:
```kotlin
package test657
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(marker, throwable) { "warn messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test657
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(marker, throwable) { "warn messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable) { "warn messageBuilder $i ${helper()}" } at Test658Kt.main(test658.kt:12)

User code:
```kotlin
package test658
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(marker, throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test658
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(marker, throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {}", throwable) at Test659Kt.main(test659.kt:12)

User code:
```kotlin
package test659
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.warn(marker, "warn message {}", throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test659
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.warn(marker, "warn message {}", throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, message, throwable) at Test660Kt.main(test660.kt:12)

User code:
```kotlin
package test660
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "warn message as variable"
  logger.warn(marker, message, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test660
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "warn message as variable"
  logger.warn(marker, message, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
