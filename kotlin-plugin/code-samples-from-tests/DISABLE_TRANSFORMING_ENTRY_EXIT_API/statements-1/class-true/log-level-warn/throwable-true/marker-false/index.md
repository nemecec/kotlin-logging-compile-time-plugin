## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn(throwable) { "warn messageBuilder" } at MainTest.main(test276.kt:12)

User code:
```kotlin
package test276
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
package test276
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder"", className = "test276.MainTest", methodName = "main", fileName = "test276.kt", lineNumber = 12)
  }
  
}


```

###  warn(throwable) { "warn messageBuilder $i" } at MainTest.main(test277.kt:12)

User code:
```kotlin
package test277
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
package test277
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i"", className = "test277.MainTest", methodName = "main", fileName = "test277.kt", lineNumber = 12)
  }
  
}


```

###  warn(throwable) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test278.kt:12)

User code:
```kotlin
package test278
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
package test278
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i ${helper()}"", className = "test278.MainTest", methodName = "main", fileName = "test278.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  warn(throwable, messageLambda) at MainTest.main(test279.kt:12)

User code:
```kotlin
package test279
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
package test279
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.at(Level.WARN) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test279.MainTest", methodName = "main", fileName = "test279.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder"; cause=throwable } at MainTest.main(test280.kt:12)

User code:
```kotlin
package test280
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
package test280
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test280.MainTest", methodName = "main", fileName = "test280.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test281.kt:12)

User code:
```kotlin
package test281
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
package test281
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test281.MainTest", methodName = "main", fileName = "test281.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test282.kt:12)

User code:
```kotlin
package test282
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
package test282
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test282.MainTest", methodName = "main", fileName = "test282.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.WARN) { message="warn eventBuilder"; cause=throwable } at MainTest.main(test283.kt:12)

User code:
```kotlin
package test283
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
package test283
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test283.MainTest", methodName = "main", fileName = "test283.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test284.kt:12)

User code:
```kotlin
package test284
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
package test284
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test284.MainTest", methodName = "main", fileName = "test284.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test285.kt:12)

User code:
```kotlin
package test285
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
package test285
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test285.MainTest", methodName = "main", fileName = "test285.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```
