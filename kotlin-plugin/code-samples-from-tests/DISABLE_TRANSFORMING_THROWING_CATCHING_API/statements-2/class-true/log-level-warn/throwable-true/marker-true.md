## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=true



###  warn(marker, throwable) { "warn messageBuilder" } at MainTest.main(test536.kt:12)

User code:
```kotlin
package test536
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.warn(marker, throwable) { "warn messageBuilder" }
    logger.warn(marker, throwable) { "warn messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test536
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN, marker) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test536.MainTest", methodName = "main", fileName = "test536.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder\"", className = "test536.MainTest", methodName = "main", fileName = "test536.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable) { "warn messageBuilder $i" } at MainTest.main(test537.kt:12)

User code:
```kotlin
package test537
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(marker, throwable) { "warn messageBuilder $i" }
    logger.warn(marker, throwable) { "warn messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test537
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test537.MainTest", methodName = "main", fileName = "test537.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i\"", className = "test537.MainTest", methodName = "main", fileName = "test537.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test538.kt:12)

User code:
```kotlin
package test538
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(marker, throwable) { "warn messageBuilder $i ${helper()}" }
    logger.warn(marker, throwable) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test538
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test538.MainTest", methodName = "main", fileName = "test538.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn messageBuilder $i ${helper()}\"", className = "test538.MainTest", methodName = "main", fileName = "test538.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(marker, throwable, messageLambda) at MainTest.main(test539.kt:12)

User code:
```kotlin
package test539
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(marker, throwable, messageLambda)
    logger.warn(marker, throwable, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test539
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.at(Level.WARN, marker) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test539.MainTest", methodName = "main", fileName = "test539.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test539.MainTest", methodName = "main", fileName = "test539.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder"; cause=throwable } at MainTest.main(test540.kt:12)

User code:
```kotlin
package test540
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.atWarn(marker) { message="warn eventBuilder"; cause=throwable }
    logger.atWarn(marker) { message="warn eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test540
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test540.MainTest", methodName = "main", fileName = "test540.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test540.MainTest", methodName = "main", fileName = "test540.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test541.kt:12)

User code:
```kotlin
package test541
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn(marker) { message="warn eventBuilder $i"; cause=throwable }
    logger.atWarn(marker) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test541
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test541.MainTest", methodName = "main", fileName = "test541.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test541.MainTest", methodName = "main", fileName = "test541.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test542.kt:12)

User code:
```kotlin
package test542
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test542
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test542.MainTest", methodName = "main", fileName = "test542.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test542.MainTest", methodName = "main", fileName = "test542.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable } at MainTest.main(test543.kt:12)

User code:
```kotlin
package test543
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable }
    logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test543
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test543.MainTest", methodName = "main", fileName = "test543.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder\"", className = "test543.MainTest", methodName = "main", fileName = "test543.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test544.kt:12)

User code:
```kotlin
package test544
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable }
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test544
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test544.MainTest", methodName = "main", fileName = "test544.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i\"", className = "test544.MainTest", methodName = "main", fileName = "test544.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test545.kt:12)

User code:
```kotlin
package test545
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test545
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test545.MainTest", methodName = "main", fileName = "test545.kt", lineNumber = 12)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"warn eventBuilder $i ${helper()}\"", className = "test545.MainTest", methodName = "main", fileName = "test545.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
