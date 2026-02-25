## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=true



###  warn(marker) { "warn messageBuilder" } at Test761Kt.main(test761.kt:12)

User code:
```kotlin
package test761
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.warn(marker) { "warn messageBuilder" }
  logger.warn(marker) { "warn messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test761
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"")
  logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker) { "warn messageBuilder $i" } at Test762Kt.main(test762.kt:12)

User code:
```kotlin
package test762
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.warn(marker) { "warn messageBuilder $i" }
  logger.warn(marker) { "warn messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test762
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"")
  logger.at(Level.WARN, marker) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker) { "warn messageBuilder $i ${helper()}" } at Test763Kt.main(test763.kt:12)

User code:
```kotlin
package test763
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.warn(marker) { "warn messageBuilder $i ${helper()}" }
  logger.warn(marker) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test763
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"")
  logger.at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, messageLambda) at Test764Kt.main(test764.kt:12)

User code:
```kotlin
package test764
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(marker, messageLambda)
  logger.warn(marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test764
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
  logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder"; cause=null } at Test765Kt.main(test765.kt:12)

User code:
```kotlin
package test765
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atWarn(marker) { message="warn eventBuilder"; cause=null }
  logger.atWarn(marker) { message="warn eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test765
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"")
  logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i"; cause=null } at Test766Kt.main(test766.kt:12)

User code:
```kotlin
package test766
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atWarn(marker) { message="warn eventBuilder $i"; cause=null }
  logger.atWarn(marker) { message="warn eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test766
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"")
  logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null } at Test767Kt.main(test767.kt:12)

User code:
```kotlin
package test767
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test767
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"")
  logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder"; cause=null } at Test768Kt.main(test768.kt:12)

User code:
```kotlin
package test768
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
  logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test768
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"")
  logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null } at Test769Kt.main(test769.kt:12)

User code:
```kotlin
package test769
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test769
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"")
  logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null } at Test770Kt.main(test770.kt:12)

User code:
```kotlin
package test770
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test770
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"")
  logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
