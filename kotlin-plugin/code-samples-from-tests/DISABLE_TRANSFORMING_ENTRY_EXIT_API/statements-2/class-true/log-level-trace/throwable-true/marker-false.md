## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=false



###  trace(throwable) { "trace messageBuilder" } at MainTest.main(test426.kt:12)

User code:
```kotlin
package test426
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.trace(throwable) { "trace messageBuilder" }
    logger.trace(throwable) { "trace messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test426
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test426.MainTest", methodName = "main", fileName = "test426.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test426.MainTest", methodName = "main", fileName = "test426.kt", lineNumber = 13)
  }
  
}


```

###  trace(throwable) { "trace messageBuilder $i" } at MainTest.main(test427.kt:12)

User code:
```kotlin
package test427
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(throwable) { "trace messageBuilder $i" }
    logger.trace(throwable) { "trace messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test427
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test427.MainTest", methodName = "main", fileName = "test427.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test427.MainTest", methodName = "main", fileName = "test427.kt", lineNumber = 13)
  }
  
}


```

###  trace(throwable) { "trace messageBuilder $i ${helper()}" } at MainTest.main(test428.kt:12)

User code:
```kotlin
package test428
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
    logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test428
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test428.MainTest", methodName = "main", fileName = "test428.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test428.MainTest", methodName = "main", fileName = "test428.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  trace(throwable, messageLambda) at MainTest.main(test429.kt:12)

User code:
```kotlin
package test429
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.trace(throwable, messageLambda)
    logger.trace(throwable, messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test429
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test429.MainTest", methodName = "main", fileName = "test429.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test429.MainTest", methodName = "main", fileName = "test429.kt", lineNumber = 13)
  }
  
}


```

###  atTrace() { message="trace eventBuilder"; cause=throwable } at MainTest.main(test430.kt:12)

User code:
```kotlin
package test430
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atTrace() { message="trace eventBuilder"; cause=throwable }
    logger.atTrace() { message="trace eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test430
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test430.MainTest", methodName = "main", fileName = "test430.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test430.MainTest", methodName = "main", fileName = "test430.kt", lineNumber = 13)
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test431.kt:12)

User code:
```kotlin
package test431
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
    logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test431
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test431.MainTest", methodName = "main", fileName = "test431.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test431.MainTest", methodName = "main", fileName = "test431.kt", lineNumber = 13)
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test432.kt:12)

User code:
```kotlin
package test432
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test432
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test432.MainTest", methodName = "main", fileName = "test432.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test432.MainTest", methodName = "main", fileName = "test432.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=throwable } at MainTest.main(test433.kt:12)

User code:
```kotlin
package test433
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test433
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test433.MainTest", methodName = "main", fileName = "test433.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test433.MainTest", methodName = "main", fileName = "test433.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test434.kt:12)

User code:
```kotlin
package test434
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test434
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test434.MainTest", methodName = "main", fileName = "test434.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test434.MainTest", methodName = "main", fileName = "test434.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test435.kt:12)

User code:
```kotlin
package test435
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test435
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test435.MainTest", methodName = "main", fileName = "test435.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test435.MainTest", methodName = "main", fileName = "test435.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
