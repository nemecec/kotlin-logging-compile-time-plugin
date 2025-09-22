package dev.nemecec.kotlinlogging.compiletimeplugin.newtest

import org.junit.jupiter.api.extension.AfterClassTemplateInvocationCallback
import org.junit.jupiter.api.extension.ExtensionContext

class KotlinCompilerPerClassExtension(private val definitions: List<TestCallbackHolder>) : AfterClassTemplateInvocationCallback {

  override fun afterClassTemplateInvocation(context: ExtensionContext) {
    println("Will compile code here:")
    definitions.forEach { testDefinitionHolder ->
      println("   Def: ${testDefinitionHolder.testDefinition}")
    }
  }

}