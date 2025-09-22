## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace("trace message {}", arg, throwable) at MainTest.main(test836.kt:12)

User code:
```kotlin
package test836
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.trace("trace message {}", arg, throwable)
    logger.trace("trace message {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test836
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.TRACE) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test836.MainTest", methodName = "main", fileName = "test836.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test836.MainTest", methodName = "main", fileName = "test836.kt", lineNumber = 13)
    logger.at(Level.TRACE) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test836.MainTest", methodName = "main", fileName = "test836.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test836.MainTest", methodName = "main", fileName = "test836.kt", lineNumber = 13)
  }
  
}


```

###  trace("trace message with concatenation $arg {}", arg, throwable) at MainTest.main(test837.kt:12)

User code:
```kotlin
package test837
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.trace("trace message with concatenation $arg {}", arg, throwable)
    logger.trace("trace message with concatenation $arg {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test837
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test837.MainTest", methodName = "main", fileName = "test837.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test837.MainTest", methodName = "main", fileName = "test837.kt", lineNumber = 13)
    logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test837.MainTest", methodName = "main", fileName = "test837.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test837.MainTest", methodName = "main", fileName = "test837.kt", lineNumber = 13)
  }
  
}


```

###  trace("trace with extension function {} interval", arg.minutes, throwable) at MainTest.main(test838.kt:12)

User code:
```kotlin
package test838
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.trace("trace with extension function {} interval", arg.minutes, throwable)
    logger.trace("trace with extension function {} interval", arg.minutes, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test838
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test838.MainTest", methodName = "main", fileName = "test838.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test838.MainTest", methodName = "main", fileName = "test838.kt", lineNumber = 13)
    logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test838.MainTest", methodName = "main", fileName = "test838.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test838.MainTest", methodName = "main", fileName = "test838.kt", lineNumber = 13)
  }
  
}


```

###  trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at MainTest.main(test839.kt:12)

User code:
```kotlin
package test839
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
    logger.trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test839
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.TRACE) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test839.MainTest", methodName = "main", fileName = "test839.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test839.MainTest", methodName = "main", fileName = "test839.kt", lineNumber = 13)
    logger.at(Level.TRACE) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test839.MainTest", methodName = "main", fileName = "test839.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test839.MainTest", methodName = "main", fileName = "test839.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at MainTest.main(test840.kt:12)

User code:
```kotlin
package test840
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
    logger.trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test840
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test840.MainTest", methodName = "main", fileName = "test840.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test840.MainTest", methodName = "main", fileName = "test840.kt", lineNumber = 13)
    logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test840.MainTest", methodName = "main", fileName = "test840.kt", lineNumber = 12)
at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test840.MainTest", methodName = "main", fileName = "test840.kt", lineNumber = 13)
  }
  fun ab() = 12
}


```
