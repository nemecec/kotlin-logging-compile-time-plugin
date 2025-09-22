## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  trace() { "trace messageBuilder" } at Test481Kt.main(test481.kt:12)

User code:
```kotlin
package test481
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace() { "trace messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test481
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder"", className = "test481.Test481Kt", methodName = "main", fileName = "test481.kt", lineNumber = 12)
}




```

###  trace() { "trace messageBuilder $i" } at Test482Kt.main(test482.kt:12)

User code:
```kotlin
package test482
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test482
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i"", className = "test482.Test482Kt", methodName = "main", fileName = "test482.kt", lineNumber = 12)
}




```

###  trace() { "trace messageBuilder $i ${helper()}" } at Test483Kt.main(test483.kt:12)

User code:
```kotlin
package test483
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test483
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace messageBuilder $i ${helper()}"", className = "test483.Test483Kt", methodName = "main", fileName = "test483.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  trace(messageLambda) at Test484Kt.main(test484.kt:12)

User code:
```kotlin
package test484
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(messageLambda)
}




```
  
Transformed into:
```kotlin
package test484
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test484.Test484Kt", methodName = "main", fileName = "test484.kt", lineNumber = 12)
}




```

###  atTrace() { message="trace eventBuilder"; cause=null } at Test485Kt.main(test485.kt:12)

User code:
```kotlin
package test485
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atTrace() { message="trace eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test485
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test485.Test485Kt", methodName = "main", fileName = "test485.kt", lineNumber = 12)
}




```

###  atTrace() { message="trace eventBuilder $i"; cause=null } at Test486Kt.main(test486.kt:12)

User code:
```kotlin
package test486
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test486
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test486.Test486Kt", methodName = "main", fileName = "test486.kt", lineNumber = 12)
}




```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null } at Test487Kt.main(test487.kt:12)

User code:
```kotlin
package test487
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test487
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test487.Test487Kt", methodName = "main", fileName = "test487.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=null } at Test488Kt.main(test488.kt:12)

User code:
```kotlin
package test488
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test488
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder"", className = "test488.Test488Kt", methodName = "main", fileName = "test488.kt", lineNumber = 12)
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=null } at Test489Kt.main(test489.kt:12)

User code:
```kotlin
package test489
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test489
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i"", className = "test489.Test489Kt", methodName = "main", fileName = "test489.kt", lineNumber = 12)
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null } at Test490Kt.main(test490.kt:12)

User code:
```kotlin
package test490
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test490
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace eventBuilder $i ${helper()}"", className = "test490.Test490Kt", methodName = "main", fileName = "test490.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```
