## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=false



###  warn(throwable) { "warn messageBuilder" } at Test341Kt.main(test341.kt:12)

User code:
```kotlin
package test341
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn(throwable) { "warn messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test341
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.warn(throwable) { "warn messageBuilder" }
}




```

###  warn(throwable) { "warn messageBuilder $i" } at Test342Kt.main(test342.kt:12)

User code:
```kotlin
package test342
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test342
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i" }
}




```

###  warn(throwable) { "warn messageBuilder $i ${helper()}" } at Test343Kt.main(test343.kt:12)

User code:
```kotlin
package test343
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test343
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  warn(throwable, messageLambda) at Test344Kt.main(test344.kt:12)

User code:
```kotlin
package test344
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(throwable, messageLambda)
}




```
  
Remains as-is:
```kotlin
package test344
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(throwable, messageLambda)
}




```

###  atWarn() { message="warn eventBuilder"; cause=throwable } at Test345Kt.main(test345.kt:12)

User code:
```kotlin
package test345
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atWarn() { message="warn eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test345
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.atWarn() { message="warn eventBuilder"; cause=throwable }
}




```

###  atWarn() { message="warn eventBuilder $i"; cause=throwable } at Test346Kt.main(test346.kt:12)

User code:
```kotlin
package test346
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test346
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
}




```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable } at Test347Kt.main(test347.kt:12)

User code:
```kotlin
package test347
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test347
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```

###  at(Level.WARN) { message="warn eventBuilder"; cause=throwable } at Test348Kt.main(test348.kt:12)

User code:
```kotlin
package test348
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test348
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
}




```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable } at Test349Kt.main(test349.kt:12)

User code:
```kotlin
package test349
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
}




```
  
Remains as-is:
```kotlin
package test349
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
}




```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at Test350Kt.main(test350.kt:12)

User code:
```kotlin
package test350
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test350
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"



```
