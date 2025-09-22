## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug(marker, throwable) { "debug messageBuilder" } at Test1306Kt.main(test1306.kt:12)

User code:
```kotlin
package test1306
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.debug(marker, throwable) { "debug messageBuilder" }
  logger.debug(marker, throwable) { "debug messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1306
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.debug(marker, throwable) { "debug messageBuilder" }
debug(marker, throwable) { "debug messageBuilder" }
  logger.debug(marker, throwable) { "debug messageBuilder" }
debug(marker, throwable) { "debug messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, throwable) { "debug messageBuilder $i" } at Test1307Kt.main(test1307.kt:12)

User code:
```kotlin
package test1307
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(marker, throwable) { "debug messageBuilder $i" }
  logger.debug(marker, throwable) { "debug messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1307
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(marker, throwable) { "debug messageBuilder $i" }
debug(marker, throwable) { "debug messageBuilder $i" }
  logger.debug(marker, throwable) { "debug messageBuilder $i" }
debug(marker, throwable) { "debug messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, throwable) { "debug messageBuilder $i ${helper()}" } at Test1308Kt.main(test1308.kt:12)

User code:
```kotlin
package test1308
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
  logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1308
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
  logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {}", throwable) at Test1309Kt.main(test1309.kt:12)

User code:
```kotlin
package test1309
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.debug(marker, "debug message {}", throwable)
  logger.debug(marker, "debug message {}", throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1309
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.debug(marker, "debug message {}", throwable)
debug(marker, "debug message {}", throwable)
  logger.debug(marker, "debug message {}", throwable)
debug(marker, "debug message {}", throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, message, throwable) at Test1310Kt.main(test1310.kt:12)

User code:
```kotlin
package test1310
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.debug(marker, message, throwable)
  logger.debug(marker, message, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1310
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "debug message as variable"
  logger.debug(marker, message, throwable)
debug(marker, message, throwable)
  logger.debug(marker, message, throwable)
debug(marker, message, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
