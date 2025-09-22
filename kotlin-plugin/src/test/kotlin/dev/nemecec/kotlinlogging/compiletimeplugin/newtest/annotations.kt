package dev.nemecec.kotlinlogging.compiletimeplugin.newtest

import dev.nemecec.kotlinlogging.compiletimeplugin.FeatureFlag
import org.junit.jupiter.api.ClassTemplate
import org.junit.jupiter.api.TestTemplate
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.ExtensionContext

@ClassTemplate
@ExtendWith(KotlinCompilerClassTemplateInvocationContextProvider::class)
//@ExtendWith(KotlinCompilerPerClassExtension::class)
annotation class KotlinCompilerTests(val featureFlags: Array<FeatureFlag>)

@TestTemplate
@ExtendWith(PreparedTestRunnerContextProvider::class)
annotation class KotlinCompilerTest()

private const val NAMESPACE = "dev.nemecec.kotlinlogging.compiletimeplugin"

internal fun ExtensionContext.getTestCallbackHolderList(): MutableList<TestCallbackHolder> =
  root.getStore(ExtensionContext.Namespace.create(NAMESPACE))
    .getOrComputeIfAbsent("callbackHolderList") { mutableListOf<TestCallbackHolder>() } as MutableList<TestCallbackHolder>

internal fun ExtensionContext.isCollectingDefinitions(defaultValue: Boolean): Boolean =
  getStore(ExtensionContext.Namespace.create(NAMESPACE))
    .getOrComputeIfAbsent("isCollectingDefinitions") { defaultValue } as Boolean
