## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=true / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  debug(marker, "debug message {}", arg, throwable) at MainTest.main(test896.kt:12)

User code:
```kotlin
package test896
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.debug(marker, "debug message {}", arg, throwable)
    logger.debug(marker, "debug message {}", arg, throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test896
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.DEBUG, marker) { message = "debug message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test896.MainTest", methodName = "main", fileName = "test896.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test896.MainTest", methodName = "main", fileName = "test896.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test896.MainTest", methodName = "main", fileName = "test896.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test896.MainTest", methodName = "main", fileName = "test896.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message with concatenation $arg {}", arg, throwable) at MainTest.main(test897.kt:12)

User code:
```kotlin
package test897
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.debug(marker, "debug message with concatenation $arg {}", arg, throwable)
    logger.debug(marker, "debug message with concatenation $arg {}", arg, throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test897
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message with concatenation $arg {}\"", className = "test897.MainTest", methodName = "main", fileName = "test897.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message with concatenation $arg {}\"", className = "test897.MainTest", methodName = "main", fileName = "test897.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message with concatenation $arg {}\"", className = "test897.MainTest", methodName = "main", fileName = "test897.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message with concatenation $arg {}\"", className = "test897.MainTest", methodName = "main", fileName = "test897.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug with extension function {} interval", arg.minutes, throwable) at MainTest.main(test898.kt:12)

User code:
```kotlin
package test898
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.debug(marker, "debug with extension function {} interval", arg.minutes, throwable)
    logger.debug(marker, "debug with extension function {} interval", arg.minutes, throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test898
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug with extension function {} interval\"", className = "test898.MainTest", methodName = "main", fileName = "test898.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug with extension function {} interval\"", className = "test898.MainTest", methodName = "main", fileName = "test898.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug with extension function {} interval\"", className = "test898.MainTest", methodName = "main", fileName = "test898.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug with extension function {} interval\"", className = "test898.MainTest", methodName = "main", fileName = "test898.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at MainTest.main(test899.kt:12)

User code:
```kotlin
package test899
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
    logger.debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test899
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.DEBUG, marker) { message = "debug message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test899.MainTest", methodName = "main", fileName = "test899.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test899.MainTest", methodName = "main", fileName = "test899.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test899.MainTest", methodName = "main", fileName = "test899.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test899.MainTest", methodName = "main", fileName = "test899.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at MainTest.main(test900.kt:12)

User code:
```kotlin
package test900
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
    logger.debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test900
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test900.MainTest", methodName = "main", fileName = "test900.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test900.MainTest", methodName = "main", fileName = "test900.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test900.MainTest", methodName = "main", fileName = "test900.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test900.MainTest", methodName = "main", fileName = "test900.kt", lineNumber = 13)
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
