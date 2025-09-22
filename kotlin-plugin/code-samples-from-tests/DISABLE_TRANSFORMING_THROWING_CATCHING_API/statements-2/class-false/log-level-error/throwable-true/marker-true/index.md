## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  error(throwable, marker) { "error messageBuilder" } at Test1551Kt.main(test1551.kt:12)

User code:
```kotlin
package test1551
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.error(throwable, marker) { "error messageBuilder" }
  logger.error(throwable, marker) { "error messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1551
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1551.Test1551Kt", methodName = "main", fileName = "test1551.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1551.Test1551Kt", methodName = "main", fileName = "test1551.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1551.Test1551Kt", methodName = "main", fileName = "test1551.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1551.Test1551Kt", methodName = "main", fileName = "test1551.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(throwable, marker) { "error messageBuilder $i" } at Test1552Kt.main(test1552.kt:12)

User code:
```kotlin
package test1552
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable, marker) { "error messageBuilder $i" }
  logger.error(throwable, marker) { "error messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1552
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1552.Test1552Kt", methodName = "main", fileName = "test1552.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1552.Test1552Kt", methodName = "main", fileName = "test1552.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1552.Test1552Kt", methodName = "main", fileName = "test1552.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1552.Test1552Kt", methodName = "main", fileName = "test1552.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(throwable, marker) { "error messageBuilder $i ${helper()}" } at Test1553Kt.main(test1553.kt:12)

User code:
```kotlin
package test1553
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable, marker) { "error messageBuilder $i ${helper()}" }
  logger.error(throwable, marker) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1553
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1553.Test1553Kt", methodName = "main", fileName = "test1553.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1553.Test1553Kt", methodName = "main", fileName = "test1553.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1553.Test1553Kt", methodName = "main", fileName = "test1553.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1553.Test1553Kt", methodName = "main", fileName = "test1553.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(throwable, marker, messageLambda) at Test1554Kt.main(test1554.kt:12)

User code:
```kotlin
package test1554
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(throwable, marker, messageLambda)
  logger.error(throwable, marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1554
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1554.Test1554Kt", methodName = "main", fileName = "test1554.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1554.Test1554Kt", methodName = "main", fileName = "test1554.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1554.Test1554Kt", methodName = "main", fileName = "test1554.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1554.Test1554Kt", methodName = "main", fileName = "test1554.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder"; cause=throwable } at Test1555Kt.main(test1555.kt:12)

User code:
```kotlin
package test1555
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
package test1555
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1555.Test1555Kt", methodName = "main", fileName = "test1555.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1555.Test1555Kt", methodName = "main", fileName = "test1555.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1555.Test1555Kt", methodName = "main", fileName = "test1555.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1555.Test1555Kt", methodName = "main", fileName = "test1555.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i"; cause=throwable } at Test1556Kt.main(test1556.kt:12)

User code:
```kotlin
package test1556
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
package test1556
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1556.Test1556Kt", methodName = "main", fileName = "test1556.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1556.Test1556Kt", methodName = "main", fileName = "test1556.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1556.Test1556Kt", methodName = "main", fileName = "test1556.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1556.Test1556Kt", methodName = "main", fileName = "test1556.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test1557Kt.main(test1557.kt:12)

User code:
```kotlin
package test1557
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
package test1557
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1557.Test1557Kt", methodName = "main", fileName = "test1557.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1557.Test1557Kt", methodName = "main", fileName = "test1557.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1557.Test1557Kt", methodName = "main", fileName = "test1557.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1557.Test1557Kt", methodName = "main", fileName = "test1557.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder"; cause=throwable } at Test1558Kt.main(test1558.kt:12)

User code:
```kotlin
package test1558
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
package test1558
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1558.Test1558Kt", methodName = "main", fileName = "test1558.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1558.Test1558Kt", methodName = "main", fileName = "test1558.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1558.Test1558Kt", methodName = "main", fileName = "test1558.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1558.Test1558Kt", methodName = "main", fileName = "test1558.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=throwable } at Test1559Kt.main(test1559.kt:12)

User code:
```kotlin
package test1559
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
package test1559
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1559.Test1559Kt", methodName = "main", fileName = "test1559.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1559.Test1559Kt", methodName = "main", fileName = "test1559.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1559.Test1559Kt", methodName = "main", fileName = "test1559.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1559.Test1559Kt", methodName = "main", fileName = "test1559.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test1560Kt.main(test1560.kt:12)

User code:
```kotlin
package test1560
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
package test1560
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1560.Test1560Kt", methodName = "main", fileName = "test1560.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1560.Test1560Kt", methodName = "main", fileName = "test1560.kt", lineNumber = 13)
  logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1560.Test1560Kt", methodName = "main", fileName = "test1560.kt", lineNumber = 12)
at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1560.Test1560Kt", methodName = "main", fileName = "test1560.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
