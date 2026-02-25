## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=false



###  error() { "error messageBuilder" } at Test401Kt.main(test401.kt:12)

User code:
```kotlin
package test401
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.error() { "error messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test401
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test401.Test401Kt", methodName = "main", fileName = "test401.kt", lineNumber = 12)
}




```

###  error() { "error messageBuilder $i" } at Test402Kt.main(test402.kt:12)

User code:
```kotlin
package test402
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.error() { "error messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test402
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test402.Test402Kt", methodName = "main", fileName = "test402.kt", lineNumber = 12)
}




```

###  error() { "error messageBuilder $i ${helper()}" } at Test403Kt.main(test403.kt:12)

User code:
```kotlin
package test403
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.error() { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test403
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test403.Test403Kt", methodName = "main", fileName = "test403.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  error(messageLambda) at Test404Kt.main(test404.kt:12)

User code:
```kotlin
package test404
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(messageLambda)
}




```
  
Transformed into:
```kotlin
package test404
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test404.Test404Kt", methodName = "main", fileName = "test404.kt", lineNumber = 12)
}




```

###  atError() { message="error eventBuilder"; cause=null } at Test405Kt.main(test405.kt:12)

User code:
```kotlin
package test405
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atError() { message="error eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test405
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test405.Test405Kt", methodName = "main", fileName = "test405.kt", lineNumber = 12)
}




```

###  atError() { message="error eventBuilder $i"; cause=null } at Test406Kt.main(test406.kt:12)

User code:
```kotlin
package test406
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test406
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test406.Test406Kt", methodName = "main", fileName = "test406.kt", lineNumber = 12)
}




```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=null } at Test407Kt.main(test407.kt:12)

User code:
```kotlin
package test407
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test407
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test407.Test407Kt", methodName = "main", fileName = "test407.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  at(Level.ERROR) { message="error eventBuilder"; cause=null } at Test408Kt.main(test408.kt:12)

User code:
```kotlin
package test408
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test408
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test408.Test408Kt", methodName = "main", fileName = "test408.kt", lineNumber = 12)
}




```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=null } at Test409Kt.main(test409.kt:12)

User code:
```kotlin
package test409
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test409
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test409.Test409Kt", methodName = "main", fileName = "test409.kt", lineNumber = 12)
}




```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null } at Test410Kt.main(test410.kt:12)

User code:
```kotlin
package test410
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test410
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test410.Test410Kt", methodName = "main", fileName = "test410.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```
