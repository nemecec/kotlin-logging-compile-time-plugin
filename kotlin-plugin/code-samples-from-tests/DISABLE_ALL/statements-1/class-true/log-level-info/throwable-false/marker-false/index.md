## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=INFO / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  info() { "info messageBuilder" } at MainTest.main(test236.kt:12)

User code:
```kotlin
package test236
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.info() { "info messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test236
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.info() { "info messageBuilder" }
  }
  
}


```

###  info() { "info messageBuilder $i" } at MainTest.main(test237.kt:12)

User code:
```kotlin
package test237
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.info() { "info messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test237
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.info() { "info messageBuilder $i" }
  }
  
}


```

###  info() { "info messageBuilder $i ${helper()}" } at MainTest.main(test238.kt:12)

User code:
```kotlin
package test238
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.info() { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test238
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.info() { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  info(messageLambda) at MainTest.main(test239.kt:12)

User code:
```kotlin
package test239
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.info(messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test239
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.info(messageLambda)
  }
  
}


```

###  atInfo() { message="info eventBuilder"; cause=null } at MainTest.main(test240.kt:12)

User code:
```kotlin
package test240
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atInfo() { message="info eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test240
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atInfo() { message="info eventBuilder"; cause=null }
  }
  
}


```

###  atInfo() { message="info eventBuilder $i"; cause=null } at MainTest.main(test241.kt:12)

User code:
```kotlin
package test241
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atInfo() { message="info eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test241
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atInfo() { message="info eventBuilder $i"; cause=null }
  }
  
}


```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test242.kt:12)

User code:
```kotlin
package test242
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test242
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.INFO) { message="info eventBuilder"; cause=null } at MainTest.main(test243.kt:12)

User code:
```kotlin
package test243
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test243
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.INFO) { message="info eventBuilder"; cause=null }
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=null } at MainTest.main(test244.kt:12)

User code:
```kotlin
package test244
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test244
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=null }
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test245.kt:12)

User code:
```kotlin
package test245
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test245
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
