## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=false



###  error() { "error messageBuilder" } at MainTest.main(test606.kt:12)

User code:
```kotlin
package test606
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.error() { "error messageBuilder" }
    logger.error() { "error messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test606
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test606.MainTest", methodName = "main", fileName = "test606.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test606.MainTest", methodName = "main", fileName = "test606.kt", lineNumber = 13)
  }
  
}


```

###  error() { "error messageBuilder $i" } at MainTest.main(test607.kt:12)

User code:
```kotlin
package test607
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.error() { "error messageBuilder $i" }
    logger.error() { "error messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test607
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test607.MainTest", methodName = "main", fileName = "test607.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test607.MainTest", methodName = "main", fileName = "test607.kt", lineNumber = 13)
  }
  
}


```

###  error() { "error messageBuilder $i ${helper()}" } at MainTest.main(test608.kt:12)

User code:
```kotlin
package test608
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.error() { "error messageBuilder $i ${helper()}" }
    logger.error() { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test608
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test608.MainTest", methodName = "main", fileName = "test608.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test608.MainTest", methodName = "main", fileName = "test608.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  error(messageLambda) at MainTest.main(test609.kt:12)

User code:
```kotlin
package test609
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(messageLambda)
    logger.error(messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test609
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test609.MainTest", methodName = "main", fileName = "test609.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test609.MainTest", methodName = "main", fileName = "test609.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder"; cause=null } at MainTest.main(test610.kt:12)

User code:
```kotlin
package test610
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atError() { message="error eventBuilder"; cause=null }
    logger.atError() { message="error eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test610
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test610.MainTest", methodName = "main", fileName = "test610.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test610.MainTest", methodName = "main", fileName = "test610.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder $i"; cause=null } at MainTest.main(test611.kt:12)

User code:
```kotlin
package test611
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atError() { message="error eventBuilder $i"; cause=null }
    logger.atError() { message="error eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test611
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test611.MainTest", methodName = "main", fileName = "test611.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test611.MainTest", methodName = "main", fileName = "test611.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test612.kt:12)

User code:
```kotlin
package test612
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test612
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test612.MainTest", methodName = "main", fileName = "test612.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test612.MainTest", methodName = "main", fileName = "test612.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.ERROR) { message="error eventBuilder"; cause=null } at MainTest.main(test613.kt:12)

User code:
```kotlin
package test613
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test613
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test613.MainTest", methodName = "main", fileName = "test613.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test613.MainTest", methodName = "main", fileName = "test613.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=null } at MainTest.main(test614.kt:12)

User code:
```kotlin
package test614
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test614
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test614.MainTest", methodName = "main", fileName = "test614.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test614.MainTest", methodName = "main", fileName = "test614.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test615.kt:12)

User code:
```kotlin
package test615
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test615
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test615.MainTest", methodName = "main", fileName = "test615.kt", lineNumber = 12)
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test615.MainTest", methodName = "main", fileName = "test615.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
