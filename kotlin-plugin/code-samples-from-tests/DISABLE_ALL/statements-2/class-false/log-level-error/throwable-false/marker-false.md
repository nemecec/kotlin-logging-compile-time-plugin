## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=false



###  error() { "error messageBuilder" } at Test811Kt.main(test811.kt:12)

User code:
```kotlin
package test811
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.error() { "error messageBuilder" }
  logger.error() { "error messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test811
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.error() { "error messageBuilder" }
  logger.error() { "error messageBuilder" }
}




```

###  error() { "error messageBuilder $i" } at Test812Kt.main(test812.kt:12)

User code:
```kotlin
package test812
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.error() { "error messageBuilder $i" }
  logger.error() { "error messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test812
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.error() { "error messageBuilder $i" }
  logger.error() { "error messageBuilder $i" }
}




```

###  error() { "error messageBuilder $i ${helper()}" } at Test813Kt.main(test813.kt:12)

User code:
```kotlin
package test813
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.error() { "error messageBuilder $i ${helper()}" }
  logger.error() { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test813
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.error() { "error messageBuilder $i ${helper()}" }
  logger.error() { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  error(messageLambda) at Test814Kt.main(test814.kt:12)

User code:
```kotlin
package test814
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(messageLambda)
  logger.error(messageLambda)
}




```
  
Remains as-is:
```kotlin
package test814
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(messageLambda)
  logger.error(messageLambda)
}




```

###  atError() { message="error eventBuilder"; cause=null } at Test815Kt.main(test815.kt:12)

User code:
```kotlin
package test815
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atError() { message="error eventBuilder"; cause=null }
  logger.atError() { message="error eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test815
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atError() { message="error eventBuilder"; cause=null }
  logger.atError() { message="error eventBuilder"; cause=null }
}




```

###  atError() { message="error eventBuilder $i"; cause=null } at Test816Kt.main(test816.kt:12)

User code:
```kotlin
package test816
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=null }
  logger.atError() { message="error eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test816
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=null }
  logger.atError() { message="error eventBuilder $i"; cause=null }
}




```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=null } at Test817Kt.main(test817.kt:12)

User code:
```kotlin
package test817
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test817
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```

###  at(Level.ERROR) { message="error eventBuilder"; cause=null } at Test818Kt.main(test818.kt:12)

User code:
```kotlin
package test818
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test818
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
}




```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=null } at Test819Kt.main(test819.kt:12)

User code:
```kotlin
package test819
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test819
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
}




```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null } at Test820Kt.main(test820.kt:12)

User code:
```kotlin
package test820
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test820
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
