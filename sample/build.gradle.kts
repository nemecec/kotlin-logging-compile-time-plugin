plugins {
  kotlin("jvm").version(libs.versions.kotlinversion)
  application
  id("io.github.nemecec.kotlinlogging.compile-time-plugin")
}

dependencies {
  implementation(libs.kotlin.logging.jvm)

  testImplementation(kotlin("test-junit5"))
  testImplementation(libs.junit.jupiter)
  testImplementation(libs.logback.classic)
  testImplementation(libs.assertk)
  testRuntimeOnly(libs.junit.jupiter.engine)
}

application {
  mainClass = "SampleAppKt"
}

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