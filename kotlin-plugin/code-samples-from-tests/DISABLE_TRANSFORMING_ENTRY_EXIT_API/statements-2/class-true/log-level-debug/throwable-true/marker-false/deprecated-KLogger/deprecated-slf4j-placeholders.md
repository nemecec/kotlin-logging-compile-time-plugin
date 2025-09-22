## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  debug("debug message {}", arg, throwable) at MainTest.main(test916.kt:12)

User code:
```kotlin
package test916
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.debug("debug message {}", arg, throwable)
    logger.debug("debug message {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test916
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.DEBUG) { message = "debug message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test916.MainTest", methodName = "main", fileName = "test916.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test916.MainTest", methodName = "main", fileName = "test916.kt", lineNumber = 13)
    logger.at(Level.DEBUG) { message = "debug message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test916.MainTest", methodName = "main", fileName = "test916.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test916.MainTest", methodName = "main", fileName = "test916.kt", lineNumber = 13)
  }
  
}


```

###  debug("debug message with concatenation $arg {}", arg, throwable) at MainTest.main(test917.kt:12)

User code:
```kotlin
package test917
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.debug("debug message with concatenation $arg {}", arg, throwable)
    logger.debug("debug message with concatenation $arg {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test917
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.DEBUG) { message = "debug message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"", className = "test917.MainTest", methodName = "main", fileName = "test917.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"", className = "test917.MainTest", methodName = "main", fileName = "test917.kt", lineNumber = 13)
    logger.at(Level.DEBUG) { message = "debug message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"", className = "test917.MainTest", methodName = "main", fileName = "test917.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"", className = "test917.MainTest", methodName = "main", fileName = "test917.kt", lineNumber = 13)
  }
  
}


```

###  debug("debug with extension function {} interval", arg.minutes, throwable) at MainTest.main(test918.kt:12)

User code:
```kotlin
package test918
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug("debug with extension function {} interval", arg.minutes, throwable)
    logger.debug("debug with extension function {} interval", arg.minutes, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test918
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message = "debug with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"", className = "test918.MainTest", methodName = "main", fileName = "test918.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"", className = "test918.MainTest", methodName = "main", fileName = "test918.kt", lineNumber = 13)
    logger.at(Level.DEBUG) { message = "debug with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"", className = "test918.MainTest", methodName = "main", fileName = "test918.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"", className = "test918.MainTest", methodName = "main", fileName = "test918.kt", lineNumber = 13)
  }
  
}


```

###  debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at MainTest.main(test919.kt:12)

User code:
```kotlin
package test919
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
    logger.debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test919
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.DEBUG) { message = "debug message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test919.MainTest", methodName = "main", fileName = "test919.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test919.MainTest", methodName = "main", fileName = "test919.kt", lineNumber = 13)
    logger.at(Level.DEBUG) { message = "debug message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test919.MainTest", methodName = "main", fileName = "test919.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test919.MainTest", methodName = "main", fileName = "test919.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at MainTest.main(test920.kt:12)

User code:
```kotlin
package test920
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
    logger.debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test920
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"", className = "test920.MainTest", methodName = "main", fileName = "test920.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"", className = "test920.MainTest", methodName = "main", fileName = "test920.kt", lineNumber = 13)
    logger.at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"", className = "test920.MainTest", methodName = "main", fileName = "test920.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"", className = "test920.MainTest", methodName = "main", fileName = "test920.kt", lineNumber = 13)
  }
  fun ab() = 12
}


```
