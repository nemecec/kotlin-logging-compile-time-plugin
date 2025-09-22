## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=DEBUG / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  debug(throwable) { "debug messageBuilder" } at MainTest.main(test116.kt:12)

User code:
```kotlin
package test116
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug(throwable) { "debug messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test116
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.debug(throwable) { "debug messageBuilder" }
  }
  
}


```

###  debug(throwable) { "debug messageBuilder $i" } at MainTest.main(test117.kt:12)

User code:
```kotlin
package test117
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test117
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i" }
  }
  
}


```

###  debug(throwable) { "debug messageBuilder $i ${helper()}" } at MainTest.main(test118.kt:12)

User code:
```kotlin
package test118
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test118
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.debug(throwable) { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  debug(throwable, messageLambda) at MainTest.main(test119.kt:12)

User code:
```kotlin
package test119
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(throwable, messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test119
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(throwable, messageLambda)
  }
  
}


```

###  atDebug() { message="debug eventBuilder"; cause=throwable } at MainTest.main(test120.kt:12)

User code:
```kotlin
package test120
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atDebug() { message="debug eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test120
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atDebug() { message="debug eventBuilder"; cause=throwable }
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test121.kt:12)

User code:
```kotlin
package test121
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test121
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test122.kt:12)

User code:
```kotlin
package test122
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test122
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable } at MainTest.main(test123.kt:12)

User code:
```kotlin
package test123
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test123
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=throwable }
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable } at MainTest.main(test124.kt:12)

User code:
```kotlin
package test124
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test124
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=throwable }
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test125.kt:12)

User code:
```kotlin
package test125
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test125
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
