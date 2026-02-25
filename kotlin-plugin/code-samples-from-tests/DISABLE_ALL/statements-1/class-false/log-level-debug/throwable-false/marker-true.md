## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=true



###  debug(marker) { "debug messageBuilder" } at Test271Kt.main(test271.kt:12)

User code:
```kotlin
package test271
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
package test271
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.debug(marker) { "debug messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker) { "debug messageBuilder $i" } at Test272Kt.main(test272.kt:12)

User code:
```kotlin
package test272
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
package test272
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.debug(marker) { "debug messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker) { "debug messageBuilder $i ${helper()}" } at Test273Kt.main(test273.kt:12)

User code:
```kotlin
package test273
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
package test273
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

###  debug(marker, messageLambda) at Test274Kt.main(test274.kt:12)

User code:
```kotlin
package test274
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test274
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder"; cause=null } at Test275Kt.main(test275.kt:12)

User code:
```kotlin
package test275
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atDebug(marker) { message="debug eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test275
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atDebug(marker) { message="debug eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i"; cause=null } at Test276Kt.main(test276.kt:12)

User code:
```kotlin
package test276
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test276
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=null } at Test277Kt.main(test277.kt:12)

User code:
```kotlin
package test277
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test277
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=null } at Test278Kt.main(test278.kt:12)

User code:
```kotlin
package test278
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test278
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=null } at Test279Kt.main(test279.kt:12)

User code:
```kotlin
package test279
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test279
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=null } at Test280Kt.main(test280.kt:12)

User code:
```kotlin
package test280
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test280
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
