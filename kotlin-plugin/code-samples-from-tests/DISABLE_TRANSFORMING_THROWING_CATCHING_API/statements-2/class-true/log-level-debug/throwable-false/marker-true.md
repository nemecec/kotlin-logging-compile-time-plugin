## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=true



###  debug(marker) { "debug messageBuilder" } at MainTest.main(test476.kt:12)

User code:
```kotlin
package test476
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
package test476
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test476.MainTest", methodName = "main", fileName = "test476.kt", lineNumber = 12)
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder\"", className = "test476.MainTest", methodName = "main", fileName = "test476.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker) { "debug messageBuilder $i" } at MainTest.main(test477.kt:12)

User code:
```kotlin
package test477
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
package test477
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test477.MainTest", methodName = "main", fileName = "test477.kt", lineNumber = 12)
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i\"", className = "test477.MainTest", methodName = "main", fileName = "test477.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker) { "debug messageBuilder $i ${helper()}" } at MainTest.main(test478.kt:12)

User code:
```kotlin
package test478
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
package test478
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test478.MainTest", methodName = "main", fileName = "test478.kt", lineNumber = 12)
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug messageBuilder $i ${helper()}\"", className = "test478.MainTest", methodName = "main", fileName = "test478.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, messageLambda) at MainTest.main(test479.kt:12)

User code:
```kotlin
package test479
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(marker, messageLambda)
    logger.debug(marker, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test479
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test479.MainTest", methodName = "main", fileName = "test479.kt", lineNumber = 12)
    logger.at(Level.DEBUG, marker) { message = "debug messageBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda", className = "test479.MainTest", methodName = "main", fileName = "test479.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder"; cause=null } at MainTest.main(test480.kt:12)

User code:
```kotlin
package test480
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
package test480
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test480.MainTest", methodName = "main", fileName = "test480.kt", lineNumber = 12)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test480.MainTest", methodName = "main", fileName = "test480.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i"; cause=null } at MainTest.main(test481.kt:12)

User code:
```kotlin
package test481
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
package test481
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test481.MainTest", methodName = "main", fileName = "test481.kt", lineNumber = 12)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test481.MainTest", methodName = "main", fileName = "test481.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test482.kt:12)

User code:
```kotlin
package test482
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
package test482
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test482.MainTest", methodName = "main", fileName = "test482.kt", lineNumber = 12)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test482.MainTest", methodName = "main", fileName = "test482.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=null } at MainTest.main(test483.kt:12)

User code:
```kotlin
package test483
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
package test483
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test483.MainTest", methodName = "main", fileName = "test483.kt", lineNumber = 12)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder\"", className = "test483.MainTest", methodName = "main", fileName = "test483.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=null } at MainTest.main(test484.kt:12)

User code:
```kotlin
package test484
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
package test484
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test484.MainTest", methodName = "main", fileName = "test484.kt", lineNumber = 12)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i\"", className = "test484.MainTest", methodName = "main", fileName = "test484.kt", lineNumber = 13)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test485.kt:12)

User code:
```kotlin
package test485
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
package test485
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test485.MainTest", methodName = "main", fileName = "test485.kt", lineNumber = 12)
    logger.at(Level.DEBUG, marker) { message = "debug eventBuilder 42 Hello!"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"debug eventBuilder $i ${helper()}\"", className = "test485.MainTest", methodName = "main", fileName = "test485.kt", lineNumber = 13)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
