## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=INFO / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  info(throwable) { "info messageBuilder" } at MainTest.main(test196.kt:12)

User code:
```kotlin
package test196
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.info(throwable) { "info messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test196
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.info(throwable) { "info messageBuilder" }
  }
  
}


```

###  info(throwable) { "info messageBuilder $i" } at MainTest.main(test197.kt:12)

User code:
```kotlin
package test197
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.info(throwable) { "info messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test197
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.info(throwable) { "info messageBuilder $i" }
  }
  
}


```

###  info(throwable) { "info messageBuilder $i ${helper()}" } at MainTest.main(test198.kt:12)

User code:
```kotlin
package test198
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.info(throwable) { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test198
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.info(throwable) { "info messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  info(throwable, messageLambda) at MainTest.main(test199.kt:12)

User code:
```kotlin
package test199
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.info(throwable, messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test199
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "info messageBuilder" }
    logger.info(throwable, messageLambda)
  }
  
}


```

###  atInfo() { message="info eventBuilder"; cause=throwable } at MainTest.main(test200.kt:12)

User code:
```kotlin
package test200
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atInfo() { message="info eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test200
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atInfo() { message="info eventBuilder"; cause=throwable }
  }
  
}


```

###  atInfo() { message="info eventBuilder $i"; cause=throwable } at MainTest.main(test201.kt:12)

User code:
```kotlin
package test201
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test201
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atInfo() { message="info eventBuilder $i"; cause=throwable }
  }
  
}


```

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test202.kt:12)

User code:
```kotlin
package test202
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test202
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.INFO) { message="info eventBuilder"; cause=throwable } at MainTest.main(test203.kt:12)

User code:
```kotlin
package test203
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test203
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=throwable } at MainTest.main(test204.kt:12)

User code:
```kotlin
package test204
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test204
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i"; cause=throwable }
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test205.kt:12)

User code:
```kotlin
package test205
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test205
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
