## featureFlag=DEFAULT / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace("trace message {}", arg) at MainTest.main(test66.kt:12)

User code:
```kotlin
package test66
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.trace("trace message {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test66
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.TRACE) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}\"", className = "test66.MainTest", methodName = "main", fileName = "test66.kt", lineNumber = 12)
  }
  
}


```

###  trace("trace message with concatenation $arg {}", arg) at MainTest.main(test67.kt:12)

User code:
```kotlin
package test67
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.trace("trace message with concatenation $arg {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test67
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.TRACE) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message with concatenation $arg {}\"", className = "test67.MainTest", methodName = "main", fileName = "test67.kt", lineNumber = 12)
  }
  
}


```

###  trace("trace with extension function {} interval", arg.minutes) at MainTest.main(test68.kt:12)

User code:
```kotlin
package test68
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.trace("trace with extension function {} interval", arg.minutes)
  }
  
}


```
  
Transformed into:
```kotlin
package test68
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.at(Level.TRACE) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace with extension function {} interval\"", className = "test68.MainTest", methodName = "main", fileName = "test68.kt", lineNumber = 12)
  }
  
}


```

###  trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test69.kt:12)

User code:
```kotlin
package test69
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.trace("trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test69
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.TRACE) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {} \" + \"\" + \"{}\" + \"{}\" + \" abc\" + \" {}\"", className = "test69.MainTest", methodName = "main", fileName = "test69.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test70.kt:12)

User code:
```kotlin
package test70
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.trace("trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test70
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.at(Level.TRACE) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace message {}a\" + \" {}b\" + \" {}ab\" + \" ab\"", className = "test70.MainTest", methodName = "main", fileName = "test70.kt", lineNumber = 12)
  }
  fun ab() = 12
}


```
