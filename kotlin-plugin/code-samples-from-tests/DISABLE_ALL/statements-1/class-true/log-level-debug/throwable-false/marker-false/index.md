## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  debug() { "debug messageBuilder" } at MainTest.main(test156.kt:12)

User code:
```kotlin
package test156
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
package test156
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug() { "debug messageBuilder" }
  }
  
}


```

###  debug() { "debug messageBuilder $i" } at MainTest.main(test157.kt:12)

User code:
```kotlin
package test157
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
package test157
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i" }
  }
  
}


```

###  debug() { "debug messageBuilder $i ${helper()}" } at MainTest.main(test158.kt:12)

User code:
```kotlin
package test158
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
package test158
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

###  debug(messageLambda) at MainTest.main(test159.kt:12)

User code:
```kotlin
package test159
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
package test159
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(messageLambda)
  }
  
}


```

###  atDebug() { message="debug eventBuilder"; cause=null } at MainTest.main(test160.kt:12)

User code:
```kotlin
package test160
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
package test160
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atDebug() { message="debug eventBuilder"; cause=null }
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i"; cause=null } at MainTest.main(test161.kt:12)

User code:
```kotlin
package test161
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
package test161
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=null }
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test162.kt:12)

User code:
```kotlin
package test162
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
package test162
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

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=null } at MainTest.main(test163.kt:12)

User code:
```kotlin
package test163
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
package test163
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null } at MainTest.main(test164.kt:12)

User code:
```kotlin
package test164
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
package test164
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test165.kt:12)

User code:
```kotlin
package test165
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
package test165
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
