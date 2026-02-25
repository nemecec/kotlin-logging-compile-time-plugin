## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=true / with marker=false



###  debug(throwable) { "debug messageBuilder" } at MainTest.main(test466.kt:12)

User code:
```kotlin
package test466
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug(throwable) { "debug messageBuilder" }
    logger.debug(throwable) { "debug messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test466
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test466.MainTest", methodName = "main", fileName = "test466.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test466.MainTest", methodName = "main", fileName = "test466.kt", lineNumber = 13)
  }
  
}


```

###  debug(throwable) { "debug messageBuilder $i" } at MainTest.main(test467.kt:12)

User code:
```kotlin
package test467
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i" }
    logger.debug(throwable) { "debug messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test467
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test467.MainTest", methodName = "main", fileName = "test467.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test467.MainTest", methodName = "main", fileName = "test467.kt", lineNumber = 13)
  }
  
}


```

###  debug(throwable) { "debug messageBuilder $i ${helper()}" } at MainTest.main(test468.kt:12)

User code:
```kotlin
package test468
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
    logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test468
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test468.MainTest", methodName = "main", fileName = "test468.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test468.MainTest", methodName = "main", fileName = "test468.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  debug(throwable, messageLambda) at MainTest.main(test469.kt:12)

User code:
```kotlin
package test469
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(throwable, messageLambda)
    logger.debug(throwable, messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test469
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test469.MainTest", methodName = "main", fileName = "test469.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test469.MainTest", methodName = "main", fileName = "test469.kt", lineNumber = 13)
  }
  
}


```

###  atDebug() { message="debug eventBuilder"; cause=throwable } at MainTest.main(test470.kt:12)

User code:
```kotlin
package test470
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atDebug() { message="debug eventBuilder"; cause=throwable }
    logger.atDebug() { message="debug eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test470
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test470.MainTest", methodName = "main", fileName = "test470.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test470.MainTest", methodName = "main", fileName = "test470.kt", lineNumber = 13)
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test471.kt:12)

User code:
```kotlin
package test471
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
    logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test471
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test471.MainTest", methodName = "main", fileName = "test471.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test471.MainTest", methodName = "main", fileName = "test471.kt", lineNumber = 13)
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test472.kt:12)

User code:
```kotlin
package test472
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test472
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test472.MainTest", methodName = "main", fileName = "test472.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test472.MainTest", methodName = "main", fileName = "test472.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable } at MainTest.main(test473.kt:12)

User code:
```kotlin
package test473
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test473
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test473.MainTest", methodName = "main", fileName = "test473.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test473.MainTest", methodName = "main", fileName = "test473.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test474.kt:12)

User code:
```kotlin
package test474
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test474
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test474.MainTest", methodName = "main", fileName = "test474.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test474.MainTest", methodName = "main", fileName = "test474.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test475.kt:12)

User code:
```kotlin
package test475
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test475
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test475.MainTest", methodName = "main", fileName = "test475.kt", lineNumber = 12)
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test475.MainTest", methodName = "main", fileName = "test475.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
