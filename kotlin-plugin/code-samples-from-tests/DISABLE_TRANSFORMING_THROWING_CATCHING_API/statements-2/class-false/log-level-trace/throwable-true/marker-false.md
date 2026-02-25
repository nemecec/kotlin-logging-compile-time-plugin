## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=false



###  trace(throwable) { "trace messageBuilder" } at Test631Kt.main(test631.kt:12)

User code:
```kotlin
package test631
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace(throwable) { "trace messageBuilder" }
  logger.trace(throwable) { "trace messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test631
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test631.Test631Kt", methodName = "main", fileName = "test631.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test631.Test631Kt", methodName = "main", fileName = "test631.kt", lineNumber = 13)
}




```

###  trace(throwable) { "trace messageBuilder $i" } at Test632Kt.main(test632.kt:12)

User code:
```kotlin
package test632
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i" }
  logger.trace(throwable) { "trace messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test632
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test632.Test632Kt", methodName = "main", fileName = "test632.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test632.Test632Kt", methodName = "main", fileName = "test632.kt", lineNumber = 13)
}




```

###  trace(throwable) { "trace messageBuilder $i ${helper()}" } at Test633Kt.main(test633.kt:12)

User code:
```kotlin
package test633
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
  logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test633
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test633.Test633Kt", methodName = "main", fileName = "test633.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test633.Test633Kt", methodName = "main", fileName = "test633.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  trace(throwable, messageLambda) at Test634Kt.main(test634.kt:12)

User code:
```kotlin
package test634
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(throwable, messageLambda)
  logger.trace(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test634
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test634.Test634Kt", methodName = "main", fileName = "test634.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test634.Test634Kt", methodName = "main", fileName = "test634.kt", lineNumber = 13)
}




```

###  atTrace() { message="trace eventBuilder"; cause=throwable } at Test635Kt.main(test635.kt:12)

User code:
```kotlin
package test635
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atTrace() { message="trace eventBuilder"; cause=throwable }
  logger.atTrace() { message="trace eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test635
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test635.Test635Kt", methodName = "main", fileName = "test635.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test635.Test635Kt", methodName = "main", fileName = "test635.kt", lineNumber = 13)
}




```

###  atTrace() { message="trace eventBuilder $i"; cause=throwable } at Test636Kt.main(test636.kt:12)

User code:
```kotlin
package test636
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
  logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test636
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test636.Test636Kt", methodName = "main", fileName = "test636.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test636.Test636Kt", methodName = "main", fileName = "test636.kt", lineNumber = 13)
}




```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test637Kt.main(test637.kt:12)

User code:
```kotlin
package test637
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test637
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test637.Test637Kt", methodName = "main", fileName = "test637.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test637.Test637Kt", methodName = "main", fileName = "test637.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=throwable } at Test638Kt.main(test638.kt:12)

User code:
```kotlin
package test638
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test638
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test638.Test638Kt", methodName = "main", fileName = "test638.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test638.Test638Kt", methodName = "main", fileName = "test638.kt", lineNumber = 13)
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable } at Test639Kt.main(test639.kt:12)

User code:
```kotlin
package test639
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test639
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test639.Test639Kt", methodName = "main", fileName = "test639.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test639.Test639Kt", methodName = "main", fileName = "test639.kt", lineNumber = 13)
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test640Kt.main(test640.kt:12)

User code:
```kotlin
package test640
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test640
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test640.Test640Kt", methodName = "main", fileName = "test640.kt", lineNumber = 12)
  logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test640.Test640Kt", methodName = "main", fileName = "test640.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```
