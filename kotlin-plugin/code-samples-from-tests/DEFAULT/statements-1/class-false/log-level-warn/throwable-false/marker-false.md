## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false



###  warn() { "warn messageBuilder" } at Test361Kt.main(test361.kt:12)

User code:
```kotlin
package test361
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn() { "warn messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test361
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test361.Test361Kt", methodName = "main", fileName = "test361.kt", lineNumber = 12)
}




```

###  warn() { "warn messageBuilder $i" } at Test362Kt.main(test362.kt:12)

User code:
```kotlin
package test362
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test362
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test362.Test362Kt", methodName = "main", fileName = "test362.kt", lineNumber = 12)
}




```

###  warn() { "warn messageBuilder $i ${helper()}" } at Test363Kt.main(test363.kt:12)

User code:
```kotlin
package test363
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
package test363
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test363.Test363Kt", methodName = "main", fileName = "test363.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  warn(messageLambda) at Test364Kt.main(test364.kt:12)

User code:
```kotlin
package test364
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(messageLambda)
}




```
  
Transformed into:
```kotlin
package test364
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test364.Test364Kt", methodName = "main", fileName = "test364.kt", lineNumber = 12)
}




```

###  atWarn() { message="warn eventBuilder"; cause=null } at Test365Kt.main(test365.kt:12)

User code:
```kotlin
package test365
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atWarn() { message="warn eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test365
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test365.Test365Kt", methodName = "main", fileName = "test365.kt", lineNumber = 12)
}




```

###  atWarn() { message="warn eventBuilder $i"; cause=null } at Test366Kt.main(test366.kt:12)

User code:
```kotlin
package test366
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test366
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test366.Test366Kt", methodName = "main", fileName = "test366.kt", lineNumber = 12)
}




```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null } at Test367Kt.main(test367.kt:12)

User code:
```kotlin
package test367
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
package test367
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test367.Test367Kt", methodName = "main", fileName = "test367.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  at(Level.WARN) { message="warn eventBuilder"; cause=null } at Test368Kt.main(test368.kt:12)

User code:
```kotlin
package test368
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test368
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test368.Test368Kt", methodName = "main", fileName = "test368.kt", lineNumber = 12)
}




```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=null } at Test369Kt.main(test369.kt:12)

User code:
```kotlin
package test369
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test369
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test369.Test369Kt", methodName = "main", fileName = "test369.kt", lineNumber = 12)
}




```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null } at Test370Kt.main(test370.kt:12)

User code:
```kotlin
package test370
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
package test370
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test370.Test370Kt", methodName = "main", fileName = "test370.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```
