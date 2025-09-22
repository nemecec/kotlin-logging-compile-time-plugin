## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=TRACE / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  trace() { "trace messageBuilder" } at MainTest.main(test886.kt:12)

User code:
```kotlin
package test886
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.trace() { "trace messageBuilder" }
    logger.trace() { "trace messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test886
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.trace() { "trace messageBuilder" }
trace() { "trace messageBuilder" }
    logger.trace() { "trace messageBuilder" }
trace() { "trace messageBuilder" }
  }
  
}


```

###  trace() { "trace messageBuilder $i" } at MainTest.main(test887.kt:12)

User code:
```kotlin
package test887
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.trace() { "trace messageBuilder $i" }
    logger.trace() { "trace messageBuilder $i" }
  }
  
}


```
  
Transformed into:
```kotlin
package test887
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.trace() { "trace messageBuilder $i" }
trace() { "trace messageBuilder $i" }
    logger.trace() { "trace messageBuilder $i" }
trace() { "trace messageBuilder $i" }
  }
  
}


```

###  trace() { "trace messageBuilder $i ${helper()}" } at MainTest.main(test888.kt:12)

User code:
```kotlin
package test888
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.trace() { "trace messageBuilder $i ${helper()}" }
    logger.trace() { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test888
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.trace() { "trace messageBuilder $i ${helper()}" }
trace() { "trace messageBuilder $i ${helper()}" }
    logger.trace() { "trace messageBuilder $i ${helper()}" }
trace() { "trace messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  trace(messageLambda) at MainTest.main(test889.kt:12)

User code:
```kotlin
package test889
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.trace(messageLambda)
    logger.trace(messageLambda)
  }
  
}


```
  
Transformed into:
```kotlin
package test889
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "trace messageBuilder" }
    logger.trace(messageLambda)
trace(messageLambda)
    logger.trace(messageLambda)
trace(messageLambda)
  }
  
}


```

###  atTrace() { message="trace eventBuilder"; cause=null } at MainTest.main(test890.kt:12)

User code:
```kotlin
package test890
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atTrace() { message="trace eventBuilder"; cause=null }
    logger.atTrace() { message="trace eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test890
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atTrace() { message="trace eventBuilder"; cause=null }
atTrace() { message="trace eventBuilder"; cause=null }
    logger.atTrace() { message="trace eventBuilder"; cause=null }
atTrace() { message="trace eventBuilder"; cause=null }
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i"; cause=null } at MainTest.main(test891.kt:12)

User code:
```kotlin
package test891
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i"; cause=null }
    logger.atTrace() { message="trace eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test891
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i"; cause=null }
atTrace() { message="trace eventBuilder $i"; cause=null }
    logger.atTrace() { message="trace eventBuilder $i"; cause=null }
atTrace() { message="trace eventBuilder $i"; cause=null }
  }
  
}


```

###  atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test892.kt:12)

User code:
```kotlin
package test892
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test892
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
    logger.atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
atTrace() { message="trace eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.TRACE) { message="trace eventBuilder"; cause=null } at MainTest.main(test893.kt:12)

User code:
```kotlin
package test893
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test893
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
at(Level.TRACE) { message="trace eventBuilder"; cause=null }
    logger.at(Level.TRACE) { message="trace eventBuilder"; cause=null }
at(Level.TRACE) { message="trace eventBuilder"; cause=null }
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i"; cause=null } at MainTest.main(test894.kt:12)

User code:
```kotlin
package test894
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test894
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
    logger.at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
at(Level.TRACE) { message="trace eventBuilder $i"; cause=null }
  }
  
}


```

###  at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test895.kt:12)

User code:
```kotlin
package test895
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Transformed into:
```kotlin
package test895
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
at(Level.TRACE) { message="trace eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
