## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  info(throwable, marker) { "info messageBuilder" } at Test1391Kt.main(test1391.kt:12)

User code:
```kotlin
package test1391
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.info(throwable, marker) { "info messageBuilder" }
  logger.info(throwable, marker) { "info messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1391
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.info(throwable, marker) { "info messageBuilder" }
info(throwable, marker) { "info messageBuilder" }
  logger.info(throwable, marker) { "info messageBuilder" }
info(throwable, marker) { "info messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(throwable, marker) { "info messageBuilder $i" } at Test1392Kt.main(test1392.kt:12)

User code:
```kotlin
package test1392
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable, marker) { "info messageBuilder $i" }
  logger.info(throwable, marker) { "info messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1392
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable, marker) { "info messageBuilder $i" }
info(throwable, marker) { "info messageBuilder $i" }
  logger.info(throwable, marker) { "info messageBuilder $i" }
info(throwable, marker) { "info messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(throwable, marker) { "info messageBuilder $i ${helper()}" } at Test1393Kt.main(test1393.kt:12)

User code:
```kotlin
package test1393
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable, marker) { "info messageBuilder $i ${helper()}" }
  logger.info(throwable, marker) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1393
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable, marker) { "info messageBuilder $i ${helper()}" }
info(throwable, marker) { "info messageBuilder $i ${helper()}" }
  logger.info(throwable, marker) { "info messageBuilder $i ${helper()}" }
info(throwable, marker) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(throwable, marker, messageLambda) at Test1394Kt.main(test1394.kt:12)

User code:
```kotlin
package test1394
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(throwable, marker, messageLambda)
  logger.info(throwable, marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1394
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(throwable, marker, messageLambda)
info(throwable, marker, messageLambda)
  logger.info(throwable, marker, messageLambda)
info(throwable, marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder"; cause=throwable } at Test1395Kt.main(test1395.kt:12)

User code:
```kotlin
package test1395
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atInfo(marker) { message="info eventBuilder"; cause=throwable }
  logger.atInfo(marker) { message="info eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1395
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atInfo(marker) { message="info eventBuilder"; cause=throwable }
atInfo(marker) { message="info eventBuilder"; cause=throwable }
  logger.atInfo(marker) { message="info eventBuilder"; cause=throwable }
atInfo(marker) { message="info eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i"; cause=throwable } at Test1396Kt.main(test1396.kt:12)

User code:
```kotlin
package test1396
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i"; cause=throwable }
  logger.atInfo(marker) { message="info eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1396
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i"; cause=throwable }
atInfo(marker) { message="info eventBuilder $i"; cause=throwable }
  logger.atInfo(marker) { message="info eventBuilder $i"; cause=throwable }
atInfo(marker) { message="info eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test1397Kt.main(test1397.kt:12)

User code:
```kotlin
package test1397
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1397
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder"; cause=throwable } at Test1398Kt.main(test1398.kt:12)

User code:
```kotlin
package test1398
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=throwable }
  logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1398
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=throwable }
at(Level.INFO, marker) { message="info eventBuilder"; cause=throwable }
  logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=throwable }
at(Level.INFO, marker) { message="info eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i"; cause=throwable } at Test1399Kt.main(test1399.kt:12)

User code:
```kotlin
package test1399
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=throwable }
  logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1399
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=throwable }
at(Level.INFO, marker) { message="info eventBuilder $i"; cause=throwable }
  logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=throwable }
at(Level.INFO, marker) { message="info eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test1400Kt.main(test1400.kt:12)

User code:
```kotlin
package test1400
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1400
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
