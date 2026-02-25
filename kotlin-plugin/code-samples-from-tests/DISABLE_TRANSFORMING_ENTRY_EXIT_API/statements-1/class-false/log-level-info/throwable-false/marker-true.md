## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=true



###  info(marker) { "info messageBuilder" } at Test311Kt.main(test311.kt:12)

User code:
```kotlin
package test311
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.info(marker) { "info messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test311
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test311.Test311Kt", methodName = "main", fileName = "test311.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker) { "info messageBuilder $i" } at Test312Kt.main(test312.kt:12)

User code:
```kotlin
package test312
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.info(marker) { "info messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test312
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test312.Test312Kt", methodName = "main", fileName = "test312.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker) { "info messageBuilder $i ${helper()}" } at Test313Kt.main(test313.kt:12)

User code:
```kotlin
package test313
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.info(marker) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test313
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test313.Test313Kt", methodName = "main", fileName = "test313.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, messageLambda) at Test314Kt.main(test314.kt:12)

User code:
```kotlin
package test314
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test314
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.at(Level.INFO, marker) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test314.Test314Kt", methodName = "main", fileName = "test314.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder"; cause=null } at Test315Kt.main(test315.kt:12)

User code:
```kotlin
package test315
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
package test315
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test315.Test315Kt", methodName = "main", fileName = "test315.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i"; cause=null } at Test316Kt.main(test316.kt:12)

User code:
```kotlin
package test316
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
package test316
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test316.Test316Kt", methodName = "main", fileName = "test316.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null } at Test317Kt.main(test317.kt:12)

User code:
```kotlin
package test317
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
package test317
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test317.Test317Kt", methodName = "main", fileName = "test317.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder"; cause=null } at Test318Kt.main(test318.kt:12)

User code:
```kotlin
package test318
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
package test318
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test318.Test318Kt", methodName = "main", fileName = "test318.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null } at Test319Kt.main(test319.kt:12)

User code:
```kotlin
package test319
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
package test319
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test319.Test319Kt", methodName = "main", fileName = "test319.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null } at Test320Kt.main(test320.kt:12)

User code:
```kotlin
package test320
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
package test320
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test320.Test320Kt", methodName = "main", fileName = "test320.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
