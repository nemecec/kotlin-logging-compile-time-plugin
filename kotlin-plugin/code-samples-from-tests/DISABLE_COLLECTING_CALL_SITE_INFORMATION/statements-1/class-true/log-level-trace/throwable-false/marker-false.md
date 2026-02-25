## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=false / with marker=false



###  trace() { "trace messageBuilder" } at MainTest.main(test36.kt:12)

User code:
```kotlin
package test36
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.trace() { "trace messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test36
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"")
  }
  
}


```

###  trace() { "trace messageBuilder $i" } at MainTest.main(test37.kt:12)

User code:
```kotlin
package test37
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.trace() { "trace messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test37
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"")
  }
  
}


```

###  trace() { "trace messageBuilder $i ${helper()}" } at MainTest.main(test38.kt:12)

User code:
```kotlin
package test38
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.trace() { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test38
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```

###  trace(messageLambda) at MainTest.main(test39.kt:12)

User code:
```kotlin
package test39
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.trace(messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test39
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.at(Level.TRACE) { message = "trace messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
  }
  
}


```

###  atTrace() { message="trace eventBuilder"; cause=null } at MainTest.main(test40.kt:12)

User code:
```kotlin
package test40
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atTrace() { message="trace eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test40
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"")
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i"; cause=null } at MainTest.main(test41.kt:12)

User code:
```kotlin
package test41
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test41
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"")
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test42.kt:12)

User code:
```kotlin
package test42
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test42
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=null } at MainTest.main(test43.kt:12)

User code:
```kotlin
package test43
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test43
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message = "trace eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"")
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=null } at MainTest.main(test44.kt:12)

User code:
```kotlin
package test44
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test44
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"")
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test45.kt:12)

User code:
```kotlin
package test45
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test45
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message = "trace eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```
