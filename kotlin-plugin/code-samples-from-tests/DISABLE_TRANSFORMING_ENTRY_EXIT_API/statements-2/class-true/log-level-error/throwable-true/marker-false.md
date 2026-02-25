## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=true / with marker=false



###  error(throwable) { "error messageBuilder" } at MainTest.main(test586.kt:12)

User code:
```kotlin
package test586
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.error(throwable) { "error messageBuilder" }
    logger.error(throwable) { "error messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test586
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test586.MainTest", methodName = "main", fileName = "test586.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test586.MainTest", methodName = "main", fileName = "test586.kt", lineNumber = 13)
  }
  
}


```

###  error(throwable) { "error messageBuilder $i" } at MainTest.main(test587.kt:12)

User code:
```kotlin
package test587
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.error(throwable) { "error messageBuilder $i" }
    logger.error(throwable) { "error messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test587
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test587.MainTest", methodName = "main", fileName = "test587.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test587.MainTest", methodName = "main", fileName = "test587.kt", lineNumber = 13)
  }
  
}


```

###  error(throwable) { "error messageBuilder $i ${helper()}" } at MainTest.main(test588.kt:12)

User code:
```kotlin
package test588
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.error(throwable) { "error messageBuilder $i ${helper()}" }
    logger.error(throwable) { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test588
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test588.MainTest", methodName = "main", fileName = "test588.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test588.MainTest", methodName = "main", fileName = "test588.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  error(throwable, messageLambda) at MainTest.main(test589.kt:12)

User code:
```kotlin
package test589
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(throwable, messageLambda)
    logger.error(throwable, messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test589
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test589.MainTest", methodName = "main", fileName = "test589.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test589.MainTest", methodName = "main", fileName = "test589.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder"; cause=throwable } at MainTest.main(test590.kt:12)

User code:
```kotlin
package test590
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atError() { message="error eventBuilder"; cause=throwable }
    logger.atError() { message="error eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test590
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test590.MainTest", methodName = "main", fileName = "test590.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test590.MainTest", methodName = "main", fileName = "test590.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder $i"; cause=throwable } at MainTest.main(test591.kt:12)

User code:
```kotlin
package test591
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atError() { message="error eventBuilder $i"; cause=throwable }
    logger.atError() { message="error eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test591
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test591.MainTest", methodName = "main", fileName = "test591.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test591.MainTest", methodName = "main", fileName = "test591.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test592.kt:12)

User code:
```kotlin
package test592
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test592
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test592.MainTest", methodName = "main", fileName = "test592.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test592.MainTest", methodName = "main", fileName = "test592.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.ERROR) { message="error eventBuilder"; cause=throwable } at MainTest.main(test593.kt:12)

User code:
```kotlin
package test593
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test593
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test593.MainTest", methodName = "main", fileName = "test593.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test593.MainTest", methodName = "main", fileName = "test593.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable } at MainTest.main(test594.kt:12)

User code:
```kotlin
package test594
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test594
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test594.MainTest", methodName = "main", fileName = "test594.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test594.MainTest", methodName = "main", fileName = "test594.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test595.kt:12)

User code:
```kotlin
package test595
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test595
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test595.MainTest", methodName = "main", fileName = "test595.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test595.MainTest", methodName = "main", fileName = "test595.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
