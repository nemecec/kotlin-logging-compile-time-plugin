## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  atDebug(marker) { message="debug eventBuilder"; cause=null } at Test1355Kt.main(test1355.kt:12)

User code:
```kotlin
package test1355
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atDebug(marker) { message="debug eventBuilder"; cause=null }
  logger.atDebug(marker) { message="debug eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1355
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test1355.Test1355Kt", methodName = "main", fileName = "test1355.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test1355.Test1355Kt", methodName = "main", fileName = "test1355.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test1355.Test1355Kt", methodName = "main", fileName = "test1355.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test1355.Test1355Kt", methodName = "main", fileName = "test1355.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i"; cause=null } at Test1356Kt.main(test1356.kt:12)

User code:
```kotlin
package test1356
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i"; cause=null }
  logger.atDebug(marker) { message="debug eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1356
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test1356.Test1356Kt", methodName = "main", fileName = "test1356.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test1356.Test1356Kt", methodName = "main", fileName = "test1356.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test1356.Test1356Kt", methodName = "main", fileName = "test1356.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test1356.Test1356Kt", methodName = "main", fileName = "test1356.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=null } at Test1357Kt.main(test1357.kt:12)

User code:
```kotlin
package test1357
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
  logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1357
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test1357.Test1357Kt", methodName = "main", fileName = "test1357.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test1357.Test1357Kt", methodName = "main", fileName = "test1357.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test1357.Test1357Kt", methodName = "main", fileName = "test1357.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test1357.Test1357Kt", methodName = "main", fileName = "test1357.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=null } at Test1358Kt.main(test1358.kt:12)

User code:
```kotlin
package test1358
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=null }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1358
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test1358.Test1358Kt", methodName = "main", fileName = "test1358.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test1358.Test1358Kt", methodName = "main", fileName = "test1358.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test1358.Test1358Kt", methodName = "main", fileName = "test1358.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test1358.Test1358Kt", methodName = "main", fileName = "test1358.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=null } at Test1359Kt.main(test1359.kt:12)

User code:
```kotlin
package test1359
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=null }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1359
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test1359.Test1359Kt", methodName = "main", fileName = "test1359.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test1359.Test1359Kt", methodName = "main", fileName = "test1359.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test1359.Test1359Kt", methodName = "main", fileName = "test1359.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test1359.Test1359Kt", methodName = "main", fileName = "test1359.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=null } at Test1360Kt.main(test1360.kt:12)

User code:
```kotlin
package test1360
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1360
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test1360.Test1360Kt", methodName = "main", fileName = "test1360.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test1360.Test1360Kt", methodName = "main", fileName = "test1360.kt", lineNumber = 13)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test1360.Test1360Kt", methodName = "main", fileName = "test1360.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test1360.Test1360Kt", methodName = "main", fileName = "test1360.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
