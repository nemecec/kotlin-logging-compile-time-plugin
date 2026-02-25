## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=true



###  trace(marker) { "trace messageBuilder" } at Test231Kt.main(test231.kt:12)

User code:
```kotlin
package test231
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.trace(marker) { "trace messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test231
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test231.Test231Kt", methodName = "main", fileName = "test231.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker) { "trace messageBuilder $i" } at Test232Kt.main(test232.kt:12)

User code:
```kotlin
package test232
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.trace(marker) { "trace messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test232
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test232.Test232Kt", methodName = "main", fileName = "test232.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker) { "trace messageBuilder $i ${helper()}" } at Test233Kt.main(test233.kt:12)

User code:
```kotlin
package test233
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.trace(marker) { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test233
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test233.Test233Kt", methodName = "main", fileName = "test233.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, messageLambda) at Test234Kt.main(test234.kt:12)

User code:
```kotlin
package test234
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test234
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test234.Test234Kt", methodName = "main", fileName = "test234.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder"; cause=null } at Test235Kt.main(test235.kt:12)

User code:
```kotlin
package test235
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atTrace(marker) { message="trace eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test235
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test235.Test235Kt", methodName = "main", fileName = "test235.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i"; cause=null } at Test236Kt.main(test236.kt:12)

User code:
```kotlin
package test236
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atTrace(marker) { message="trace eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test236
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test236.Test236Kt", methodName = "main", fileName = "test236.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=null } at Test237Kt.main(test237.kt:12)

User code:
```kotlin
package test237
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test237
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test237.Test237Kt", methodName = "main", fileName = "test237.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder"; cause=null } at Test238Kt.main(test238.kt:12)

User code:
```kotlin
package test238
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.TRACE, marker) { message="trace eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test238
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test238.Test238Kt", methodName = "main", fileName = "test238.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=null } at Test239Kt.main(test239.kt:12)

User code:
```kotlin
package test239
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test239
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test239.Test239Kt", methodName = "main", fileName = "test239.kt", lineNumber = 12)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=null } at Test240Kt.main(test240.kt:12)

User code:
```kotlin
package test240
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test240
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test240.Test240Kt", methodName = "main", fileName = "test240.kt", lineNumber = 12)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
