## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=false / with log level=WARN / with throwable=true / with marker=true



###  warn(marker, throwable) { "warn messageBuilder" } at Test331Kt.main(test331.kt:12)

User code:
```kotlin
package test331
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.warn(marker, throwable) { "warn messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test331
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.warn(marker, throwable) { "warn messageBuilder" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable) { "warn messageBuilder $i" } at Test332Kt.main(test332.kt:12)

User code:
```kotlin
package test332
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(marker, throwable) { "warn messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test332
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(marker, throwable) { "warn messageBuilder $i" }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable) { "warn messageBuilder $i ${helper()}" } at Test333Kt.main(test333.kt:12)

User code:
```kotlin
package test333
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(marker, throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test333
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.warn(marker, throwable) { "warn messageBuilder $i ${helper()}" }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable, messageLambda) at Test334Kt.main(test334.kt:12)

User code:
```kotlin
package test334
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(marker, throwable, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test334
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val messageLambda: () -> Any = { "warn messageBuilder" }
  logger.warn(marker, throwable, messageLambda)
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder"; cause=throwable } at Test335Kt.main(test335.kt:12)

User code:
```kotlin
package test335
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atWarn(marker) { message="warn eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test335
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.atWarn(marker) { message="warn eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i"; cause=throwable } at Test336Kt.main(test336.kt:12)

User code:
```kotlin
package test336
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn(marker) { message="warn eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test336
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn(marker) { message="warn eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at Test337Kt.main(test337.kt:12)

User code:
```kotlin
package test337
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test337
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable } at Test338Kt.main(test338.kt:12)

User code:
```kotlin
package test338
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test338
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  
  logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable } at Test339Kt.main(test339.kt:12)

User code:
```kotlin
package test339
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test339
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at Test340Kt.main(test340.kt:12)

User code:
```kotlin
package test340
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test340
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  val throwable = Exception("expected!")
  val i = 42
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
