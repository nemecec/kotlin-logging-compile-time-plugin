## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=false



###  info(throwable) { "info messageBuilder" } at Test711Kt.main(test711.kt:12)

User code:
```kotlin
package test711
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info(throwable) { "info messageBuilder" }
  logger.info(throwable) { "info messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test711
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test711.Test711Kt", methodName = "main", fileName = "test711.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test711.Test711Kt", methodName = "main", fileName = "test711.kt", lineNumber = 13)
}




```

###  info(throwable) { "info messageBuilder $i" } at Test712Kt.main(test712.kt:12)

User code:
```kotlin
package test712
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i" }
  logger.info(throwable) { "info messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test712
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test712.Test712Kt", methodName = "main", fileName = "test712.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test712.Test712Kt", methodName = "main", fileName = "test712.kt", lineNumber = 13)
}




```

###  info(throwable) { "info messageBuilder $i ${helper()}" } at Test713Kt.main(test713.kt:12)

User code:
```kotlin
package test713
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test713
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test713.Test713Kt", methodName = "main", fileName = "test713.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test713.Test713Kt", methodName = "main", fileName = "test713.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  info(throwable, messageLambda) at Test714Kt.main(test714.kt:12)

User code:
```kotlin
package test714
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(throwable, messageLambda)
  logger.info(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test714
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test714.Test714Kt", methodName = "main", fileName = "test714.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test714.Test714Kt", methodName = "main", fileName = "test714.kt", lineNumber = 13)
}




```

###  atInfo() { message="info eventBuilder"; cause=throwable } at Test715Kt.main(test715.kt:12)

User code:
```kotlin
package test715
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test715
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test715.Test715Kt", methodName = "main", fileName = "test715.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test715.Test715Kt", methodName = "main", fileName = "test715.kt", lineNumber = 13)
}




```

###  atInfo() { message="info eventBuilder $i"; cause=throwable } at Test716Kt.main(test716.kt:12)

User code:
```kotlin
package test716
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test716
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test716.Test716Kt", methodName = "main", fileName = "test716.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test716.Test716Kt", methodName = "main", fileName = "test716.kt", lineNumber = 13)
}




```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test717Kt.main(test717.kt:12)

User code:
```kotlin
package test717
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test717
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test717.Test717Kt", methodName = "main", fileName = "test717.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test717.Test717Kt", methodName = "main", fileName = "test717.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  at(Level.INFO) { message="info eventBuilder"; cause=throwable } at Test718Kt.main(test718.kt:12)

User code:
```kotlin
package test718
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test718
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test718.Test718Kt", methodName = "main", fileName = "test718.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test718.Test718Kt", methodName = "main", fileName = "test718.kt", lineNumber = 13)
}




```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=throwable } at Test719Kt.main(test719.kt:12)

User code:
```kotlin
package test719
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test719
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test719.Test719Kt", methodName = "main", fileName = "test719.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test719.Test719Kt", methodName = "main", fileName = "test719.kt", lineNumber = 13)
}




```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test720Kt.main(test720.kt:12)

User code:
```kotlin
package test720
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test720
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test720.Test720Kt", methodName = "main", fileName = "test720.kt", lineNumber = 12)
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test720.Test720Kt", methodName = "main", fileName = "test720.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```
