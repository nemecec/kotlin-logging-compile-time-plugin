package dev.nemecec.kotlinlogging.compiletimeplugin

data class LogStatement(
  val funName: String,
  val arguments: List<String> = emptyList(),
  val lastArgumentLambda: String? = null,
)
