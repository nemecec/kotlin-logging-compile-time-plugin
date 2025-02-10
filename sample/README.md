# Sample application for Kotlin compiler plugin for kotlin-logging

A standalone project to demonstrate the Kotlin compile-time plugin for kotlin-logging.

[build.gradle.kts](build.gradle.kts)
```kotlin
// Add the Gradle plugin to the build script
id("dev.nemecec.kotlinlogging.compile-time-plugin")

dependencies {
  // Add the kotlin-logging library
  implementation(libs.kotlin.logging.jvm)

  // Optionally, add Logback for log message template feature
  testImplementation(libs.logback.classic)
}

// Optional
// In order to use log message template feature you will need to use Logback as your logging backend (and
// to set `kotlin-logging-to-logback` system property to `true` in your application JVM).
tasks.withType<Test> {
  useJUnitPlatform()
  options {
    systemProperty("kotlin-logging-to-logback", "true")
  }
}


// Optional: configure the plugin (by default all features are enabled)
kotlinLoggingCompileTimePlugin {
  disableAll = false
  disableTransformingDeprecatedApi = false
  disableTransformingNotImplementedApi = false
  disableTransformingEntryExitApi = false
  disableTransformingThrowingCatchingApi = false
  disableCollectingCallSiteInformation = false
}
```

The project also includes a sample class with a logging statement and a test
that verifies that the code was transformed and extra information is available to logging backend.
