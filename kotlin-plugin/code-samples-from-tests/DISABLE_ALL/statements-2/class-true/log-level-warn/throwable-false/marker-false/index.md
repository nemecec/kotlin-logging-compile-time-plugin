## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn() { "warn messageBuilder" } at MainTest.main(test1126.kt:12)

User code:
```kotlin
package test1126
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.warn() { "warn messageBuilder" }
    logger.warn() { "warn messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test1126
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.warn() { "warn messageBuilder" }
    logger.warn() { "warn messageBuilder" }
  }
  
}


```

###  warn() { "warn messageBuilder $i" } at MainTest.main(test1127.kt:12)

User code:
```kotlin
package test1127
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.warn() { "warn messageBuilder $i" }
    logger.warn() { "warn messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test1127
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.warn() { "warn messageBuilder $i" }
    logger.warn() { "warn messageBuilder $i" }
  }
  
}


```

###  warn() { "warn messageBuilder $i ${helper()}" } at MainTest.main(test1128.kt:12)

User code:
```kotlin
package test1128
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.warn() { "warn messageBuilder $i ${helper()}" }
    logger.warn() { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test1128
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.warn() { "warn messageBuilder $i ${helper()}" }
    logger.warn() { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  warn(messageLambda) at MainTest.main(test1129.kt:12)

User code:
```kotlin
package test1129
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(messageLambda)
    logger.warn(messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test1129
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(messageLambda)
    logger.warn(messageLambda)
  }
  
}


```

###  atWarn() { message="warn eventBuilder"; cause=null } at MainTest.main(test1130.kt:12)

User code:
```kotlin
package test1130
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atWarn() { message="warn eventBuilder"; cause=null }
    logger.atWarn() { message="warn eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test1130
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atWarn() { message="warn eventBuilder"; cause=null }
    logger.atWarn() { message="warn eventBuilder"; cause=null }
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i"; cause=null } at MainTest.main(test1131.kt:12)

User code:
```kotlin
package test1131
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i"; cause=null }
    logger.atWarn() { message="warn eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test1131
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i"; cause=null }
    logger.atWarn() { message="warn eventBuilder $i"; cause=null }
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test1132.kt:12)

User code:
```kotlin
package test1132
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test1132
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.WARN) { message="warn eventBuilder"; cause=null } at MainTest.main(test1133.kt:12)

User code:
```kotlin
package test1133
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test1133
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=null }
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=null } at MainTest.main(test1134.kt:12)

User code:
```kotlin
package test1134
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test1134
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=null }
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test1135.kt:12)

User code:
```kotlin
package test1135
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test1135
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
