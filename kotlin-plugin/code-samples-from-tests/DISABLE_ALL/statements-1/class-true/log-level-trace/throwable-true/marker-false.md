## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=false



###  trace(throwable) { "trace messageBuilder" } at MainTest.main(test16.kt:12)

User code:
```kotlin
package test16
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.trace(throwable) { "trace messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test16
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.trace(throwable) { "trace messageBuilder" }
  }
  
}


```

###  trace(throwable) { "trace messageBuilder $i" } at MainTest.main(test17.kt:12)

User code:
```kotlin
package test17
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(throwable) { "trace messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test17
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(throwable) { "trace messageBuilder $i" }
  }
  
}


```

###  trace(throwable) { "trace messageBuilder $i ${helper()}" } at MainTest.main(test18.kt:12)

User code:
```kotlin
package test18
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test18
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.trace(throwable) { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  trace(throwable, messageLambda) at MainTest.main(test19.kt:12)

User code:
```kotlin
package test19
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.trace(throwable, messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test19
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.trace(throwable, messageLambda)
  }
  
}


```

###  atTrace() { message="trace eventBuilder"; cause=throwable } at MainTest.main(test20.kt:12)

User code:
```kotlin
package test20
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atTrace() { message="trace eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test20
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atTrace() { message="trace eventBuilder"; cause=throwable }
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test21.kt:12)

User code:
```kotlin
package test21
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test21
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i"; cause=throwable }
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test22.kt:12)

User code:
```kotlin
package test22
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test22
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=throwable } at MainTest.main(test23.kt:12)

User code:
```kotlin
package test23
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test23
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test24.kt:12)

User code:
```kotlin
package test24
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test24
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable }
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test25.kt:12)

User code:
```kotlin
package test25
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test25
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
