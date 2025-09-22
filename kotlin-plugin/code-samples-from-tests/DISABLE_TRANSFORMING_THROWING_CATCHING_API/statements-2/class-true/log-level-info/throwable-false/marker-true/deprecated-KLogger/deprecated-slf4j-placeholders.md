## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info(marker, "info message {}", arg) at MainTest.main(test1016.kt:12)

User code:
```kotlin
package test1016
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.info(marker, "info message {}", arg)
    logger.info(marker, "info message {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1016
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.INFO, marker) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"", className = "test1016.MainTest", methodName = "main", fileName = "test1016.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"", className = "test1016.MainTest", methodName = "main", fileName = "test1016.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"", className = "test1016.MainTest", methodName = "main", fileName = "test1016.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}\"", className = "test1016.MainTest", methodName = "main", fileName = "test1016.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message with concatenation $arg {}", arg) at MainTest.main(test1017.kt:12)

User code:
```kotlin
package test1017
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.info(marker, "info message with concatenation $arg {}", arg)
    logger.info(marker, "info message with concatenation $arg {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1017
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.INFO, marker) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message with concatenation $arg {}\"", className = "test1017.MainTest", methodName = "main", fileName = "test1017.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message with concatenation $arg {}\"", className = "test1017.MainTest", methodName = "main", fileName = "test1017.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message with concatenation $arg {}\"", className = "test1017.MainTest", methodName = "main", fileName = "test1017.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message with concatenation $arg {}\"", className = "test1017.MainTest", methodName = "main", fileName = "test1017.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info with extension function {} interval", arg.minutes) at MainTest.main(test1018.kt:12)

User code:
```kotlin
package test1018
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.info(marker, "info with extension function {} interval", arg.minutes)
    logger.info(marker, "info with extension function {} interval", arg.minutes)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1018
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.INFO, marker) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info with extension function {} interval\"", className = "test1018.MainTest", methodName = "main", fileName = "test1018.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info with extension function {} interval\"", className = "test1018.MainTest", methodName = "main", fileName = "test1018.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info with extension function {} interval\"", className = "test1018.MainTest", methodName = "main", fileName = "test1018.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info with extension function {} interval\"", className = "test1018.MainTest", methodName = "main", fileName = "test1018.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test1019.kt:12)

User code:
```kotlin
package test1019
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
    logger.info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1019
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.INFO, marker) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1019.MainTest", methodName = "main", fileName = "test1019.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1019.MainTest", methodName = "main", fileName = "test1019.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1019.MainTest", methodName = "main", fileName = "test1019.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1019.MainTest", methodName = "main", fileName = "test1019.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test1020.kt:12)

User code:
```kotlin
package test1020
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
    logger.info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1020
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1020.MainTest", methodName = "main", fileName = "test1020.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1020.MainTest", methodName = "main", fileName = "test1020.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1020.MainTest", methodName = "main", fileName = "test1020.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1020.MainTest", methodName = "main", fileName = "test1020.kt", lineNumber = 13)
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
