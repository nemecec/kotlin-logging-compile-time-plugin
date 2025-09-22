## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=WARN / with throwable=true / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  warn(throwable) { "warn messageBuilder" } at MainTest.main(test1086.kt:12)

User code:
```kotlin
package test1086
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
  
Transformed into:
```kotlin
package test1086
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.warn(throwable) { "warn messageBuilder" }
warn(throwable) { "warn messageBuilder" }
    logger.warn(throwable) { "warn messageBuilder" }
warn(throwable) { "warn messageBuilder" }
  }
  
}


```

###  warn(throwable) { "warn messageBuilder $i" } at MainTest.main(test1087.kt:12)

User code:
```kotlin
package test1087
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
  
Transformed into:
```kotlin
package test1087
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable) { "warn messageBuilder $i" }
warn(throwable) { "warn messageBuilder $i" }
    logger.warn(throwable) { "warn messageBuilder $i" }
warn(throwable) { "warn messageBuilder $i" }
  }
  
}


```

###  warn(throwable) { "warn messageBuilder $i ${helper()}" } at MainTest.main(test1088.kt:12)

User code:
```kotlin
package test1088
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
  
Transformed into:
```kotlin
package test1088
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
warn(throwable) { "warn messageBuilder $i ${helper()}" }
    logger.warn(throwable) { "warn messageBuilder $i ${helper()}" }
warn(throwable) { "warn messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  warn(throwable, messageLambda) at MainTest.main(test1089.kt:12)

User code:
```kotlin
package test1089
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
  
Transformed into:
```kotlin
package test1089
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "warn messageBuilder" }
    logger.warn(throwable, messageLambda)
warn(throwable, messageLambda)
    logger.warn(throwable, messageLambda)
warn(throwable, messageLambda)
  }
  
}


```

###  atWarn() { message="warn eventBuilder"; cause=throwable } at MainTest.main(test1090.kt:12)

User code:
```kotlin
package test1090
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
  
Transformed into:
```kotlin
package test1090
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atWarn() { message="warn eventBuilder"; cause=throwable }
atWarn() { message="warn eventBuilder"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder"; cause=throwable }
atWarn() { message="warn eventBuilder"; cause=throwable }
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test1091.kt:12)

User code:
```kotlin
package test1091
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
  
Transformed into:
```kotlin
package test1091
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
atWarn() { message="warn eventBuilder $i"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder $i"; cause=throwable }
atWarn() { message="warn eventBuilder $i"; cause=throwable }
  }
  
}


```

###  atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test1092.kt:12)

User code:
```kotlin
package test1092
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
  
Transformed into:
```kotlin
package test1092
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
atWarn() { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.WARN) { message="warn eventBuilder"; cause=throwable } at MainTest.main(test1093.kt:12)

User code:
```kotlin
package test1093
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
  
Transformed into:
```kotlin
package test1093
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder"; cause=throwable }
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable } at MainTest.main(test1094.kt:12)

User code:
```kotlin
package test1094
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
  
Transformed into:
```kotlin
package test1094
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder $i"; cause=throwable }
  }
  
}


```

###  at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test1095.kt:12)

User code:
```kotlin
package test1095
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
  
Transformed into:
```kotlin
package test1095
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
    logger.at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
at(Level.WARN) { message="warn eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
