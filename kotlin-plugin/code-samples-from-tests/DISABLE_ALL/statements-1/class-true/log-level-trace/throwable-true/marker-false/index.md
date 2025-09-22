## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=TRACE / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  trace(throwable) { "trace messageBuilder" } at MainTest.main(test36.kt:12)

User code:
```kotlin
package test36
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
package test36
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.trace(throwable) { "trace messageBuilder" }
  }
  
}


```

###  trace(throwable) { "trace messageBuilder $i" } at MainTest.main(test37.kt:12)

User code:
```kotlin
package test37
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
package test37
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

###  trace(throwable) { "trace messageBuilder $i ${helper()}" } at MainTest.main(test38.kt:12)

User code:
```kotlin
package test38
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
package test38
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

###  trace(throwable, messageLambda) at MainTest.main(test39.kt:12)

User code:
```kotlin
package test39
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
package test39
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

###  atTrace() { message="trace eventBuilder"; cause=throwable } at MainTest.main(test40.kt:12)

User code:
```kotlin
package test40
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
package test40
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atTrace() { message="trace eventBuilder"; cause=throwable }
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test41.kt:12)

User code:
```kotlin
package test41
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
package test41
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

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test42.kt:12)

User code:
```kotlin
package test42
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
package test42
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

###  at(Level.TRACE) { message="trace eventBuilder"; cause=throwable } at MainTest.main(test43.kt:12)

User code:
```kotlin
package test43
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
package test43
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=throwable }
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=throwable } at MainTest.main(test44.kt:12)

User code:
```kotlin
package test44
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
package test44
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

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test45.kt:12)

User code:
```kotlin
package test45
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
package test45
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
