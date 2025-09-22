## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  trace(throwable) { "trace messageBuilder" } at Test441Kt.main(test441.kt:12)

User code:
```kotlin
package test441
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace(throwable) { "trace messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test441
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace(throwable) { "trace messageBuilder" }
}




```

###  trace(throwable) { "trace messageBuilder $i" } at Test442Kt.main(test442.kt:12)

User code:
```kotlin
package test442
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test442
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i" }
}




```

###  trace(throwable) { "trace messageBuilder $i ${helper()}" } at Test443Kt.main(test443.kt:12)

User code:
```kotlin
package test443
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test443
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  trace(throwable, messageLambda) at Test444Kt.main(test444.kt:12)

User code:
```kotlin
package test444
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(throwable, messageLambda)
}




```
  
Remains as-is:
```kotlin
package test444
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(throwable, messageLambda)
}




```

###  atTrace() { message="trace eventBuilder"; cause=throwable } at Test445Kt.main(test445.kt:12)

User code:
```kotlin
package test445
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atTrace() { message="trace eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test445
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atTrace() { message="trace eventBuilder"; cause=throwable }
}




```

###  atTrace() { message="trace eventBuilder $i"; cause=throwable } at Test446Kt.main(test446.kt:12)

User code:
```kotlin
package test446
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test446
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
}




```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test447Kt.main(test447.kt:12)

User code:
```kotlin
package test447
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test447
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=throwable } at Test448Kt.main(test448.kt:12)

User code:
```kotlin
package test448
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test448
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable } at Test449Kt.main(test449.kt:12)

User code:
```kotlin
package test449
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test449
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test450Kt.main(test450.kt:12)

User code:
```kotlin
package test450
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test450
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
