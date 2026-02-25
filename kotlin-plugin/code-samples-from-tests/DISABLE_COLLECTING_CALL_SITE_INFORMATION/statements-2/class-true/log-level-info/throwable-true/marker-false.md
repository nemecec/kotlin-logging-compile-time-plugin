## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=true / with marker=false



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
    
    logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"")
    logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"")
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
    logger.at(Level.INFO) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"")
    logger.at(Level.INFO) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"")
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
    logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"")
    logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"")
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
    logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
    logger.at(Level.INFO) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
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
    
    logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"")
    logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"")
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
    logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"")
    logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"")
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
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"")
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"")
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
    
    logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"")
    logger.at(Level.INFO) { message = "info eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"")
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
    logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"")
    logger.at(Level.INFO) { message = "info eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"")
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
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"")
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```
