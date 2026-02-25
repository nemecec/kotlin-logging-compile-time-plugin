## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=true / with marker=false



###  info(throwable) { "info messageBuilder" } at MainTest.main(test506.kt:12)

User code:
```kotlin
package test506
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.info(throwable) { "info messageBuilder" }
    logger.info(throwable) { "info messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test506
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test506.MainTest", methodName = "main", fileName = "test506.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test506.MainTest", methodName = "main", fileName = "test506.kt", lineNumber = 13)
  }
  
}


```

###  info(throwable) { "info messageBuilder $i" } at MainTest.main(test507.kt:12)

User code:
```kotlin
package test507
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.info(throwable) { "info messageBuilder $i" }
    logger.info(throwable) { "info messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test507
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test507.MainTest", methodName = "main", fileName = "test507.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test507.MainTest", methodName = "main", fileName = "test507.kt", lineNumber = 13)
  }
  
}


```

###  info(throwable) { "info messageBuilder $i ${helper()}" } at MainTest.main(test508.kt:12)

User code:
```kotlin
package test508
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.info(throwable) { "info messageBuilder $i ${helper()}" }
    logger.info(throwable) { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test508
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test508.MainTest", methodName = "main", fileName = "test508.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test508.MainTest", methodName = "main", fileName = "test508.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  info(throwable, messageLambda) at MainTest.main(test509.kt:12)

User code:
```kotlin
package test509
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.info(throwable, messageLambda)
    logger.info(throwable, messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test509
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test509.MainTest", methodName = "main", fileName = "test509.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test509.MainTest", methodName = "main", fileName = "test509.kt", lineNumber = 13)
  }
  
}


```

###  atInfo() { message="info eventBuilder"; cause=throwable } at MainTest.main(test510.kt:12)

User code:
```kotlin
package test510
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atInfo() { message="info eventBuilder"; cause=throwable }
    logger.atInfo() { message="info eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test510
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test510.MainTest", methodName = "main", fileName = "test510.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test510.MainTest", methodName = "main", fileName = "test510.kt", lineNumber = 13)
  }
  
}


```

###  atInfo() { message="info eventBuilder $i"; cause=throwable } at MainTest.main(test511.kt:12)

User code:
```kotlin
package test511
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
    logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test511
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test511.MainTest", methodName = "main", fileName = "test511.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test511.MainTest", methodName = "main", fileName = "test511.kt", lineNumber = 13)
  }
  
}


```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test512.kt:12)

User code:
```kotlin
package test512
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test512
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test512.MainTest", methodName = "main", fileName = "test512.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test512.MainTest", methodName = "main", fileName = "test512.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.INFO) { message="info eventBuilder"; cause=throwable } at MainTest.main(test513.kt:12)

User code:
```kotlin
package test513
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
    logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test513
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test513.MainTest", methodName = "main", fileName = "test513.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test513.MainTest", methodName = "main", fileName = "test513.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=throwable } at MainTest.main(test514.kt:12)

User code:
```kotlin
package test514
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test514
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test514.MainTest", methodName = "main", fileName = "test514.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test514.MainTest", methodName = "main", fileName = "test514.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test515.kt:12)

User code:
```kotlin
package test515
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test515
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test515.MainTest", methodName = "main", fileName = "test515.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test515.MainTest", methodName = "main", fileName = "test515.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
