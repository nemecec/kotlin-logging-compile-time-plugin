## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=TRACE / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  trace(throwable) { "trace messageBuilder" } at Test1251Kt.main(test1251.kt:12)

User code:
```kotlin
package test1251
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace(throwable) { "trace messageBuilder" }
  logger.trace(throwable) { "trace messageBuilder" }
}




```
  
Transformed into:
```kotlin
package test1251
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.trace(throwable) { "trace messageBuilder" }
trace(throwable) { "trace messageBuilder" }
  logger.trace(throwable) { "trace messageBuilder" }
trace(throwable) { "trace messageBuilder" }
}




```

###  trace(throwable) { "trace messageBuilder $i" } at Test1252Kt.main(test1252.kt:12)

User code:
```kotlin
package test1252
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i" }
  logger.trace(throwable) { "trace messageBuilder $i" }
}




```
  
Transformed into:
```kotlin
package test1252
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i" }
trace(throwable) { "trace messageBuilder $i" }
  logger.trace(throwable) { "trace messageBuilder $i" }
trace(throwable) { "trace messageBuilder $i" }
}




```

###  trace(throwable) { "trace messageBuilder $i ${helper()}" } at Test1253Kt.main(test1253.kt:12)

User code:
```kotlin
package test1253
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
  logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1253
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
trace(throwable) { "trace messageBuilder $i ${helper()}" }
  logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
trace(throwable) { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  trace(throwable, messageLambda) at Test1254Kt.main(test1254.kt:12)

User code:
```kotlin
package test1254
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(throwable, messageLambda)
  logger.trace(throwable, messageLambda)
}




```
  
Transformed into:
```kotlin
package test1254
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(throwable, messageLambda)
trace(throwable, messageLambda)
  logger.trace(throwable, messageLambda)
trace(throwable, messageLambda)
}




```

###  atTrace() { message="trace eventBuilder"; cause=throwable } at Test1255Kt.main(test1255.kt:12)

User code:
```kotlin
package test1255
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atTrace() { message="trace eventBuilder"; cause=throwable }
  logger.atTrace() { message="trace eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1255
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atTrace() { message="trace eventBuilder"; cause=throwable }
atTrace() { message="trace eventBuilder"; cause=throwable }
  logger.atTrace() { message="trace eventBuilder"; cause=throwable }
atTrace() { message="trace eventBuilder"; cause=throwable }
}




```

###  atTrace() { message="trace eventBuilder $i"; cause=throwable } at Test1256Kt.main(test1256.kt:12)

User code:
```kotlin
package test1256
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
  logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1256
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
atTrace() { message="trace eventBuilder $i"; cause=throwable }
  logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
atTrace() { message="trace eventBuilder $i"; cause=throwable }
}




```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test1257Kt.main(test1257.kt:12)

User code:
```kotlin
package test1257
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1257
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=throwable } at Test1258Kt.main(test1258.kt:12)

User code:
```kotlin
package test1258
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1258
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable } at Test1259Kt.main(test1259.kt:12)

User code:
```kotlin
package test1259
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
}




```
  
Transformed into:
```kotlin
package test1259
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at Test1260Kt.main(test1260.kt:12)

User code:
```kotlin
package test1260
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Transformed into:
```kotlin
package test1260
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
