## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  warn("warn message {}", arg, throwable) at MainTest.main(test1076.kt:12)

User code:
```kotlin
package test1076
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.warn("warn message {}", arg, throwable)
    logger.warn("warn message {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test1076
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.WARN) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1076.MainTest", methodName = "main", fileName = "test1076.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}\"", className = "test1076.MainTest", methodName = "main", fileName = "test1076.kt", lineNumber = 13)
  }
  
}


```

###  warn("warn message with concatenation $arg {}", arg, throwable) at MainTest.main(test1077.kt:12)

User code:
```kotlin
package test1077
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.warn("warn message with concatenation $arg {}", arg, throwable)
    logger.warn("warn message with concatenation $arg {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test1077
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.WARN) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message with concatenation $arg {}\"", className = "test1077.MainTest", methodName = "main", fileName = "test1077.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message with concatenation $arg {}\"", className = "test1077.MainTest", methodName = "main", fileName = "test1077.kt", lineNumber = 13)
  }
  
}


```

###  warn("warn with extension function {} interval", arg.minutes, throwable) at MainTest.main(test1078.kt:12)

User code:
```kotlin
package test1078
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.warn("warn with extension function {} interval", arg.minutes, throwable)
    logger.warn("warn with extension function {} interval", arg.minutes, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test1078
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn with extension function {} interval\"", className = "test1078.MainTest", methodName = "main", fileName = "test1078.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn with extension function {} interval\"", className = "test1078.MainTest", methodName = "main", fileName = "test1078.kt", lineNumber = 13)
  }
  
}


```

###  warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at MainTest.main(test1079.kt:12)

User code:
```kotlin
package test1079
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
    logger.warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test1079
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.WARN) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1079.MainTest", methodName = "main", fileName = "test1079.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test1079.MainTest", methodName = "main", fileName = "test1079.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at MainTest.main(test1080.kt:12)

User code:
```kotlin
package test1080
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
    logger.warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test1080
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1080.MainTest", methodName = "main", fileName = "test1080.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test1080.MainTest", methodName = "main", fileName = "test1080.kt", lineNumber = 13)
  }
  fun ab() = 12
}


```
