## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=INFO / with throwable=false / with marker=false



###  info() { "info messageBuilder" } at MainTest.main(test526.kt:12)

User code:
```kotlin
package test526
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.info() { "info messageBuilder" }
    logger.info() { "info messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test526
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.info() { "info messageBuilder" }
    logger.info() { "info messageBuilder" }
  }
  
}


```

###  info() { "info messageBuilder $i" } at MainTest.main(test527.kt:12)

User code:
```kotlin
package test527
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.info() { "info messageBuilder $i" }
    logger.info() { "info messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test527
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.info() { "info messageBuilder $i" }
    logger.info() { "info messageBuilder $i" }
  }
  
}


```

###  info() { "info messageBuilder $i ${helper()}" } at MainTest.main(test528.kt:12)

User code:
```kotlin
package test528
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.info() { "info messageBuilder $i ${helper()}" }
    logger.info() { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test528
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.info() { "info messageBuilder $i ${helper()}" }
    logger.info() { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  info(messageLambda) at MainTest.main(test529.kt:12)

User code:
```kotlin
package test529
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.info(messageLambda)
    logger.info(messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test529
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.info(messageLambda)
    logger.info(messageLambda)
  }
  
}


```

###  atInfo() { message="info eventBuilder"; cause=null } at MainTest.main(test530.kt:12)

User code:
```kotlin
package test530
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atInfo() { message="info eventBuilder"; cause=null }
    logger.atInfo() { message="info eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test530
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atInfo() { message="info eventBuilder"; cause=null }
    logger.atInfo() { message="info eventBuilder"; cause=null }
  }
  
}


```

###  atInfo() { message="info eventBuilder $i"; cause=null } at MainTest.main(test531.kt:12)

User code:
```kotlin
package test531
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atInfo() { message="info eventBuilder $i"; cause=null }
    logger.atInfo() { message="info eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test531
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atInfo() { message="info eventBuilder $i"; cause=null }
    logger.atInfo() { message="info eventBuilder $i"; cause=null }
  }
  
}


```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test532.kt:12)

User code:
```kotlin
package test532
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test532
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.INFO) { message="info eventBuilder"; cause=null } at MainTest.main(test533.kt:12)

User code:
```kotlin
package test533
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
    logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test533
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
    logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=null } at MainTest.main(test534.kt:12)

User code:
```kotlin
package test534
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test534
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test535.kt:12)

User code:
```kotlin
package test535
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test535
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
