## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=TRACE / with throwable=false / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  trace(marker) { "trace messageBuilder" } at MainTest.main(test861.kt:12)

User code:
```kotlin
package test861
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.trace(marker) { "trace messageBuilder" }
    logger.trace(marker) { "trace messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test861
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.trace(marker) { "trace messageBuilder" }
trace(marker) { "trace messageBuilder" }
    logger.trace(marker) { "trace messageBuilder" }
trace(marker) { "trace messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker) { "trace messageBuilder $i" } at MainTest.main(test862.kt:12)

User code:
```kotlin
package test862
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.trace(marker) { "trace messageBuilder $i" }
    logger.trace(marker) { "trace messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test862
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.trace(marker) { "trace messageBuilder $i" }
trace(marker) { "trace messageBuilder $i" }
    logger.trace(marker) { "trace messageBuilder $i" }
trace(marker) { "trace messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker) { "trace messageBuilder $i ${helper()}" } at MainTest.main(test863.kt:12)

User code:
```kotlin
package test863
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.trace(marker) { "trace messageBuilder $i ${helper()}" }
    logger.trace(marker) { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test863
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.trace(marker) { "trace messageBuilder $i ${helper()}" }
trace(marker) { "trace messageBuilder $i ${helper()}" }
    logger.trace(marker) { "trace messageBuilder $i ${helper()}" }
trace(marker) { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {}") at MainTest.main(test864.kt:12)

User code:
```kotlin
package test864
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.trace(marker, "trace message {}")
    logger.trace(marker, "trace message {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test864
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.trace(marker, "trace message {}")
trace(marker, "trace message {}")
    logger.trace(marker, "trace message {}")
trace(marker, "trace message {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, message) at MainTest.main(test865.kt:12)

User code:
```kotlin
package test865
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val message = "trace message as variable"
    logger.trace(marker, message)
    logger.trace(marker, message)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test865
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val message = "trace message as variable"
    logger.trace(marker, message)
trace(marker, message)
    logger.trace(marker, message)
trace(marker, message)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
