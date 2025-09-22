## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  error("error message {}", arg) at MainTest.main(test1196.kt:12)

User code:
```kotlin
package test1196
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.error("error message {}", arg)
    logger.error("error message {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test1196
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1196.MainTest", methodName = "main", fileName = "test1196.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1196.MainTest", methodName = "main", fileName = "test1196.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1196.MainTest", methodName = "main", fileName = "test1196.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"", className = "test1196.MainTest", methodName = "main", fileName = "test1196.kt", lineNumber = 13)
  }
  
}


```

###  error("error message with concatenation $arg {}", arg) at MainTest.main(test1197.kt:12)

User code:
```kotlin
package test1197
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.error("error message with concatenation $arg {}", arg)
    logger.error("error message with concatenation $arg {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test1197
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"", className = "test1197.MainTest", methodName = "main", fileName = "test1197.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"", className = "test1197.MainTest", methodName = "main", fileName = "test1197.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"", className = "test1197.MainTest", methodName = "main", fileName = "test1197.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"", className = "test1197.MainTest", methodName = "main", fileName = "test1197.kt", lineNumber = 13)
  }
  
}


```

###  error("error with extension function {} interval", arg.minutes) at MainTest.main(test1198.kt:12)

User code:
```kotlin
package test1198
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.error("error with extension function {} interval", arg.minutes)
    logger.error("error with extension function {} interval", arg.minutes)
  }
  
}


```
  
Transformed into:
```kotlin
package test1198
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"", className = "test1198.MainTest", methodName = "main", fileName = "test1198.kt", lineNumber = 12)
at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"", className = "test1198.MainTest", methodName = "main", fileName = "test1198.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"", className = "test1198.MainTest", methodName = "main", fileName = "test1198.kt", lineNumber = 12)
at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"", className = "test1198.MainTest", methodName = "main", fileName = "test1198.kt", lineNumber = 13)
  }
  
}


```

###  error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test1199.kt:12)

User code:
```kotlin
package test1199
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
    logger.error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test1199
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1199.MainTest", methodName = "main", fileName = "test1199.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1199.MainTest", methodName = "main", fileName = "test1199.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1199.MainTest", methodName = "main", fileName = "test1199.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test1199.MainTest", methodName = "main", fileName = "test1199.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test1200.kt:12)

User code:
```kotlin
package test1200
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
    logger.error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test1200
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"", className = "test1200.MainTest", methodName = "main", fileName = "test1200.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"", className = "test1200.MainTest", methodName = "main", fileName = "test1200.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"", className = "test1200.MainTest", methodName = "main", fileName = "test1200.kt", lineNumber = 12)
at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"", className = "test1200.MainTest", methodName = "main", fileName = "test1200.kt", lineNumber = 13)
  }
  fun ab() = 12
}


```
