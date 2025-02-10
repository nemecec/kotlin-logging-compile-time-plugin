pluginManagement {
  plugins {
    id("io.github.nemecec.kotlinlogging.compile-time-plugin")
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}

rootProject.name = "kotlin-logging-compile-time-plugin-sample"

includeBuild("..")