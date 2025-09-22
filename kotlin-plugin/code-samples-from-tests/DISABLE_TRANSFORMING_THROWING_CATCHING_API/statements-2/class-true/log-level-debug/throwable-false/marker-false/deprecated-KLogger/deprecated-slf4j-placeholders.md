## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  debug("debug message {}", arg) at MainTest.main(test956.kt:12)

User code:
```kotlin
package test956
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.debug("debug message {}", arg)
    logger.debug("debug message {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test956
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.DEBUG) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test956.MainTest", methodName = "main", fileName = "test956.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test956.MainTest", methodName = "main", fileName = "test956.kt", lineNumber = 13)
    logger.at(Level.DEBUG) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test956.MainTest", methodName = "main", fileName = "test956.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}\"", className = "test956.MainTest", methodName = "main", fileName = "test956.kt", lineNumber = 13)
  }
  
}


```

###  debug("debug message with concatenation $arg {}", arg) at MainTest.main(test957.kt:12)

User code:
```kotlin
package test957
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.debug("debug message with concatenation $arg {}", arg)
    logger.debug("debug message with concatenation $arg {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test957
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.DEBUG) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message with concatenation $arg {}\"", className = "test957.MainTest", methodName = "main", fileName = "test957.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message with concatenation $arg {}\"", className = "test957.MainTest", methodName = "main", fileName = "test957.kt", lineNumber = 13)
    logger.at(Level.DEBUG) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message with concatenation $arg {}\"", className = "test957.MainTest", methodName = "main", fileName = "test957.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message with concatenation $arg {}\"", className = "test957.MainTest", methodName = "main", fileName = "test957.kt", lineNumber = 13)
  }
  
}


```

###  debug("debug with extension function {} interval", arg.minutes) at MainTest.main(test958.kt:12)

User code:
```kotlin
package test958
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.debug("debug with extension function {} interval", arg.minutes)
    logger.debug("debug with extension function {} interval", arg.minutes)
  }
  
}


```
  
Transformed into:
```kotlin
package test958
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug with extension function {} interval\"", className = "test958.MainTest", methodName = "main", fileName = "test958.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug with extension function {} interval\"", className = "test958.MainTest", methodName = "main", fileName = "test958.kt", lineNumber = 13)
    logger.at(Level.DEBUG) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug with extension function {} interval\"", className = "test958.MainTest", methodName = "main", fileName = "test958.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug with extension function {} interval\"", className = "test958.MainTest", methodName = "main", fileName = "test958.kt", lineNumber = 13)
  }
  
}


```

###  debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test959.kt:12)

User code:
```kotlin
package test959
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
    logger.debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test959
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.DEBUG) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test959.MainTest", methodName = "main", fileName = "test959.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test959.MainTest", methodName = "main", fileName = "test959.kt", lineNumber = 13)
    logger.at(Level.DEBUG) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test959.MainTest", methodName = "main", fileName = "test959.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test959.MainTest", methodName = "main", fileName = "test959.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test960.kt:12)

User code:
```kotlin
package test960
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
    logger.debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test960
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test960.MainTest", methodName = "main", fileName = "test960.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test960.MainTest", methodName = "main", fileName = "test960.kt", lineNumber = 13)
    logger.at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test960.MainTest", methodName = "main", fileName = "test960.kt", lineNumber = 12)
at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test960.MainTest", methodName = "main", fileName = "test960.kt", lineNumber = 13)
  }
  fun ab() = 12
}


```
