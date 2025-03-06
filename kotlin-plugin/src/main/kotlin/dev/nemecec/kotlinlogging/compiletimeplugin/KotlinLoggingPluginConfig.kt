package dev.nemecec.kotlinlogging.compiletimeplugin

data class KotlinLoggingPluginConfig(
  val disableAll: Boolean = false,
  val disableTransformingDeprecatedApi: Boolean = false,
  val disableTransformingEntryExitApi: Boolean = false,
  val disableTransformingThrowingCatchingApi: Boolean = false,
  val disableCollectingCallSiteInformation: Boolean = false,
)
