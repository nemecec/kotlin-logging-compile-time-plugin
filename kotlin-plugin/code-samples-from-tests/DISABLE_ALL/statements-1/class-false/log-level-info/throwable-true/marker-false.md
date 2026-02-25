## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=false



###  info(throwable) { "info messageBuilder" } at Test301Kt.main(test301.kt:12)

User code:
```kotlin
package test301
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info(throwable) { "info messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test301
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info(throwable) { "info messageBuilder" }
}




```

###  info(throwable) { "info messageBuilder $i" } at Test302Kt.main(test302.kt:12)

User code:
```kotlin
package test302
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
package test302
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i" }
}




```

###  info(throwable) { "info messageBuilder $i ${helper()}" } at Test303Kt.main(test303.kt:12)

User code:
```kotlin
package test303
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
package test303
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  info(throwable, messageLambda) at Test304Kt.main(test304.kt:12)

User code:
```kotlin
package test304
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
package test304
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(throwable, messageLambda)
}




```

###  atInfo() { message="info eventBuilder"; cause=throwable } at Test305Kt.main(test305.kt:12)

User code:
```kotlin
package test305
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test305
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
}




```

###  atInfo() { message="info eventBuilder $i"; cause=throwable } at Test306Kt.main(test306.kt:12)

User code:
```kotlin
package test306
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
package test306
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
}




```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test307Kt.main(test307.kt:12)

User code:
```kotlin
package test307
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
package test307
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.INFO) { message="info eventBuilder"; cause=throwable } at Test308Kt.main(test308.kt:12)

User code:
```kotlin
package test308
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test308
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
}




```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=throwable } at Test309Kt.main(test309.kt:12)

User code:
```kotlin
package test309
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
package test309
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
}




```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test310Kt.main(test310.kt:12)

User code:
```kotlin
package test310
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
package test310
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
