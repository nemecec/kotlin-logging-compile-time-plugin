import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm

plugins {
  kotlin("jvm")
  kotlin("kapt")
  alias(libs.plugins.dokka)
  alias(libs.plugins.maven.publish)
  alias(libs.plugins.build.config)
  alias(libs.plugins.spotless)
}

dependencies {
  kapt(libs.auto.service)
  compileOnly(libs.auto.service.annotations)
  // The helpers used from kotlin-compiler-extensions are inline, so nothing of it is needed at run
  // time. The compiler that runs the plugin provides the compiler API.
  compileOnly(libs.kotlin.compiler.extensions)
  compileOnly(libs.kotlin.compiler)

  testImplementation(kotlin("test-junit"))
  testImplementation(libs.junit.jupiter)
  testRuntimeOnly(libs.junit.platform)
  testImplementation("org.jetbrains.kotlin:kotlin-compiler-embeddable")
  testImplementation(libs.kctfork)
  testImplementation(libs.kotlin.logging.jvm)
  testImplementation(libs.logback.classic)
}

buildConfig {
  useKotlinOutput {
    internalVisibility = true
  }

  packageName(group.toString())
  buildConfigField("String", "KOTLIN_PLUGIN_ID", "\"${rootProject.extra["kotlin_plugin_id"]}\"")
}

mavenPublishing {
  configure(
    KotlinJvm(javadocJar = JavadocJar.Dokka("dokkaGeneratePublicationHtml"))
  )
}

tasks {
  withType<Test> {
    useJUnitPlatform()
  }
}

kotlin {
  compilerOptions {
    javaParameters = true
  }
}

spotless {
  kotlin {
    target("src/**/*.kt")
    ktfmt(libs.versions.ktfmt.get()).googleStyle()
  }
}
