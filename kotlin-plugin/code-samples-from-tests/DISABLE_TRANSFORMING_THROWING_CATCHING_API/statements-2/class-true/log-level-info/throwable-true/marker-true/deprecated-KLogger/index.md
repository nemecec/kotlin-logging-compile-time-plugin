## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=true / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  info(marker, throwable) { "info messageBuilder" } at MainTest.main(test981.kt:12)

User code:
```kotlin
package test981
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.info(marker, throwable) { "info messageBuilder" }
    logger.info(marker, throwable) { "info messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test981
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO, marker) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"", className = "test981.MainTest", methodName = "main", fileName = "test981.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"", className = "test981.MainTest", methodName = "main", fileName = "test981.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"", className = "test981.MainTest", methodName = "main", fileName = "test981.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder"", className = "test981.MainTest", methodName = "main", fileName = "test981.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, throwable) { "info messageBuilder $i" } at MainTest.main(test982.kt:12)

User code:
```kotlin
package test982
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.info(marker, throwable) { "info messageBuilder $i" }
    logger.info(marker, throwable) { "info messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test982
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO, marker) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"", className = "test982.MainTest", methodName = "main", fileName = "test982.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"", className = "test982.MainTest", methodName = "main", fileName = "test982.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"", className = "test982.MainTest", methodName = "main", fileName = "test982.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i"", className = "test982.MainTest", methodName = "main", fileName = "test982.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, throwable) { "info messageBuilder $i ${helper()}" } at MainTest.main(test983.kt:12)

User code:
```kotlin
package test983
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.info(marker, throwable) { "info messageBuilder $i ${helper()}" }
    logger.info(marker, throwable) { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test983
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"", className = "test983.MainTest", methodName = "main", fileName = "test983.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"", className = "test983.MainTest", methodName = "main", fileName = "test983.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"", className = "test983.MainTest", methodName = "main", fileName = "test983.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info messageBuilder $i ${helper()}"", className = "test983.MainTest", methodName = "main", fileName = "test983.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {}", throwable) at MainTest.main(test984.kt:12)

User code:
```kotlin
package test984
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.info(marker, "info message {}", throwable)
    logger.info(marker, "info message {}", throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test984
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO, marker) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test984.MainTest", methodName = "main", fileName = "test984.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test984.MainTest", methodName = "main", fileName = "test984.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test984.MainTest", methodName = "main", fileName = "test984.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"", className = "test984.MainTest", methodName = "main", fileName = "test984.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, message, throwable) at MainTest.main(test985.kt:12)

User code:
```kotlin
package test985
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val message = "info message as variable"
    logger.info(marker, message, throwable)
    logger.info(marker, message, throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test985
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val message = "info message as variable"
    logger.at(Level.INFO, marker) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test985.MainTest", methodName = "main", fileName = "test985.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test985.MainTest", methodName = "main", fileName = "test985.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test985.MainTest", methodName = "main", fileName = "test985.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info message as variable"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test985.MainTest", methodName = "main", fileName = "test985.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
