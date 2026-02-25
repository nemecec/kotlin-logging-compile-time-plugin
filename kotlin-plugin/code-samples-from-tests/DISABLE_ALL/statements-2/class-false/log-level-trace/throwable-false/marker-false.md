## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false



###  trace() { "trace messageBuilder" } at Test651Kt.main(test651.kt:12)

User code:
```kotlin
package test651
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace() { "trace messageBuilder" }
  logger.trace() { "trace messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test651
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace() { "trace messageBuilder" }
  logger.trace() { "trace messageBuilder" }
}




```

###  trace() { "trace messageBuilder $i" } at Test652Kt.main(test652.kt:12)

User code:
```kotlin
package test652
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i" }
  logger.trace() { "trace messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test652
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i" }
  logger.trace() { "trace messageBuilder $i" }
}




```

###  trace() { "trace messageBuilder $i ${helper()}" } at Test653Kt.main(test653.kt:12)

User code:
```kotlin
package test653
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i ${helper()}" }
  logger.trace() { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test653
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i ${helper()}" }
  logger.trace() { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  trace(messageLambda) at Test654Kt.main(test654.kt:12)

User code:
```kotlin
package test654
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(messageLambda)
  logger.trace(messageLambda)
}




```
  
Remains as-is:
```kotlin
package test654
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(messageLambda)
  logger.trace(messageLambda)
}




```

###  atTrace() { message="trace eventBuilder"; cause=null } at Test655Kt.main(test655.kt:12)

User code:
```kotlin
package test655
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atTrace() { message="trace eventBuilder"; cause=null }
  logger.atTrace() { message="trace eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test655
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atTrace() { message="trace eventBuilder"; cause=null }
  logger.atTrace() { message="trace eventBuilder"; cause=null }
}




```

###  atTrace() { message="trace eventBuilder $i"; cause=null } at Test656Kt.main(test656.kt:12)

User code:
```kotlin
package test656
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test656
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
}




```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null } at Test657Kt.main(test657.kt:12)

User code:
```kotlin
package test657
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test657
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=null } at Test658Kt.main(test658.kt:12)

User code:
```kotlin
package test658
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test658
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=null } at Test659Kt.main(test659.kt:12)

User code:
```kotlin
package test659
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test659
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null } at Test660Kt.main(test660.kt:12)

User code:
```kotlin
package test660
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test660
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
