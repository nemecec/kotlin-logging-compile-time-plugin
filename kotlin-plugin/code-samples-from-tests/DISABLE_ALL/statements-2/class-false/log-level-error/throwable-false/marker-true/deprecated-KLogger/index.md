## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error(marker) { "error messageBuilder" } at Test1586Kt.main(test1586.kt:12)

User code:
```kotlin
package test1586
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.error(marker) { "error messageBuilder" }
  logger.error(marker) { "error messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test1586
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.error(marker) { "error messageBuilder" }
  logger.error(marker) { "error messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker) { "error messageBuilder $i" } at Test1587Kt.main(test1587.kt:12)

User code:
```kotlin
package test1587
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.error(marker) { "error messageBuilder $i" }
  logger.error(marker) { "error messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test1587
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.error(marker) { "error messageBuilder $i" }
  logger.error(marker) { "error messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker) { "error messageBuilder $i ${helper()}" } at Test1588Kt.main(test1588.kt:12)

User code:
```kotlin
package test1588
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.error(marker) { "error messageBuilder $i ${helper()}" }
  logger.error(marker) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test1588
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.error(marker) { "error messageBuilder $i ${helper()}" }
  logger.error(marker) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message {}") at Test1589Kt.main(test1589.kt:12)

User code:
```kotlin
package test1589
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.error(marker, "error message {}")
  logger.error(marker, "error message {}")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test1589
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.error(marker, "error message {}")
  logger.error(marker, "error message {}")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, message) at Test1590Kt.main(test1590.kt:12)

User code:
```kotlin
package test1590
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val message = "error message as variable"
  logger.error(marker, message)
  logger.error(marker, message)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test1590
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val message = "error message as variable"
  logger.error(marker, message)
  logger.error(marker, message)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
