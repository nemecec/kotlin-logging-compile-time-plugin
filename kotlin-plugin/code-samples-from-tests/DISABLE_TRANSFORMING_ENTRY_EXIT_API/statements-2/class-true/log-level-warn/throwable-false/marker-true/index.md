## featureFlag=DISABLE_TRANSFORMING_ENTRY_EXIT_API / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  atWarn(marker) { message="warn eventBuilder"; cause=null } at MainTest.main(test1110.kt:12)

User code:
```kotlin
package test1110
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
package test1110
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test1110.MainTest", methodName = "main", fileName = "test1110.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test1110.MainTest", methodName = "main", fileName = "test1110.kt", lineNumber = 13)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test1110.MainTest", methodName = "main", fileName = "test1110.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test1110.MainTest", methodName = "main", fileName = "test1110.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i"; cause=null } at MainTest.main(test1111.kt:12)

User code:
```kotlin
package test1111
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
package test1111
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test1111.MainTest", methodName = "main", fileName = "test1111.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test1111.MainTest", methodName = "main", fileName = "test1111.kt", lineNumber = 13)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test1111.MainTest", methodName = "main", fileName = "test1111.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test1111.MainTest", methodName = "main", fileName = "test1111.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test1112.kt:12)

User code:
```kotlin
package test1112
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
package test1112
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test1112.MainTest", methodName = "main", fileName = "test1112.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test1112.MainTest", methodName = "main", fileName = "test1112.kt", lineNumber = 13)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test1112.MainTest", methodName = "main", fileName = "test1112.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test1112.MainTest", methodName = "main", fileName = "test1112.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder"; cause=null } at MainTest.main(test1113.kt:12)

User code:
```kotlin
package test1113
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
package test1113
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test1113.MainTest", methodName = "main", fileName = "test1113.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test1113.MainTest", methodName = "main", fileName = "test1113.kt", lineNumber = 13)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test1113.MainTest", methodName = "main", fileName = "test1113.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder"", className = "test1113.MainTest", methodName = "main", fileName = "test1113.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=null } at MainTest.main(test1114.kt:12)

User code:
```kotlin
package test1114
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
package test1114
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test1114.MainTest", methodName = "main", fileName = "test1114.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test1114.MainTest", methodName = "main", fileName = "test1114.kt", lineNumber = 13)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test1114.MainTest", methodName = "main", fileName = "test1114.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i"", className = "test1114.MainTest", methodName = "main", fileName = "test1114.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test1115.kt:12)

User code:
```kotlin
package test1115
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
package test1115
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test1115.MainTest", methodName = "main", fileName = "test1115.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test1115.MainTest", methodName = "main", fileName = "test1115.kt", lineNumber = 13)
    logger.at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test1115.MainTest", methodName = "main", fileName = "test1115.kt", lineNumber = 12)
at(Level.WARN, marker) { message = "warn eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""warn eventBuilder $i ${helper()}"", className = "test1115.MainTest", methodName = "main", fileName = "test1115.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
