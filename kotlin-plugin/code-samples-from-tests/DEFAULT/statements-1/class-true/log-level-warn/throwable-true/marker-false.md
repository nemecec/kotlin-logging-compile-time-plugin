## featureFlag=DEFAULT / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=false



###  warn(throwable) { "warn messageBuilder" } at MainTest.main(test136.kt:12)

User code:
```kotlin
package test136
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.warn(throwable) { "warn messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test136
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test136.MainTest", methodName = "main", fileName = "test136.kt", lineNumber = 12)
  }
  
}


```

###  warn(throwable) { "warn messageBuilder $i" } at MainTest.main(test137.kt:12)

User code:
```kotlin
package test137
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable) { "warn messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test137
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test137.MainTest", methodName = "main", fileName = "test137.kt", lineNumber = 12)
  }
  
}


```

###  warn(throwable) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test138.kt:12)

User code:
```kotlin
package test138
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test138
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test138.MainTest", methodName = "main", fileName = "test138.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  warn(throwable, messageLambda) at MainTest.main(test139.kt:12)

User code:
```kotlin
package test139
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(throwable, messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test139
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.at(Level.WARN) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test139.MainTest", methodName = "main", fileName = "test139.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder"; cause=throwable } at MainTest.main(test140.kt:12)

User code:
```kotlin
package test140
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atWarn() { message="warn eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test140
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test140.MainTest", methodName = "main", fileName = "test140.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test141.kt:12)

User code:
```kotlin
package test141
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test141
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test141.MainTest", methodName = "main", fileName = "test141.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test142.kt:12)

User code:
```kotlin
package test142
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test142
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test142.MainTest", methodName = "main", fileName = "test142.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.WARN) { message="warn eventBuilder"; cause=throwable } at MainTest.main(test143.kt:12)

User code:
```kotlin
package test143
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test143
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test143.MainTest", methodName = "main", fileName = "test143.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test144.kt:12)

User code:
```kotlin
package test144
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test144
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test144.MainTest", methodName = "main", fileName = "test144.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test145.kt:12)

User code:
```kotlin
package test145
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test145
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test145.MainTest", methodName = "main", fileName = "test145.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```
