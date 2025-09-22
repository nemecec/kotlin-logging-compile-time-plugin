## featureFlag=DISABLE_TRANSFORMING_DEPRECATED_API / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=false / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  atInfo(marker) { message="info eventBuilder"; cause=null } at MainTest.main(test1030.kt:12)

User code:
```kotlin
package test1030
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.atInfo(marker) { message="info eventBuilder"; cause=null }
    logger.atInfo(marker) { message="info eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1030
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"", className = "test1030.MainTest", methodName = "main", fileName = "test1030.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"", className = "test1030.MainTest", methodName = "main", fileName = "test1030.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"", className = "test1030.MainTest", methodName = "main", fileName = "test1030.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"", className = "test1030.MainTest", methodName = "main", fileName = "test1030.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i"; cause=null } at MainTest.main(test1031.kt:12)

User code:
```kotlin
package test1031
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
    logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1031
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"", className = "test1031.MainTest", methodName = "main", fileName = "test1031.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"", className = "test1031.MainTest", methodName = "main", fileName = "test1031.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"", className = "test1031.MainTest", methodName = "main", fileName = "test1031.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"", className = "test1031.MainTest", methodName = "main", fileName = "test1031.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test1032.kt:12)

User code:
```kotlin
package test1032
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1032
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"", className = "test1032.MainTest", methodName = "main", fileName = "test1032.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"", className = "test1032.MainTest", methodName = "main", fileName = "test1032.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"", className = "test1032.MainTest", methodName = "main", fileName = "test1032.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"", className = "test1032.MainTest", methodName = "main", fileName = "test1032.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder"; cause=null } at MainTest.main(test1033.kt:12)

User code:
```kotlin
package test1033
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
    logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1033
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"", className = "test1033.MainTest", methodName = "main", fileName = "test1033.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"", className = "test1033.MainTest", methodName = "main", fileName = "test1033.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"", className = "test1033.MainTest", methodName = "main", fileName = "test1033.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder"", className = "test1033.MainTest", methodName = "main", fileName = "test1033.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null } at MainTest.main(test1034.kt:12)

User code:
```kotlin
package test1034
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
    logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1034
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"", className = "test1034.MainTest", methodName = "main", fileName = "test1034.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"", className = "test1034.MainTest", methodName = "main", fileName = "test1034.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"", className = "test1034.MainTest", methodName = "main", fileName = "test1034.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i"", className = "test1034.MainTest", methodName = "main", fileName = "test1034.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test1035.kt:12)

User code:
```kotlin
package test1035
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1035
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"", className = "test1035.MainTest", methodName = "main", fileName = "test1035.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"", className = "test1035.MainTest", methodName = "main", fileName = "test1035.kt", lineNumber = 13)
    logger.at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"", className = "test1035.MainTest", methodName = "main", fileName = "test1035.kt", lineNumber = 12)
at(Level.INFO, marker) { message = "info eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info eventBuilder $i ${helper()}"", className = "test1035.MainTest", methodName = "main", fileName = "test1035.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
