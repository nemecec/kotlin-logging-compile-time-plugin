## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=INFO / with throwable=true / with marker=false



###  info(throwable) { "info messageBuilder" } at MainTest.main(test96.kt:12)

User code:
```kotlin
package test96
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
package test96
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.info(throwable) { "info messageBuilder" }
  }
  
}


```

###  info(throwable) { "info messageBuilder $i" } at MainTest.main(test97.kt:12)

User code:
```kotlin
package test97
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
package test97
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

###  info(throwable) { "info messageBuilder $i ${helper()}" } at MainTest.main(test98.kt:12)

User code:
```kotlin
package test98
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
package test98
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

###  info(throwable, messageLambda) at MainTest.main(test99.kt:12)

User code:
```kotlin
package test99
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
package test99
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

###  atInfo() { message="info eventBuilder"; cause=throwable } at MainTest.main(test100.kt:12)

User code:
```kotlin
package test100
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
package test100
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atInfo() { message="info eventBuilder"; cause=throwable }
  }
  
}


```

###  atInfo() { message="info eventBuilder $i"; cause=throwable } at MainTest.main(test101.kt:12)

User code:
```kotlin
package test101
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
package test101
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

###  atInfo() { message="info eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test102.kt:12)

User code:
```kotlin
package test102
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
package test102
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

###  at(Level.INFO) { message="info eventBuilder"; cause=throwable } at MainTest.main(test103.kt:12)

User code:
```kotlin
package test103
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
package test103
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.INFO) { message="info eventBuilder"; cause=throwable }
  }
  
}


```

###  at(Level.INFO) { message="info eventBuilder $i"; cause=throwable } at MainTest.main(test104.kt:12)

User code:
```kotlin
package test104
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
package test104
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

###  at(Level.INFO) { message="info eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test105.kt:12)

User code:
```kotlin
package test105
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
package test105
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
