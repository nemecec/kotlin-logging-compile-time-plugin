## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  warn(marker, throwable) { "warn messageBuilder" } at MainTest.main(test251.kt:12)

User code:
```kotlin
package test251
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.warn(marker, throwable) { "warn messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test251
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.warn(marker, throwable) { "warn messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable) { "warn messageBuilder $i" } at MainTest.main(test252.kt:12)

User code:
```kotlin
package test252
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(marker, throwable) { "warn messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test252
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(marker, throwable) { "warn messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test253.kt:12)

User code:
```kotlin
package test253
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(marker, throwable) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test253
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(marker, throwable) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {}", throwable) at MainTest.main(test254.kt:12)

User code:
```kotlin
package test254
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.warn(marker, "warn message {}", throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test254
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.warn(marker, "warn message {}", throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, message, throwable) at MainTest.main(test255.kt:12)

User code:
```kotlin
package test255
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val message = "warn message as variable"
    logger.warn(marker, message, throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test255
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val message = "warn message as variable"
    logger.warn(marker, message, throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
