## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn() { "warn messageBuilder" } at Test721Kt.main(test721.kt:12)

User code:
```kotlin
package test721
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn() { "warn messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test721
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test721.Test721Kt", methodName = "main", fileName = "test721.kt", lineNumber = 12)
}




```

###  warn() { "warn messageBuilder $i" } at Test722Kt.main(test722.kt:12)

User code:
```kotlin
package test722
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test722
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test722.Test722Kt", methodName = "main", fileName = "test722.kt", lineNumber = 12)
}




```

###  warn() { "warn messageBuilder $i ${helper()}" } at Test723Kt.main(test723.kt:12)

User code:
```kotlin
package test723
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test723
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test723.Test723Kt", methodName = "main", fileName = "test723.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  warn(messageLambda) at Test724Kt.main(test724.kt:12)

User code:
```kotlin
package test724
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(messageLambda)
}




```
  
Transformed into:
```kotlin
package test724
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test724.Test724Kt", methodName = "main", fileName = "test724.kt", lineNumber = 12)
}




```

###  atWarn() { message="warn eventBuilder"; cause=null } at Test725Kt.main(test725.kt:12)

User code:
```kotlin
package test725
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atWarn() { message="warn eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test725
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test725.Test725Kt", methodName = "main", fileName = "test725.kt", lineNumber = 12)
}




```

###  atWarn() { message="warn eventBuilder $i"; cause=null } at Test726Kt.main(test726.kt:12)

User code:
```kotlin
package test726
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test726
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test726.Test726Kt", methodName = "main", fileName = "test726.kt", lineNumber = 12)
}




```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null } at Test727Kt.main(test727.kt:12)

User code:
```kotlin
package test727
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test727
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test727.Test727Kt", methodName = "main", fileName = "test727.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  at(Level.WARN) { message="warn eventBuilder"; cause=null } at Test728Kt.main(test728.kt:12)

User code:
```kotlin
package test728
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test728
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test728.Test728Kt", methodName = "main", fileName = "test728.kt", lineNumber = 12)
}




```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=null } at Test729Kt.main(test729.kt:12)

User code:
```kotlin
package test729
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test729
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test729.Test729Kt", methodName = "main", fileName = "test729.kt", lineNumber = 12)
}




```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null } at Test730Kt.main(test730.kt:12)

User code:
```kotlin
package test730
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test730
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test730.Test730Kt", methodName = "main", fileName = "test730.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```
