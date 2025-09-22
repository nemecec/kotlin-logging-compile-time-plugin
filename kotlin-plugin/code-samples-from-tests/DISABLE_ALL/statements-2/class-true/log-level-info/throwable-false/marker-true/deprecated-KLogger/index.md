## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=false / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info(marker) { "info messageBuilder" } at MainTest.main(test1021.kt:12)

User code:
```kotlin
package test1021
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.info(marker) { "info messageBuilder" }
    logger.info(marker) { "info messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1021
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.info(marker) { "info messageBuilder" }
info(marker) { "info messageBuilder" }
    logger.info(marker) { "info messageBuilder" }
info(marker) { "info messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker) { "info messageBuilder $i" } at MainTest.main(test1022.kt:12)

User code:
```kotlin
package test1022
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.info(marker) { "info messageBuilder $i" }
    logger.info(marker) { "info messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1022
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.info(marker) { "info messageBuilder $i" }
info(marker) { "info messageBuilder $i" }
    logger.info(marker) { "info messageBuilder $i" }
info(marker) { "info messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker) { "info messageBuilder $i ${helper()}" } at MainTest.main(test1023.kt:12)

User code:
```kotlin
package test1023
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.info(marker) { "info messageBuilder $i ${helper()}" }
    logger.info(marker) { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1023
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.info(marker) { "info messageBuilder $i ${helper()}" }
info(marker) { "info messageBuilder $i ${helper()}" }
    logger.info(marker) { "info messageBuilder $i ${helper()}" }
info(marker) { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {}") at MainTest.main(test1024.kt:12)

User code:
```kotlin
package test1024
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.info(marker, "info message {}")
    logger.info(marker, "info message {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1024
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.info(marker, "info message {}")
info(marker, "info message {}")
    logger.info(marker, "info message {}")
info(marker, "info message {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, message) at MainTest.main(test1025.kt:12)

User code:
```kotlin
package test1025
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val message = "info message as variable"
    logger.info(marker, message)
    logger.info(marker, message)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1025
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val message = "info message as variable"
    logger.info(marker, message)
info(marker, message)
    logger.info(marker, message)
info(marker, message)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
