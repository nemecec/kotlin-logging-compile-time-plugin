## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug(marker) { "debug messageBuilder" } at Test1346Kt.main(test1346.kt:12)

User code:
```kotlin
package test1346
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.debug(marker) { "debug messageBuilder" }
  logger.debug(marker) { "debug messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1346
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test1346.Test1346Kt", methodName = "main", fileName = "test1346.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test1346.Test1346Kt", methodName = "main", fileName = "test1346.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test1346.Test1346Kt", methodName = "main", fileName = "test1346.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test1346.Test1346Kt", methodName = "main", fileName = "test1346.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker) { "debug messageBuilder $i" } at Test1347Kt.main(test1347.kt:12)

User code:
```kotlin
package test1347
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.debug(marker) { "debug messageBuilder $i" }
  logger.debug(marker) { "debug messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1347
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test1347.Test1347Kt", methodName = "main", fileName = "test1347.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test1347.Test1347Kt", methodName = "main", fileName = "test1347.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test1347.Test1347Kt", methodName = "main", fileName = "test1347.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test1347.Test1347Kt", methodName = "main", fileName = "test1347.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker) { "debug messageBuilder $i ${helper()}" } at Test1348Kt.main(test1348.kt:12)

User code:
```kotlin
package test1348
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.debug(marker) { "debug messageBuilder $i ${helper()}" }
  logger.debug(marker) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1348
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test1348.Test1348Kt", methodName = "main", fileName = "test1348.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test1348.Test1348Kt", methodName = "main", fileName = "test1348.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test1348.Test1348Kt", methodName = "main", fileName = "test1348.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test1348.Test1348Kt", methodName = "main", fileName = "test1348.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {}") at Test1349Kt.main(test1349.kt:12)

User code:
```kotlin
package test1349
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.debug(marker, "debug message {}")
  logger.debug(marker, "debug message {}")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1349
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.DEBUG, marker) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1349.Test1349Kt", methodName = "main", fileName = "test1349.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1349.Test1349Kt", methodName = "main", fileName = "test1349.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1349.Test1349Kt", methodName = "main", fileName = "test1349.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test1349.Test1349Kt", methodName = "main", fileName = "test1349.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, message) at Test1350Kt.main(test1350.kt:12)

User code:
```kotlin
package test1350
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val message = "debug message as variable"
  logger.debug(marker, message)
  logger.debug(marker, message)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1350
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val message = "debug message as variable"
  logger.at(Level.DEBUG, marker) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1350.Test1350Kt", methodName = "main", fileName = "test1350.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1350.Test1350Kt", methodName = "main", fileName = "test1350.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1350.Test1350Kt", methodName = "main", fileName = "test1350.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1350.Test1350Kt", methodName = "main", fileName = "test1350.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
