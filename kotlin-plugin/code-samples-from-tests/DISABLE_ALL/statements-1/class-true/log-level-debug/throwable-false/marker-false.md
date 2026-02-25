## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=false



###  debug() { "debug messageBuilder" } at MainTest.main(test76.kt:12)

User code:
```kotlin
package test76
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug() { "debug messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test76
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug() { "debug messageBuilder" }
  }
  
}


```

###  debug() { "debug messageBuilder $i" } at MainTest.main(test77.kt:12)

User code:
```kotlin
package test77
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test77
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i" }
  }
  
}


```

###  debug() { "debug messageBuilder $i ${helper()}" } at MainTest.main(test78.kt:12)

User code:
```kotlin
package test78
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test78
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  debug(messageLambda) at MainTest.main(test79.kt:12)

User code:
```kotlin
package test79
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test79
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(messageLambda)
  }
  
}


```

###  atDebug() { message="debug eventBuilder"; cause=null } at MainTest.main(test80.kt:12)

User code:
```kotlin
package test80
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atDebug() { message="debug eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test80
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atDebug() { message="debug eventBuilder"; cause=null }
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i"; cause=null } at MainTest.main(test81.kt:12)

User code:
```kotlin
package test81
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test81
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=null }
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test82.kt:12)

User code:
```kotlin
package test82
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test82
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=null } at MainTest.main(test83.kt:12)

User code:
```kotlin
package test83
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test83
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null } at MainTest.main(test84.kt:12)

User code:
```kotlin
package test84
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test84
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test85.kt:12)

User code:
```kotlin
package test85
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test85
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
