## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  warn(marker, "warn message {}", arg, throwable) at MainTest.main(test1056.kt:12)

User code:
```kotlin
package test1056
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.warn(marker, "warn message {}", arg, throwable)
    logger.warn(marker, "warn message {}", arg, throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1056
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.WARN, marker) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1056.MainTest", methodName = "main", fileName = "test1056.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1056.MainTest", methodName = "main", fileName = "test1056.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message with concatenation $arg {}", arg, throwable) at MainTest.main(test1057.kt:12)

User code:
```kotlin
package test1057
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.warn(marker, "warn message with concatenation $arg {}", arg, throwable)
    logger.warn(marker, "warn message with concatenation $arg {}", arg, throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1057
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message with concatenation $arg {}\"", className = "test1057.MainTest", methodName = "main", fileName = "test1057.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message with concatenation $arg {}\"", className = "test1057.MainTest", methodName = "main", fileName = "test1057.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn with extension function {} interval", arg.minutes, throwable) at MainTest.main(test1058.kt:12)

User code:
```kotlin
package test1058
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.warn(marker, "warn with extension function {} interval", arg.minutes, throwable)
    logger.warn(marker, "warn with extension function {} interval", arg.minutes, throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1058
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN, marker) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn with extension function {} interval\"", className = "test1058.MainTest", methodName = "main", fileName = "test1058.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn with extension function {} interval\"", className = "test1058.MainTest", methodName = "main", fileName = "test1058.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at MainTest.main(test1059.kt:12)

User code:
```kotlin
package test1059
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
    logger.warn(marker, "warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1059
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.WARN, marker) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1059.MainTest", methodName = "main", fileName = "test1059.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1059.MainTest", methodName = "main", fileName = "test1059.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at MainTest.main(test1060.kt:12)

User code:
```kotlin
package test1060
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
    logger.warn(marker, "warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1060
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1060.MainTest", methodName = "main", fileName = "test1060.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1060.MainTest", methodName = "main", fileName = "test1060.kt", lineNumber = 13)
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
