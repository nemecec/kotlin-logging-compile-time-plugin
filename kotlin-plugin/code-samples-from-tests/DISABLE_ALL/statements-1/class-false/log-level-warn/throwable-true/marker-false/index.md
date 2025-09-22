## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn(throwable) { "warn messageBuilder" } at Test681Kt.main(test681.kt:12)

User code:
```kotlin
package test681
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn(throwable) { "warn messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test681
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn(throwable) { "warn messageBuilder" }
}




```

###  warn(throwable) { "warn messageBuilder $i" } at Test682Kt.main(test682.kt:12)

User code:
```kotlin
package test682
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test682
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i" }
}




```

###  warn(throwable) { "warn messageBuilder $i ${helper()}" } at Test683Kt.main(test683.kt:12)

User code:
```kotlin
package test683
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test683
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  warn(throwable, messageLambda) at Test684Kt.main(test684.kt:12)

User code:
```kotlin
package test684
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(throwable, messageLambda)
}




```
  
Remains as-is:
```kotlin
package test684
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(throwable, messageLambda)
}




```

###  atWarn() { message="warn eventBuilder"; cause=throwable } at Test685Kt.main(test685.kt:12)

User code:
```kotlin
package test685
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atWarn() { message="warn eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test685
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atWarn() { message="warn eventBuilder"; cause=throwable }
}




```

###  atWarn() { message="warn eventBuilder $i"; cause=throwable } at Test686Kt.main(test686.kt:12)

User code:
```kotlin
package test686
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test686
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
}




```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable } at Test687Kt.main(test687.kt:12)

User code:
```kotlin
package test687
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test687
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.WARN) { message="warn eventBuilder"; cause=throwable } at Test688Kt.main(test688.kt:12)

User code:
```kotlin
package test688
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test688
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
}




```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable } at Test689Kt.main(test689.kt:12)

User code:
```kotlin
package test689
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test689
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
}




```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at Test690Kt.main(test690.kt:12)

User code:
```kotlin
package test690
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test690
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
