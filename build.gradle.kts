import com.vanniktech.maven.publish.MavenPublishBaseExtension
import org.jetbrains.dokka.DokkaConfiguration.Visibility
import org.jetbrains.dokka.gradle.DokkaMultiModuleTask
import org.jetbrains.dokka.gradle.DokkaTaskPartial
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
  version = "1.4.0"
}

tasks.named("dokkaHtmlMultiModule", DokkaMultiModuleTask::class.java).configure {
  moduleName.set("Kotlin-logging compile-time plugin")
}

allprojects {
  tasks.withType<DokkaTaskPartial>().configureEach {
    dokkaSourceSets.configureEach {
      documentedVisibilities.set(
        setOf(
          Visibility.PUBLIC,
          Visibility.PROTECTED
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
        remoteUrl.set(URI("https://github.com/nemecec/kotlin-logging-compile-time-plugin/tree/main/").toURL())
        remoteLineSuffix.set("#L")
      }
    }
  }

  // Don't attempt to sign anything if we don't have an in-memory key. Otherwise, the 'build' task
  // triggers 'signJsPublication' even when we aren't publishing (and so don't have signing keys).
  tasks.withType<Sign>().configureEach {
    enabled = project.findProperty("signingInMemoryKey") != null
  }

  val javaVersion = JavaVersion.VERSION_1_8

  tasks.withType(JavaCompile::class.java).configureEach {
    sourceCompatibility = javaVersion.toString()
    targetCompatibility = javaVersion.toString()
  }

  tasks.withType(KotlinJvmCompile::class.java).configureEach {
    compilerOptions {
      jvmTarget.set(JvmTarget.fromTarget(javaVersion.toString()))
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
