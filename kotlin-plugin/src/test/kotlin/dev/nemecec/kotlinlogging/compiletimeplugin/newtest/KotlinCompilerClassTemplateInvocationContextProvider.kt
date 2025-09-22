package dev.nemecec.kotlinlogging.compiletimeplugin.newtest

import dev.nemecec.kotlinlogging.compiletimeplugin.FeatureFlag
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ClassTemplateInvocationContext
import org.junit.jupiter.api.extension.ClassTemplateInvocationContextProvider
import org.junit.jupiter.api.extension.Extension
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolver
import org.junit.platform.commons.support.AnnotationSupport
import java.util.stream.Stream

class KotlinCompilerClassTemplateInvocationContextProvider: ClassTemplateInvocationContextProvider {
  override fun supportsClassTemplate(context: ExtensionContext) = true

  override fun provideClassTemplateInvocationContexts(context: ExtensionContext): Stream<out ClassTemplateInvocationContext> {
    val definitions = context.getTestCallbackHolderList()
    val definitionContext = object : ClassTemplateInvocationContext {
      override fun getDisplayName(invocationIndex: Int) = "Collect definitions"
      override fun getAdditionalExtensions(): List<Extension> {
        return listOf(
          FeatureFlagParameterResolver(null),
          object: BeforeEachCallback {
            override fun beforeEach(context: ExtensionContext) {
              context.isCollectingDefinitions(true)
            }
          },
          KotlinCompilerPerTestExtension(true),
          TestCallbackCollectorParameterResolver { testDefinition -> definitions.last().call(testDefinition) },
          KotlinCompilerPerClassExtension(definitions),
        )
      }
    }
    val annotation = AnnotationSupport.findAnnotation(context.requiredTestClass, KotlinCompilerTests::class.java).get()
    val featureContexts = annotation.featureFlags.map { featureFlag ->
      object : ClassTemplateInvocationContext {
        override fun getDisplayName(invocationIndex: Int) = "Feature: ${featureFlag.name}"
        override fun getAdditionalExtensions(): List<Extension> {
          return listOf(
            FeatureFlagParameterResolver(featureFlag),
            object: BeforeEachCallback {
              override fun beforeEach(context: ExtensionContext) {
                context.isCollectingDefinitions(false)
              }
            },
            KotlinCompilerPerTestExtension(false),
            TestCallbackCollectorParameterResolver { _ -> println("Run the test") },
          )
        }
      }
    }
    return (listOf(definitionContext) + featureContexts).stream()
  }
}

class FeatureFlagParameterResolver(private val featureFlag: FeatureFlag?): ParameterResolver {
  override fun supportsParameter(
    parameterContext: ParameterContext,
    extensionContext: ExtensionContext,
  ) = parameterContext.parameter.type == FeatureFlag::class.java

  override fun resolveParameter(
    parameterContext: ParameterContext,
    extensionContext: ExtensionContext,
  ) = featureFlag
}

class TestCallbackCollectorParameterResolver(private val collector: TestCallbackCollector): ParameterResolver {
  override fun supportsParameter(
    parameterContext: ParameterContext,
    extensionContext: ExtensionContext,
  ) = parameterContext.parameter.type == TestCallbackCollector::class.java

  override fun resolveParameter(
    parameterContext: ParameterContext,
    extensionContext: ExtensionContext,
  ) = collector
}