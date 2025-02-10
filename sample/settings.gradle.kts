pluginManagement {
  plugins {
    id("io.github.nemecec.kotlinlogging.compile-time-plugin")
  }
  repositories {
    mavenCentral()
    google()
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    google()
  }
}

rootProject.name = "kotlin-logging-compile-time-plugin-sample"

includeBuild("..")