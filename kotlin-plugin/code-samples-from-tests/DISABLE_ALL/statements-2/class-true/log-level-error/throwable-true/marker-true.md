## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=true / with marker=true



###  error(marker, throwable) { "error messageBuilder" } at MainTest.main(test576.kt:12)

User code:
```kotlin
package test576
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.error(marker, throwable) { "error messageBuilder" }
    logger.error(marker, throwable) { "error messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test576
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.error(marker, throwable) { "error messageBuilder" }
    logger.error(marker, throwable) { "error messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, throwable) { "error messageBuilder $i" } at MainTest.main(test577.kt:12)

User code:
```kotlin
package test577
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.error(marker, throwable) { "error messageBuilder $i" }
    logger.error(marker, throwable) { "error messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test577
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.error(marker, throwable) { "error messageBuilder $i" }
    logger.error(marker, throwable) { "error messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, throwable) { "error messageBuilder $i ${helper()}" } at MainTest.main(test578.kt:12)

User code:
```kotlin
package test578
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.error(marker, throwable) { "error messageBuilder $i ${helper()}" }
    logger.error(marker, throwable) { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test578
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.error(marker, throwable) { "error messageBuilder $i ${helper()}" }
    logger.error(marker, throwable) { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  error(marker, throwable, messageLambda) at MainTest.main(test579.kt:12)

User code:
```kotlin
package test579
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(marker, throwable, messageLambda)
    logger.error(marker, throwable, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test579
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(marker, throwable, messageLambda)
    logger.error(marker, throwable, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder"; cause=throwable } at MainTest.main(test580.kt:12)

User code:
```kotlin
package test580
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.atError(marker) { message="error eventBuilder"; cause=throwable }
    logger.atError(marker) { message="error eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test580
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.atError(marker) { message="error eventBuilder"; cause=throwable }
    logger.atError(marker) { message="error eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i"; cause=throwable } at MainTest.main(test581.kt:12)

User code:
```kotlin
package test581
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atError(marker) { message="error eventBuilder $i"; cause=throwable }
    logger.atError(marker) { message="error eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test581
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atError(marker) { message="error eventBuilder $i"; cause=throwable }
    logger.atError(marker) { message="error eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atError(marker) { message="error eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test582.kt:12)

User code:
```kotlin
package test582
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atError(marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
    logger.atError(marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test582
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.atError(marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
    logger.atError(marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder"; cause=throwable } at MainTest.main(test583.kt:12)

User code:
```kotlin
package test583
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR, marker) { message="error eventBuilder"; cause=throwable }
    logger.at(Level.ERROR, marker) { message="error eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test583
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR, marker) { message="error eventBuilder"; cause=throwable }
    logger.at(Level.ERROR, marker) { message="error eventBuilder"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=throwable } at MainTest.main(test584.kt:12)

User code:
```kotlin
package test584
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=throwable }
    logger.at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test584
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=throwable }
    logger.at(Level.ERROR, marker) { message="error eventBuilder $i"; cause=throwable }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test585.kt:12)

User code:
```kotlin
package test585
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test585
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.ERROR, marker) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
