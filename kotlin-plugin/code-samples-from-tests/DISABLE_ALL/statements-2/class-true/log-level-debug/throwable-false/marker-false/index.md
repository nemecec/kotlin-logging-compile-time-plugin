## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=DEBUG / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  debug() { "debug messageBuilder" } at MainTest.main(test966.kt:12)

User code:
```kotlin
package test966
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug() { "debug messageBuilder" }
    logger.debug() { "debug messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test966
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.debug() { "debug messageBuilder" }
    logger.debug() { "debug messageBuilder" }
  }
  
}


```

###  debug() { "debug messageBuilder $i" } at MainTest.main(test967.kt:12)

User code:
```kotlin
package test967
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i" }
    logger.debug() { "debug messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test967
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i" }
    logger.debug() { "debug messageBuilder $i" }
  }
  
}


```

###  debug() { "debug messageBuilder $i ${helper()}" } at MainTest.main(test968.kt:12)

User code:
```kotlin
package test968
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i ${helper()}" }
    logger.debug() { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test968
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.debug() { "debug messageBuilder $i ${helper()}" }
    logger.debug() { "debug messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  debug(messageLambda) at MainTest.main(test969.kt:12)

User code:
```kotlin
package test969
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(messageLambda)
    logger.debug(messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test969
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "debug messageBuilder" }
    logger.debug(messageLambda)
    logger.debug(messageLambda)
  }
  
}


```

###  atDebug() { message="debug eventBuilder"; cause=null } at MainTest.main(test970.kt:12)

User code:
```kotlin
package test970
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atDebug() { message="debug eventBuilder"; cause=null }
    logger.atDebug() { message="debug eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test970
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atDebug() { message="debug eventBuilder"; cause=null }
    logger.atDebug() { message="debug eventBuilder"; cause=null }
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i"; cause=null } at MainTest.main(test971.kt:12)

User code:
```kotlin
package test971
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=null }
    logger.atDebug() { message="debug eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test971
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i"; cause=null }
    logger.atDebug() { message="debug eventBuilder $i"; cause=null }
  }
  
}


```

###  atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test972.kt:12)

User code:
```kotlin
package test972
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test972
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
    logger.atDebug() { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.DEBUG) { message="debug eventBuilder"; cause=null } at MainTest.main(test973.kt:12)

User code:
```kotlin
package test973
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test973
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
    logger.at(Level.DEBUG) { message="debug eventBuilder"; cause=null }
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null } at MainTest.main(test974.kt:12)

User code:
```kotlin
package test974
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test974
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i"; cause=null }
  }
  
}


```

###  at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test975.kt:12)

User code:
```kotlin
package test975
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test975
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.DEBUG) { message="debug eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
