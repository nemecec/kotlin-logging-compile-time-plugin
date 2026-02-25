## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=false



###  error() { "error messageBuilder" } at Test811Kt.main(test811.kt:12)

User code:
```kotlin
package test811
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.error() { "error messageBuilder" }
  logger.error() { "error messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test811
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test811.Test811Kt", methodName = "main", fileName = "test811.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test811.Test811Kt", methodName = "main", fileName = "test811.kt", lineNumber = 13)
}




```

###  error() { "error messageBuilder $i" } at Test812Kt.main(test812.kt:12)

User code:
```kotlin
package test812
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.error() { "error messageBuilder $i" }
  logger.error() { "error messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test812
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test812.Test812Kt", methodName = "main", fileName = "test812.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test812.Test812Kt", methodName = "main", fileName = "test812.kt", lineNumber = 13)
}




```

###  error() { "error messageBuilder $i ${helper()}" } at Test813Kt.main(test813.kt:12)

User code:
```kotlin
package test813
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.error() { "error messageBuilder $i ${helper()}" }
  logger.error() { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test813
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test813.Test813Kt", methodName = "main", fileName = "test813.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test813.Test813Kt", methodName = "main", fileName = "test813.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  error(messageLambda) at Test814Kt.main(test814.kt:12)

User code:
```kotlin
package test814
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(messageLambda)
  logger.error(messageLambda)
}




```
  
Transformed into:
```kotlin
package test814
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test814.Test814Kt", methodName = "main", fileName = "test814.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test814.Test814Kt", methodName = "main", fileName = "test814.kt", lineNumber = 13)
}




```

###  atError() { message="error eventBuilder"; cause=null } at Test815Kt.main(test815.kt:12)

User code:
```kotlin
package test815
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atError() { message="error eventBuilder"; cause=null }
  logger.atError() { message="error eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test815
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test815.Test815Kt", methodName = "main", fileName = "test815.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test815.Test815Kt", methodName = "main", fileName = "test815.kt", lineNumber = 13)
}




```

###  atError() { message="error eventBuilder $i"; cause=null } at Test816Kt.main(test816.kt:12)

User code:
```kotlin
package test816
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=null }
  logger.atError() { message="error eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test816
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test816.Test816Kt", methodName = "main", fileName = "test816.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test816.Test816Kt", methodName = "main", fileName = "test816.kt", lineNumber = 13)
}




```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=null } at Test817Kt.main(test817.kt:12)

User code:
```kotlin
package test817
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test817
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test817.Test817Kt", methodName = "main", fileName = "test817.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test817.Test817Kt", methodName = "main", fileName = "test817.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  at(Level.ERROR) { message="error eventBuilder"; cause=null } at Test818Kt.main(test818.kt:12)

User code:
```kotlin
package test818
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test818
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test818.Test818Kt", methodName = "main", fileName = "test818.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test818.Test818Kt", methodName = "main", fileName = "test818.kt", lineNumber = 13)
}




```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=null } at Test819Kt.main(test819.kt:12)

User code:
```kotlin
package test819
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test819
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test819.Test819Kt", methodName = "main", fileName = "test819.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test819.Test819Kt", methodName = "main", fileName = "test819.kt", lineNumber = 13)
}




```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null } at Test820Kt.main(test820.kt:12)

User code:
```kotlin
package test820
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test820
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test820.Test820Kt", methodName = "main", fileName = "test820.kt", lineNumber = 12)
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test820.Test820Kt", methodName = "main", fileName = "test820.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```
