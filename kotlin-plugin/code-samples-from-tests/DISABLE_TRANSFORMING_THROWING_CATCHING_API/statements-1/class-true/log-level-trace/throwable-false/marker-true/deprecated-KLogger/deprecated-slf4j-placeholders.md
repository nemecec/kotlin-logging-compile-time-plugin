## featureFlag=DISABLE_TRANSFORMING_THROWING_CATCHING_API / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace(marker, "trace message {}", arg) at MainTest.main(test46.kt:12)

User code:
```kotlin
package test46
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.trace(marker, "trace message {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test46
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.TRACE, marker) { message = "trace message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}"", className = "test46.MainTest", methodName = "main", fileName = "test46.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message with concatenation $arg {}", arg) at MainTest.main(test47.kt:12)

User code:
```kotlin
package test47
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.trace(marker, "trace message with concatenation $arg {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test47
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.TRACE, marker) { message = "trace message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message with concatenation $arg {}"", className = "test47.MainTest", methodName = "main", fileName = "test47.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace with extension function {} interval", arg.minutes) at MainTest.main(test48.kt:12)

User code:
```kotlin
package test48
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.trace(marker, "trace with extension function {} interval", arg.minutes)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test48
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.TRACE, marker) { message = "trace with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace with extension function {} interval"", className = "test48.MainTest", methodName = "main", fileName = "test48.kt", lineNumber = 12)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test49.kt:12)

User code:
```kotlin
package test49
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test49
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.TRACE, marker) { message = "trace message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {} " + "" + "{}" + "{}" + " abc" + " {}"", className = "test49.MainTest", methodName = "main", fileName = "test49.kt", lineNumber = 12)
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test50.kt:12)

User code:
```kotlin
package test50
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test50
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.at(Level.TRACE, marker) { message = "trace message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""trace message {}a" + " {}b" + " {}ab" + " ab"", className = "test50.MainTest", methodName = "main", fileName = "test50.kt", lineNumber = 12)
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
