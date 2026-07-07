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

  configurations.classpath {
    resolutionStrategy.eachDependency {
      if (requested.group.startsWith("com.fasterxml.jackson")) {
        // Align to jackson-bom 2.21.5: core/databind track the patch line, annotations does not.
        useVersion(if (requested.name == "jackson-annotations") "2.21" else "2.21.5")
        because("GHSA-72hv-8253-57qq, GHSA-j3rv-43j4-c7qm, GHSA-rmj7-2vxq-3g9f, GHSA-hgj6-7826-r7m5, GHSA-5jmj-h7xm-6q6v")
      }
    }
  }
}

plugins {
  kotlin("jvm").version(libs.versions.kotlinversion).apply(false)
  alias(libs.plugins.dokka)
  alias(libs.plugins.maven.publish)
}

allprojects {
  group = "dev.nemecec.kotlinlogging.compiletimeplugin"
  version = "1.7.1-SNAPSHOT"

  configurations.configureEach {
    resolutionStrategy.eachDependency {
      if (requested.group == "org.bouncycastle" && requested.name.endsWith("-jdk18on")) {
        useVersion("1.84")
        because("GHSA-cj8j-37rh-8475, GHSA-c3fc-8qff-9hwx, GHSA-wg6q-6289-32hp")
      }
      if (requested.group.startsWith("com.fasterxml.jackson")) {
        // Also reaches the Dokka worker runtime classpath, which the buildscript rule does not.
        // Align to jackson-bom 2.21.5: core/databind track the patch line, annotations does not.
        useVersion(if (requested.name == "jackson-annotations") "2.21" else "2.21.5")
        because("GHSA-72hv-8253-57qq, GHSA-j3rv-43j4-c7qm, GHSA-rmj7-2vxq-3g9f, GHSA-hgj6-7826-r7m5, GHSA-5jmj-h7xm-6q6v")
      }
    }
  }
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
