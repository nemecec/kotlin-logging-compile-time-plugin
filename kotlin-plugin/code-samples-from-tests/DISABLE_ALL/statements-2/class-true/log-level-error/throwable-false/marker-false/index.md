## featureFlag=DISABLE_ALL / With 2 log statement(s) / with class=true / with log level=ERROR / with throwable=false / with marker=false

* [deprecated KLogger API](deprecated-KLogger/index.md)

###  error() { "error messageBuilder" } at MainTest.main(test1206.kt:12)

User code:
```kotlin
package test1206
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.error() { "error messageBuilder" }
    logger.error() { "error messageBuilder" }
  }
  
}


```
  
Transformed into:
```kotlin
package test1206
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.error() { "error messageBuilder" }
error() { "error messageBuilder" }
    logger.error() { "error messageBuilder" }
error() { "error messageBuilder" }
  }
  
}


```

###  error() { "error messageBuilder $i" } at MainTest.main(test1207.kt:12)

User code:
```kotlin
package test1207
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
  
Transformed into:
```kotlin
package test1207
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.error() { "error messageBuilder $i" }
error() { "error messageBuilder $i" }
    logger.error() { "error messageBuilder $i" }
error() { "error messageBuilder $i" }
  }
  
}


```

###  error() { "error messageBuilder $i ${helper()}" } at MainTest.main(test1208.kt:12)

User code:
```kotlin
package test1208
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
  
Transformed into:
```kotlin
package test1208
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.error() { "error messageBuilder $i ${helper()}" }
error() { "error messageBuilder $i ${helper()}" }
    logger.error() { "error messageBuilder $i ${helper()}" }
error() { "error messageBuilder $i ${helper()}" }
  }
  fun helper() = "Hello!"
}


```

###  error(messageLambda) at MainTest.main(test1209.kt:12)

User code:
```kotlin
package test1209
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
  
Transformed into:
```kotlin
package test1209
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val messageLambda: () -> Any = { "error messageBuilder" }
    logger.error(messageLambda)
error(messageLambda)
    logger.error(messageLambda)
error(messageLambda)
  }
  
}


```

###  atError() { message="error eventBuilder"; cause=null } at MainTest.main(test1210.kt:12)

User code:
```kotlin
package test1210
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atError() { message="error eventBuilder"; cause=null }
    logger.atError() { message="error eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test1210
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.atError() { message="error eventBuilder"; cause=null }
atError() { message="error eventBuilder"; cause=null }
    logger.atError() { message="error eventBuilder"; cause=null }
atError() { message="error eventBuilder"; cause=null }
  }
  
}


```

###  atError() { message="error eventBuilder $i"; cause=null } at MainTest.main(test1211.kt:12)

User code:
```kotlin
package test1211
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
  
Transformed into:
```kotlin
package test1211
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atError() { message="error eventBuilder $i"; cause=null }
atError() { message="error eventBuilder $i"; cause=null }
    logger.atError() { message="error eventBuilder $i"; cause=null }
atError() { message="error eventBuilder $i"; cause=null }
  }
  
}


```

###  atError() { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test1212.kt:12)

User code:
```kotlin
package test1212
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
  
Transformed into:
```kotlin
package test1212
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
atError() { message="error eventBuilder $i ${helper()}"; cause=null }
    logger.atError() { message="error eventBuilder $i ${helper()}"; cause=null }
atError() { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```

###  at(Level.ERROR) { message="error eventBuilder"; cause=null } at MainTest.main(test1213.kt:12)

User code:
```kotlin
package test1213
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
  }
  
}


```
  
Transformed into:
```kotlin
package test1213
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
at(Level.ERROR) { message="error eventBuilder"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder"; cause=null }
at(Level.ERROR) { message="error eventBuilder"; cause=null }
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i"; cause=null } at MainTest.main(test1214.kt:12)

User code:
```kotlin
package test1214
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
  
Transformed into:
```kotlin
package test1214
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
at(Level.ERROR) { message="error eventBuilder $i"; cause=null }
  }
  
}


```

###  at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null } at MainTest.main(test1215.kt:12)

User code:
```kotlin
package test1215
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
  
Transformed into:
```kotlin
package test1215
import io.github.oshai.kotlinlogging.*


public class MainTest {
private val logger = KotlinLogging.logger {}

  fun main() {
    
    
    val i = 42
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
    logger.at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
at(Level.ERROR) { message="error eventBuilder $i ${helper()}"; cause=null }
  }
  fun helper() = "Hello!"
}


```
