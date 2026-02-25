## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=true



###  error(marker) { "error messageBuilder" } at Test801Kt.main(test801.kt:12)

User code:
```kotlin
package test801
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.error(marker) { "error messageBuilder" }
  logger.error(marker) { "error messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test801
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test801.Test801Kt", methodName = "main", fileName = "test801.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test801.Test801Kt", methodName = "main", fileName = "test801.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker) { "error messageBuilder $i" } at Test802Kt.main(test802.kt:12)

User code:
```kotlin
package test802
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.error(marker) { "error messageBuilder $i" }
  logger.error(marker) { "error messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test802
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test802.Test802Kt", methodName = "main", fileName = "test802.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test802.Test802Kt", methodName = "main", fileName = "test802.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker) { "error messageBuilder $i ${helper()}" } at Test803Kt.main(test803.kt:12)

User code:
```kotlin
package test803
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.error(marker) { "error messageBuilder $i ${helper()}" }
  logger.error(marker) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test803
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test803.Test803Kt", methodName = "main", fileName = "test803.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test803.Test803Kt", methodName = "main", fileName = "test803.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, messageLambda) at Test804Kt.main(test804.kt:12)

User code:
```kotlin
package test804
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(marker, messageLambda)
  logger.error(marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test804
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test804.Test804Kt", methodName = "main", fileName = "test804.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test804.Test804Kt", methodName = "main", fileName = "test804.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder"; cause=null } at Test805Kt.main(test805.kt:12)

User code:
```kotlin
package test805
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atError(marker) { message="error eventBuilder"; cause=null }
  logger.atError(marker) { message="error eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test805
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test805.Test805Kt", methodName = "main", fileName = "test805.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test805.Test805Kt", methodName = "main", fileName = "test805.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i"; cause=null } at Test806Kt.main(test806.kt:12)

User code:
```kotlin
package test806
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atError(marker) { message="error eventBuilder $i"; cause=null }
  logger.atError(marker) { message="error eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test806
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test806.Test806Kt", methodName = "main", fileName = "test806.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test806.Test806Kt", methodName = "main", fileName = "test806.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i ${helper()}"; cause=null } at Test807Kt.main(test807.kt:12)

User code:
```kotlin
package test807
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atError(marker) { message="error eventBuilder $i ${helper()}"; cause=null }
  logger.atError(marker) { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test807
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test807.Test807Kt", methodName = "main", fileName = "test807.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test807.Test807Kt", methodName = "main", fileName = "test807.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder"; cause=null } at Test808Kt.main(test808.kt:12)

User code:
```kotlin
package test808
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.ERROR, marker) { message="error eventBuilder"; cause=null }
  logger.at(Level.ERROR, marker) { message="error eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test808
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test808.Test808Kt", methodName = "main", fileName = "test808.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test808.Test808Kt", methodName = "main", fileName = "test808.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=null } at Test809Kt.main(test809.kt:12)

User code:
```kotlin
package test809
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=null }
  logger.at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test809
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test809.Test809Kt", methodName = "main", fileName = "test809.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test809.Test809Kt", methodName = "main", fileName = "test809.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=null } at Test810Kt.main(test810.kt:12)

User code:
```kotlin
package test810
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test810
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test810.Test810Kt", methodName = "main", fileName = "test810.kt", lineNumber = 12)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test810.Test810Kt", methodName = "main", fileName = "test810.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
