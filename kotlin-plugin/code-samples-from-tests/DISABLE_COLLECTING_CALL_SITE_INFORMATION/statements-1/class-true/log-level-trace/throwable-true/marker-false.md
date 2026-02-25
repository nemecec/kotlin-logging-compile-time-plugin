## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=false



###  trace(throwable) { "trace messageBuilder" } at MainTest.main(test16.kt:12)

User code:
```kotlin
package test16
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.trace(throwable) { "trace messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test16
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"")
  }
  
}


```

###  trace(throwable) { "trace messageBuilder $i" } at MainTest.main(test17.kt:12)

User code:
```kotlin
package test17
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(throwable) { "trace messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test17
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"")
  }
  
}


```

###  trace(throwable) { "trace messageBuilder $i ${helper()}" } at MainTest.main(test18.kt:12)

User code:
```kotlin
package test18
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test18
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```

###  trace(throwable, messageLambda) at MainTest.main(test19.kt:12)

User code:
```kotlin
package test19
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.trace(throwable, messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test19
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.at(Level.TRACE) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
  }
  
}


```

###  atTrace() { message="trace eventBuilder"; cause=throwable } at MainTest.main(test20.kt:12)

User code:
```kotlin
package test20
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atTrace() { message="trace eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test20
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"")
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test21.kt:12)

User code:
```kotlin
package test21
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test21
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"")
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test22.kt:12)

User code:
```kotlin
package test22
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test22
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=throwable } at MainTest.main(test23.kt:12)

User code:
```kotlin
package test23
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test23
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"")
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test24.kt:12)

User code:
```kotlin
package test24
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test24
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"")
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test25.kt:12)

User code:
```kotlin
package test25
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test25
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```
