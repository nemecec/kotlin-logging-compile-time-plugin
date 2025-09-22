## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  error(throwable) { "error messageBuilder" } at Test1571Kt.main(test1571.kt:12)

User code:
```kotlin
package test1571
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error(throwable) { "error messageBuilder" }
  logger.error(throwable) { "error messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test1571
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error(throwable) { "error messageBuilder" }
error(throwable) { "error messageBuilder" }
  logger.error(throwable) { "error messageBuilder" }
error(throwable) { "error messageBuilder" }
}




```

###  error(throwable) { "error messageBuilder $i" } at Test1572Kt.main(test1572.kt:12)

User code:
```kotlin
package test1572
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i" }
  logger.error(throwable) { "error messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test1572
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i" }
error(throwable) { "error messageBuilder $i" }
  logger.error(throwable) { "error messageBuilder $i" }
error(throwable) { "error messageBuilder $i" }
}




```

###  error(throwable) { "error messageBuilder $i ${helper()}" } at Test1573Kt.main(test1573.kt:12)

User code:
```kotlin
package test1573
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i ${helper()}" }
  logger.error(throwable) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1573
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i ${helper()}" }
error(throwable) { "error messageBuilder $i ${helper()}" }
  logger.error(throwable) { "error messageBuilder $i ${helper()}" }
error(throwable) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  error(throwable, messageLambda) at Test1574Kt.main(test1574.kt:12)

User code:
```kotlin
package test1574
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(throwable, messageLambda)
  logger.error(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test1574
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(throwable, messageLambda)
error(throwable, messageLambda)
  logger.error(throwable, messageLambda)
error(throwable, messageLambda)
}




```

###  atError() { message="error eventBuilder"; cause=throwable } at Test1575Kt.main(test1575.kt:12)

User code:
```kotlin
package test1575
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atError() { message="error eventBuilder"; cause=throwable }
  logger.atError() { message="error eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1575
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atError() { message="error eventBuilder"; cause=throwable }
atError() { message="error eventBuilder"; cause=throwable }
  logger.atError() { message="error eventBuilder"; cause=throwable }
atError() { message="error eventBuilder"; cause=throwable }
}




```

###  atError() { message="error eventBuilder $i"; cause=throwable } at Test1576Kt.main(test1576.kt:12)

User code:
```kotlin
package test1576
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1576
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
atError() { message="error eventBuilder $i"; cause=throwable }
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
atError() { message="error eventBuilder $i"; cause=throwable }
}




```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test1577Kt.main(test1577.kt:12)

User code:
```kotlin
package test1577
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1577
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.ERROR) { message="error eventBuilder"; cause=throwable } at Test1578Kt.main(test1578.kt:12)

User code:
```kotlin
package test1578
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1578
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
}




```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable } at Test1579Kt.main(test1579.kt:12)

User code:
```kotlin
package test1579
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1579
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
}




```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test1580Kt.main(test1580.kt:12)

User code:
```kotlin
package test1580
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1580
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
