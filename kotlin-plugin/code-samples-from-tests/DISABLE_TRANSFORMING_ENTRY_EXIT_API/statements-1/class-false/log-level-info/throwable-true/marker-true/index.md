## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  info(throwable, marker) { "info messageBuilder" } at Test581Kt.main(test581.kt:12)

User code:
```kotlin
package test581
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.info(throwable, marker) { "info messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test581
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO, marker) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"", className = "test581.Test581Kt", methodName = "main", fileName = "test581.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(throwable, marker) { "info messageBuilder $i" } at Test582Kt.main(test582.kt:12)

User code:
```kotlin
package test582
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable, marker) { "info messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test582
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"", className = "test582.Test582Kt", methodName = "main", fileName = "test582.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(throwable, marker) { "info messageBuilder $i ${helper()}" } at Test583Kt.main(test583.kt:12)

User code:
```kotlin
package test583
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable, marker) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test583
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"", className = "test583.Test583Kt", methodName = "main", fileName = "test583.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(throwable, marker, messageLambda) at Test584Kt.main(test584.kt:12)

User code:
```kotlin
package test584
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(throwable, marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test584
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.at(Level.INFO, marker) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test584.Test584Kt", methodName = "main", fileName = "test584.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder"; cause=throwable } at Test585Kt.main(test585.kt:12)

User code:
```kotlin
package test585
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atInfo(marker) { message="info eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test585
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO, marker) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"", className = "test585.Test585Kt", methodName = "main", fileName = "test585.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i"; cause=throwable } at Test586Kt.main(test586.kt:12)

User code:
```kotlin
package test586
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test586
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"", className = "test586.Test586Kt", methodName = "main", fileName = "test586.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test587Kt.main(test587.kt:12)

User code:
```kotlin
package test587
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test587
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"", className = "test587.Test587Kt", methodName = "main", fileName = "test587.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder"; cause=throwable } at Test588Kt.main(test588.kt:12)

User code:
```kotlin
package test588
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test588
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO, marker) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"", className = "test588.Test588Kt", methodName = "main", fileName = "test588.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i"; cause=throwable } at Test589Kt.main(test589.kt:12)

User code:
```kotlin
package test589
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test589
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"", className = "test589.Test589Kt", methodName = "main", fileName = "test589.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test590Kt.main(test590.kt:12)

User code:
```kotlin
package test590
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test590
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"", className = "test590.Test590Kt", methodName = "main", fileName = "test590.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
