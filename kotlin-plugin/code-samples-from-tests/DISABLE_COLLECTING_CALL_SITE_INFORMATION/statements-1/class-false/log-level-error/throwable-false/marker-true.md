## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=true



###  error(marker) { "error messageBuilder" } at Test391Kt.main(test391.kt:12)

User code:
```kotlin
package test391
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.error(marker) { "error messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test391
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker) { "error messageBuilder $i" } at Test392Kt.main(test392.kt:12)

User code:
```kotlin
package test392
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.error(marker) { "error messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test392
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker) { "error messageBuilder $i ${helper()}" } at Test393Kt.main(test393.kt:12)

User code:
```kotlin
package test393
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.error(marker) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test393
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, messageLambda) at Test394Kt.main(test394.kt:12)

User code:
```kotlin
package test394
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test394
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder"; cause=null } at Test395Kt.main(test395.kt:12)

User code:
```kotlin
package test395
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atError(marker) { message="error eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test395
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i"; cause=null } at Test396Kt.main(test396.kt:12)

User code:
```kotlin
package test396
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atError(marker) { message="error eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test396
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i ${helper()}"; cause=null } at Test397Kt.main(test397.kt:12)

User code:
```kotlin
package test397
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atError(marker) { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test397
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder"; cause=null } at Test398Kt.main(test398.kt:12)

User code:
```kotlin
package test398
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.ERROR, marker) { message="error eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test398
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=null } at Test399Kt.main(test399.kt:12)

User code:
```kotlin
package test399
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test399
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=null } at Test400Kt.main(test400.kt:12)

User code:
```kotlin
package test400
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test400
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
