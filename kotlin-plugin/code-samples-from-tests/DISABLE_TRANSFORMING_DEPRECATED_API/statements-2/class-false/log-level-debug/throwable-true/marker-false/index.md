## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  debug(throwable) { "debug messageBuilder" } at Test1331Kt.main(test1331.kt:12)

User code:
```kotlin
package test1331
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug(throwable) { "debug messageBuilder" }
  logger.debug(throwable) { "debug messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test1331
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test1331.Test1331Kt", methodName = "main", fileName = "test1331.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test1331.Test1331Kt", methodName = "main", fileName = "test1331.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test1331.Test1331Kt", methodName = "main", fileName = "test1331.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test1331.Test1331Kt", methodName = "main", fileName = "test1331.kt", lineNumber = 13)
}




```

###  debug(throwable) { "debug messageBuilder $i" } at Test1332Kt.main(test1332.kt:12)

User code:
```kotlin
package test1332
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable) { "debug messageBuilder $i" }
  logger.debug(throwable) { "debug messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test1332
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test1332.Test1332Kt", methodName = "main", fileName = "test1332.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test1332.Test1332Kt", methodName = "main", fileName = "test1332.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test1332.Test1332Kt", methodName = "main", fileName = "test1332.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test1332.Test1332Kt", methodName = "main", fileName = "test1332.kt", lineNumber = 13)
}




```

###  debug(throwable) { "debug messageBuilder $i ${helper()}" } at Test1333Kt.main(test1333.kt:12)

User code:
```kotlin
package test1333
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
  logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1333
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test1333.Test1333Kt", methodName = "main", fileName = "test1333.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test1333.Test1333Kt", methodName = "main", fileName = "test1333.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test1333.Test1333Kt", methodName = "main", fileName = "test1333.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test1333.Test1333Kt", methodName = "main", fileName = "test1333.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  debug(throwable, messageLambda) at Test1334Kt.main(test1334.kt:12)

User code:
```kotlin
package test1334
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(throwable, messageLambda)
  logger.debug(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test1334
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1334.Test1334Kt", methodName = "main", fileName = "test1334.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1334.Test1334Kt", methodName = "main", fileName = "test1334.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1334.Test1334Kt", methodName = "main", fileName = "test1334.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1334.Test1334Kt", methodName = "main", fileName = "test1334.kt", lineNumber = 13)
}




```

###  atDebug() { message="debug eventBuilder"; cause=throwable } at Test1335Kt.main(test1335.kt:12)

User code:
```kotlin
package test1335
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atDebug() { message="debug eventBuilder"; cause=throwable }
  logger.atDebug() { message="debug eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1335
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test1335.Test1335Kt", methodName = "main", fileName = "test1335.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test1335.Test1335Kt", methodName = "main", fileName = "test1335.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test1335.Test1335Kt", methodName = "main", fileName = "test1335.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test1335.Test1335Kt", methodName = "main", fileName = "test1335.kt", lineNumber = 13)
}




```

###  atDebug() { message="debug eventBuilder $i"; cause=throwable } at Test1336Kt.main(test1336.kt:12)

User code:
```kotlin
package test1336
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
  logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1336
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test1336.Test1336Kt", methodName = "main", fileName = "test1336.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test1336.Test1336Kt", methodName = "main", fileName = "test1336.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test1336.Test1336Kt", methodName = "main", fileName = "test1336.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test1336.Test1336Kt", methodName = "main", fileName = "test1336.kt", lineNumber = 13)
}




```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test1337Kt.main(test1337.kt:12)

User code:
```kotlin
package test1337
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1337
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test1337.Test1337Kt", methodName = "main", fileName = "test1337.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test1337.Test1337Kt", methodName = "main", fileName = "test1337.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test1337.Test1337Kt", methodName = "main", fileName = "test1337.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test1337.Test1337Kt", methodName = "main", fileName = "test1337.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable } at Test1338Kt.main(test1338.kt:12)

User code:
```kotlin
package test1338
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1338
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test1338.Test1338Kt", methodName = "main", fileName = "test1338.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test1338.Test1338Kt", methodName = "main", fileName = "test1338.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test1338.Test1338Kt", methodName = "main", fileName = "test1338.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test1338.Test1338Kt", methodName = "main", fileName = "test1338.kt", lineNumber = 13)
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable } at Test1339Kt.main(test1339.kt:12)

User code:
```kotlin
package test1339
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1339
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test1339.Test1339Kt", methodName = "main", fileName = "test1339.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test1339.Test1339Kt", methodName = "main", fileName = "test1339.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test1339.Test1339Kt", methodName = "main", fileName = "test1339.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test1339.Test1339Kt", methodName = "main", fileName = "test1339.kt", lineNumber = 13)
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test1340Kt.main(test1340.kt:12)

User code:
```kotlin
package test1340
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1340
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test1340.Test1340Kt", methodName = "main", fileName = "test1340.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test1340.Test1340Kt", methodName = "main", fileName = "test1340.kt", lineNumber = 13)
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test1340.Test1340Kt", methodName = "main", fileName = "test1340.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test1340.Test1340Kt", methodName = "main", fileName = "test1340.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```
