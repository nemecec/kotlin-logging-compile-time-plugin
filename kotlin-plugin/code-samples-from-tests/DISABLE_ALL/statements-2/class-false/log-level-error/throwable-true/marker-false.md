## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=true / with marker=false



###  error(throwable) { "error messageBuilder" } at Test791Kt.main(test791.kt:12)

User code:
```kotlin
package test791
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error(throwable) { "error messageBuilder" }
  logger.error(throwable) { "error messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test791
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.error(throwable) { "error messageBuilder" }
  logger.error(throwable) { "error messageBuilder" }
}




```

###  error(throwable) { "error messageBuilder $i" } at Test792Kt.main(test792.kt:12)

User code:
```kotlin
package test792
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i" }
  logger.error(throwable) { "error messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test792
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.error(throwable) { "error messageBuilder $i" }
  logger.error(throwable) { "error messageBuilder $i" }
}




```

###  error(throwable) { "error messageBuilder $i ${helper()}" } at Test793Kt.main(test793.kt:12)

User code:
```kotlin
package test793
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
  
Remains as-is:
```kotlin
package test793
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

###  error(throwable, messageLambda) at Test794Kt.main(test794.kt:12)

User code:
```kotlin
package test794
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(throwable, messageLambda)
  logger.error(throwable, messageLambda)
}




```
  
Remains as-is:
```kotlin
package test794
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(throwable, messageLambda)
  logger.error(throwable, messageLambda)
}




```

###  atError() { message="error eventBuilder"; cause=throwable } at Test795Kt.main(test795.kt:12)

User code:
```kotlin
package test795
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atError() { message="error eventBuilder"; cause=throwable }
  logger.atError() { message="error eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test795
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atError() { message="error eventBuilder"; cause=throwable }
  logger.atError() { message="error eventBuilder"; cause=throwable }
}




```

###  atError() { message="error eventBuilder $i"; cause=throwable } at Test796Kt.main(test796.kt:12)

User code:
```kotlin
package test796
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test796
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
  logger.atError() { message="error eventBuilder $i"; cause=throwable }
}




```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test797Kt.main(test797.kt:12)

User code:
```kotlin
package test797
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
  
Remains as-is:
```kotlin
package test797
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

###  at(Level.ERROR) { message="error eventBuilder"; cause=throwable } at Test798Kt.main(test798.kt:12)

User code:
```kotlin
package test798
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test798
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
}




```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable } at Test799Kt.main(test799.kt:12)

User code:
```kotlin
package test799
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test799
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
}




```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable } at Test800Kt.main(test800.kt:12)

User code:
```kotlin
package test800
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
  
Remains as-is:
```kotlin
package test800
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
