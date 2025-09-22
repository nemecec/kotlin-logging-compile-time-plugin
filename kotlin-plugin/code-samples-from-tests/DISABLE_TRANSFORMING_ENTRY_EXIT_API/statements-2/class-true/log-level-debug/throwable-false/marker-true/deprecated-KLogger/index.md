## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=true / deprecated KLogger API

* [deprecated API with SLF4J placeholders](deprecated-slf4j-placeholders.md)

###  debug(marker) { "debug messageBuilder" } at MainTest.main(test941.kt:12)

User code:
```kotlin
package test941
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.debug(marker) { "debug messageBuilder" }
    logger.debug(marker) { "debug messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test941
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test941.MainTest", methodName = "main", fileName = "test941.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test941.MainTest", methodName = "main", fileName = "test941.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test941.MainTest", methodName = "main", fileName = "test941.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder"", className = "test941.MainTest", methodName = "main", fileName = "test941.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker) { "debug messageBuilder $i" } at MainTest.main(test942.kt:12)

User code:
```kotlin
package test942
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.debug(marker) { "debug messageBuilder $i" }
    logger.debug(marker) { "debug messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test942
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test942.MainTest", methodName = "main", fileName = "test942.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test942.MainTest", methodName = "main", fileName = "test942.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test942.MainTest", methodName = "main", fileName = "test942.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i"", className = "test942.MainTest", methodName = "main", fileName = "test942.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker) { "debug messageBuilder $i ${helper()}" } at MainTest.main(test943.kt:12)

User code:
```kotlin
package test943
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.debug(marker) { "debug messageBuilder $i ${helper()}" }
    logger.debug(marker) { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test943
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test943.MainTest", methodName = "main", fileName = "test943.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test943.MainTest", methodName = "main", fileName = "test943.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test943.MainTest", methodName = "main", fileName = "test943.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug messageBuilder $i ${helper()}"", className = "test943.MainTest", methodName = "main", fileName = "test943.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {}") at MainTest.main(test944.kt:12)

User code:
```kotlin
package test944
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.debug(marker, "debug message {}")
    logger.debug(marker, "debug message {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test944
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.DEBUG, marker) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test944.MainTest", methodName = "main", fileName = "test944.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test944.MainTest", methodName = "main", fileName = "test944.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test944.MainTest", methodName = "main", fileName = "test944.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"", className = "test944.MainTest", methodName = "main", fileName = "test944.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, message) at MainTest.main(test945.kt:12)

User code:
```kotlin
package test945
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val message = "debug message as variable"
    logger.debug(marker, message)
    logger.debug(marker, message)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test945
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val message = "debug message as variable"
    logger.at(Level.DEBUG, marker) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test945.MainTest", methodName = "main", fileName = "test945.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test945.MainTest", methodName = "main", fileName = "test945.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test945.MainTest", methodName = "main", fileName = "test945.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug message as variable"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "message", className = "test945.MainTest", methodName = "main", fileName = "test945.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
