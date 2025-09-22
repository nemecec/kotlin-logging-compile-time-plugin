## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn() { "warn messageBuilder" } at MainTest.main(test316.kt:12)

User code:
```kotlin
package test316
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.warn() { "warn messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test316
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.warn() { "warn messageBuilder" }
  }
  
}


```

###  warn() { "warn messageBuilder $i" } at MainTest.main(test317.kt:12)

User code:
```kotlin
package test317
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.warn() { "warn messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test317
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.warn() { "warn messageBuilder $i" }
  }
  
}


```

###  warn() { "warn messageBuilder $i ${helper()}" } at MainTest.main(test318.kt:12)

User code:
```kotlin
package test318
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.warn() { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test318
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.warn() { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  warn(messageLambda) at MainTest.main(test319.kt:12)

User code:
```kotlin
package test319
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test319
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(messageLambda)
  }
  
}


```

###  atWarn() { message="warn eventBuilder"; cause=null } at MainTest.main(test320.kt:12)

User code:
```kotlin
package test320
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atWarn() { message="warn eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test320
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atWarn() { message="warn eventBuilder"; cause=null }
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i"; cause=null } at MainTest.main(test321.kt:12)

User code:
```kotlin
package test321
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test321
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i"; cause=null }
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test322.kt:12)

User code:
```kotlin
package test322
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test322
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.WARN) { message="warn eventBuilder"; cause=null } at MainTest.main(test323.kt:12)

User code:
```kotlin
package test323
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test323
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=null } at MainTest.main(test324.kt:12)

User code:
```kotlin
package test324
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test324
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test325.kt:12)

User code:
```kotlin
package test325
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test325
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
