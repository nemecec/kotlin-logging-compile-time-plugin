## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=false



###  error() { "error messageBuilder" } at MainTest.main(test606.kt:12)

User code:
```kotlin
package test606
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.error() { "error messageBuilder" }
    logger.error() { "error messageBuilder" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test606
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.error() { "error messageBuilder" }
    logger.error() { "error messageBuilder" }
  }
  
}


```

###  error() { "error messageBuilder $i" } at MainTest.main(test607.kt:12)

User code:
```kotlin
package test607
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.error() { "error messageBuilder $i" }
    logger.error() { "error messageBuilder $i" }
  }
  
}


```
  
Remains as-is:
```kotlin
package test607
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.error() { "error messageBuilder $i" }
    logger.error() { "error messageBuilder $i" }
  }
  
}


```

###  error() { "error messageBuilder $i ${helper()}" } at MainTest.main(test608.kt:12)

User code:
```kotlin
package test608
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.error() { "error messageBuilder $i ${helper()}" }
    logger.error() { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test608
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.error() { "error messageBuilder $i ${helper()}" }
    logger.error() { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  error(messageLambda) at MainTest.main(test609.kt:12)

User code:
```kotlin
package test609
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(messageLambda)
    logger.error(messageLambda)
  }
  
}


```
  
Remains as-is:
```kotlin
package test609
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(messageLambda)
    logger.error(messageLambda)
  }
  
}


```

###  atError() { message="error eventBuilder"; cause=null } at MainTest.main(test610.kt:12)

User code:
```kotlin
package test610
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atError() { message="error eventBuilder"; cause=null }
    logger.atError() { message="error eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test610
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atError() { message="error eventBuilder"; cause=null }
    logger.atError() { message="error eventBuilder"; cause=null }
  }
  
}


```

###  atError() { message="error eventBuilder $i"; cause=null } at MainTest.main(test611.kt:12)

User code:
```kotlin
package test611
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atError() { message="error eventBuilder $i"; cause=null }
    logger.atError() { message="error eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test611
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atError() { message="error eventBuilder $i"; cause=null }
    logger.atError() { message="error eventBuilder $i"; cause=null }
  }
  
}


```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test612.kt:12)

User code:
```kotlin
package test612
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test612
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.ERROR) { message="error eventBuilder"; cause=null } at MainTest.main(test613.kt:12)

User code:
```kotlin
package test613
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test613
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=null } at MainTest.main(test614.kt:12)

User code:
```kotlin
package test614
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
  }
  
}


```
  
Remains as-is:
```kotlin
package test614
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test615.kt:12)

User code:
```kotlin
package test615
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
  
Remains as-is:
```kotlin
package test615
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
