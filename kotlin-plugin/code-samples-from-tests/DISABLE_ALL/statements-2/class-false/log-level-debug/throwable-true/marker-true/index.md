## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  debug(throwable, marker) { "debug messageBuilder" } at Test1311Kt.main(test1311.kt:12)

User code:
```kotlin
package test1311
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.debug(throwable, marker) { "debug messageBuilder" }
  logger.debug(throwable, marker) { "debug messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1311
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.debug(throwable, marker) { "debug messageBuilder" }
debug(throwable, marker) { "debug messageBuilder" }
  logger.debug(throwable, marker) { "debug messageBuilder" }
debug(throwable, marker) { "debug messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(throwable, marker) { "debug messageBuilder $i" } at Test1312Kt.main(test1312.kt:12)

User code:
```kotlin
package test1312
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable, marker) { "debug messageBuilder $i" }
  logger.debug(throwable, marker) { "debug messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1312
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable, marker) { "debug messageBuilder $i" }
debug(throwable, marker) { "debug messageBuilder $i" }
  logger.debug(throwable, marker) { "debug messageBuilder $i" }
debug(throwable, marker) { "debug messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(throwable, marker) { "debug messageBuilder $i ${helper()}" } at Test1313Kt.main(test1313.kt:12)

User code:
```kotlin
package test1313
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable, marker) { "debug messageBuilder $i ${helper()}" }
  logger.debug(throwable, marker) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1313
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable, marker) { "debug messageBuilder $i ${helper()}" }
debug(throwable, marker) { "debug messageBuilder $i ${helper()}" }
  logger.debug(throwable, marker) { "debug messageBuilder $i ${helper()}" }
debug(throwable, marker) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(throwable, marker, messageLambda) at Test1314Kt.main(test1314.kt:12)

User code:
```kotlin
package test1314
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(throwable, marker, messageLambda)
  logger.debug(throwable, marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1314
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(throwable, marker, messageLambda)
debug(throwable, marker, messageLambda)
  logger.debug(throwable, marker, messageLambda)
debug(throwable, marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder"; cause=throwable } at Test1315Kt.main(test1315.kt:12)

User code:
```kotlin
package test1315
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atDebug(marker) { message="debug eventBuilder"; cause=throwable }
  logger.atDebug(marker) { message="debug eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1315
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atDebug(marker) { message="debug eventBuilder"; cause=throwable }
atDebug(marker) { message="debug eventBuilder"; cause=throwable }
  logger.atDebug(marker) { message="debug eventBuilder"; cause=throwable }
atDebug(marker) { message="debug eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i"; cause=throwable } at Test1316Kt.main(test1316.kt:12)

User code:
```kotlin
package test1316
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
  logger.atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1316
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
  logger.atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test1317Kt.main(test1317.kt:12)

User code:
```kotlin
package test1317
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1317
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable } at Test1318Kt.main(test1318.kt:12)

User code:
```kotlin
package test1318
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1318
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable } at Test1319Kt.main(test1319.kt:12)

User code:
```kotlin
package test1319
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1319
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test1320Kt.main(test1320.kt:12)

User code:
```kotlin
package test1320
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1320
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
