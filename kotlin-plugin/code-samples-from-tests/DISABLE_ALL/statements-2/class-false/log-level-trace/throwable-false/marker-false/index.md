## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  trace() { "trace messageBuilder" } at Test1291Kt.main(test1291.kt:12)

User code:
```kotlin
package test1291
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace() { "trace messageBuilder" }
  logger.trace() { "trace messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test1291
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace() { "trace messageBuilder" }
  logger.trace() { "trace messageBuilder" }
}




```

###  trace() { "trace messageBuilder $i" } at Test1292Kt.main(test1292.kt:12)

User code:
```kotlin
package test1292
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
package test1292
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i" }
  logger.trace() { "trace messageBuilder $i" }
}




```

###  trace() { "trace messageBuilder $i ${helper()}" } at Test1293Kt.main(test1293.kt:12)

User code:
```kotlin
package test1293
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
package test1293
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i ${helper()}" }
  logger.trace() { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  trace(messageLambda) at Test1294Kt.main(test1294.kt:12)

User code:
```kotlin
package test1294
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
package test1294
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(messageLambda)
  logger.trace(messageLambda)
}




```

###  atTrace() { message="trace eventBuilder"; cause=null } at Test1295Kt.main(test1295.kt:12)

User code:
```kotlin
package test1295
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atTrace() { message="trace eventBuilder"; cause=null }
  logger.atTrace() { message="trace eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test1295
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atTrace() { message="trace eventBuilder"; cause=null }
  logger.atTrace() { message="trace eventBuilder"; cause=null }
}




```

###  atTrace() { message="trace eventBuilder $i"; cause=null } at Test1296Kt.main(test1296.kt:12)

User code:
```kotlin
package test1296
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
package test1296
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
}




```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null } at Test1297Kt.main(test1297.kt:12)

User code:
```kotlin
package test1297
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
package test1297
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=null } at Test1298Kt.main(test1298.kt:12)

User code:
```kotlin
package test1298
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test1298
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=null } at Test1299Kt.main(test1299.kt:12)

User code:
```kotlin
package test1299
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
package test1299
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null } at Test1300Kt.main(test1300.kt:12)

User code:
```kotlin
package test1300
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
package test1300
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
