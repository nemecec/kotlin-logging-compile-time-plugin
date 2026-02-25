## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=TRACE / with throwable=false / with marker=false



###  trace() { "trace messageBuilder" } at MainTest.main(test446.kt:12)

User code:
```kotlin
package test446
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.trace() { "trace messageBuilder" }
    logger.trace() { "trace messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test446
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test446.MainTest", methodName = "main", fileName = "test446.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test446.MainTest", methodName = "main", fileName = "test446.kt", lineNumber = 13)
  }
  
}


```

###  trace() { "trace messageBuilder $i" } at MainTest.main(test447.kt:12)

User code:
```kotlin
package test447
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.trace() { "trace messageBuilder $i" }
    logger.trace() { "trace messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test447
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test447.MainTest", methodName = "main", fileName = "test447.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test447.MainTest", methodName = "main", fileName = "test447.kt", lineNumber = 13)
  }
  
}


```

###  trace() { "trace messageBuilder $i ${helper()}" } at MainTest.main(test448.kt:12)

User code:
```kotlin
package test448
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.trace() { "trace messageBuilder $i ${helper()}" }
    logger.trace() { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test448
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test448.MainTest", methodName = "main", fileName = "test448.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test448.MainTest", methodName = "main", fileName = "test448.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  trace(messageLambda) at MainTest.main(test449.kt:12)

User code:
```kotlin
package test449
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.trace(messageLambda)
    logger.trace(messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test449
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test449.MainTest", methodName = "main", fileName = "test449.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test449.MainTest", methodName = "main", fileName = "test449.kt", lineNumber = 13)
  }
  
}


```

###  atTrace() { message="trace eventBuilder"; cause=null } at MainTest.main(test450.kt:12)

User code:
```kotlin
package test450
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atTrace() { message="trace eventBuilder"; cause=null }
    logger.atTrace() { message="trace eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test450
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test450.MainTest", methodName = "main", fileName = "test450.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test450.MainTest", methodName = "main", fileName = "test450.kt", lineNumber = 13)
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i"; cause=null } at MainTest.main(test451.kt:12)

User code:
```kotlin
package test451
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i"; cause=null }
    logger.atTrace() { message="trace eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test451
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test451.MainTest", methodName = "main", fileName = "test451.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test451.MainTest", methodName = "main", fileName = "test451.kt", lineNumber = 13)
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test452.kt:12)

User code:
```kotlin
package test452
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test452
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test452.MainTest", methodName = "main", fileName = "test452.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test452.MainTest", methodName = "main", fileName = "test452.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=null } at MainTest.main(test453.kt:12)

User code:
```kotlin
package test453
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test453
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test453.MainTest", methodName = "main", fileName = "test453.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test453.MainTest", methodName = "main", fileName = "test453.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=null } at MainTest.main(test454.kt:12)

User code:
```kotlin
package test454
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test454
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test454.MainTest", methodName = "main", fileName = "test454.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test454.MainTest", methodName = "main", fileName = "test454.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test455.kt:12)

User code:
```kotlin
package test455
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test455
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test455.MainTest", methodName = "main", fileName = "test455.kt", lineNumber = 12)
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test455.MainTest", methodName = "main", fileName = "test455.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
