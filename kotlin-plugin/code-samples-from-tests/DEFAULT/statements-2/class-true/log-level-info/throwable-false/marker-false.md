## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=false / with marker=false



###  info() { "info messageBuilder" } at MainTest.main(test526.kt:12)

User code:
```kotlin
package test526
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.info() { "info messageBuilder" }
    logger.info() { "info messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test526
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.INFO) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test526.MainTest", methodName = "main", fileName = "test526.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder\"", className = "test526.MainTest", methodName = "main", fileName = "test526.kt", lineNumber = 13)
  }
  
}


```

###  info() { "info messageBuilder $i" } at MainTest.main(test527.kt:12)

User code:
```kotlin
package test527
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.info() { "info messageBuilder $i" }
    logger.info() { "info messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test527
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message = "info messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test527.MainTest", methodName = "main", fileName = "test527.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i\"", className = "test527.MainTest", methodName = "main", fileName = "test527.kt", lineNumber = 13)
  }
  
}


```

###  info() { "info messageBuilder $i ${helper()}" } at MainTest.main(test528.kt:12)

User code:
```kotlin
package test528
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.info() { "info messageBuilder $i ${helper()}" }
    logger.info() { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test528
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test528.MainTest", methodName = "main", fileName = "test528.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info messageBuilder $i ${helper()}\"", className = "test528.MainTest", methodName = "main", fileName = "test528.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  info(messageLambda) at MainTest.main(test529.kt:12)

User code:
```kotlin
package test529
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.info(messageLambda)
    logger.info(messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test529
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.at(Level.INFO) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test529.MainTest", methodName = "main", fileName = "test529.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test529.MainTest", methodName = "main", fileName = "test529.kt", lineNumber = 13)
  }
  
}


```

###  atInfo() { message="info eventBuilder"; cause=null } at MainTest.main(test530.kt:12)

User code:
```kotlin
package test530
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atInfo() { message="info eventBuilder"; cause=null }
    logger.atInfo() { message="info eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test530
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.INFO) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test530.MainTest", methodName = "main", fileName = "test530.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test530.MainTest", methodName = "main", fileName = "test530.kt", lineNumber = 13)
  }
  
}


```

###  atInfo() { message="info eventBuilder $i"; cause=null } at MainTest.main(test531.kt:12)

User code:
```kotlin
package test531
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atInfo() { message="info eventBuilder $i"; cause=null }
    logger.atInfo() { message="info eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test531
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test531.MainTest", methodName = "main", fileName = "test531.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test531.MainTest", methodName = "main", fileName = "test531.kt", lineNumber = 13)
  }
  
}


```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test532.kt:12)

User code:
```kotlin
package test532
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test532
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test532.MainTest", methodName = "main", fileName = "test532.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test532.MainTest", methodName = "main", fileName = "test532.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.INFO) { message="info eventBuilder"; cause=null } at MainTest.main(test533.kt:12)

User code:
```kotlin
package test533
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
    logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test533
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.INFO) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test533.MainTest", methodName = "main", fileName = "test533.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder\"", className = "test533.MainTest", methodName = "main", fileName = "test533.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=null } at MainTest.main(test534.kt:12)

User code:
```kotlin
package test534
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test534
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test534.MainTest", methodName = "main", fileName = "test534.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i\"", className = "test534.MainTest", methodName = "main", fileName = "test534.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test535.kt:12)

User code:
```kotlin
package test535
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test535
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test535.MainTest", methodName = "main", fileName = "test535.kt", lineNumber = 12)
    logger.at(Level.INFO) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"info eventBuilder $i ${helper()}\"", className = "test535.MainTest", methodName = "main", fileName = "test535.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
