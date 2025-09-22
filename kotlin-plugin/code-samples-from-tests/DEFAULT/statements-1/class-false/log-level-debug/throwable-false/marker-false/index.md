## featureFlag=DEFAULT / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  debug() { "debug messageBuilder" } at Test561Kt.main(test561.kt:12)

User code:
```kotlin
package test561
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.debug() { "debug messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test561
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test561.Test561Kt", methodName = "main", fileName = "test561.kt", lineNumber = 12)
}




```

###  debug() { "debug messageBuilder $i" } at Test562Kt.main(test562.kt:12)

User code:
```kotlin
package test562
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test562
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test562.Test562Kt", methodName = "main", fileName = "test562.kt", lineNumber = 12)
}




```

###  debug() { "debug messageBuilder $i ${helper()}" } at Test563Kt.main(test563.kt:12)

User code:
```kotlin
package test563
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test563
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test563.Test563Kt", methodName = "main", fileName = "test563.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  debug(messageLambda) at Test564Kt.main(test564.kt:12)

User code:
```kotlin
package test564
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(messageLambda)
}




```
  
Transformed into:
```kotlin
package test564
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test564.Test564Kt", methodName = "main", fileName = "test564.kt", lineNumber = 12)
}




```

###  atDebug() { message="debug eventBuilder"; cause=null } at Test565Kt.main(test565.kt:12)

User code:
```kotlin
package test565
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atDebug() { message="debug eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test565
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test565.Test565Kt", methodName = "main", fileName = "test565.kt", lineNumber = 12)
}




```

###  atDebug() { message="debug eventBuilder $i"; cause=null } at Test566Kt.main(test566.kt:12)

User code:
```kotlin
package test566
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test566
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test566.Test566Kt", methodName = "main", fileName = "test566.kt", lineNumber = 12)
}




```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null } at Test567Kt.main(test567.kt:12)

User code:
```kotlin
package test567
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test567
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test567.Test567Kt", methodName = "main", fileName = "test567.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=null } at Test568Kt.main(test568.kt:12)

User code:
```kotlin
package test568
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test568
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test568.Test568Kt", methodName = "main", fileName = "test568.kt", lineNumber = 12)
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null } at Test569Kt.main(test569.kt:12)

User code:
```kotlin
package test569
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test569
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test569.Test569Kt", methodName = "main", fileName = "test569.kt", lineNumber = 12)
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null } at Test570Kt.main(test570.kt:12)

User code:
```kotlin
package test570
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test570
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test570.Test570Kt", methodName = "main", fileName = "test570.kt", lineNumber = 12)
}
fun helper() = "Hello!"



```
