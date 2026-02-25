## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=false



###  debug() { "debug messageBuilder" } at MainTest.main(test486.kt:12)

User code:
```kotlin
package test486
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug() { "debug messageBuilder" }
    logger.debug() { "debug messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test486
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test486.MainTest", methodName = "main", fileName = "test486.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test486.MainTest", methodName = "main", fileName = "test486.kt", lineNumber = 13)
  }
  
}


```

###  debug() { "debug messageBuilder $i" } at MainTest.main(test487.kt:12)

User code:
```kotlin
package test487
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i" }
    logger.debug() { "debug messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test487
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test487.MainTest", methodName = "main", fileName = "test487.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test487.MainTest", methodName = "main", fileName = "test487.kt", lineNumber = 13)
  }
  
}


```

###  debug() { "debug messageBuilder $i ${helper()}" } at MainTest.main(test488.kt:12)

User code:
```kotlin
package test488
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i ${helper()}" }
    logger.debug() { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test488
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test488.MainTest", methodName = "main", fileName = "test488.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test488.MainTest", methodName = "main", fileName = "test488.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  debug(messageLambda) at MainTest.main(test489.kt:12)

User code:
```kotlin
package test489
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(messageLambda)
    logger.debug(messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test489
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test489.MainTest", methodName = "main", fileName = "test489.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test489.MainTest", methodName = "main", fileName = "test489.kt", lineNumber = 13)
  }
  
}


```

###  atDebug() { message="debug eventBuilder"; cause=null } at MainTest.main(test490.kt:12)

User code:
```kotlin
package test490
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atDebug() { message="debug eventBuilder"; cause=null }
    logger.atDebug() { message="debug eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test490
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test490.MainTest", methodName = "main", fileName = "test490.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test490.MainTest", methodName = "main", fileName = "test490.kt", lineNumber = 13)
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i"; cause=null } at MainTest.main(test491.kt:12)

User code:
```kotlin
package test491
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=null }
    logger.atDebug() { message="debug eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test491
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test491.MainTest", methodName = "main", fileName = "test491.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test491.MainTest", methodName = "main", fileName = "test491.kt", lineNumber = 13)
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test492.kt:12)

User code:
```kotlin
package test492
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test492
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test492.MainTest", methodName = "main", fileName = "test492.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test492.MainTest", methodName = "main", fileName = "test492.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=null } at MainTest.main(test493.kt:12)

User code:
```kotlin
package test493
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test493
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test493.MainTest", methodName = "main", fileName = "test493.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test493.MainTest", methodName = "main", fileName = "test493.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null } at MainTest.main(test494.kt:12)

User code:
```kotlin
package test494
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test494
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test494.MainTest", methodName = "main", fileName = "test494.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test494.MainTest", methodName = "main", fileName = "test494.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test495.kt:12)

User code:
```kotlin
package test495
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test495
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test495.MainTest", methodName = "main", fileName = "test495.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test495.MainTest", methodName = "main", fileName = "test495.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
