## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=true



###  trace(marker, throwable) { "trace messageBuilder" } at MainTest.main(test6.kt:12)

User code:
```kotlin
package test6
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.trace(marker, throwable) { "trace messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test6
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder\"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable) { "trace messageBuilder $i" } at MainTest.main(test7.kt:12)

User code:
```kotlin
package test7
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(marker, throwable) { "trace messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test7
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i\"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable) { "trace messageBuilder $i ${helper()}" } at MainTest.main(test8.kt:12)

User code:
```kotlin
package test8
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(marker, throwable) { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test8
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace messageBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, throwable, messageLambda) at MainTest.main(test9.kt:12)

User code:
```kotlin
package test9
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.trace(marker, throwable, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test9
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.at(Level.TRACE, marker) { message = "trace messageBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "messageLambda")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder"; cause=throwable } at MainTest.main(test10.kt:12)

User code:
```kotlin
package test10
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.atTrace(marker) { message="trace eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test10
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test11.kt:12)

User code:
```kotlin
package test11
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace(marker) { message="trace eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test11
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test12.kt:12)

User code:
```kotlin
package test12
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace(marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test12
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder"; cause=throwable } at MainTest.main(test13.kt:12)

User code:
```kotlin
package test13
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE, marker) { message="trace eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test13
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder\"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test14.kt:12)

User code:
```kotlin
package test14
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message="trace eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test14
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i\"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test15.kt:12)

User code:
```kotlin
package test15
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test15
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE, marker) { message = "trace eventBuilder 42 Hello!"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "\"trace eventBuilder $i ${helper()}\"")
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
