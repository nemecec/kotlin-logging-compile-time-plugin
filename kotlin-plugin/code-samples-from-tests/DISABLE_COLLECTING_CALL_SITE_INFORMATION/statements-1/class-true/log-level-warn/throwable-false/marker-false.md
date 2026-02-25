## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=false



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
    
    
    
    logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"")
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
    logger.at(Level.WARN) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"")
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
    logger.at(Level.WARN) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"")
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
    logger.at(Level.WARN) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
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
    
    
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"")
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
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"")
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
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"")
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
    
    
    
    logger.at(Level.WARN) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"")
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
    logger.at(Level.WARN) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"")
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
    logger.at(Level.WARN) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```
