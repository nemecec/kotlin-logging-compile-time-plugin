## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=false



###  warn() { "warn messageBuilder" } at Test771Kt.main(test771.kt:12)

User code:
```kotlin
package test771
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn() { "warn messageBuilder" }
  logger.warn() { "warn messageBuilder" }
}




```
  
Remains as-is:
```kotlin
package test771
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.warn() { "warn messageBuilder" }
  logger.warn() { "warn messageBuilder" }
}




```

###  warn() { "warn messageBuilder $i" } at Test772Kt.main(test772.kt:12)

User code:
```kotlin
package test772
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i" }
  logger.warn() { "warn messageBuilder $i" }
}




```
  
Remains as-is:
```kotlin
package test772
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i" }
  logger.warn() { "warn messageBuilder $i" }
}




```

###  warn() { "warn messageBuilder $i ${helper()}" } at Test773Kt.main(test773.kt:12)

User code:
```kotlin
package test773
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i ${helper()}" }
  logger.warn() { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test773
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.warn() { "warn messageBuilder $i ${helper()}" }
  logger.warn() { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"



```

###  warn(messageLambda) at Test774Kt.main(test774.kt:12)

User code:
```kotlin
package test774
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(messageLambda)
  logger.warn(messageLambda)
}




```
  
Remains as-is:
```kotlin
package test774
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(messageLambda)
  logger.warn(messageLambda)
}




```

###  atWarn() { message="warn eventBuilder"; cause=null } at Test775Kt.main(test775.kt:12)

User code:
```kotlin
package test775
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atWarn() { message="warn eventBuilder"; cause=null }
  logger.atWarn() { message="warn eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test775
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.atWarn() { message="warn eventBuilder"; cause=null }
  logger.atWarn() { message="warn eventBuilder"; cause=null }
}




```

###  atWarn() { message="warn eventBuilder $i"; cause=null } at Test776Kt.main(test776.kt:12)

User code:
```kotlin
package test776
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test776
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
  logger.atWarn() { message="warn eventBuilder $i"; cause=null }
}




```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null } at Test777Kt.main(test777.kt:12)

User code:
```kotlin
package test777
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test777
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```

###  at(Level.WARN) { message="warn eventBuilder"; cause=null } at Test778Kt.main(test778.kt:12)

User code:
```kotlin
package test778
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test778
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
}




```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=null } at Test779Kt.main(test779.kt:12)

User code:
```kotlin
package test779
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
}




```
  
Remains as-is:
```kotlin
package test779
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
}




```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null } at Test780Kt.main(test780.kt:12)

User code:
```kotlin
package test780
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
  
Remains as-is:
```kotlin
package test780
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  
  
  val i = 42
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"



```
