## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=false



###  error() { "error messageBuilder" } at MainTest.main(test196.kt:12)

User code:
```kotlin
package test196
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.error() { "error messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test196
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"")
  }
  
}


```

###  error() { "error messageBuilder $i" } at MainTest.main(test197.kt:12)

User code:
```kotlin
package test197
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.error() { "error messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test197
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"")
  }
  
}


```

###  error() { "error messageBuilder $i ${helper()}" } at MainTest.main(test198.kt:12)

User code:
```kotlin
package test198
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.error() { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test198
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```

###  error(messageLambda) at MainTest.main(test199.kt:12)

User code:
```kotlin
package test199
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test199
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
  }
  
}


```

###  atError() { message="error eventBuilder"; cause=null } at MainTest.main(test200.kt:12)

User code:
```kotlin
package test200
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atError() { message="error eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test200
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"")
  }
  
}


```

###  atError() { message="error eventBuilder $i"; cause=null } at MainTest.main(test201.kt:12)

User code:
```kotlin
package test201
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atError() { message="error eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test201
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"")
  }
  
}


```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test202.kt:12)

User code:
```kotlin
package test202
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test202
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```

###  at(Level.ERROR) { message="error eventBuilder"; cause=null } at MainTest.main(test203.kt:12)

User code:
```kotlin
package test203
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test203
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"")
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=null } at MainTest.main(test204.kt:12)

User code:
```kotlin
package test204
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test204
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"")
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test205.kt:12)

User code:
```kotlin
package test205
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test205
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}


```
