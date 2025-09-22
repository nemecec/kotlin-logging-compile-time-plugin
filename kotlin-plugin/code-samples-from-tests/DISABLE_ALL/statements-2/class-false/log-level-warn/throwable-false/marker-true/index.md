## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=false / with log level=WARN / with throwable=false / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  atWarn(marker) { message="warn eventBuilder"; cause=null } at Test1515Kt.main(test1515.kt:12)

User code:
```kotlin
package test1515
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atWarn(marker) { message="warn eventBuilder"; cause=null }
  logger.atWarn(marker) { message="warn eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1515
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.atWarn(marker) { message="warn eventBuilder"; cause=null }
atWarn(marker) { message="warn eventBuilder"; cause=null }
  logger.atWarn(marker) { message="warn eventBuilder"; cause=null }
atWarn(marker) { message="warn eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i"; cause=null } at Test1516Kt.main(test1516.kt:12)

User code:
```kotlin
package test1516
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atWarn(marker) { message="warn eventBuilder $i"; cause=null }
  logger.atWarn(marker) { message="warn eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1516
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atWarn(marker) { message="warn eventBuilder $i"; cause=null }
atWarn(marker) { message="warn eventBuilder $i"; cause=null }
  logger.atWarn(marker) { message="warn eventBuilder $i"; cause=null }
atWarn(marker) { message="warn eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null } at Test1517Kt.main(test1517.kt:12)

User code:
```kotlin
package test1517
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1517
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder"; cause=null } at Test1518Kt.main(test1518.kt:12)

User code:
```kotlin
package test1518
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
  logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1518
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  
  logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
  logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null } at Test1519Kt.main(test1519.kt:12)

User code:
```kotlin
package test1519
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1519
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
}


class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null } at Test1520Kt.main(test1520.kt:12)

User code:
```kotlin
package test1520
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1520
import io.github.oshai.kotlinlogging.*



private val logger = KotlinLogging.logger {}

fun main() {
  val marker = MyMarker("markerName")
  
  val i = 42
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
  logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
}
fun helper() = "Hello!"

class MyMarker(private val name: String): Marker { override fun getName() = name }

```
