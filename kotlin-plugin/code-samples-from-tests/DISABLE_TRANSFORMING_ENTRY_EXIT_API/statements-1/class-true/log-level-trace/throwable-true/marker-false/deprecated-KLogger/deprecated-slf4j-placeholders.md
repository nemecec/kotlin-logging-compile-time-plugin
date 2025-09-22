## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace("trace message {}", arg, throwable) at MainTest.main(test26.kt:12)

User code:
```kotlin
package test26
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.trace("trace message {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test26
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.TRACE) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test26.MainTest", methodName = "main", fileName = "test26.kt", lineNumber = 12)
  }
  
}


```

###  trace("trace message with concatenation $arg {}", arg, throwable) at MainTest.main(test27.kt:12)

User code:
```kotlin
package test27
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.trace("trace message with concatenation $arg {}", arg, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test27
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message with concatenation $arg {}"", className = "test27.MainTest", methodName = "main", fileName = "test27.kt", lineNumber = 12)
  }
  
}


```

###  trace("trace with extension function {} interval", arg.minutes, throwable) at MainTest.main(test28.kt:12)

User code:
```kotlin
package test28
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.trace("trace with extension function {} interval", arg.minutes, throwable)
  }
  
}


```
  
Transformed into:
```kotlin
package test28
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace with extension function {} interval"", className = "test28.MainTest", methodName = "main", fileName = "test28.kt", lineNumber = 12)
  }
  
}


```

###  trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at MainTest.main(test29.kt:12)

User code:
```kotlin
package test29
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test29
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val arg = 42
    logger.at(Level.TRACE) { message = "trace message 42 Hello!java.lang.Exception: expected! abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test29.MainTest", methodName = "main", fileName = "test29.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at MainTest.main(test30.kt:12)

User code:
```kotlin
package test30
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test30
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}a" + " {}b" + " {}ab" + " ab"", className = "test30.MainTest", methodName = "main", fileName = "test30.kt", lineNumber = 12)
  }
  fun ab() = 12
}


```
