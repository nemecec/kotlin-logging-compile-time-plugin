## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=false



###  warn() { "warn messageBuilder" } at MainTest.main(test156.kt:12)

User code:
```kotlin
package test156
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.warn() { "warn messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test156
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test156.MainTest", methodName = "main", fileName = "test156.kt", lineNumber = 12)
  }
  
}


```

###  warn() { "warn messageBuilder $i" } at MainTest.main(test157.kt:12)

User code:
```kotlin
package test157
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.warn() { "warn messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test157
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test157.MainTest", methodName = "main", fileName = "test157.kt", lineNumber = 12)
  }
  
}


```

###  warn() { "warn messageBuilder $i ${helper()}" } at MainTest.main(test158.kt:12)

User code:
```kotlin
package test158
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.warn() { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test158
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test158.MainTest", methodName = "main", fileName = "test158.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  warn(messageLambda) at MainTest.main(test159.kt:12)

User code:
```kotlin
package test159
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test159
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test159.MainTest", methodName = "main", fileName = "test159.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder"; cause=null } at MainTest.main(test160.kt:12)

User code:
```kotlin
package test160
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atWarn() { message="warn eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test160
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test160.MainTest", methodName = "main", fileName = "test160.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i"; cause=null } at MainTest.main(test161.kt:12)

User code:
```kotlin
package test161
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test161
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test161.MainTest", methodName = "main", fileName = "test161.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test162.kt:12)

User code:
```kotlin
package test162
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test162
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test162.MainTest", methodName = "main", fileName = "test162.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.WARN) { message="warn eventBuilder"; cause=null } at MainTest.main(test163.kt:12)

User code:
```kotlin
package test163
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test163
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test163.MainTest", methodName = "main", fileName = "test163.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=null } at MainTest.main(test164.kt:12)

User code:
```kotlin
package test164
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test164
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test164.MainTest", methodName = "main", fileName = "test164.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test165.kt:12)

User code:
```kotlin
package test165
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test165
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test165.MainTest", methodName = "main", fileName = "test165.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```
