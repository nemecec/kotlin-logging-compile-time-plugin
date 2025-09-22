## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  debug("debug message {}", arg) at MainTest.main(test146.kt:12)

User code:
```kotlin
package test146
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.debug("debug message {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test146
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.DEBUG) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test146.MainTest", methodName = "main", fileName = "test146.kt", lineNumber = 12)
  }
  
}


```

###  debug("debug message with concatenation $arg {}", arg) at MainTest.main(test147.kt:12)

User code:
```kotlin
package test147
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.debug("debug message with concatenation $arg {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test147
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.DEBUG) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"", className = "test147.MainTest", methodName = "main", fileName = "test147.kt", lineNumber = 12)
  }
  
}


```

###  debug("debug with extension function {} interval", arg.minutes) at MainTest.main(test148.kt:12)

User code:
```kotlin
package test148
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.debug("debug with extension function {} interval", arg.minutes)
  }
  
}


```
  
Transformed into:
```kotlin
package test148
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"", className = "test148.MainTest", methodName = "main", fileName = "test148.kt", lineNumber = 12)
  }
  
}


```

###  debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test149.kt:12)

User code:
```kotlin
package test149
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.debug("debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test149
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.DEBUG) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test149.MainTest", methodName = "main", fileName = "test149.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test150.kt:12)

User code:
```kotlin
package test150
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.debug("debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test150
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.at(Level.DEBUG) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"", className = "test150.MainTest", methodName = "main", fileName = "test150.kt", lineNumber = 12)
  }
  fun ab() = 12
}


```
