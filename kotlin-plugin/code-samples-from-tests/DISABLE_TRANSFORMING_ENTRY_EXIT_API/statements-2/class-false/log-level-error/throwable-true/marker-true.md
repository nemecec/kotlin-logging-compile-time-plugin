## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=true



###  error(marker, throwable) { "error messageBuilder" } at Test781Kt.main(test781.kt:12)

User code:
```kotlin
package test781
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.error(marker, throwable) { "error messageBuilder" }
  logger.error(marker, throwable) { "error messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test781
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test781.Test781Kt", methodName = "main", fileName = "test781.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test781.Test781Kt", methodName = "main", fileName = "test781.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, throwable) { "error messageBuilder $i" } at Test782Kt.main(test782.kt:12)

User code:
```kotlin
package test782
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.error(marker, throwable) { "error messageBuilder $i" }
  logger.error(marker, throwable) { "error messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test782
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test782.Test782Kt", methodName = "main", fileName = "test782.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test782.Test782Kt", methodName = "main", fileName = "test782.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, throwable) { "error messageBuilder $i ${helper()}" } at Test783Kt.main(test783.kt:12)

User code:
```kotlin
package test783
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.error(marker, throwable) { "error messageBuilder $i ${helper()}" }
  logger.error(marker, throwable) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test783
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test783.Test783Kt", methodName = "main", fileName = "test783.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test783.Test783Kt", methodName = "main", fileName = "test783.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, throwable, messageLambda) at Test784Kt.main(test784.kt:12)

User code:
```kotlin
package test784
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(marker, throwable, messageLambda)
  logger.error(marker, throwable, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test784
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test784.Test784Kt", methodName = "main", fileName = "test784.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test784.Test784Kt", methodName = "main", fileName = "test784.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder"; cause=throwable } at Test785Kt.main(test785.kt:12)

User code:
```kotlin
package test785
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atError(marker) { message="error eventBuilder"; cause=throwable }
  logger.atError(marker) { message="error eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test785
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test785.Test785Kt", methodName = "main", fileName = "test785.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test785.Test785Kt", methodName = "main", fileName = "test785.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i"; cause=throwable } at Test786Kt.main(test786.kt:12)

User code:
```kotlin
package test786
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atError(marker) { message="error eventBuilder $i"; cause=throwable }
  logger.atError(marker) { message="error eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test786
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test786.Test786Kt", methodName = "main", fileName = "test786.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test786.Test786Kt", methodName = "main", fileName = "test786.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test787Kt.main(test787.kt:12)

User code:
```kotlin
package test787
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atError(marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  logger.atError(marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test787
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test787.Test787Kt", methodName = "main", fileName = "test787.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test787.Test787Kt", methodName = "main", fileName = "test787.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder"; cause=throwable } at Test788Kt.main(test788.kt:12)

User code:
```kotlin
package test788
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR, marker) { message="error eventBuilder"; cause=throwable }
  logger.at(Level.ERROR, marker) { message="error eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test788
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test788.Test788Kt", methodName = "main", fileName = "test788.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test788.Test788Kt", methodName = "main", fileName = "test788.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=throwable } at Test789Kt.main(test789.kt:12)

User code:
```kotlin
package test789
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=throwable }
  logger.at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test789
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test789.Test789Kt", methodName = "main", fileName = "test789.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test789.Test789Kt", methodName = "main", fileName = "test789.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test790Kt.main(test790.kt:12)

User code:
```kotlin
package test790
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test790
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test790.Test790Kt", methodName = "main", fileName = "test790.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test790.Test790Kt", methodName = "main", fileName = "test790.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
