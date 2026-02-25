## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=true / with marker=true



###  debug(marker, throwable) { "debug messageBuilder" } at MainTest.main(test456.kt:12)

User code:
```kotlin
package test456
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.debug(marker, throwable) { "debug messageBuilder" }
    logger.debug(marker, throwable) { "debug messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test456
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.debug(marker, throwable) { "debug messageBuilder" }
    logger.debug(marker, throwable) { "debug messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, throwable) { "debug messageBuilder $i" } at MainTest.main(test457.kt:12)

User code:
```kotlin
package test457
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(marker, throwable) { "debug messageBuilder $i" }
    logger.debug(marker, throwable) { "debug messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test457
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(marker, throwable) { "debug messageBuilder $i" }
    logger.debug(marker, throwable) { "debug messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, throwable) { "debug messageBuilder $i ${helper()}" } at MainTest.main(test458.kt:12)

User code:
```kotlin
package test458
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
    logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test458
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
    logger.debug(marker, throwable) { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  debug(marker, throwable, messageLambda) at MainTest.main(test459.kt:12)

User code:
```kotlin
package test459
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(marker, throwable, messageLambda)
    logger.debug(marker, throwable, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test459
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(marker, throwable, messageLambda)
    logger.debug(marker, throwable, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder"; cause=throwable } at MainTest.main(test460.kt:12)

User code:
```kotlin
package test460
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.atDebug(marker) { message="debug eventBuilder"; cause=throwable }
    logger.atDebug(marker) { message="debug eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test460
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.atDebug(marker) { message="debug eventBuilder"; cause=throwable }
    logger.atDebug(marker) { message="debug eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test461.kt:12)

User code:
```kotlin
package test461
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
    logger.atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test461
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
    logger.atDebug(marker) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test462.kt:12)

User code:
```kotlin
package test462
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
    logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test462
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
    logger.atDebug(marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable } at MainTest.main(test463.kt:12)

User code:
```kotlin
package test463
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test463
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test464.kt:12)

User code:
```kotlin
package test464
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test464
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test465.kt:12)

User code:
```kotlin
package test465
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test465
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.DEBUG, marker) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
