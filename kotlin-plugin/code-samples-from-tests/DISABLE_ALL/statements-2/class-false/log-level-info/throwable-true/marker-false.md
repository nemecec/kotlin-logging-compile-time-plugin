## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=true / with marker=false



###  info(throwable) { "info messageBuilder" } at Test711Kt.main(test711.kt:12)

User code:
```kotlin
package test711
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info(throwable) { "info messageBuilder" }
  logger.info(throwable) { "info messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test711
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.info(throwable) { "info messageBuilder" }
  logger.info(throwable) { "info messageBuilder" }
}




```

###  info(throwable) { "info messageBuilder $i" } at Test712Kt.main(test712.kt:12)

User code:
```kotlin
package test712
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i" }
  logger.info(throwable) { "info messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test712
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i" }
  logger.info(throwable) { "info messageBuilder $i" }
}




```

###  info(throwable) { "info messageBuilder $i ${helper()}" } at Test713Kt.main(test713.kt:12)

User code:
```kotlin
package test713
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test713
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
  logger.info(throwable) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  info(throwable, messageLambda) at Test714Kt.main(test714.kt:12)

User code:
```kotlin
package test714
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(throwable, messageLambda)
  logger.info(throwable, messageLambda)
}




```
  
Remains as-is:
```kotlin
package test714
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(throwable, messageLambda)
  logger.info(throwable, messageLambda)
}




```

###  atInfo() { message="info eventBuilder"; cause=throwable } at Test715Kt.main(test715.kt:12)

User code:
```kotlin
package test715
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test715
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
  logger.atInfo() { message="info eventBuilder"; cause=throwable }
}




```

###  atInfo() { message="info eventBuilder $i"; cause=throwable } at Test716Kt.main(test716.kt:12)

User code:
```kotlin
package test716
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test716
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
  logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
}




```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test717Kt.main(test717.kt:12)

User code:
```kotlin
package test717
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test717
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.INFO) { message="info eventBuilder"; cause=throwable } at Test718Kt.main(test718.kt:12)

User code:
```kotlin
package test718
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test718
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
}




```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=throwable } at Test719Kt.main(test719.kt:12)

User code:
```kotlin
package test719
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test719
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
}




```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable } at Test720Kt.main(test720.kt:12)

User code:
```kotlin
package test720
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test720
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
