## featureFlag=DEFAULT / With 2 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=true



###  trace(marker, throwable) { "trace messageBuilder" } at MainTest.main(test416.kt:12)

User code:
```kotlin
package test416
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.trace(marker, throwable) { "trace messageBuilder" }
    logger.trace(marker, throwable) { "trace messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test416
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test416.MainTest", methodName = "main", fileName = "test416.kt", lineNumber = 12)
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"", className = "test416.MainTest", methodName = "main", fileName = "test416.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable) { "trace messageBuilder $i" } at MainTest.main(test417.kt:12)

User code:
```kotlin
package test417
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(marker, throwable) { "trace messageBuilder $i" }
    logger.trace(marker, throwable) { "trace messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test417
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test417.MainTest", methodName = "main", fileName = "test417.kt", lineNumber = 12)
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"", className = "test417.MainTest", methodName = "main", fileName = "test417.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable) { "trace messageBuilder $i ${helper()}" } at MainTest.main(test418.kt:12)

User code:
```kotlin
package test418
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(marker, throwable) { "trace messageBuilder $i ${helper()}" }
    logger.trace(marker, throwable) { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test418
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test418.MainTest", methodName = "main", fileName = "test418.kt", lineNumber = 12)
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"", className = "test418.MainTest", methodName = "main", fileName = "test418.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable, messageLambda) at MainTest.main(test419.kt:12)

User code:
```kotlin
package test419
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.trace(marker, throwable, messageLambda)
    logger.trace(marker, throwable, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test419
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test419.MainTest", methodName = "main", fileName = "test419.kt", lineNumber = 12)
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test419.MainTest", methodName = "main", fileName = "test419.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder"; cause=throwable } at MainTest.main(test420.kt:12)

User code:
```kotlin
package test420
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.atTrace(marker) { message="trace eventBuilder"; cause=throwable }
    logger.atTrace(marker) { message="trace eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test420
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test420.MainTest", methodName = "main", fileName = "test420.kt", lineNumber = 12)
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test420.MainTest", methodName = "main", fileName = "test420.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test421.kt:12)

User code:
```kotlin
package test421
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace(marker) { message="trace eventBuilder $i"; cause=throwable }
    logger.atTrace(marker) { message="trace eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test421
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test421.MainTest", methodName = "main", fileName = "test421.kt", lineNumber = 12)
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test421.MainTest", methodName = "main", fileName = "test421.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test422.kt:12)

User code:
```kotlin
package test422
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
    logger.atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test422
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test422.MainTest", methodName = "main", fileName = "test422.kt", lineNumber = 12)
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test422.MainTest", methodName = "main", fileName = "test422.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder"; cause=throwable } at MainTest.main(test423.kt:12)

User code:
```kotlin
package test423
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE, marker) { message="trace eventBuilder"; cause=throwable }
    logger.at(Level.TRACE, marker) { message="trace eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test423
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test423.MainTest", methodName = "main", fileName = "test423.kt", lineNumber = 12)
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"", className = "test423.MainTest", methodName = "main", fileName = "test423.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test424.kt:12)

User code:
```kotlin
package test424
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=throwable }
    logger.at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test424
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test424.MainTest", methodName = "main", fileName = "test424.kt", lineNumber = 12)
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"", className = "test424.MainTest", methodName = "main", fileName = "test424.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test425.kt:12)

User code:
```kotlin
package test425
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test425
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test425.MainTest", methodName = "main", fileName = "test425.kt", lineNumber = 12)
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"", className = "test425.MainTest", methodName = "main", fileName = "test425.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
