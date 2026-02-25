## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=true



###  trace(marker, throwable) { "trace messageBuilder" } at Test211Kt.main(test211.kt:12)

User code:
```kotlin
package test211
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.trace(marker, throwable) { "trace messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test211
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable) { "trace messageBuilder $i" } at Test212Kt.main(test212.kt:12)

User code:
```kotlin
package test212
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(marker, throwable) { "trace messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test212
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable) { "trace messageBuilder $i ${helper()}" } at Test213Kt.main(test213.kt:12)

User code:
```kotlin
package test213
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(marker, throwable) { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test213
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable, messageLambda) at Test214Kt.main(test214.kt:12)

User code:
```kotlin
package test214
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(marker, throwable, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test214
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder"; cause=throwable } at Test215Kt.main(test215.kt:12)

User code:
```kotlin
package test215
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atTrace(marker) { message="trace eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test215
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i"; cause=throwable } at Test216Kt.main(test216.kt:12)

User code:
```kotlin
package test216
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace(marker) { message="trace eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test216
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test217Kt.main(test217.kt:12)

User code:
```kotlin
package test217
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test217
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder"; cause=throwable } at Test218Kt.main(test218.kt:12)

User code:
```kotlin
package test218
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message="trace eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test218
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=throwable } at Test219Kt.main(test219.kt:12)

User code:
```kotlin
package test219
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test219
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test220Kt.main(test220.kt:12)

User code:
```kotlin
package test220
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test220
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
