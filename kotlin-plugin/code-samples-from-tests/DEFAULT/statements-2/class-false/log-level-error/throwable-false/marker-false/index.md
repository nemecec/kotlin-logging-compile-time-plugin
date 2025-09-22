## featureFlag=DEFAULT / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  error() { "error messageBuilder" } at Test1611Kt.main(test1611.kt:12)

User code:
```kotlin
package test1611
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.error() { "error messageBuilder" }
  logger.error() { "error messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test1611
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1611.Test1611Kt", methodName = "main", fileName = "test1611.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1611.Test1611Kt", methodName = "main", fileName = "test1611.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1611.Test1611Kt", methodName = "main", fileName = "test1611.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1611.Test1611Kt", methodName = "main", fileName = "test1611.kt", lineNumber = 13)
}




```

###  error() { "error messageBuilder $i" } at Test1612Kt.main(test1612.kt:12)

User code:
```kotlin
package test1612
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
package test1612
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1612.Test1612Kt", methodName = "main", fileName = "test1612.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1612.Test1612Kt", methodName = "main", fileName = "test1612.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1612.Test1612Kt", methodName = "main", fileName = "test1612.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1612.Test1612Kt", methodName = "main", fileName = "test1612.kt", lineNumber = 13)
}




```

###  error() { "error messageBuilder $i ${helper()}" } at Test1613Kt.main(test1613.kt:12)

User code:
```kotlin
package test1613
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
package test1613
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1613.Test1613Kt", methodName = "main", fileName = "test1613.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1613.Test1613Kt", methodName = "main", fileName = "test1613.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1613.Test1613Kt", methodName = "main", fileName = "test1613.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1613.Test1613Kt", methodName = "main", fileName = "test1613.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  error(messageLambda) at Test1614Kt.main(test1614.kt:12)

User code:
```kotlin
package test1614
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
package test1614
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1614.Test1614Kt", methodName = "main", fileName = "test1614.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1614.Test1614Kt", methodName = "main", fileName = "test1614.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1614.Test1614Kt", methodName = "main", fileName = "test1614.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1614.Test1614Kt", methodName = "main", fileName = "test1614.kt", lineNumber = 13)
}




```

###  atError() { message="error eventBuilder"; cause=null } at Test1615Kt.main(test1615.kt:12)

User code:
```kotlin
package test1615
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atError() { message="error eventBuilder"; cause=null }
  logger.atError() { message="error eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1615
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1615.Test1615Kt", methodName = "main", fileName = "test1615.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1615.Test1615Kt", methodName = "main", fileName = "test1615.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1615.Test1615Kt", methodName = "main", fileName = "test1615.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1615.Test1615Kt", methodName = "main", fileName = "test1615.kt", lineNumber = 13)
}




```

###  atError() { message="error eventBuilder $i"; cause=null } at Test1616Kt.main(test1616.kt:12)

User code:
```kotlin
package test1616
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
package test1616
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1616.Test1616Kt", methodName = "main", fileName = "test1616.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1616.Test1616Kt", methodName = "main", fileName = "test1616.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1616.Test1616Kt", methodName = "main", fileName = "test1616.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1616.Test1616Kt", methodName = "main", fileName = "test1616.kt", lineNumber = 13)
}




```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=null } at Test1617Kt.main(test1617.kt:12)

User code:
```kotlin
package test1617
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
package test1617
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1617.Test1617Kt", methodName = "main", fileName = "test1617.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1617.Test1617Kt", methodName = "main", fileName = "test1617.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1617.Test1617Kt", methodName = "main", fileName = "test1617.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1617.Test1617Kt", methodName = "main", fileName = "test1617.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```

###  at(Level.ERROR) { message="error eventBuilder"; cause=null } at Test1618Kt.main(test1618.kt:12)

User code:
```kotlin
package test1618
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test1618
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1618.Test1618Kt", methodName = "main", fileName = "test1618.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1618.Test1618Kt", methodName = "main", fileName = "test1618.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1618.Test1618Kt", methodName = "main", fileName = "test1618.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1618.Test1618Kt", methodName = "main", fileName = "test1618.kt", lineNumber = 13)
}




```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=null } at Test1619Kt.main(test1619.kt:12)

User code:
```kotlin
package test1619
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
package test1619
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1619.Test1619Kt", methodName = "main", fileName = "test1619.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1619.Test1619Kt", methodName = "main", fileName = "test1619.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1619.Test1619Kt", methodName = "main", fileName = "test1619.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1619.Test1619Kt", methodName = "main", fileName = "test1619.kt", lineNumber = 13)
}




```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null } at Test1620Kt.main(test1620.kt:12)

User code:
```kotlin
package test1620
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
package test1620
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1620.Test1620Kt", methodName = "main", fileName = "test1620.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1620.Test1620Kt", methodName = "main", fileName = "test1620.kt", lineNumber = 13)
  logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1620.Test1620Kt", methodName = "main", fileName = "test1620.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1620.Test1620Kt", methodName = "main", fileName = "test1620.kt", lineNumber = 13)
}
fun helper() = "Hello!"



```
