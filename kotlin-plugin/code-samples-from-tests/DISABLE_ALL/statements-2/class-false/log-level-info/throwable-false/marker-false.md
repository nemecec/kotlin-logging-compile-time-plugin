## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=false



###  info() { "info messageBuilder" } at Test731Kt.main(test731.kt:12)

User code:
```kotlin
package test731
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.info() { "info messageBuilder" }
  logger.info() { "info messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test731
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.info() { "info messageBuilder" }
  logger.info() { "info messageBuilder" }
}




```

###  info() { "info messageBuilder $i" } at Test732Kt.main(test732.kt:12)

User code:
```kotlin
package test732
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.info() { "info messageBuilder $i" }
  logger.info() { "info messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test732
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.info() { "info messageBuilder $i" }
  logger.info() { "info messageBuilder $i" }
}




```

###  info() { "info messageBuilder $i ${helper()}" } at Test733Kt.main(test733.kt:12)

User code:
```kotlin
package test733
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.info() { "info messageBuilder $i ${helper()}" }
  logger.info() { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test733
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.info() { "info messageBuilder $i ${helper()}" }
  logger.info() { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  info(messageLambda) at Test734Kt.main(test734.kt:12)

User code:
```kotlin
package test734
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(messageLambda)
  logger.info(messageLambda)
}




```
  
Remains as-is:
```kotlin
package test734
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(messageLambda)
  logger.info(messageLambda)
}




```

###  atInfo() { message="info eventBuilder"; cause=null } at Test735Kt.main(test735.kt:12)

User code:
```kotlin
package test735
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atInfo() { message="info eventBuilder"; cause=null }
  logger.atInfo() { message="info eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test735
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atInfo() { message="info eventBuilder"; cause=null }
  logger.atInfo() { message="info eventBuilder"; cause=null }
}




```

###  atInfo() { message="info eventBuilder $i"; cause=null } at Test736Kt.main(test736.kt:12)

User code:
```kotlin
package test736
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=null }
  logger.atInfo() { message="info eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test736
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atInfo() { message="info eventBuilder $i"; cause=null }
  logger.atInfo() { message="info eventBuilder $i"; cause=null }
}




```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=null } at Test737Kt.main(test737.kt:12)

User code:
```kotlin
package test737
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test737
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
  logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```

###  at(Level.INFO) { message="info eventBuilder"; cause=null } at Test738Kt.main(test738.kt:12)

User code:
```kotlin
package test738
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
  logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test738
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
  logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
}




```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=null } at Test739Kt.main(test739.kt:12)

User code:
```kotlin
package test739
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test739
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
  logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
}




```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null } at Test740Kt.main(test740.kt:12)

User code:
```kotlin
package test740
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test740
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
