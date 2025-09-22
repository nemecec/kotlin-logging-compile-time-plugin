## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  atDebug(marker) { message="debug eventBuilder"; cause=null } at MainTest.main(test950.kt:12)

User code:
```kotlin
package test950
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.atDebug(marker) { message="debug eventBuilder"; cause=null }
    logger.atDebug(marker) { message="debug eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test950
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test950.MainTest", methodName = "main", fileName = "test950.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test950.MainTest", methodName = "main", fileName = "test950.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test950.MainTest", methodName = "main", fileName = "test950.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test950.MainTest", methodName = "main", fileName = "test950.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i"; cause=null } at MainTest.main(test951.kt:12)

User code:
```kotlin
package test951
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atDebug(marker) { message="debug eventBuilder $i"; cause=null }
    logger.atDebug(marker) { message="debug eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test951
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test951.MainTest", methodName = "main", fileName = "test951.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test951.MainTest", methodName = "main", fileName = "test951.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test951.MainTest", methodName = "main", fileName = "test951.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test951.MainTest", methodName = "main", fileName = "test951.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test952.kt:12)

User code:
```kotlin
package test952
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
    logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test952
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test952.MainTest", methodName = "main", fileName = "test952.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test952.MainTest", methodName = "main", fileName = "test952.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test952.MainTest", methodName = "main", fileName = "test952.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test952.MainTest", methodName = "main", fileName = "test952.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=null } at MainTest.main(test953.kt:12)

User code:
```kotlin
package test953
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=null }
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test953
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test953.MainTest", methodName = "main", fileName = "test953.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test953.MainTest", methodName = "main", fileName = "test953.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test953.MainTest", methodName = "main", fileName = "test953.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder"", className = "test953.MainTest", methodName = "main", fileName = "test953.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=null } at MainTest.main(test954.kt:12)

User code:
```kotlin
package test954
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=null }
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test954
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test954.MainTest", methodName = "main", fileName = "test954.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test954.MainTest", methodName = "main", fileName = "test954.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test954.MainTest", methodName = "main", fileName = "test954.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i"", className = "test954.MainTest", methodName = "main", fileName = "test954.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test955.kt:12)

User code:
```kotlin
package test955
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test955
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test955.MainTest", methodName = "main", fileName = "test955.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test955.MainTest", methodName = "main", fileName = "test955.kt", lineNumber = 13)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test955.MainTest", methodName = "main", fileName = "test955.kt", lineNumber = 12)
at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug eventBuilder $i ${helper()}"", className = "test955.MainTest", methodName = "main", fileName = "test955.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
