## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 1 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=true



###  error(marker) { "error messageBuilder" } at MainTest.main(test186.kt:12)

User code:
```kotlin
package test186
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.error(marker) { "error messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test186
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.ERROR, marker) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder\"", className = "test186.MainTest", methodName = "main", fileName = "test186.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker) { "error messageBuilder $i" } at MainTest.main(test187.kt:12)

User code:
```kotlin
package test187
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.error(marker) { "error messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test187
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.ERROR, marker) { message = "error messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i\"", className = "test187.MainTest", methodName = "main", fileName = "test187.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker) { "error messageBuilder $i ${helper()}" } at MainTest.main(test188.kt:12)

User code:
```kotlin
package test188
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.error(marker) { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test188
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.ERROR, marker) { message = "error messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error messageBuilder $i ${helper()}\"", className = "test188.MainTest", methodName = "main", fileName = "test188.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, messageLambda) at MainTest.main(test189.kt:12)

User code:
```kotlin
package test189
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(marker, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test189
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.at(Level.ERROR, marker) { message = "error messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test189.MainTest", methodName = "main", fileName = "test189.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder"; cause=null } at MainTest.main(test190.kt:12)

User code:
```kotlin
package test190
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.atError(marker) { message="error eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test190
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test190.MainTest", methodName = "main", fileName = "test190.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i"; cause=null } at MainTest.main(test191.kt:12)

User code:
```kotlin
package test191
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atError(marker) { message="error eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test191
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test191.MainTest", methodName = "main", fileName = "test191.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test192.kt:12)

User code:
```kotlin
package test192
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atError(marker) { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test192
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test192.MainTest", methodName = "main", fileName = "test192.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder"; cause=null } at MainTest.main(test193.kt:12)

User code:
```kotlin
package test193
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.ERROR, marker) { message="error eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test193
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.ERROR, marker) { message = "error eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder\"", className = "test193.MainTest", methodName = "main", fileName = "test193.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=null } at MainTest.main(test194.kt:12)

User code:
```kotlin
package test194
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test194
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.ERROR, marker) { message = "error eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i\"", className = "test194.MainTest", methodName = "main", fileName = "test194.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test195.kt:12)

User code:
```kotlin
package test195
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test195
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.ERROR, marker) { message = "error eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"error eventBuilder $i ${helper()}\"", className = "test195.MainTest", methodName = "main", fileName = "test195.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
