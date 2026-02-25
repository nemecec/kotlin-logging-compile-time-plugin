## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=DEBUG / with throwable=false / with marker=false



###  debug() { "debug messageBuilder" } at Test281Kt.main(test281.kt:12)

User code:
```kotlin
package test281
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.debug() { "debug messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test281
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.debug() { "debug messageBuilder" }
}




```

###  debug() { "debug messageBuilder $i" } at Test282Kt.main(test282.kt:12)

User code:
```kotlin
package test282
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test282
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i" }
}




```

###  debug() { "debug messageBuilder $i ${helper()}" } at Test283Kt.main(test283.kt:12)

User code:
```kotlin
package test283
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test283
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.debug() { "debug messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  debug(messageLambda) at Test284Kt.main(test284.kt:12)

User code:
```kotlin
package test284
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(messageLambda)
}




```
  
Remains as-is:
```kotlin
package test284
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "debug messageBuilder" }
  logger.debug(messageLambda)
}




```

###  atDebug() { message="debug eventBuilder"; cause=null } at Test285Kt.main(test285.kt:12)

User code:
```kotlin
package test285
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atDebug() { message="debug eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test285
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atDebug() { message="debug eventBuilder"; cause=null }
}




```

###  atDebug() { message="debug eventBuilder $i"; cause=null } at Test286Kt.main(test286.kt:12)

User code:
```kotlin
package test286
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test286
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i"; cause=null }
}




```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null } at Test287Kt.main(test287.kt:12)

User code:
```kotlin
package test287
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test287
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=null } at Test288Kt.main(test288.kt:12)

User code:
```kotlin
package test288
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test288
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null } at Test289Kt.main(test289.kt:12)

User code:
```kotlin
package test289
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test289
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
}




```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null } at Test290Kt.main(test290.kt:12)

User code:
```kotlin
package test290
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test290
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
