## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace(marker, throwable) { "trace messageBuilder" } at Test416Kt.main(test416.kt:12)

User code:
```kotlin
package test416
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
package test416
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder"", className = "test416.Test416Kt", methodName = "main", fileName = "test416.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable) { "trace messageBuilder $i" } at Test417Kt.main(test417.kt:12)

User code:
```kotlin
package test417
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
package test417
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i"", className = "test417.Test417Kt", methodName = "main", fileName = "test417.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable) { "trace messageBuilder $i ${helper()}" } at Test418Kt.main(test418.kt:12)

User code:
```kotlin
package test418
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
package test418
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i ${helper()}"", className = "test418.Test418Kt", methodName = "main", fileName = "test418.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {}", throwable) at Test419Kt.main(test419.kt:12)

User code:
```kotlin
package test419
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.trace(marker, "trace message {}", throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test419
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message = "trace message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test419.Test419Kt", methodName = "main", fileName = "test419.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, message, throwable) at Test420Kt.main(test420.kt:12)

User code:
```kotlin
package test420
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "trace message as variable"
  logger.trace(marker, message, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test420
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "trace message as variable"
  logger.at(Level.TRACE, marker) { message = "trace message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test420.Test420Kt", methodName = "main", fileName = "test420.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
