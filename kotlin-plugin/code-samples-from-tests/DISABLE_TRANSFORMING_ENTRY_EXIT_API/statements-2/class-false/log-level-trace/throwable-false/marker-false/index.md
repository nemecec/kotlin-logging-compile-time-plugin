## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  trace() { "trace messageBuilder" } at Test1291Kt.main(test1291.kt:12)

User code:
```kotlin
package test1291
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace() { "trace messageBuilder" }
  logger.trace() { "trace messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test1291
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test1291.Test1291Kt", methodName = "main", fileName = "test1291.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test1291.Test1291Kt", methodName = "main", fileName = "test1291.kt", lineNumber = 13)
}




```

###  trace() { "trace messageBuilder $i" } at Test1292Kt.main(test1292.kt:12)

User code:
```kotlin
package test1292
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i" }
  logger.trace() { "trace messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test1292
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test1292.Test1292Kt", methodName = "main", fileName = "test1292.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test1292.Test1292Kt", methodName = "main", fileName = "test1292.kt", lineNumber = 13)
}




```

###  trace() { "trace messageBuilder $i ${helper()}" } at Test1293Kt.main(test1293.kt:12)

User code:
```kotlin
package test1293
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i ${helper()}" }
  logger.trace() { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1293
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test1293.Test1293Kt", methodName = "main", fileName = "test1293.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test1293.Test1293Kt", methodName = "main", fileName = "test1293.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  trace(messageLambda) at Test1294Kt.main(test1294.kt:12)

User code:
```kotlin
package test1294
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(messageLambda)
  logger.trace(messageLambda)
}




```
  
Transformed into:
```kotlin
package test1294
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1294.Test1294Kt", methodName = "main", fileName = "test1294.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1294.Test1294Kt", methodName = "main", fileName = "test1294.kt", lineNumber = 13)
}




```

###  atTrace() { message="trace eventBuilder"; cause=null } at Test1295Kt.main(test1295.kt:12)

User code:
```kotlin
package test1295
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atTrace() { message="trace eventBuilder"; cause=null }
  logger.atTrace() { message="trace eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1295
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test1295.Test1295Kt", methodName = "main", fileName = "test1295.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test1295.Test1295Kt", methodName = "main", fileName = "test1295.kt", lineNumber = 13)
}




```

###  atTrace() { message="trace eventBuilder $i"; cause=null } at Test1296Kt.main(test1296.kt:12)

User code:
```kotlin
package test1296
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1296
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test1296.Test1296Kt", methodName = "main", fileName = "test1296.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test1296.Test1296Kt", methodName = "main", fileName = "test1296.kt", lineNumber = 13)
}




```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null } at Test1297Kt.main(test1297.kt:12)

User code:
```kotlin
package test1297
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1297
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test1297.Test1297Kt", methodName = "main", fileName = "test1297.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test1297.Test1297Kt", methodName = "main", fileName = "test1297.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=null } at Test1298Kt.main(test1298.kt:12)

User code:
```kotlin
package test1298
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1298
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test1298.Test1298Kt", methodName = "main", fileName = "test1298.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test1298.Test1298Kt", methodName = "main", fileName = "test1298.kt", lineNumber = 13)
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=null } at Test1299Kt.main(test1299.kt:12)

User code:
```kotlin
package test1299
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1299
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test1299.Test1299Kt", methodName = "main", fileName = "test1299.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test1299.Test1299Kt", methodName = "main", fileName = "test1299.kt", lineNumber = 13)
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null } at Test1300Kt.main(test1300.kt:12)

User code:
```kotlin
package test1300
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1300
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test1300.Test1300Kt", methodName = "main", fileName = "test1300.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test1300.Test1300Kt", methodName = "main", fileName = "test1300.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```
