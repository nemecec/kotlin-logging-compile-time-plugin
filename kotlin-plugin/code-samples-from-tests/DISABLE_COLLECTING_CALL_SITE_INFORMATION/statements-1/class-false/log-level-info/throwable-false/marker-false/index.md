## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  info() { "info messageBuilder" } at Test641Kt.main(test641.kt:12)

User code:
```kotlin
package test641
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.info() { "info messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test641
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"")
}




```

###  info() { "info messageBuilder $i" } at Test642Kt.main(test642.kt:12)

User code:
```kotlin
package test642
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.info() { "info messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test642
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"")
}




```

###  info() { "info messageBuilder $i ${helper()}" } at Test643Kt.main(test643.kt:12)

User code:
```kotlin
package test643
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.info() { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test643
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"")
}
fun helper() = "Hello!"



```

###  info(messageLambda) at Test644Kt.main(test644.kt:12)

User code:
```kotlin
package test644
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(messageLambda)
}




```
  
Transformed into:
```kotlin
package test644
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.at(Level.INFO) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
}




```

###  atInfo() { message="info eventBuilder"; cause=null } at Test645Kt.main(test645.kt:12)

User code:
```kotlin
package test645
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atInfo() { message="info eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test645
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"")
}




```

###  atInfo() { message="info eventBuilder $i"; cause=null } at Test646Kt.main(test646.kt:12)

User code:
```kotlin
package test646
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test646
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"")
}




```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=null } at Test647Kt.main(test647.kt:12)

User code:
```kotlin
package test647
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test647
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"")
}
fun helper() = "Hello!"



```

###  at(Level.INFO) { message="info eventBuilder"; cause=null } at Test648Kt.main(test648.kt:12)

User code:
```kotlin
package test648
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
}




```
  
Transformed into:
```kotlin
package test648
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"")
}




```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=null } at Test649Kt.main(test649.kt:12)

User code:
```kotlin
package test649
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
}




```
  
Transformed into:
```kotlin
package test649
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"")
}




```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null } at Test650Kt.main(test650.kt:12)

User code:
```kotlin
package test650
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test650
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"")
}
fun helper() = "Hello!"



```
