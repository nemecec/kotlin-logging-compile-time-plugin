plugins {
  kotlin("jvm").version(libs.versions.kotlinversion)
  application
  id("dev.nemecec.kotlinlogging.compile-time-plugin")
  alias(libs.plugins.spotless)
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
  disableTransformingEntryExitApi = false
  disableTransformingThrowingCatchingApi = false
  disableCollectingCallSiteInformation = false
}

spotless {
  kotlin {
    target("src/**/*.kt")
    ktfmt(libs.versions.ktfmt.get()).googleStyle()
  }
}
