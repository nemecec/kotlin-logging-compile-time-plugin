## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



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
    logger.at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"")
at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"")
    logger.at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"")
at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}"")
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
    logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"")
at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"")
    logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"")
at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message with concatenation $arg {}"")
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
    
    
    
    logger.at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"")
at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"")
    logger.at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"")
at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error with extension function {} interval"")
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
    logger.at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"")
at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"")
    logger.at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"")
at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {} " + "" + "{}" + "{}" + " abc" + " {}"")
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
    logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"")
at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"")
    logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"")
at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error message {}a" + " {}b" + " {}ab" + " ab"")
  }
  fun ab() = 12
}


```
