## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=true / with log level=DEBUG / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  debug(throwable) { "debug messageBuilder" } at MainTest.main(test116.kt:12)

User code:
```kotlin
package test116
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug(throwable) { "debug messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test116
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test116.MainTest", methodName = "main", fileName = "test116.kt", lineNumber = 12)
  }
  
}


```

###  debug(throwable) { "debug messageBuilder $i" } at MainTest.main(test117.kt:12)

User code:
```kotlin
package test117
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test117
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test117.MainTest", methodName = "main", fileName = "test117.kt", lineNumber = 12)
  }
  
}


```

###  debug(throwable) { "debug messageBuilder $i ${helper()}" } at MainTest.main(test118.kt:12)

User code:
```kotlin
package test118
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test118
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test118.MainTest", methodName = "main", fileName = "test118.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  debug(throwable, messageLambda) at MainTest.main(test119.kt:12)

User code:
```kotlin
package test119
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(throwable, messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test119
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.at(Level.DEBUG) { message = "debug messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test119.MainTest", methodName = "main", fileName = "test119.kt", lineNumber = 12)
  }
  
}


```

###  atDebug() { message="debug eventBuilder"; cause=throwable } at MainTest.main(test120.kt:12)

User code:
```kotlin
package test120
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atDebug() { message="debug eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test120
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test120.MainTest", methodName = "main", fileName = "test120.kt", lineNumber = 12)
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test121.kt:12)

User code:
```kotlin
package test121
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test121
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test121.MainTest", methodName = "main", fileName = "test121.kt", lineNumber = 12)
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test122.kt:12)

User code:
```kotlin
package test122
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test122
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test122.MainTest", methodName = "main", fileName = "test122.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable } at MainTest.main(test123.kt:12)

User code:
```kotlin
package test123
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test123
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message = "debug eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test123.MainTest", methodName = "main", fileName = "test123.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test124.kt:12)

User code:
```kotlin
package test124
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test124
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test124.MainTest", methodName = "main", fileName = "test124.kt", lineNumber = 12)
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test125.kt:12)

User code:
```kotlin
package test125
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test125
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message = "debug eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test125.MainTest", methodName = "main", fileName = "test125.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}


```
