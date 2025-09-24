## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=ERROR / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  error() { "error messageBuilder" } at Test1611Kt.main(test1611.kt:12)

User code:
```kotlin
package test1611
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.error() { "error messageBuilder" }
  logger.error() { "error messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test1611
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.error() { "error messageBuilder" }
  logger.error() { "error messageBuilder" }
}




```

###  error() { "error messageBuilder $i" } at Test1612Kt.main(test1612.kt:12)

User code:
```kotlin
package test1612
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
package test1612
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.error() { "error messageBuilder $i" }
  logger.error() { "error messageBuilder $i" }
}




```

###  error() { "error messageBuilder $i ${helper()}" } at Test1613Kt.main(test1613.kt:12)

User code:
```kotlin
package test1613
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
package test1613
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.error() { "error messageBuilder $i ${helper()}" }
  logger.error() { "error messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  error(messageLambda) at Test1614Kt.main(test1614.kt:12)

User code:
```kotlin
package test1614
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
package test1614
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "error messageBuilder" }
  logger.error(messageLambda)
  logger.error(messageLambda)
}




```

###  atError() { message="error eventBuilder"; cause=null } at Test1615Kt.main(test1615.kt:12)

User code:
```kotlin
package test1615
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atError() { message="error eventBuilder"; cause=null }
  logger.atError() { message="error eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test1615
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atError() { message="error eventBuilder"; cause=null }
  logger.atError() { message="error eventBuilder"; cause=null }
}




```

###  atError() { message="error eventBuilder $i"; cause=null } at Test1616Kt.main(test1616.kt:12)

User code:
```kotlin
package test1616
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
package test1616
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atError() { message="error eventBuilder $i"; cause=null }
  logger.atError() { message="error eventBuilder $i"; cause=null }
}




```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=null } at Test1617Kt.main(test1617.kt:12)

User code:
```kotlin
package test1617
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
package test1617
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
  logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```

###  at(Level.ERROR) { message="error eventBuilder"; cause=null } at Test1618Kt.main(test1618.kt:12)

User code:
```kotlin
package test1618
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test1618
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
}




```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=null } at Test1619Kt.main(test1619.kt:12)

User code:
```kotlin
package test1619
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
package test1619
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
}




```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null } at Test1620Kt.main(test1620.kt:12)

User code:
```kotlin
package test1620
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
package test1620
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
