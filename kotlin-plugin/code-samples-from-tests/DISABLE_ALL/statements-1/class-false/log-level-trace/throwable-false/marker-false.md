## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=TRACE / with throwable=false / with marker=false



###  trace() { "trace messageBuilder" } at Test241Kt.main(test241.kt:12)

User code:
```kotlin
package test241
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace() { "trace messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test241
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.trace() { "trace messageBuilder" }
}




```

###  trace() { "trace messageBuilder $i" } at Test242Kt.main(test242.kt:12)

User code:
```kotlin
package test242
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test242
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i" }
}




```

###  trace() { "trace messageBuilder $i ${helper()}" } at Test243Kt.main(test243.kt:12)

User code:
```kotlin
package test243
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test243
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.trace() { "trace messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  trace(messageLambda) at Test244Kt.main(test244.kt:12)

User code:
```kotlin
package test244
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(messageLambda)
}




```
  
Remains as-is:
```kotlin
package test244
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "trace messageBuilder" }
  logger.trace(messageLambda)
}




```

###  atTrace() { message="trace eventBuilder"; cause=null } at Test245Kt.main(test245.kt:12)

User code:
```kotlin
package test245
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atTrace() { message="trace eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test245
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atTrace() { message="trace eventBuilder"; cause=null }
}




```

###  atTrace() { message="trace eventBuilder $i"; cause=null } at Test246Kt.main(test246.kt:12)

User code:
```kotlin
package test246
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test246
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i"; cause=null }
}




```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null } at Test247Kt.main(test247.kt:12)

User code:
```kotlin
package test247
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test247
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=null } at Test248Kt.main(test248.kt:12)

User code:
```kotlin
package test248
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test248
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=null } at Test249Kt.main(test249.kt:12)

User code:
```kotlin
package test249
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test249
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
}




```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null } at Test250Kt.main(test250.kt:12)

User code:
```kotlin
package test250
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test250
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
