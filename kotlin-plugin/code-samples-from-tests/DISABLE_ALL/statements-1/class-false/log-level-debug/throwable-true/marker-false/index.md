## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  debug(throwable) { "debug messageBuilder" } at Test521Kt.main(test521.kt:12)

User code:
```kotlin
package test521
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug(throwable) { "debug messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test521
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.debug(throwable) { "debug messageBuilder" }
}




```

###  debug(throwable) { "debug messageBuilder $i" } at Test522Kt.main(test522.kt:12)

User code:
```kotlin
package test522
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable) { "debug messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test522
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable) { "debug messageBuilder $i" }
}




```

###  debug(throwable) { "debug messageBuilder $i ${helper()}" } at Test523Kt.main(test523.kt:12)

User code:
```kotlin
package test523
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test523
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  debug(throwable, messageLambda) at Test524Kt.main(test524.kt:12)

User code:
```kotlin
package test524
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(throwable, messageLambda)
}




```
  
Remains as-is:
```kotlin
package test524
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(throwable, messageLambda)
}




```

###  atDebug() { message="debug eventBuilder"; cause=throwable } at Test525Kt.main(test525.kt:12)

User code:
```kotlin
package test525
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atDebug() { message="debug eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test525
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atDebug() { message="debug eventBuilder"; cause=throwable }
}




```

###  atDebug() { message="debug eventBuilder $i"; cause=throwable } at Test526Kt.main(test526.kt:12)

User code:
```kotlin
package test526
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test526
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
}




```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test527Kt.main(test527.kt:12)

User code:
```kotlin
package test527
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test527
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable } at Test528Kt.main(test528.kt:12)

User code:
```kotlin
package test528
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test528
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable } at Test529Kt.main(test529.kt:12)

User code:
```kotlin
package test529
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test529
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at Test530Kt.main(test530.kt:12)

User code:
```kotlin
package test530
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test530
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
