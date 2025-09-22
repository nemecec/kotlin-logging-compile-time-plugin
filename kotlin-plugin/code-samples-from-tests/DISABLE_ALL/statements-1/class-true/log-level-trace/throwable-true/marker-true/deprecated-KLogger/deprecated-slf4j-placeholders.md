## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  trace(marker, "trace message {}", arg, throwable) at MainTest.main(test6.kt:12)

User code:
```kotlin
package test6
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.trace(marker, "trace message {}", arg, throwable)
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
    val arg = 42
    logger.at(Level.TRACE, marker) { message = "trace message 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "trace message {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message with concatenation $arg {}", arg, throwable) at MainTest.main(test7.kt:12)

User code:
```kotlin
package test7
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.trace(marker, "trace message with concatenation $arg {}", arg, throwable)
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
    val arg = 42
    logger.at(Level.TRACE, marker) { message = "trace message with concatenation 42 42"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "trace message with concatenation 42 {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace with extension function {} interval", arg.minutes, throwable) at MainTest.main(test8.kt:12)

User code:
```kotlin
package test8
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.trace(marker, "trace with extension function {} interval", arg.minutes, throwable)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test8
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE, marker) { message = "trace with extension function 42m interval"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "trace with extension function {} interval")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable) at MainTest.main(test9.kt:12)

User code:
```kotlin
package test9
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val arg = 42
    logger.trace(marker, "trace message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper(), throwable)
  }
  fun helper() = "Hello!"
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
    val arg = 42
    logger.at(Level.TRACE, marker) { message = "trace message 42 Hello!{} abc {}"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "trace message {} {}{} abc {}")
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable) at MainTest.main(test10.kt:12)

User code:
```kotlin
package test10
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val a = 1; val b = 2
    logger.trace(marker, "trace message {}a" + " {}b" + " {}ab" + " ab", a, b, ab(), throwable)
  }
  fun ab() = 12
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
    val a = 1; val b = 2
    logger.at(Level.TRACE, marker) { message = "trace message 1a 2b 12ab ab"; cause = throwable; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "trace message {}a {}b {}ab ab")
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
