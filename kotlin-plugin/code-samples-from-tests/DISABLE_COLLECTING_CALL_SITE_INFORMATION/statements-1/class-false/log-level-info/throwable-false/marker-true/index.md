## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  atInfo(marker) { message="info eventBuilder"; cause=null } at Test625Kt.main(test625.kt:12)

User code:
```kotlin
package test625
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atInfo(marker) { message="info eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test625
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i"; cause=null } at Test626Kt.main(test626.kt:12)

User code:
```kotlin
package test626
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test626
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null } at Test627Kt.main(test627.kt:12)

User code:
```kotlin
package test627
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test627
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder"; cause=null } at Test628Kt.main(test628.kt:12)

User code:
```kotlin
package test628
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test628
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null } at Test629Kt.main(test629.kt:12)

User code:
```kotlin
package test629
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test629
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null } at Test630Kt.main(test630.kt:12)

User code:
```kotlin
package test630
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test630
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
