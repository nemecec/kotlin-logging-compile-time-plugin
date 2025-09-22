## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn(marker) { "warn messageBuilder" } at MainTest.main(test1101.kt:12)

User code:
```kotlin
package test1101
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.warn(marker) { "warn messageBuilder" }
    logger.warn(marker) { "warn messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1101
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.warn(marker) { "warn messageBuilder" }
warn(marker) { "warn messageBuilder" }
    logger.warn(marker) { "warn messageBuilder" }
warn(marker) { "warn messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker) { "warn messageBuilder $i" } at MainTest.main(test1102.kt:12)

User code:
```kotlin
package test1102
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.warn(marker) { "warn messageBuilder $i" }
    logger.warn(marker) { "warn messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1102
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.warn(marker) { "warn messageBuilder $i" }
warn(marker) { "warn messageBuilder $i" }
    logger.warn(marker) { "warn messageBuilder $i" }
warn(marker) { "warn messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test1103.kt:12)

User code:
```kotlin
package test1103
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.warn(marker) { "warn messageBuilder $i ${helper()}" }
    logger.warn(marker) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1103
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.warn(marker) { "warn messageBuilder $i ${helper()}" }
warn(marker) { "warn messageBuilder $i ${helper()}" }
    logger.warn(marker) { "warn messageBuilder $i ${helper()}" }
warn(marker) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {}") at MainTest.main(test1104.kt:12)

User code:
```kotlin
package test1104
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.warn(marker, "warn message {}")
    logger.warn(marker, "warn message {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1104
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.warn(marker, "warn message {}")
warn(marker, "warn message {}")
    logger.warn(marker, "warn message {}")
warn(marker, "warn message {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, message) at MainTest.main(test1105.kt:12)

User code:
```kotlin
package test1105
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val message = "warn message as variable"
    logger.warn(marker, message)
    logger.warn(marker, message)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1105
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val message = "warn message as variable"
    logger.warn(marker, message)
warn(marker, message)
    logger.warn(marker, message)
warn(marker, message)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
