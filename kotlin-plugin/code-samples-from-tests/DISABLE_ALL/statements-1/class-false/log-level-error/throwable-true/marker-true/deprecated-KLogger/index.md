## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  error(marker, throwable) { "error messageBuilder" } at Test736Kt.main(test736.kt:12)

User code:
```kotlin
package test736
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.error(marker, throwable) { "error messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test736
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.error(marker, throwable) { "error messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, throwable) { "error messageBuilder $i" } at Test737Kt.main(test737.kt:12)

User code:
```kotlin
package test737
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.error(marker, throwable) { "error messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test737
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.error(marker, throwable) { "error messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, throwable) { "error messageBuilder $i ${helper()}" } at Test738Kt.main(test738.kt:12)

User code:
```kotlin
package test738
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.error(marker, throwable) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test738
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.error(marker, throwable) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message {}", throwable) at Test739Kt.main(test739.kt:12)

User code:
```kotlin
package test739
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.error(marker, "error message {}", throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test739
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.error(marker, "error message {}", throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, message, throwable) at Test740Kt.main(test740.kt:12)

User code:
```kotlin
package test740
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "error message as variable"
  logger.error(marker, message, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test740
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "error message as variable"
  logger.error(marker, message, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
