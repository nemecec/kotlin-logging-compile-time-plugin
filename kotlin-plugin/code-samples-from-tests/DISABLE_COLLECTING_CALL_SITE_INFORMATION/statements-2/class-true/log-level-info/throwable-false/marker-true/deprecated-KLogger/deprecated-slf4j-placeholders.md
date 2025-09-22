## featureFlag=DISABLE_COLLECTING_CALL_SITE_INFORMATION / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=false / with marker=true / deprecated KLogger API / deprecated API with SLF4J placeholders



###  info(marker, "info message {}", arg) at MainTest.main(test1016.kt:12)

User code:
```kotlin
package test1016
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.info(marker, "info message {}", arg)
    logger.info(marker, "info message {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1016
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.INFO, marker) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"")
at(Level.INFO, marker) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"")
    logger.at(Level.INFO, marker) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"")
at(Level.INFO, marker) { message = "info message 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message with concatenation $arg {}", arg) at MainTest.main(test1017.kt:12)

User code:
```kotlin
package test1017
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.info(marker, "info message with concatenation $arg {}", arg)
    logger.info(marker, "info message with concatenation $arg {}", arg)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1017
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.INFO, marker) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"")
at(Level.INFO, marker) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"")
    logger.at(Level.INFO, marker) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"")
at(Level.INFO, marker) { message = "info message with concatenation 42 42"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message with concatenation $arg {}"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info with extension function {} interval", arg.minutes) at MainTest.main(test1018.kt:12)

User code:
```kotlin
package test1018
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.info(marker, "info with extension function {} interval", arg.minutes)
    logger.info(marker, "info with extension function {} interval", arg.minutes)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1018
import io.github.oshai.kotlinlogging.*
import kotlin.time.Duration.Companion.minutes

public class MainTest {
private val logger = KotlinLogging.logger {}
private var arg: Long = 42
  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.INFO, marker) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"")
at(Level.INFO, marker) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"")
    logger.at(Level.INFO, marker) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"")
at(Level.INFO, marker) { message = "info with extension function 42m interval"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info with extension function {} interval"")
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper()) at MainTest.main(test1019.kt:12)

User code:
```kotlin
package test1019
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
    logger.info(marker, "info message {} " + "" + "{}" + "{}" + " abc" + " {}", arg, helper())
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1019
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val arg = 42
    logger.at(Level.INFO, marker) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"")
at(Level.INFO, marker) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"")
    logger.at(Level.INFO, marker) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"")
at(Level.INFO, marker) { message = "info message 42 Hello!{} abc {}"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {} " + "" + "{}" + "{}" + " abc" + " {}"")
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab()) at MainTest.main(test1020.kt:12)

User code:
```kotlin
package test1020
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
    logger.info(marker, "info message {}a" + " {}b" + " {}ab" + " ab", a, b, ab())
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1020
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val a = 1; val b = 2
    logger.at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"")
at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"")
    logger.at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"")
at(Level.INFO, marker) { message = "info message 1a 2b 12ab ab"; internalCompilerData = KLoggingEventBuilder.InternalCompilerData(messageTemplate = ""info message {}a" + " {}b" + " {}ab" + " ab"")
  }
  fun ab() = 12
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
