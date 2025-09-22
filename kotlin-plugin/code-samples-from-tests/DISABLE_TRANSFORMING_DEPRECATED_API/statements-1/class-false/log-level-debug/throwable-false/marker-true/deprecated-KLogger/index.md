## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug(marker) { "debug messageBuilder" } at Test536Kt.main(test536.kt:12)

User code:
```kotlin
package test536
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.debug(marker) { "debug messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test536
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.debug(marker) { "debug messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker) { "debug messageBuilder $i" } at Test537Kt.main(test537.kt:12)

User code:
```kotlin
package test537
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.debug(marker) { "debug messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test537
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.debug(marker) { "debug messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker) { "debug messageBuilder $i ${helper()}" } at Test538Kt.main(test538.kt:12)

User code:
```kotlin
package test538
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.debug(marker) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test538
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.debug(marker) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {}") at Test539Kt.main(test539.kt:12)

User code:
```kotlin
package test539
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.debug(marker, "debug message {}")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test539
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.debug(marker, "debug message {}")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, message) at Test540Kt.main(test540.kt:12)

User code:
```kotlin
package test540
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val message = "debug message as variable"
  logger.debug(marker, message)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test540
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val message = "debug message as variable"
  logger.debug(marker, message)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
