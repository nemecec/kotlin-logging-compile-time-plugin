## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=false



###  warn(throwable) { "warn messageBuilder" } at MainTest.main(test546.kt:12)

User code:
```kotlin
package test546
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.warn(throwable) { "warn messageBuilder" }
    logger.warn(throwable) { "warn messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test546
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test546.MainTest", methodName = "main", fileName = "test546.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test546.MainTest", methodName = "main", fileName = "test546.kt", lineNumber = 13)
  }
  
}


```

###  warn(throwable) { "warn messageBuilder $i" } at MainTest.main(test547.kt:12)

User code:
```kotlin
package test547
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable) { "warn messageBuilder $i" }
    logger.warn(throwable) { "warn messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test547
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test547.MainTest", methodName = "main", fileName = "test547.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test547.MainTest", methodName = "main", fileName = "test547.kt", lineNumber = 13)
  }
  
}


```

###  warn(throwable) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test548.kt:12)

User code:
```kotlin
package test548
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
    logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test548
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test548.MainTest", methodName = "main", fileName = "test548.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test548.MainTest", methodName = "main", fileName = "test548.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  warn(throwable, messageLambda) at MainTest.main(test549.kt:12)

User code:
```kotlin
package test549
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(throwable, messageLambda)
    logger.warn(throwable, messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test549
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.at(Level.WARN) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test549.MainTest", methodName = "main", fileName = "test549.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test549.MainTest", methodName = "main", fileName = "test549.kt", lineNumber = 13)
  }
  
}


```

###  atWarn() { message="warn eventBuilder"; cause=throwable } at MainTest.main(test550.kt:12)

User code:
```kotlin
package test550
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atWarn() { message="warn eventBuilder"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test550
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test550.MainTest", methodName = "main", fileName = "test550.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test550.MainTest", methodName = "main", fileName = "test550.kt", lineNumber = 13)
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test551.kt:12)

User code:
```kotlin
package test551
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test551
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test551.MainTest", methodName = "main", fileName = "test551.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test551.MainTest", methodName = "main", fileName = "test551.kt", lineNumber = 13)
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test552.kt:12)

User code:
```kotlin
package test552
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test552
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test552.MainTest", methodName = "main", fileName = "test552.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test552.MainTest", methodName = "main", fileName = "test552.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.WARN) { message="warn eventBuilder"; cause=throwable } at MainTest.main(test553.kt:12)

User code:
```kotlin
package test553
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test553
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test553.MainTest", methodName = "main", fileName = "test553.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test553.MainTest", methodName = "main", fileName = "test553.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test554.kt:12)

User code:
```kotlin
package test554
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test554
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test554.MainTest", methodName = "main", fileName = "test554.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test554.MainTest", methodName = "main", fileName = "test554.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test555.kt:12)

User code:
```kotlin
package test555
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test555
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test555.MainTest", methodName = "main", fileName = "test555.kt", lineNumber = 12)
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test555.MainTest", methodName = "main", fileName = "test555.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
