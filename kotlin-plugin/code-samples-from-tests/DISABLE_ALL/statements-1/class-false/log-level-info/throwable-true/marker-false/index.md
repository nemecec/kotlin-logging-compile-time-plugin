## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  info(throwable) { "info messageBuilder" } at Test601Kt.main(test601.kt:12)

User code:
```kotlin
package test601
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info(throwable) { "info messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test601
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info(throwable) { "info messageBuilder" }
}




```

###  info(throwable) { "info messageBuilder $i" } at Test602Kt.main(test602.kt:12)

User code:
```kotlin
package test602
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test602
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i" }
}




```

###  info(throwable) { "info messageBuilder $i ${helper()}" } at Test603Kt.main(test603.kt:12)

User code:
```kotlin
package test603
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test603
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  info(throwable, messageLambda) at Test604Kt.main(test604.kt:12)

User code:
```kotlin
package test604
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(throwable, messageLambda)
}




```
  
Remains as-is:
```kotlin
package test604
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(throwable, messageLambda)
}




```

###  atInfo() { message="info eventBuilder"; cause=throwable } at Test605Kt.main(test605.kt:12)

User code:
```kotlin
package test605
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test605
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
}




```

###  atInfo() { message="info eventBuilder $i"; cause=throwable } at Test606Kt.main(test606.kt:12)

User code:
```kotlin
package test606
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test606
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
}




```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test607Kt.main(test607.kt:12)

User code:
```kotlin
package test607
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test607
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.INFO) { message="info eventBuilder"; cause=throwable } at Test608Kt.main(test608.kt:12)

User code:
```kotlin
package test608
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test608
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
}




```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=throwable } at Test609Kt.main(test609.kt:12)

User code:
```kotlin
package test609
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test609
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
}




```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test610Kt.main(test610.kt:12)

User code:
```kotlin
package test610
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test610
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
