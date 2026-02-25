## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=true



###  warn(marker) { "warn messageBuilder" } at MainTest.main(test556.kt:12)

User code:
```kotlin
package test556
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.warn(marker) { "warn messageBuilder" }
    logger.warn(marker) { "warn messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test556
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test556.MainTest", methodName = "main", fileName = "test556.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test556.MainTest", methodName = "main", fileName = "test556.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker) { "warn messageBuilder $i" } at MainTest.main(test557.kt:12)

User code:
```kotlin
package test557
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.warn(marker) { "warn messageBuilder $i" }
    logger.warn(marker) { "warn messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test557
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test557.MainTest", methodName = "main", fileName = "test557.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test557.MainTest", methodName = "main", fileName = "test557.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test558.kt:12)

User code:
```kotlin
package test558
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.warn(marker) { "warn messageBuilder $i ${helper()}" }
    logger.warn(marker) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test558
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test558.MainTest", methodName = "main", fileName = "test558.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test558.MainTest", methodName = "main", fileName = "test558.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, messageLambda) at MainTest.main(test559.kt:12)

User code:
```kotlin
package test559
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(marker, messageLambda)
    logger.warn(marker, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test559
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test559.MainTest", methodName = "main", fileName = "test559.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test559.MainTest", methodName = "main", fileName = "test559.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder"; cause=null } at MainTest.main(test560.kt:12)

User code:
```kotlin
package test560
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.atWarn(marker) { message="warn eventBuilder"; cause=null }
    logger.atWarn(marker) { message="warn eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test560
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test560.MainTest", methodName = "main", fileName = "test560.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test560.MainTest", methodName = "main", fileName = "test560.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i"; cause=null } at MainTest.main(test561.kt:12)

User code:
```kotlin
package test561
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atWarn(marker) { message="warn eventBuilder $i"; cause=null }
    logger.atWarn(marker) { message="warn eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test561
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test561.MainTest", methodName = "main", fileName = "test561.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test561.MainTest", methodName = "main", fileName = "test561.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test562.kt:12)

User code:
```kotlin
package test562
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
    logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test562
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test562.MainTest", methodName = "main", fileName = "test562.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test562.MainTest", methodName = "main", fileName = "test562.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder"; cause=null } at MainTest.main(test563.kt:12)

User code:
```kotlin
package test563
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
    logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test563
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test563.MainTest", methodName = "main", fileName = "test563.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test563.MainTest", methodName = "main", fileName = "test563.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null } at MainTest.main(test564.kt:12)

User code:
```kotlin
package test564
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test564
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test564.MainTest", methodName = "main", fileName = "test564.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test564.MainTest", methodName = "main", fileName = "test564.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test565.kt:12)

User code:
```kotlin
package test565
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test565
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test565.MainTest", methodName = "main", fileName = "test565.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test565.MainTest", methodName = "main", fileName = "test565.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
