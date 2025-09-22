## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info(marker, throwable) { "info messageBuilder" } at Test1386Kt.main(test1386.kt:12)

User code:
```kotlin
package test1386
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.info(marker, throwable) { "info messageBuilder" }
  logger.info(marker, throwable) { "info messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1386
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO, marker) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"", className = "test1386.Test1386Kt", methodName = "main", fileName = "test1386.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"", className = "test1386.Test1386Kt", methodName = "main", fileName = "test1386.kt", lineNumber = 13)
  logger.at(Level.INFO, marker) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"", className = "test1386.Test1386Kt", methodName = "main", fileName = "test1386.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"", className = "test1386.Test1386Kt", methodName = "main", fileName = "test1386.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, throwable) { "info messageBuilder $i" } at Test1387Kt.main(test1387.kt:12)

User code:
```kotlin
package test1387
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.info(marker, throwable) { "info messageBuilder $i" }
  logger.info(marker, throwable) { "info messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1387
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"", className = "test1387.Test1387Kt", methodName = "main", fileName = "test1387.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"", className = "test1387.Test1387Kt", methodName = "main", fileName = "test1387.kt", lineNumber = 13)
  logger.at(Level.INFO, marker) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"", className = "test1387.Test1387Kt", methodName = "main", fileName = "test1387.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"", className = "test1387.Test1387Kt", methodName = "main", fileName = "test1387.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, throwable) { "info messageBuilder $i ${helper()}" } at Test1388Kt.main(test1388.kt:12)

User code:
```kotlin
package test1388
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.info(marker, throwable) { "info messageBuilder $i ${helper()}" }
  logger.info(marker, throwable) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1388
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"", className = "test1388.Test1388Kt", methodName = "main", fileName = "test1388.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"", className = "test1388.Test1388Kt", methodName = "main", fileName = "test1388.kt", lineNumber = 13)
  logger.at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"", className = "test1388.Test1388Kt", methodName = "main", fileName = "test1388.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"", className = "test1388.Test1388Kt", methodName = "main", fileName = "test1388.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {}", throwable) at Test1389Kt.main(test1389.kt:12)

User code:
```kotlin
package test1389
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.info(marker, "info message {}", throwable)
  logger.info(marker, "info message {}", throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1389
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO, marker) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1389.Test1389Kt", methodName = "main", fileName = "test1389.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1389.Test1389Kt", methodName = "main", fileName = "test1389.kt", lineNumber = 13)
  logger.at(Level.INFO, marker) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1389.Test1389Kt", methodName = "main", fileName = "test1389.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test1389.Test1389Kt", methodName = "main", fileName = "test1389.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, message, throwable) at Test1390Kt.main(test1390.kt:12)

User code:
```kotlin
package test1390
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "info message as variable"
  logger.info(marker, message, throwable)
  logger.info(marker, message, throwable)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1390
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val message = "info message as variable"
  logger.at(Level.INFO, marker) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1390.Test1390Kt", methodName = "main", fileName = "test1390.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1390.Test1390Kt", methodName = "main", fileName = "test1390.kt", lineNumber = 13)
  logger.at(Level.INFO, marker) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1390.Test1390Kt", methodName = "main", fileName = "test1390.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test1390.Test1390Kt", methodName = "main", fileName = "test1390.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
