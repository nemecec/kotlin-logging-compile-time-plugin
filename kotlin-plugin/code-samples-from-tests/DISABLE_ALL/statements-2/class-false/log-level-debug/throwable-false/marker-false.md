## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=false



###  debug() { "debug messageBuilder" } at Test691Kt.main(test691.kt:12)

User code:
```kotlin
package test691
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.debug() { "debug messageBuilder" }
  logger.debug() { "debug messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test691
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.debug() { "debug messageBuilder" }
  logger.debug() { "debug messageBuilder" }
}




```

###  debug() { "debug messageBuilder $i" } at Test692Kt.main(test692.kt:12)

User code:
```kotlin
package test692
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i" }
  logger.debug() { "debug messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test692
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i" }
  logger.debug() { "debug messageBuilder $i" }
}




```

###  debug() { "debug messageBuilder $i ${helper()}" } at Test693Kt.main(test693.kt:12)

User code:
```kotlin
package test693
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i ${helper()}" }
  logger.debug() { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test693
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i ${helper()}" }
  logger.debug() { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  debug(messageLambda) at Test694Kt.main(test694.kt:12)

User code:
```kotlin
package test694
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(messageLambda)
  logger.debug(messageLambda)
}




```
  
Remains as-is:
```kotlin
package test694
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(messageLambda)
  logger.debug(messageLambda)
}




```

###  atDebug() { message="debug eventBuilder"; cause=null } at Test695Kt.main(test695.kt:12)

User code:
```kotlin
package test695
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atDebug() { message="debug eventBuilder"; cause=null }
  logger.atDebug() { message="debug eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test695
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atDebug() { message="debug eventBuilder"; cause=null }
  logger.atDebug() { message="debug eventBuilder"; cause=null }
}




```

###  atDebug() { message="debug eventBuilder $i"; cause=null } at Test696Kt.main(test696.kt:12)

User code:
```kotlin
package test696
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=null }
  logger.atDebug() { message="debug eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test696
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=null }
  logger.atDebug() { message="debug eventBuilder $i"; cause=null }
}




```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null } at Test697Kt.main(test697.kt:12)

User code:
```kotlin
package test697
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test697
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=null } at Test698Kt.main(test698.kt:12)

User code:
```kotlin
package test698
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test698
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null } at Test699Kt.main(test699.kt:12)

User code:
```kotlin
package test699
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test699
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null } at Test700Kt.main(test700.kt:12)

User code:
```kotlin
package test700
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test700
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
