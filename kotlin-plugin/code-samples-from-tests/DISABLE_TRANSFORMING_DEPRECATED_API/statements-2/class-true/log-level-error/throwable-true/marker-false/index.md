## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  error(throwable) { "error messageBuilder" } at MainTest.main(test1166.kt:12)

User code:
```kotlin
package test1166
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.error(throwable) { "error messageBuilder" }
    logger.error(throwable) { "error messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test1166
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1166.MainTest", methodName = "main", fileName = "test1166.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1166.MainTest", methodName = "main", fileName = "test1166.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1166.MainTest", methodName = "main", fileName = "test1166.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1166.MainTest", methodName = "main", fileName = "test1166.kt", lineNumber = 13)
  }
  
}


```

###  error(throwable) { "error messageBuilder $i" } at MainTest.main(test1167.kt:12)

User code:
```kotlin
package test1167
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.error(throwable) { "error messageBuilder $i" }
    logger.error(throwable) { "error messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test1167
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1167.MainTest", methodName = "main", fileName = "test1167.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1167.MainTest", methodName = "main", fileName = "test1167.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1167.MainTest", methodName = "main", fileName = "test1167.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1167.MainTest", methodName = "main", fileName = "test1167.kt", lineNumber = 13)
  }
  
}


```

###  error(throwable) { "error messageBuilder $i ${helper()}" } at MainTest.main(test1168.kt:12)

User code:
```kotlin
package test1168
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.error(throwable) { "error messageBuilder $i ${helper()}" }
    logger.error(throwable) { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test1168
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1168.MainTest", methodName = "main", fileName = "test1168.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1168.MainTest", methodName = "main", fileName = "test1168.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1168.MainTest", methodName = "main", fileName = "test1168.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1168.MainTest", methodName = "main", fileName = "test1168.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  error(throwable, messageLambda) at MainTest.main(test1169.kt:12)

User code:
```kotlin
package test1169
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(throwable, messageLambda)
    logger.error(throwable, messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test1169
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1169.MainTest", methodName = "main", fileName = "test1169.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1169.MainTest", methodName = "main", fileName = "test1169.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1169.MainTest", methodName = "main", fileName = "test1169.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1169.MainTest", methodName = "main", fileName = "test1169.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder"; cause=throwable } at MainTest.main(test1170.kt:12)

User code:
```kotlin
package test1170
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atError() { message="error eventBuilder"; cause=throwable }
    logger.atError() { message="error eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test1170
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1170.MainTest", methodName = "main", fileName = "test1170.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1170.MainTest", methodName = "main", fileName = "test1170.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1170.MainTest", methodName = "main", fileName = "test1170.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1170.MainTest", methodName = "main", fileName = "test1170.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder $i"; cause=throwable } at MainTest.main(test1171.kt:12)

User code:
```kotlin
package test1171
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atError() { message="error eventBuilder $i"; cause=throwable }
    logger.atError() { message="error eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test1171
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1171.MainTest", methodName = "main", fileName = "test1171.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1171.MainTest", methodName = "main", fileName = "test1171.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1171.MainTest", methodName = "main", fileName = "test1171.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1171.MainTest", methodName = "main", fileName = "test1171.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test1172.kt:12)

User code:
```kotlin
package test1172
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test1172
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1172.MainTest", methodName = "main", fileName = "test1172.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1172.MainTest", methodName = "main", fileName = "test1172.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1172.MainTest", methodName = "main", fileName = "test1172.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1172.MainTest", methodName = "main", fileName = "test1172.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.ERROR) { message="error eventBuilder"; cause=throwable } at MainTest.main(test1173.kt:12)

User code:
```kotlin
package test1173
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test1173
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1173.MainTest", methodName = "main", fileName = "test1173.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1173.MainTest", methodName = "main", fileName = "test1173.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1173.MainTest", methodName = "main", fileName = "test1173.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1173.MainTest", methodName = "main", fileName = "test1173.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable } at MainTest.main(test1174.kt:12)

User code:
```kotlin
package test1174
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Transformed into:
```kotlin
package test1174
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1174.MainTest", methodName = "main", fileName = "test1174.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1174.MainTest", methodName = "main", fileName = "test1174.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1174.MainTest", methodName = "main", fileName = "test1174.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1174.MainTest", methodName = "main", fileName = "test1174.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test1175.kt:12)

User code:
```kotlin
package test1175
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test1175
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1175.MainTest", methodName = "main", fileName = "test1175.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1175.MainTest", methodName = "main", fileName = "test1175.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1175.MainTest", methodName = "main", fileName = "test1175.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1175.MainTest", methodName = "main", fileName = "test1175.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
