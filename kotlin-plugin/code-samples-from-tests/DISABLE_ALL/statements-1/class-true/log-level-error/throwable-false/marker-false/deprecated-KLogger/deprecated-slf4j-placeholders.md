## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=false / deprecated KLogger API / deprecated API with SLF4J placeholders



###  error("error message {}", arg) at MainTest.main(test386.kt:12)

User code:
```kotlin
package test386
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.error("error message {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test386
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.ERROR) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}")
  }
  
}


```

###  error("error message with concatenation $arg {}", arg) at MainTest.main(test387.kt:12)

User code:
```kotlin
package test387
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.error("error message with concatenation $arg {}", arg)
  }
  
}


```
  
Transformed into:
```kotlin
package test387
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.ERROR) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message with concatenation 42 {}")
  }
  
}


```

###  error("error with extension function {} interval", arg.minutes) at MainTest.main(test388.kt:12)

User code:
```kotlin
package test388
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.error("error with extension function {} interval", arg.minutes)
  }
  
}


```
  
Transformed into:
```kotlin
package test388
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error with extension function {} interval")
  }
  
}


```

###  error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test389.kt:12)

User code:
```kotlin
package test389
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.error("error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test389
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val arg = 42
    logger.at(Level.ERROR) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {} {}{} abc {}")
  }
  fun helper() = "Hello!"
}


```

###  error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test390.kt:12)

User code:
```kotlin
package test390
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.error("error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}


```
  
Transformed into:
```kotlin
package test390
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val a = 1; val b = 2
    logger.at(Level.ERROR) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}a {}b {}ab ab")
  }
  fun ab() = 12
}


```
