## featureFlag=DEFAULT / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn() { "warn messageBuilder" } at MainTest.main(test316.kt:12)

User code:
```kotlin
package test316
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
package test316
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder"", className = "test316.MainTest", methodName = "main", fileName = "test316.kt", lineNumber = 12)
  }
  
}


```

###  warn() { "warn messageBuilder $i" } at MainTest.main(test317.kt:12)

User code:
```kotlin
package test317
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
package test317
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i"", className = "test317.MainTest", methodName = "main", fileName = "test317.kt", lineNumber = 12)
  }
  
}


```

###  warn() { "warn messageBuilder $i ${helper()}" } at MainTest.main(test318.kt:12)

User code:
```kotlin
package test318
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
package test318
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn messageBuilder $i ${helper()}"", className = "test318.MainTest", methodName = "main", fileName = "test318.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  warn(messageLambda) at MainTest.main(test319.kt:12)

User code:
```kotlin
package test319
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
package test319
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test319.MainTest", methodName = "main", fileName = "test319.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder"; cause=null } at MainTest.main(test320.kt:12)

User code:
```kotlin
package test320
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
package test320
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test320.MainTest", methodName = "main", fileName = "test320.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i"; cause=null } at MainTest.main(test321.kt:12)

User code:
```kotlin
package test321
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
package test321
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test321.MainTest", methodName = "main", fileName = "test321.kt", lineNumber = 12)
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test322.kt:12)

User code:
```kotlin
package test322
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
package test322
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test322.MainTest", methodName = "main", fileName = "test322.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.WARN) { message="warn eventBuilder"; cause=null } at MainTest.main(test323.kt:12)

User code:
```kotlin
package test323
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
package test323
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test323.MainTest", methodName = "main", fileName = "test323.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=null } at MainTest.main(test324.kt:12)

User code:
```kotlin
package test324
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
package test324
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test324.MainTest", methodName = "main", fileName = "test324.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test325.kt:12)

User code:
```kotlin
package test325
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
package test325
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test325.MainTest", methodName = "main", fileName = "test325.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```
