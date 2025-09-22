## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  error(marker, "error message {}", arg) at MainTest.main(test1176.kt:12)

User code:
```kotlin
package test1176
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.error(marker, "error message {}", arg)
    logger.error(marker, "error message {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1176
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.ERROR, marker) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}")
at(Level.ERROR, marker) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}")
    logger.at(Level.ERROR, marker) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}")
at(Level.ERROR, marker) { message = "error message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message with concatenation $arg {}", arg) at MainTest.main(test1177.kt:12)

User code:
```kotlin
package test1177
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.error(marker, "error message with concatenation $arg {}", arg)
    logger.error(marker, "error message with concatenation $arg {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1177
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.ERROR, marker) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message with concatenation 42 {}")
at(Level.ERROR, marker) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message with concatenation 42 {}")
    logger.at(Level.ERROR, marker) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message with concatenation 42 {}")
at(Level.ERROR, marker) { message = "error message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message with concatenation 42 {}")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error with extension function {} interval", arg.minutes) at MainTest.main(test1178.kt:12)

User code:
```kotlin
package test1178
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.error(marker, "error with extension function {} interval", arg.minutes)
    logger.error(marker, "error with extension function {} interval", arg.minutes)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1178
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.ERROR, marker) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error with extension function {} interval")
at(Level.ERROR, marker) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error with extension function {} interval")
    logger.at(Level.ERROR, marker) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error with extension function {} interval")
at(Level.ERROR, marker) { message = "error with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error with extension function {} interval")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test1179.kt:12)

User code:
```kotlin
package test1179
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.error(marker, "error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
    logger.error(marker, "error message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1179
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.ERROR, marker) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {} {}{} abc {}")
at(Level.ERROR, marker) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {} {}{} abc {}")
    logger.at(Level.ERROR, marker) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {} {}{} abc {}")
at(Level.ERROR, marker) { message = "error message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {} {}{} abc {}")
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, "error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test1180.kt:12)

User code:
```kotlin
package test1180
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.error(marker, "error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
    logger.error(marker, "error message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1180
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.at(Level.ERROR, marker) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}a {}b {}ab ab")
at(Level.ERROR, marker) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}a {}b {}ab ab")
    logger.at(Level.ERROR, marker) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}a {}b {}ab ab")
at(Level.ERROR, marker) { message = "error message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = "error message {}a {}b {}ab ab")
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
