## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  warn(marker, "warn message {}", arg) at MainTest.main(test286.kt:12)

User code:
```kotlin
package test286
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.warn(marker, "warn message {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test286
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.WARN, marker) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}"", className = "test286.MainTest", methodName = "main", fileName = "test286.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message with concatenation $arg {}", arg) at MainTest.main(test287.kt:12)

User code:
```kotlin
package test287
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.warn(marker, "warn message with concatenation $arg {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test287
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message with concatenation $arg {}"", className = "test287.MainTest", methodName = "main", fileName = "test287.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn with extension function {} interval", arg.minutes) at MainTest.main(test288.kt:12)

User code:
```kotlin
package test288
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.warn(marker, "warn with extension function {} interval", arg.minutes)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test288
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn with extension function {} interval"", className = "test288.MainTest", methodName = "main", fileName = "test288.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test289.kt:12)

User code:
```kotlin
package test289
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test289
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.WARN, marker) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test289.MainTest", methodName = "main", fileName = "test289.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test290.kt:12)

User code:
```kotlin
package test290
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test290
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn message {}a" + " {}b" + " {}ab" + " ab"", className = "test290.MainTest", methodName = "main", fileName = "test290.kt", lineNumber = 12)
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
