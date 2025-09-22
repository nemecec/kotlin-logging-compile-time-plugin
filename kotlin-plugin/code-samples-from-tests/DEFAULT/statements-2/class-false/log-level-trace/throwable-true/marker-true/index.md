## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  trace(throwable, marker) { "trace messageBuilder" } at Test1231Kt.main(test1231.kt:12)

User code:
```kotlin
package test1231
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.trace(throwable, marker) { "trace messageBuilder" }
  logger.trace(throwable, marker) { "trace messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1231
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder"", className = "test1231.Test1231Kt", methodName = "main", fileName = "test1231.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder"", className = "test1231.Test1231Kt", methodName = "main", fileName = "test1231.kt", lineNumber = 13)
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder"", className = "test1231.Test1231Kt", methodName = "main", fileName = "test1231.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder"", className = "test1231.Test1231Kt", methodName = "main", fileName = "test1231.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(throwable, marker) { "trace messageBuilder $i" } at Test1232Kt.main(test1232.kt:12)

User code:
```kotlin
package test1232
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable, marker) { "trace messageBuilder $i" }
  logger.trace(throwable, marker) { "trace messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1232
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i"", className = "test1232.Test1232Kt", methodName = "main", fileName = "test1232.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i"", className = "test1232.Test1232Kt", methodName = "main", fileName = "test1232.kt", lineNumber = 13)
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i"", className = "test1232.Test1232Kt", methodName = "main", fileName = "test1232.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i"", className = "test1232.Test1232Kt", methodName = "main", fileName = "test1232.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(throwable, marker) { "trace messageBuilder $i ${helper()}" } at Test1233Kt.main(test1233.kt:12)

User code:
```kotlin
package test1233
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable, marker) { "trace messageBuilder $i ${helper()}" }
  logger.trace(throwable, marker) { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1233
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i ${helper()}"", className = "test1233.Test1233Kt", methodName = "main", fileName = "test1233.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i ${helper()}"", className = "test1233.Test1233Kt", methodName = "main", fileName = "test1233.kt", lineNumber = 13)
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i ${helper()}"", className = "test1233.Test1233Kt", methodName = "main", fileName = "test1233.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i ${helper()}"", className = "test1233.Test1233Kt", methodName = "main", fileName = "test1233.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(throwable, marker, messageLambda) at Test1234Kt.main(test1234.kt:12)

User code:
```kotlin
package test1234
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(throwable, marker, messageLambda)
  logger.trace(throwable, marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1234
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1234.Test1234Kt", methodName = "main", fileName = "test1234.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1234.Test1234Kt", methodName = "main", fileName = "test1234.kt", lineNumber = 13)
  logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1234.Test1234Kt", methodName = "main", fileName = "test1234.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1234.Test1234Kt", methodName = "main", fileName = "test1234.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder"; cause=throwable } at Test1235Kt.main(test1235.kt:12)

User code:
```kotlin
package test1235
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atTrace(marker) { message="trace eventBuilder"; cause=throwable }
  logger.atTrace(marker) { message="trace eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1235
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test1235.Test1235Kt", methodName = "main", fileName = "test1235.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test1235.Test1235Kt", methodName = "main", fileName = "test1235.kt", lineNumber = 13)
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test1235.Test1235Kt", methodName = "main", fileName = "test1235.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test1235.Test1235Kt", methodName = "main", fileName = "test1235.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i"; cause=throwable } at Test1236Kt.main(test1236.kt:12)

User code:
```kotlin
package test1236
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace(marker) { message="trace eventBuilder $i"; cause=throwable }
  logger.atTrace(marker) { message="trace eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1236
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test1236.Test1236Kt", methodName = "main", fileName = "test1236.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test1236.Test1236Kt", methodName = "main", fileName = "test1236.kt", lineNumber = 13)
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test1236.Test1236Kt", methodName = "main", fileName = "test1236.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test1236.Test1236Kt", methodName = "main", fileName = "test1236.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test1237Kt.main(test1237.kt:12)

User code:
```kotlin
package test1237
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  logger.atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1237
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test1237.Test1237Kt", methodName = "main", fileName = "test1237.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test1237.Test1237Kt", methodName = "main", fileName = "test1237.kt", lineNumber = 13)
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test1237.Test1237Kt", methodName = "main", fileName = "test1237.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test1237.Test1237Kt", methodName = "main", fileName = "test1237.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder"; cause=throwable } at Test1238Kt.main(test1238.kt:12)

User code:
```kotlin
package test1238
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message="trace eventBuilder"; cause=throwable }
  logger.at(Level.TRACE, marker) { message="trace eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1238
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test1238.Test1238Kt", methodName = "main", fileName = "test1238.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test1238.Test1238Kt", methodName = "main", fileName = "test1238.kt", lineNumber = 13)
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test1238.Test1238Kt", methodName = "main", fileName = "test1238.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test1238.Test1238Kt", methodName = "main", fileName = "test1238.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=throwable } at Test1239Kt.main(test1239.kt:12)

User code:
```kotlin
package test1239
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=throwable }
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1239
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test1239.Test1239Kt", methodName = "main", fileName = "test1239.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test1239.Test1239Kt", methodName = "main", fileName = "test1239.kt", lineNumber = 13)
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test1239.Test1239Kt", methodName = "main", fileName = "test1239.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test1239.Test1239Kt", methodName = "main", fileName = "test1239.kt", lineNumber = 13)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test1240Kt.main(test1240.kt:12)

User code:
```kotlin
package test1240
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1240
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test1240.Test1240Kt", methodName = "main", fileName = "test1240.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test1240.Test1240Kt", methodName = "main", fileName = "test1240.kt", lineNumber = 13)
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test1240.Test1240Kt", methodName = "main", fileName = "test1240.kt", lineNumber = 12)
at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test1240.Test1240Kt", methodName = "main", fileName = "test1240.kt", lineNumber = 13)
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
