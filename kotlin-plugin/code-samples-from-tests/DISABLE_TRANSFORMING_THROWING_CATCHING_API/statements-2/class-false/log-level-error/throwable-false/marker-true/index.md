## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  atError(marker) { message="error eventBuilder"; cause=null } at Test1595Kt.main(test1595.kt:12)

User code:
```kotlin
package test1595
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
package test1595
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test1595.Test1595Kt", methodName = "main", fileName = "test1595.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test1595.Test1595Kt", methodName = "main", fileName = "test1595.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test1595.Test1595Kt", methodName = "main", fileName = "test1595.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test1595.Test1595Kt", methodName = "main", fileName = "test1595.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i"; cause=null } at Test1596Kt.main(test1596.kt:12)

User code:
```kotlin
package test1596
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
package test1596
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test1596.Test1596Kt", methodName = "main", fileName = "test1596.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test1596.Test1596Kt", methodName = "main", fileName = "test1596.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test1596.Test1596Kt", methodName = "main", fileName = "test1596.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test1596.Test1596Kt", methodName = "main", fileName = "test1596.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i ${helper()}"; cause=null } at Test1597Kt.main(test1597.kt:12)

User code:
```kotlin
package test1597
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
package test1597
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test1597.Test1597Kt", methodName = "main", fileName = "test1597.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test1597.Test1597Kt", methodName = "main", fileName = "test1597.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test1597.Test1597Kt", methodName = "main", fileName = "test1597.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test1597.Test1597Kt", methodName = "main", fileName = "test1597.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder"; cause=null } at Test1598Kt.main(test1598.kt:12)

User code:
```kotlin
package test1598
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
package test1598
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test1598.Test1598Kt", methodName = "main", fileName = "test1598.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test1598.Test1598Kt", methodName = "main", fileName = "test1598.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test1598.Test1598Kt", methodName = "main", fileName = "test1598.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test1598.Test1598Kt", methodName = "main", fileName = "test1598.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=null } at Test1599Kt.main(test1599.kt:12)

User code:
```kotlin
package test1599
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
package test1599
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test1599.Test1599Kt", methodName = "main", fileName = "test1599.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test1599.Test1599Kt", methodName = "main", fileName = "test1599.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test1599.Test1599Kt", methodName = "main", fileName = "test1599.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test1599.Test1599Kt", methodName = "main", fileName = "test1599.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=null } at Test1600Kt.main(test1600.kt:12)

User code:
```kotlin
package test1600
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
package test1600
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test1600.Test1600Kt", methodName = "main", fileName = "test1600.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test1600.Test1600Kt", methodName = "main", fileName = "test1600.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test1600.Test1600Kt", methodName = "main", fileName = "test1600.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test1600.Test1600Kt", methodName = "main", fileName = "test1600.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
