## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=INFO / with throwable=false / with marker=true



###  info(marker) { "info messageBuilder" } at Test721Kt.main(test721.kt:12)

User code:
```kotlin
package test721
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.info(marker) { "info messageBuilder" }
  logger.info(marker) { "info messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test721
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.info(marker) { "info messageBuilder" }
  logger.info(marker) { "info messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker) { "info messageBuilder $i" } at Test722Kt.main(test722.kt:12)

User code:
```kotlin
package test722
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.info(marker) { "info messageBuilder $i" }
  logger.info(marker) { "info messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test722
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.info(marker) { "info messageBuilder $i" }
  logger.info(marker) { "info messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker) { "info messageBuilder $i ${helper()}" } at Test723Kt.main(test723.kt:12)

User code:
```kotlin
package test723
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.info(marker) { "info messageBuilder $i ${helper()}" }
  logger.info(marker) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test723
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.info(marker) { "info messageBuilder $i ${helper()}" }
  logger.info(marker) { "info messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, messageLambda) at Test724Kt.main(test724.kt:12)

User code:
```kotlin
package test724
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(marker, messageLambda)
  logger.info(marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test724
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val messageLambda: () -> Any = { "info messageBuilder" }
  logger.info(marker, messageLambda)
  logger.info(marker, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder"; cause=null } at Test725Kt.main(test725.kt:12)

User code:
```kotlin
package test725
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atInfo(marker) { message="info eventBuilder"; cause=null }
  logger.atInfo(marker) { message="info eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test725
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atInfo(marker) { message="info eventBuilder"; cause=null }
  logger.atInfo(marker) { message="info eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i"; cause=null } at Test726Kt.main(test726.kt:12)

User code:
```kotlin
package test726
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
  logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test726
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
  logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null } at Test727Kt.main(test727.kt:12)

User code:
```kotlin
package test727
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
  logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test727
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
  logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder"; cause=null } at Test728Kt.main(test728.kt:12)

User code:
```kotlin
package test728
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
  logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test728
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
  logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null } at Test729Kt.main(test729.kt:12)

User code:
```kotlin
package test729
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
  logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test729
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
  logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null } at Test730Kt.main(test730.kt:12)

User code:
```kotlin
package test730
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test730
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
