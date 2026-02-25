## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=false



###  warn(throwable) { "warn messageBuilder" } at MainTest.main(test546.kt:12)

User code:
```kotlin
package test546
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.warn(throwable) { "warn messageBuilder" }
    logger.warn(throwable) { "warn messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test546
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.warn(throwable) { "warn messageBuilder" }
    logger.warn(throwable) { "warn messageBuilder" }
  }
  
}


```

###  warn(throwable) { "warn messageBuilder $i" } at MainTest.main(test547.kt:12)

User code:
```kotlin
package test547
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable) { "warn messageBuilder $i" }
    logger.warn(throwable) { "warn messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test547
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable) { "warn messageBuilder $i" }
    logger.warn(throwable) { "warn messageBuilder $i" }
  }
  
}


```

###  warn(throwable) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test548.kt:12)

User code:
```kotlin
package test548
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
    logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test548
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
    logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  warn(throwable, messageLambda) at MainTest.main(test549.kt:12)

User code:
```kotlin
package test549
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(throwable, messageLambda)
    logger.warn(throwable, messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test549
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(throwable, messageLambda)
    logger.warn(throwable, messageLambda)
  }
  
}


```

###  atWarn() { message="warn eventBuilder"; cause=throwable } at MainTest.main(test550.kt:12)

User code:
```kotlin
package test550
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atWarn() { message="warn eventBuilder"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test550
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atWarn() { message="warn eventBuilder"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder"; cause=throwable }
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test551.kt:12)

User code:
```kotlin
package test551
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test551
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test552.kt:12)

User code:
```kotlin
package test552
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test552
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.WARN) { message="warn eventBuilder"; cause=throwable } at MainTest.main(test553.kt:12)

User code:
```kotlin
package test553
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test553
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test554.kt:12)

User code:
```kotlin
package test554
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test554
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test555.kt:12)

User code:
```kotlin
package test555
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test555
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
