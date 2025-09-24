## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn() { "warn messageBuilder" } at Test1531Kt.main(test1531.kt:12)

User code:
```kotlin
package test1531
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn() { "warn messageBuilder" }
  logger.warn() { "warn messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test1531
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn() { "warn messageBuilder" }
  logger.warn() { "warn messageBuilder" }
}




```

###  warn() { "warn messageBuilder $i" } at Test1532Kt.main(test1532.kt:12)

User code:
```kotlin
package test1532
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i" }
  logger.warn() { "warn messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test1532
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i" }
  logger.warn() { "warn messageBuilder $i" }
}




```

###  warn() { "warn messageBuilder $i ${helper()}" } at Test1533Kt.main(test1533.kt:12)

User code:
```kotlin
package test1533
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i ${helper()}" }
  logger.warn() { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test1533
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i ${helper()}" }
  logger.warn() { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  warn(messageLambda) at Test1534Kt.main(test1534.kt:12)

User code:
```kotlin
package test1534
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(messageLambda)
  logger.warn(messageLambda)
}




```
  
Remains as-is:
```kotlin
package test1534
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(messageLambda)
  logger.warn(messageLambda)
}




```

###  atWarn() { message="warn eventBuilder"; cause=null } at Test1535Kt.main(test1535.kt:12)

User code:
```kotlin
package test1535
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atWarn() { message="warn eventBuilder"; cause=null }
  logger.atWarn() { message="warn eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test1535
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atWarn() { message="warn eventBuilder"; cause=null }
  logger.atWarn() { message="warn eventBuilder"; cause=null }
}




```

###  atWarn() { message="warn eventBuilder $i"; cause=null } at Test1536Kt.main(test1536.kt:12)

User code:
```kotlin
package test1536
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test1536
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
}




```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null } at Test1537Kt.main(test1537.kt:12)

User code:
```kotlin
package test1537
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test1537
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```

###  at(Level.WARN) { message="warn eventBuilder"; cause=null } at Test1538Kt.main(test1538.kt:12)

User code:
```kotlin
package test1538
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test1538
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
}




```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=null } at Test1539Kt.main(test1539.kt:12)

User code:
```kotlin
package test1539
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test1539
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
}




```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null } at Test1540Kt.main(test1540.kt:12)

User code:
```kotlin
package test1540
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test1540
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
