## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=true / with log level=DEBUG / with throwable=true / with marker=false



###  debug(throwable) { "debug messageBuilder" } at MainTest.main(test56.kt:12)

User code:
```kotlin
package test56
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug(throwable) { "debug messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test56
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test56.MainTest", methodName = "main", fileName = "test56.kt", lineNumber = 12)
  }
  
}


```

###  debug(throwable) { "debug messageBuilder $i" } at MainTest.main(test57.kt:12)

User code:
```kotlin
package test57
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test57
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test57.MainTest", methodName = "main", fileName = "test57.kt", lineNumber = 12)
  }
  
}


```

###  debug(throwable) { "debug messageBuilder $i ${helper()}" } at MainTest.main(test58.kt:12)

User code:
```kotlin
package test58
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test58
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test58.MainTest", methodName = "main", fileName = "test58.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  debug(throwable, messageLambda) at MainTest.main(test59.kt:12)

User code:
```kotlin
package test59
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(throwable, messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test59
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test59.MainTest", methodName = "main", fileName = "test59.kt", lineNumber = 12)
  }
  
}


```

###  atDebug() { message="debug eventBuilder"; cause=throwable } at MainTest.main(test60.kt:12)

User code:
```kotlin
package test60
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atDebug() { message="debug eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test60
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test60.MainTest", methodName = "main", fileName = "test60.kt", lineNumber = 12)
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test61.kt:12)

User code:
```kotlin
package test61
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test61
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test61.MainTest", methodName = "main", fileName = "test61.kt", lineNumber = 12)
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test62.kt:12)

User code:
```kotlin
package test62
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test62
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test62.MainTest", methodName = "main", fileName = "test62.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable } at MainTest.main(test63.kt:12)

User code:
```kotlin
package test63
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test63
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test63.MainTest", methodName = "main", fileName = "test63.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test64.kt:12)

User code:
```kotlin
package test64
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test64
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test64.MainTest", methodName = "main", fileName = "test64.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test65.kt:12)

User code:
```kotlin
package test65
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test65
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test65.MainTest", methodName = "main", fileName = "test65.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```
