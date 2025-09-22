## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  warn("warn message {}", arg) at MainTest.main(test1116.kt:12)

User code:
```kotlin
package test1116
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.warn("warn message {}", arg)
    logger.warn("warn message {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test1116
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.WARN) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {}")
at(Level.WARN) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {}")
    logger.at(Level.WARN) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {}")
at(Level.WARN) { message = "warn message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {}")
  }
  
}


```

###  warn("warn message with concatenation $arg {}", arg) at MainTest.main(test1117.kt:12)

User code:
```kotlin
package test1117
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.warn("warn message with concatenation $arg {}", arg)
    logger.warn("warn message with concatenation $arg {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test1117
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.WARN) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message with concatenation 42 {}")
at(Level.WARN) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message with concatenation 42 {}")
    logger.at(Level.WARN) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message with concatenation 42 {}")
at(Level.WARN) { message = "warn message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message with concatenation 42 {}")
  }
  
}


```

###  warn("warn with extension function {} interval", arg.minutes) at MainTest.main(test1118.kt:12)

User code:
```kotlin
package test1118
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.warn("warn with extension function {} interval", arg.minutes)
    logger.warn("warn with extension function {} interval", arg.minutes)
  }
  
}


```
  
Transformed into:
```kotlin
package test1118
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.at(Level.WARN) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn with extension function {} interval")
at(Level.WARN) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn with extension function {} interval")
    logger.at(Level.WARN) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn with extension function {} interval")
at(Level.WARN) { message = "warn with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn with extension function {} interval")
  }
  
}


```

###  warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test1119.kt:12)

User code:
```kotlin
package test1119
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
    logger.warn("warn message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test1119
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.WARN) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {} {}{} abc {}")
at(Level.WARN) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {} {}{} abc {}")
    logger.at(Level.WARN) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {} {}{} abc {}")
at(Level.WARN) { message = "warn message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {} {}{} abc {}")
  }
  fun helper() = "Hello!"
}


```

###  warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test1120.kt:12)

User code:
```kotlin
package test1120
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
    logger.warn("warn message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test1120
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {}a {}b {}ab ab")
at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {}a {}b {}ab ab")
    logger.at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {}a {}b {}ab ab")
at(Level.WARN) { message = "warn message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "warn message {}a {}b {}ab ab")
  }
  fun ab() = 12
}


```
