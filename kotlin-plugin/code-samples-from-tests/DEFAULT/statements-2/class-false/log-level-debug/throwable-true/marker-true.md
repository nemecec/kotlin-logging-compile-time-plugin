## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=true



###  debug(marker, throwable) { "debug messageBuilder" } at Test661Kt.main(test661.kt:12)

User code:
```kotlin
package test661
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.debug(marker, throwable) { "debug messageBuilder" }
  logger.debug(marker, throwable) { "debug messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test661
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test661.Test661Kt", methodName = "main", fileName = "test661.kt", lineNumber = 12)
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test661.Test661Kt", methodName = "main", fileName = "test661.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, throwable) { "debug messageBuilder $i" } at Test662Kt.main(test662.kt:12)

User code:
```kotlin
package test662
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(marker, throwable) { "debug messageBuilder $i" }
  logger.debug(marker, throwable) { "debug messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test662
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test662.Test662Kt", methodName = "main", fileName = "test662.kt", lineNumber = 12)
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test662.Test662Kt", methodName = "main", fileName = "test662.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, throwable) { "debug messageBuilder $i ${helper()}" } at Test663Kt.main(test663.kt:12)

User code:
```kotlin
package test663
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
  logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test663
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test663.Test663Kt", methodName = "main", fileName = "test663.kt", lineNumber = 12)
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test663.Test663Kt", methodName = "main", fileName = "test663.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, throwable, messageLambda) at Test664Kt.main(test664.kt:12)

User code:
```kotlin
package test664
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(marker, throwable, messageLambda)
  logger.debug(marker, throwable, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test664
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test664.Test664Kt", methodName = "main", fileName = "test664.kt", lineNumber = 12)
  logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test664.Test664Kt", methodName = "main", fileName = "test664.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder"; cause=throwable } at Test665Kt.main(test665.kt:12)

User code:
```kotlin
package test665
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atDebug(marker) { message="debug eventBuilder"; cause=throwable }
  logger.atDebug(marker) { message="debug eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test665
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test665.Test665Kt", methodName = "main", fileName = "test665.kt", lineNumber = 12)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test665.Test665Kt", methodName = "main", fileName = "test665.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i"; cause=throwable } at Test666Kt.main(test666.kt:12)

User code:
```kotlin
package test666
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
  logger.atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test666
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test666.Test666Kt", methodName = "main", fileName = "test666.kt", lineNumber = 12)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test666.Test666Kt", methodName = "main", fileName = "test666.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test667Kt.main(test667.kt:12)

User code:
```kotlin
package test667
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test667
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test667.Test667Kt", methodName = "main", fileName = "test667.kt", lineNumber = 12)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test667.Test667Kt", methodName = "main", fileName = "test667.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable } at Test668Kt.main(test668.kt:12)

User code:
```kotlin
package test668
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test668
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test668.Test668Kt", methodName = "main", fileName = "test668.kt", lineNumber = 12)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test668.Test668Kt", methodName = "main", fileName = "test668.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable } at Test669Kt.main(test669.kt:12)

User code:
```kotlin
package test669
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test669
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test669.Test669Kt", methodName = "main", fileName = "test669.kt", lineNumber = 12)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test669.Test669Kt", methodName = "main", fileName = "test669.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test670Kt.main(test670.kt:12)

User code:
```kotlin
package test670
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test670
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test670.Test670Kt", methodName = "main", fileName = "test670.kt", lineNumber = 12)
  logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test670.Test670Kt", methodName = "main", fileName = "test670.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
