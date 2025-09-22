## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  error(throwable) { "error messageBuilder" } at Test761Kt.main(test761.kt:12)

User code:
```kotlin
package test761
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error(throwable) { "error messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test761
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error(throwable) { "error messageBuilder" }
}




```

###  error(throwable) { "error messageBuilder $i" } at Test762Kt.main(test762.kt:12)

User code:
```kotlin
package test762
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test762
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i" }
}




```

###  error(throwable) { "error messageBuilder $i ${helper()}" } at Test763Kt.main(test763.kt:12)

User code:
```kotlin
package test763
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test763
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  error(throwable, messageLambda) at Test764Kt.main(test764.kt:12)

User code:
```kotlin
package test764
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(throwable, messageLambda)
}




```
  
Remains as-is:
```kotlin
package test764
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(throwable, messageLambda)
}




```

###  atError() { message="error eventBuilder"; cause=throwable } at Test765Kt.main(test765.kt:12)

User code:
```kotlin
package test765
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atError() { message="error eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test765
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atError() { message="error eventBuilder"; cause=throwable }
}




```

###  atError() { message="error eventBuilder $i"; cause=throwable } at Test766Kt.main(test766.kt:12)

User code:
```kotlin
package test766
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test766
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
}




```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test767Kt.main(test767.kt:12)

User code:
```kotlin
package test767
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test767
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.ERROR) { message="error eventBuilder"; cause=throwable } at Test768Kt.main(test768.kt:12)

User code:
```kotlin
package test768
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test768
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
}




```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable } at Test769Kt.main(test769.kt:12)

User code:
```kotlin
package test769
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test769
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
}




```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test770Kt.main(test770.kt:12)

User code:
```kotlin
package test770
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test770
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
