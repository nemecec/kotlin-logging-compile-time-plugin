package dev.nemecec.kotlinlogging.compiletimeplugin.newtest

import dev.nemecec.kotlinlogging.compiletimeplugin.TestDefinition

fun interface TestCallbackCollector {

  fun call(testDefinition: TestDefinition)

}

class TestCallbackHolder(val testId: String) : TestCallbackCollector {

  var testDefinition: TestDefinition? = null
    private set

  override fun call(testDefinition: TestDefinition) {
    check(this.testDefinition == null) { "Test definition already defined for $testId" }
    this.testDefinition = testDefinition
  }

}