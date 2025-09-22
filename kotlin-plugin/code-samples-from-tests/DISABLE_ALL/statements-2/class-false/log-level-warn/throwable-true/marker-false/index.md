## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn(throwable) { "warn messageBuilder" } at Test1491Kt.main(test1491.kt:12)

User code:
```kotlin
package test1491
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn(throwable) { "warn messageBuilder" }
  logger.warn(throwable) { "warn messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test1491
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn(throwable) { "warn messageBuilder" }
warn(throwable) { "warn messageBuilder" }
  logger.warn(throwable) { "warn messageBuilder" }
warn(throwable) { "warn messageBuilder" }
}




```

###  warn(throwable) { "warn messageBuilder $i" } at Test1492Kt.main(test1492.kt:12)

User code:
```kotlin
package test1492
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i" }
  logger.warn(throwable) { "warn messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test1492
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i" }
warn(throwable) { "warn messageBuilder $i" }
  logger.warn(throwable) { "warn messageBuilder $i" }
warn(throwable) { "warn messageBuilder $i" }
}




```

###  warn(throwable) { "warn messageBuilder $i ${helper()}" } at Test1493Kt.main(test1493.kt:12)

User code:
```kotlin
package test1493
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
  logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1493
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
warn(throwable) { "warn messageBuilder $i ${helper()}" }
  logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
warn(throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  warn(throwable, messageLambda) at Test1494Kt.main(test1494.kt:12)

User code:
```kotlin
package test1494
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(throwable, messageLambda)
  logger.warn(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test1494
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(throwable, messageLambda)
warn(throwable, messageLambda)
  logger.warn(throwable, messageLambda)
warn(throwable, messageLambda)
}




```

###  atWarn() { message="warn eventBuilder"; cause=throwable } at Test1495Kt.main(test1495.kt:12)

User code:
```kotlin
package test1495
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atWarn() { message="warn eventBuilder"; cause=throwable }
  logger.atWarn() { message="warn eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1495
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atWarn() { message="warn eventBuilder"; cause=throwable }
atWarn() { message="warn eventBuilder"; cause=throwable }
  logger.atWarn() { message="warn eventBuilder"; cause=throwable }
atWarn() { message="warn eventBuilder"; cause=throwable }
}




```

###  atWarn() { message="warn eventBuilder $i"; cause=throwable } at Test1496Kt.main(test1496.kt:12)

User code:
```kotlin
package test1496
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
  logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1496
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
atWarn() { message="warn eventBuilder $i"; cause=throwable }
  logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
atWarn() { message="warn eventBuilder $i"; cause=throwable }
}




```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable } at Test1497Kt.main(test1497.kt:12)

User code:
```kotlin
package test1497
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1497
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.WARN) { message="warn eventBuilder"; cause=throwable } at Test1498Kt.main(test1498.kt:12)

User code:
```kotlin
package test1498
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1498
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
}




```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable } at Test1499Kt.main(test1499.kt:12)

User code:
```kotlin
package test1499
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1499
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
}




```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at Test1500Kt.main(test1500.kt:12)

User code:
```kotlin
package test1500
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1500
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
