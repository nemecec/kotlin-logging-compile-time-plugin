## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=false / with marker=true



###  info(marker) { "info messageBuilder" } at MainTest.main(test516.kt:12)

User code:
```kotlin
package test516
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.info(marker) { "info messageBuilder" }
    logger.info(marker) { "info messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test516
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.info(marker) { "info messageBuilder" }
    logger.info(marker) { "info messageBuilder" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker) { "info messageBuilder $i" } at MainTest.main(test517.kt:12)

User code:
```kotlin
package test517
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.info(marker) { "info messageBuilder $i" }
    logger.info(marker) { "info messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test517
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.info(marker) { "info messageBuilder $i" }
    logger.info(marker) { "info messageBuilder $i" }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker) { "info messageBuilder $i ${helper()}" } at MainTest.main(test518.kt:12)

User code:
```kotlin
package test518
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.info(marker) { "info messageBuilder $i ${helper()}" }
    logger.info(marker) { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test518
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.info(marker) { "info messageBuilder $i ${helper()}" }
    logger.info(marker) { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  info(marker, messageLambda) at MainTest.main(test519.kt:12)

User code:
```kotlin
package test519
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.info(marker, messageLambda)
    logger.info(marker, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test519
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.info(marker, messageLambda)
    logger.info(marker, messageLambda)
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder"; cause=null } at MainTest.main(test520.kt:12)

User code:
```kotlin
package test520
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.atInfo(marker) { message="info eventBuilder"; cause=null }
    logger.atInfo(marker) { message="info eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test520
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.atInfo(marker) { message="info eventBuilder"; cause=null }
    logger.atInfo(marker) { message="info eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i"; cause=null } at MainTest.main(test521.kt:12)

User code:
```kotlin
package test521
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
    logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test521
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
    logger.atInfo(marker) { message="info eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test522.kt:12)

User code:
```kotlin
package test522
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test522
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.atInfo(marker) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder"; cause=null } at MainTest.main(test523.kt:12)

User code:
```kotlin
package test523
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
    logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test523
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    
    logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
    logger.at(Level.INFO, marker) { message="info eventBuilder"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null } at MainTest.main(test524.kt:12)

User code:
```kotlin
package test524
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
    logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test524
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
    logger.at(Level.INFO, marker) { message="info eventBuilder $i"; cause=null }
  }
  
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```

###  at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test525.kt:12)

User code:
```kotlin
package test525
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
  
Remains as-is:
```kotlin
package test525
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    val marker = MyMarker("markerName")
    
    val i = 42
    logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.INFO, marker) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}
class MyMarker(private val name: String): Marker { override fun getName() = name }

```
