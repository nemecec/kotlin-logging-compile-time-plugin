## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  debug(marker, "debug message {}", arg) at MainTest.main(test936.kt:12)

User code:
```kotlin
package test936
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.debug(marker, "debug message {}", arg)
    logger.debug(marker, "debug message {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test936
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.DEBUG, marker) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"")
at(Level.DEBUG, marker) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"")
    logger.at(Level.DEBUG, marker) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"")
at(Level.DEBUG, marker) { message = "debug message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message with concatenation $arg {}", arg) at MainTest.main(test937.kt:12)

User code:
```kotlin
package test937
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.debug(marker, "debug message with concatenation $arg {}", arg)
    logger.debug(marker, "debug message with concatenation $arg {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test937
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"")
at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"")
    logger.at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"")
at(Level.DEBUG, marker) { message = "debug message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message with concatenation $arg {}"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug with extension function {} interval", arg.minutes) at MainTest.main(test938.kt:12)

User code:
```kotlin
package test938
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.debug(marker, "debug with extension function {} interval", arg.minutes)
    logger.debug(marker, "debug with extension function {} interval", arg.minutes)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test938
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"")
at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"")
    logger.at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"")
at(Level.DEBUG, marker) { message = "debug with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug with extension function {} interval"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test939.kt:12)

User code:
```kotlin
package test939
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
    logger.debug(marker, "debug message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test939
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.DEBUG, marker) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"")
at(Level.DEBUG, marker) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"")
    logger.at(Level.DEBUG, marker) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"")
at(Level.DEBUG, marker) { message = "debug message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {} " + "" + "{}" + "{}" + " abc" + " {}"")
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test940.kt:12)

User code:
```kotlin
package test940
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
    logger.debug(marker, "debug message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test940
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"")
at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"")
    logger.at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"")
at(Level.DEBUG, marker) { message = "debug message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""debug message {}a" + " {}b" + " {}ab" + " ab"")
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
