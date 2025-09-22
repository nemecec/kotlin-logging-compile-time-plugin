## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  error() { "error messageBuilder" } at MainTest.main(test1206.kt:12)

User code:
```kotlin
package test1206
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
package test1206
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1206.MainTest", methodName = "main", fileName = "test1206.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1206.MainTest", methodName = "main", fileName = "test1206.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1206.MainTest", methodName = "main", fileName = "test1206.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder"", className = "test1206.MainTest", methodName = "main", fileName = "test1206.kt", lineNumber = 13)
  }
  
}


```

###  error() { "error messageBuilder $i" } at MainTest.main(test1207.kt:12)

User code:
```kotlin
package test1207
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
package test1207
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1207.MainTest", methodName = "main", fileName = "test1207.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1207.MainTest", methodName = "main", fileName = "test1207.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1207.MainTest", methodName = "main", fileName = "test1207.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i"", className = "test1207.MainTest", methodName = "main", fileName = "test1207.kt", lineNumber = 13)
  }
  
}


```

###  error() { "error messageBuilder $i ${helper()}" } at MainTest.main(test1208.kt:12)

User code:
```kotlin
package test1208
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
package test1208
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1208.MainTest", methodName = "main", fileName = "test1208.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1208.MainTest", methodName = "main", fileName = "test1208.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1208.MainTest", methodName = "main", fileName = "test1208.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error messageBuilder $i ${helper()}"", className = "test1208.MainTest", methodName = "main", fileName = "test1208.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  error(messageLambda) at MainTest.main(test1209.kt:12)

User code:
```kotlin
package test1209
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
package test1209
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1209.MainTest", methodName = "main", fileName = "test1209.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1209.MainTest", methodName = "main", fileName = "test1209.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1209.MainTest", methodName = "main", fileName = "test1209.kt", lineNumber = 12)
at(Level.ERROR) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test1209.MainTest", methodName = "main", fileName = "test1209.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder"; cause=null } at MainTest.main(test1210.kt:12)

User code:
```kotlin
package test1210
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
package test1210
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1210.MainTest", methodName = "main", fileName = "test1210.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1210.MainTest", methodName = "main", fileName = "test1210.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1210.MainTest", methodName = "main", fileName = "test1210.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1210.MainTest", methodName = "main", fileName = "test1210.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder $i"; cause=null } at MainTest.main(test1211.kt:12)

User code:
```kotlin
package test1211
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
package test1211
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1211.MainTest", methodName = "main", fileName = "test1211.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1211.MainTest", methodName = "main", fileName = "test1211.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1211.MainTest", methodName = "main", fileName = "test1211.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1211.MainTest", methodName = "main", fileName = "test1211.kt", lineNumber = 13)
  }
  
}


```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test1212.kt:12)

User code:
```kotlin
package test1212
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
package test1212
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1212.MainTest", methodName = "main", fileName = "test1212.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1212.MainTest", methodName = "main", fileName = "test1212.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1212.MainTest", methodName = "main", fileName = "test1212.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1212.MainTest", methodName = "main", fileName = "test1212.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```

###  at(Level.ERROR) { message="error eventBuilder"; cause=null } at MainTest.main(test1213.kt:12)

User code:
```kotlin
package test1213
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
package test1213
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1213.MainTest", methodName = "main", fileName = "test1213.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1213.MainTest", methodName = "main", fileName = "test1213.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1213.MainTest", methodName = "main", fileName = "test1213.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder"", className = "test1213.MainTest", methodName = "main", fileName = "test1213.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=null } at MainTest.main(test1214.kt:12)

User code:
```kotlin
package test1214
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
package test1214
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1214.MainTest", methodName = "main", fileName = "test1214.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1214.MainTest", methodName = "main", fileName = "test1214.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1214.MainTest", methodName = "main", fileName = "test1214.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i"", className = "test1214.MainTest", methodName = "main", fileName = "test1214.kt", lineNumber = 13)
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test1215.kt:12)

User code:
```kotlin
package test1215
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
package test1215
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1215.MainTest", methodName = "main", fileName = "test1215.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1215.MainTest", methodName = "main", fileName = "test1215.kt", lineNumber = 13)
    logger.at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1215.MainTest", methodName = "main", fileName = "test1215.kt", lineNumber = 12)
at(Level.ERROR) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""error eventBuilder $i ${helper()}"", className = "test1215.MainTest", methodName = "main", fileName = "test1215.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}


```
