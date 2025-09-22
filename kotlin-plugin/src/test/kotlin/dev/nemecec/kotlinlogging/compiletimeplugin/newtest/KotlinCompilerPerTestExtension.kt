package dev.nemecec.kotlinlogging.compiletimeplugin.newtest

import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext

class KotlinCompilerPerTestExtension(private val isCollectingDefinitions: Boolean) : BeforeEachCallback, AfterEachCallback {

  //TODO find all functions annotated with @TestDefinitionBuilder, invoke them and collect the TestDefinitions
  //TODO compile the tests, run them and store the ExecutedTest in the context store
  override fun beforeEach(context: ExtensionContext) {
    println("Before each: ${context.uniqueId}")
    if (context.isCollectingDefinitions(isCollectingDefinitions)) {
      context.getTestCallbackHolderList().add(TestCallbackHolder(context.uniqueId))
    }
  }

  override fun afterEach(context: ExtensionContext) {
    println("After each: ${context.uniqueId}")
  }

}