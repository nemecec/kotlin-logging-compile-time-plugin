## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=true

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn(throwable, marker) { "warn messageBuilder" } at MainTest.main(test1066.kt:12)

User code:
```kotlin
package test1066
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.warn(throwable, marker) { "warn messageBuilder" }
    logger.warn(throwable, marker) { "warn messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1066
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.warn(throwable, marker) { "warn messageBuilder" }
warn(throwable, marker) { "warn messageBuilder" }
    logger.warn(throwable, marker) { "warn messageBuilder" }
warn(throwable, marker) { "warn messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(throwable, marker) { "warn messageBuilder $i" } at MainTest.main(test1067.kt:12)

User code:
```kotlin
package test1067
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable, marker) { "warn messageBuilder $i" }
    logger.warn(throwable, marker) { "warn messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1067
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable, marker) { "warn messageBuilder $i" }
warn(throwable, marker) { "warn messageBuilder $i" }
    logger.warn(throwable, marker) { "warn messageBuilder $i" }
warn(throwable, marker) { "warn messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(throwable, marker) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test1068.kt:12)

User code:
```kotlin
package test1068
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable, marker) { "warn messageBuilder $i ${helper()}" }
    logger.warn(throwable, marker) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1068
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable, marker) { "warn messageBuilder $i ${helper()}" }
warn(throwable, marker) { "warn messageBuilder $i ${helper()}" }
    logger.warn(throwable, marker) { "warn messageBuilder $i ${helper()}" }
warn(throwable, marker) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  warn(throwable, marker, messageLambda) at MainTest.main(test1069.kt:12)

User code:
```kotlin
package test1069
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(throwable, marker, messageLambda)
    logger.warn(throwable, marker, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1069
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(throwable, marker, messageLambda)
warn(throwable, marker, messageLambda)
    logger.warn(throwable, marker, messageLambda)
warn(throwable, marker, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder"; cause=throwable } at MainTest.main(test1070.kt:12)

User code:
```kotlin
package test1070
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.atWarn(marker) { message="warn eventBuilder"; cause=throwable }
    logger.atWarn(marker) { message="warn eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1070
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.atWarn(marker) { message="warn eventBuilder"; cause=throwable }
atWarn(marker) { message="warn eventBuilder"; cause=throwable }
    logger.atWarn(marker) { message="warn eventBuilder"; cause=throwable }
atWarn(marker) { message="warn eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test1071.kt:12)

User code:
```kotlin
package test1071
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn(marker) { message="warn eventBuilder $i"; cause=throwable }
    logger.atWarn(marker) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1071
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn(marker) { message="warn eventBuilder $i"; cause=throwable }
atWarn(marker) { message="warn eventBuilder $i"; cause=throwable }
    logger.atWarn(marker) { message="warn eventBuilder $i"; cause=throwable }
atWarn(marker) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test1072.kt:12)

User code:
```kotlin
package test1072
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1072
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
atWarn(marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable } at MainTest.main(test1073.kt:12)

User code:
```kotlin
package test1073
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable }
    logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1073
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable }
at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable }
    logger.at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable }
at(Level.WARN, marker) { message="warn eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test1074.kt:12)

User code:
```kotlin
package test1074
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable }
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1074
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable }
at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable }
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable }
at(Level.WARN, marker) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test1075.kt:12)

User code:
```kotlin
package test1075
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Transformed into:
```kotlin
package test1075
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
at(Level.WARN, marker) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
