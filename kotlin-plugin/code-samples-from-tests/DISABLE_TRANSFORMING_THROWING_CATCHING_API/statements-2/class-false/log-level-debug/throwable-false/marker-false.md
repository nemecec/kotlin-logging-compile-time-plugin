## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=false



###  debug() { "debug messageBuilder" } at Test691Kt.main(test691.kt:12)

User code:
```kotlin
package test691
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.debug() { "debug messageBuilder" }
  logger.debug() { "debug messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test691
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test691.Test691Kt", methodName = "main", fileName = "test691.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test691.Test691Kt", methodName = "main", fileName = "test691.kt", lineNumber = 13)
}




```

###  debug() { "debug messageBuilder $i" } at Test692Kt.main(test692.kt:12)

User code:
```kotlin
package test692
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i" }
  logger.debug() { "debug messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test692
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test692.Test692Kt", methodName = "main", fileName = "test692.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test692.Test692Kt", methodName = "main", fileName = "test692.kt", lineNumber = 13)
}




```

###  debug() { "debug messageBuilder $i ${helper()}" } at Test693Kt.main(test693.kt:12)

User code:
```kotlin
package test693
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i ${helper()}" }
  logger.debug() { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test693
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test693.Test693Kt", methodName = "main", fileName = "test693.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test693.Test693Kt", methodName = "main", fileName = "test693.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  debug(messageLambda) at Test694Kt.main(test694.kt:12)

User code:
```kotlin
package test694
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(messageLambda)
  logger.debug(messageLambda)
}




```
  
Transformed into:
```kotlin
package test694
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test694.Test694Kt", methodName = "main", fileName = "test694.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test694.Test694Kt", methodName = "main", fileName = "test694.kt", lineNumber = 13)
}




```

###  atDebug() { message="debug eventBuilder"; cause=null } at Test695Kt.main(test695.kt:12)

User code:
```kotlin
package test695
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atDebug() { message="debug eventBuilder"; cause=null }
  logger.atDebug() { message="debug eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test695
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test695.Test695Kt", methodName = "main", fileName = "test695.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test695.Test695Kt", methodName = "main", fileName = "test695.kt", lineNumber = 13)
}




```

###  atDebug() { message="debug eventBuilder $i"; cause=null } at Test696Kt.main(test696.kt:12)

User code:
```kotlin
package test696
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=null }
  logger.atDebug() { message="debug eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test696
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test696.Test696Kt", methodName = "main", fileName = "test696.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test696.Test696Kt", methodName = "main", fileName = "test696.kt", lineNumber = 13)
}




```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null } at Test697Kt.main(test697.kt:12)

User code:
```kotlin
package test697
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test697
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test697.Test697Kt", methodName = "main", fileName = "test697.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test697.Test697Kt", methodName = "main", fileName = "test697.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=null } at Test698Kt.main(test698.kt:12)

User code:
```kotlin
package test698
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test698
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test698.Test698Kt", methodName = "main", fileName = "test698.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test698.Test698Kt", methodName = "main", fileName = "test698.kt", lineNumber = 13)
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null } at Test699Kt.main(test699.kt:12)

User code:
```kotlin
package test699
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test699
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test699.Test699Kt", methodName = "main", fileName = "test699.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test699.Test699Kt", methodName = "main", fileName = "test699.kt", lineNumber = 13)
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null } at Test700Kt.main(test700.kt:12)

User code:
```kotlin
package test700
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test700
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test700.Test700Kt", methodName = "main", fileName = "test700.kt", lineNumber = 12)
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test700.Test700Kt", methodName = "main", fileName = "test700.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```
