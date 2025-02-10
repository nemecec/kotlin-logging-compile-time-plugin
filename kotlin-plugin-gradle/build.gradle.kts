@file:OptIn(
  ExperimentalBuildToolsApi::class,
  ExperimentalKotlinGradlePluginApi::class,
)

import com.vanniktech.maven.publish.GradlePlugin
import com.vanniktech.maven.publish.JavadocJar
import org.jetbrains.kotlin.buildtools.api.ExperimentalBuildToolsApi
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
  kotlin("jvm")
  id("java-gradle-plugin")
  alias(libs.plugins.maven.publish)
  alias(libs.plugins.build.config)
  alias(libs.plugins.spotless)
}

dependencies {
  implementation(kotlin("gradle-plugin-api"))

  testImplementation(kotlin("test-junit5"))
}

tasks.withType<Test> {
  useJUnitPlatform()

  systemProperty("kotlinLoggingPluginVersion", project.version)
  systemProperty("kotlinVersion", kotlin.compilerVersion.get())
  dependsOn(":kotlin-plugin:publishAllPublicationsToTestMavenRepository")
  dependsOn(":kotlin-plugin-gradle:publishAllPublicationsToTestMavenRepository")
}

buildConfig {
  packageName(project.group.toString())

  val pluginProject = project(":kotlin-plugin")
  buildConfigField("String", "KOTLIN_PLUGIN_ID", "\"${rootProject.extra["kotlin_plugin_id"]}\"")
  buildConfigField("String", "KOTLIN_PLUGIN_GROUP", "\"${pluginProject.group}\"")
  buildConfigField("String", "KOTLIN_PLUGIN_NAME", "\"${pluginProject.name}\"")
  buildConfigField("String", "KOTLIN_PLUGIN_VERSION", "\"${pluginProject.version}\"")
}

gradlePlugin {
  plugins {
    create("kotlinLoggingCompileTimePlugin") {
      id = rootProject.extra["kotlin_plugin_id"] as String
      displayName = "kotlin-logging IR plugin"
      description = "Collects metadata about logging calls from the source code and adds it to the respective calls"
      implementationClass = "dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingGradlePlugin"
    }
  }
}

mavenPublishing {
  configure(
    GradlePlugin(javadocJar = JavadocJar.Empty())
  )
}

spotless {
  kotlin {
    target("src/**/*.kt")
    ktfmt(libs.versions.ktfmt.get()).googleStyle()
  }
}
