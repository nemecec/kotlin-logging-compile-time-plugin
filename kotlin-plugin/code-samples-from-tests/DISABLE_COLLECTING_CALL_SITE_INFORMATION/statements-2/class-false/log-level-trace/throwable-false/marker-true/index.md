## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  atTrace(marker) { message="trace eventBuilder"; cause=null } at Test1275Kt.main(test1275.kt:12)

User code:
```kotlin
package test1275
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atTrace(marker) { message="trace eventBuilder"; cause=null }
  logger.atTrace(marker) { message="trace eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1275
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"")
at(Level.TRACE, marker) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"")
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"")
at(Level.TRACE, marker) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i"; cause=null } at Test1276Kt.main(test1276.kt:12)

User code:
```kotlin
package test1276
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atTrace(marker) { message="trace eventBuilder $i"; cause=null }
  logger.atTrace(marker) { message="trace eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1276
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"")
at(Level.TRACE, marker) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"")
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"")
at(Level.TRACE, marker) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=null } at Test1277Kt.main(test1277.kt:12)

User code:
```kotlin
package test1277
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=null }
  logger.atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1277
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"")
at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"")
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"")
at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder"; cause=null } at Test1278Kt.main(test1278.kt:12)

User code:
```kotlin
package test1278
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.TRACE, marker) { message="trace eventBuilder"; cause=null }
  logger.at(Level.TRACE, marker) { message="trace eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1278
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"")
at(Level.TRACE, marker) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"")
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"")
at(Level.TRACE, marker) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=null } at Test1279Kt.main(test1279.kt:12)

User code:
```kotlin
package test1279
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=null }
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1279
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"")
at(Level.TRACE, marker) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"")
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"")
at(Level.TRACE, marker) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"")
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=null } at Test1280Kt.main(test1280.kt:12)

User code:
```kotlin
package test1280
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1280
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"")
at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"")
  logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"")
at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"")
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
