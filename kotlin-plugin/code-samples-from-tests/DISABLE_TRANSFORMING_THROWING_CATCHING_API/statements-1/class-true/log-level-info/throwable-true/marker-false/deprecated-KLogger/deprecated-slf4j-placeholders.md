## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=true / with log level=INFO / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info("info message {}", arg, throwable) at MainTest.main(test186.kt:12)

User code:
```kotlin
package test186
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.info("info message {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test186
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.INFO) { message = "info message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test186.MainTest", methodName = "main", fileName = "test186.kt", lineNumber = 12)
  }
  
}


```

###  info("info message with concatenation $arg {}", arg, throwable) at MainTest.main(test187.kt:12)

User code:
```kotlin
package test187
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.info("info message with concatenation $arg {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test187
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.INFO) { message = "info message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"", className = "test187.MainTest", methodName = "main", fileName = "test187.kt", lineNumber = 12)
  }
  
}


```

###  info("info with extension function {} interval", arg.minutes, throwable) at MainTest.main(test188.kt:12)

User code:
```kotlin
package test188
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.info("info with extension function {} interval", arg.minutes, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test188
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message = "info with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"", className = "test188.MainTest", methodName = "main", fileName = "test188.kt", lineNumber = 12)
  }
  
}


```

###  info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at MainTest.main(test189.kt:12)

User code:
```kotlin
package test189
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.info("info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test189
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.INFO) { message = "info message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test189.MainTest", methodName = "main", fileName = "test189.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at MainTest.main(test190.kt:12)

User code:
```kotlin
package test190
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.info("info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test190
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.at(Level.INFO) { message = "info message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"", className = "test190.MainTest", methodName = "main", fileName = "test190.kt", lineNumber = 12)
  }
  fun ab() = 12
}


```
