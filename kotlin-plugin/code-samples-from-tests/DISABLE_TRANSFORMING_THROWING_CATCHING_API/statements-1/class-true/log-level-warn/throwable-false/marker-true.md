## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=true



###  warn(marker) { "warn messageBuilder" } at MainTest.main(test146.kt:12)

User code:
```kotlin
package test146
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.warn(marker) { "warn messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test146
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test146.MainTest", methodName = "main", fileName = "test146.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker) { "warn messageBuilder $i" } at MainTest.main(test147.kt:12)

User code:
```kotlin
package test147
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.warn(marker) { "warn messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test147
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test147.MainTest", methodName = "main", fileName = "test147.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test148.kt:12)

User code:
```kotlin
package test148
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.warn(marker) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test148
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test148.MainTest", methodName = "main", fileName = "test148.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, messageLambda) at MainTest.main(test149.kt:12)

User code:
```kotlin
package test149
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(marker, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test149
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test149.MainTest", methodName = "main", fileName = "test149.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder"; cause=null } at MainTest.main(test150.kt:12)

User code:
```kotlin
package test150
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.atWarn(marker) { message="warn eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test150
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test150.MainTest", methodName = "main", fileName = "test150.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i"; cause=null } at MainTest.main(test151.kt:12)

User code:
```kotlin
package test151
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atWarn(marker) { message="warn eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test151
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test151.MainTest", methodName = "main", fileName = "test151.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test152.kt:12)

User code:
```kotlin
package test152
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test152
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test152.MainTest", methodName = "main", fileName = "test152.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder"; cause=null } at MainTest.main(test153.kt:12)

User code:
```kotlin
package test153
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test153
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test153.MainTest", methodName = "main", fileName = "test153.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null } at MainTest.main(test154.kt:12)

User code:
```kotlin
package test154
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test154
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test154.MainTest", methodName = "main", fileName = "test154.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test155.kt:12)

User code:
```kotlin
package test155
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test155
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test155.MainTest", methodName = "main", fileName = "test155.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
