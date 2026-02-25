## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=true / with marker=false



###  debug(throwable) { "debug messageBuilder" } at MainTest.main(test466.kt:12)

User code:
```kotlin
package test466
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug(throwable) { "debug messageBuilder" }
    logger.debug(throwable) { "debug messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test466
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug(throwable) { "debug messageBuilder" }
    logger.debug(throwable) { "debug messageBuilder" }
  }
  
}


```

###  debug(throwable) { "debug messageBuilder $i" } at MainTest.main(test467.kt:12)

User code:
```kotlin
package test467
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i" }
    logger.debug(throwable) { "debug messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test467
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i" }
    logger.debug(throwable) { "debug messageBuilder $i" }
  }
  
}


```

###  debug(throwable) { "debug messageBuilder $i ${helper()}" } at MainTest.main(test468.kt:12)

User code:
```kotlin
package test468
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
    logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test468
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
    logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  debug(throwable, messageLambda) at MainTest.main(test469.kt:12)

User code:
```kotlin
package test469
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(throwable, messageLambda)
    logger.debug(throwable, messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test469
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(throwable, messageLambda)
    logger.debug(throwable, messageLambda)
  }
  
}


```

###  atDebug() { message="debug eventBuilder"; cause=throwable } at MainTest.main(test470.kt:12)

User code:
```kotlin
package test470
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atDebug() { message="debug eventBuilder"; cause=throwable }
    logger.atDebug() { message="debug eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test470
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atDebug() { message="debug eventBuilder"; cause=throwable }
    logger.atDebug() { message="debug eventBuilder"; cause=throwable }
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test471.kt:12)

User code:
```kotlin
package test471
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
    logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test471
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
    logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test472.kt:12)

User code:
```kotlin
package test472
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test472
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable } at MainTest.main(test473.kt:12)

User code:
```kotlin
package test473
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test473
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test474.kt:12)

User code:
```kotlin
package test474
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test474
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test475.kt:12)

User code:
```kotlin
package test475
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test475
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
