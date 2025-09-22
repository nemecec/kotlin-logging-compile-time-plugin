## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info("info message {}", arg, throwable) at MainTest.main(test996.kt:12)

User code:
```kotlin
package test996
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.info("info message {}", arg, throwable)
    logger.info("info message {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test996
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.INFO) { message = "info message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test996.MainTest", methodName = "main", fileName = "test996.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test996.MainTest", methodName = "main", fileName = "test996.kt", lineNumber = 13)
    logger.at(Level.INFO) { message = "info message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test996.MainTest", methodName = "main", fileName = "test996.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test996.MainTest", methodName = "main", fileName = "test996.kt", lineNumber = 13)
  }
  
}


```

###  info("info message with concatenation $arg {}", arg, throwable) at MainTest.main(test997.kt:12)

User code:
```kotlin
package test997
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.info("info message with concatenation $arg {}", arg, throwable)
    logger.info("info message with concatenation $arg {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test997
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.INFO) { message = "info message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"", className = "test997.MainTest", methodName = "main", fileName = "test997.kt", lineNumber = 12)
at(Level.INFO) { message = "info message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"", className = "test997.MainTest", methodName = "main", fileName = "test997.kt", lineNumber = 13)
    logger.at(Level.INFO) { message = "info message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"", className = "test997.MainTest", methodName = "main", fileName = "test997.kt", lineNumber = 12)
at(Level.INFO) { message = "info message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"", className = "test997.MainTest", methodName = "main", fileName = "test997.kt", lineNumber = 13)
  }
  
}


```

###  info("info with extension function {} interval", arg.minutes, throwable) at MainTest.main(test998.kt:12)

User code:
```kotlin
package test998
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.info("info with extension function {} interval", arg.minutes, throwable)
    logger.info("info with extension function {} interval", arg.minutes, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test998
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message = "info with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"", className = "test998.MainTest", methodName = "main", fileName = "test998.kt", lineNumber = 12)
at(Level.INFO) { message = "info with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"", className = "test998.MainTest", methodName = "main", fileName = "test998.kt", lineNumber = 13)
    logger.at(Level.INFO) { message = "info with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"", className = "test998.MainTest", methodName = "main", fileName = "test998.kt", lineNumber = 12)
at(Level.INFO) { message = "info with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"", className = "test998.MainTest", methodName = "main", fileName = "test998.kt", lineNumber = 13)
  }
  
}


```

###  info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at MainTest.main(test999.kt:12)

User code:
```kotlin
package test999
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
    logger.info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test999
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.INFO) { message = "info message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test999.MainTest", methodName = "main", fileName = "test999.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test999.MainTest", methodName = "main", fileName = "test999.kt", lineNumber = 13)
    logger.at(Level.INFO) { message = "info message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test999.MainTest", methodName = "main", fileName = "test999.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test999.MainTest", methodName = "main", fileName = "test999.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at MainTest.main(test1000.kt:12)

User code:
```kotlin
package test1000
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
    logger.info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test1000
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.at(Level.INFO) { message = "info message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"", className = "test1000.MainTest", methodName = "main", fileName = "test1000.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"", className = "test1000.MainTest", methodName = "main", fileName = "test1000.kt", lineNumber = 13)
    logger.at(Level.INFO) { message = "info message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"", className = "test1000.MainTest", methodName = "main", fileName = "test1000.kt", lineNumber = 12)
at(Level.INFO) { message = "info message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"", className = "test1000.MainTest", methodName = "main", fileName = "test1000.kt", lineNumber = 13)
  }
  fun ab() = 12
}


```
