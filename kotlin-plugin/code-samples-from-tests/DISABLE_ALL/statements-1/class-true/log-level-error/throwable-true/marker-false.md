## featureFlag=DISABLE_ALL / With 1 log statement(s) / with class=true / with log level=ERROR / with throwable=true / with marker=false



###  error(throwable) { "error messageBuilder" } at MainTest.main(test176.kt:12)

User code:
```kotlin
package test176
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.error(throwable) { "error messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test176
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.error(throwable) { "error messageBuilder" }
  }
  
}


```

###  error(throwable) { "error messageBuilder $i" } at MainTest.main(test177.kt:12)

User code:
```kotlin
package test177
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.error(throwable) { "error messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test177
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.error(throwable) { "error messageBuilder $i" }
  }
  
}


```

###  error(throwable) { "error messageBuilder $i ${helper()}" } at MainTest.main(test178.kt:12)

User code:
```kotlin
package test178
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.error(throwable) { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test178
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.error(throwable) { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  error(throwable, messageLambda) at MainTest.main(test179.kt:12)

User code:
```kotlin
package test179
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(throwable, messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test179
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(throwable, messageLambda)
  }
  
}


```

###  atError() { message="error eventBuilder"; cause=throwable } at MainTest.main(test180.kt:12)

User code:
```kotlin
package test180
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atError() { message="error eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test180
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.atError() { message="error eventBuilder"; cause=throwable }
  }
  
}


```

###  atError() { message="error eventBuilder $i"; cause=throwable } at MainTest.main(test181.kt:12)

User code:
```kotlin
package test181
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atError() { message="error eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test181
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atError() { message="error eventBuilder $i"; cause=throwable }
  }
  
}


```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test182.kt:12)

User code:
```kotlin
package test182
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test182
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.ERROR) { message="error eventBuilder"; cause=throwable } at MainTest.main(test183.kt:12)

User code:
```kotlin
package test183
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test183
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=throwable }
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable } at MainTest.main(test184.kt:12)

User code:
```kotlin
package test184
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
  }
  
}


```
  
Remains as-is:
```kotlin
package test184
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=throwable }
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable } at MainTest.main(test185.kt:12)

User code:
```kotlin
package test185
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test185
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    val throwable = Exception("expected!")
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=throwable }
  }
  fun helper() = "Hello!"
}


```
