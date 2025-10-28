import com.vanniktech.maven.publish.MavenPublishBaseExtension
import org.gradle.api.plugins.JavaBasePlugin
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.jetbrains.dokka.gradle.engine.parameters.VisibilityModifier
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile
import java.net.URI

buildscript {
  extra["kotlin_plugin_id"] = "dev.nemecec.kotlinlogging.compile-time-plugin"
}

plugins {
  kotlin("jvm").version(libs.versions.kotlinversion).apply(false)
  alias(libs.plugins.dokka)
  alias(libs.plugins.maven.publish)
}

allprojects {
  group = "dev.nemecec.kotlinlogging.compiletimeplugin"
  version = "1.4.2"
}

dependencies {
  dokka(project(":kotlin-plugin-gradle"))
  dokka(project(":kotlin-plugin"))
}

subprojects {
  pluginManager.withPlugin("org.jetbrains.dokka") {
    configure<org.jetbrains.dokka.gradle.DokkaExtension> {
      dokkaSourceSets.configureEach {
        documentedVisibilities.set(
          setOf(
            VisibilityModifier.Public,
            VisibilityModifier.Protected
          )
        )
        reportUndocumented.set(false)
        jdkVersion.set(8)

        perPackageOption {
          matchingRegex.set("dev\\.nemecec\\.kotlinlogging\\.compiletimeplugin\\.internal\\..*")
          suppress.set(true)
        }
        sourceLink {
          localDirectory.set(rootProject.projectDir)
          remoteUrl.set(URI("https://github.com/nemecec/kotlin-logging-compile-time-plugin/tree/main/"))
          remoteLineSuffix.set("#L")
        }
      }
    }
  }

  // Don't attempt to sign anything if we don't have an in-memory key. Otherwise, the 'build' task
  // triggers 'signJsPublication' even when we aren't publishing (and so don't have signing keys).
  tasks.withType<Sign>().configureEach {
    enabled = project.findProperty("signingInMemoryKey") != null
  }

  // Use Java 17 toolchain for building and testing
  plugins.withType<JavaBasePlugin> {
    extensions.configure<JavaPluginExtension> {
      toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
      }
    }
  }

  // Target Java 8 bytecode for main code (use --release flag)
  tasks.withType(JavaCompile::class.java).configureEach {
    val isTestTask = name.startsWith("compileTest") || name.contains("Test", ignoreCase = false)
    if (!isTestTask) {
      options.release.set(8)
    }
  }

  // Target Java 8 bytecode for main code
  tasks.withType(KotlinJvmCompile::class.java).configureEach {
    compilerOptions {
      val isTestTask = name.startsWith("compileTest") || name.contains("Test", ignoreCase = false)
      if (!isTestTask) {
        jvmTarget.set(JvmTarget.JVM_1_8)
      }
    }
  }

  plugins.withId("com.vanniktech.maven.publish.base") {
    configure<PublishingExtension> {
      repositories {
        maven {
          name = "testMaven"
          url = rootProject.layout.buildDirectory.dir("testMaven").get().asFile.toURI()
        }
      }
    }
    configure<MavenPublishBaseExtension> {
      publishToMavenCentral(automaticRelease = true)
      signAllPublications()
      coordinates(group.toString(), name, version.toString())
      pom {
        description.set("Kotlin compile-time plugin for kotlin-logging library")
        name.set(project.name)
        url.set("https://github.com/nemecec/kotlin-logging-compile-time-plugin")
        licenses {
          license {
            name.set("The Apache Software License, Version 2.0")
            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            distribution.set("repo")
          }
        }
        developers {
          developer {
            id.set("nemecec")
            name.set("Neeme Praks")
            url.set("https://github.com/nemecec/")
          }
        }
        scm {
          url.set("https://github.com/nemecec/kotlin-logging-compile-time-plugin")
          connection.set("scm:git:https://github.com/nemecec/kotlin-logging-compile-time-plugin.git")
          developerConnection.set("scm:git:ssh://git@github.com/nemecec/kotlin-logging-compile-time-plugin.git")
        }
      }
    }
  }
}

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
    }
}
