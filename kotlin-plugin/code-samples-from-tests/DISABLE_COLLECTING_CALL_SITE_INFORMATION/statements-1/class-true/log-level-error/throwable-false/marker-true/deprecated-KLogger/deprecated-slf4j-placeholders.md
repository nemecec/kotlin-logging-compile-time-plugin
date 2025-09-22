## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  error(marker, "error message {}", arg) at MainTest.main(test366.kt:12)

User code:
```kotlin
package test366
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.error(marker, "error message {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test366
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.ERROR, marker) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message with concatenation $arg {}", arg) at MainTest.main(test367.kt:12)

User code:
```kotlin
package test367
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.error(marker, "error message with concatenation $arg {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test367
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.ERROR, marker) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error with extension function {} interval", arg.minutes) at MainTest.main(test368.kt:12)

User code:
```kotlin
package test368
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.error(marker, "error with extension function {} interval", arg.minutes)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test368
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.ERROR, marker) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test369.kt:12)

User code:
```kotlin
package test369
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.error(marker, "error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test369
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.ERROR, marker) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"")
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test370.kt:12)

User code:
```kotlin
package test370
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.error(marker, "error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test370
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.at(Level.ERROR, marker) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"")
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
