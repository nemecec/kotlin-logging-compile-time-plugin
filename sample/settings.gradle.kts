pluginManagement {
  plugins {
    id("dev.nemecec.kotlinlogging.compile-time-plugin")
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}

rootProject.name = "kotlin-logging-compile-time-plugin-sample"

includeBuild("..")