package dev.nemecec.kotlinlogging.compiletimeplugin

enum class FeatureFlag(
  val configurer: () -> KotlinLoggingPluginConfig,
  val expectationAdjuster: TestExecutionResultBuilder.() -> Unit,
) {
  DEFAULT({ KotlinLoggingPluginConfig() }, {}),
  DISABLE_ALL(
    { KotlinLoggingPluginConfig(disableAll = true) },
    {
      loggedEvent {
        message = formattedMessage
        callerDataFirstElement = null
      }
    },
  ),
  DISABLE_TRANSFORMING_NOT_IMPLEMENTED_API(
    { KotlinLoggingPluginConfig(disableTransformingNotImplementedApi = true) },
    {},
  ),
  DISABLE_TRANSFORMING_DEPRECATED_API(
    { KotlinLoggingPluginConfig(disableTransformingDeprecatedApi = true) },
    {},
  ),
  DISABLE_TRANSFORMING_ENTRY_EXIT_API(
    { KotlinLoggingPluginConfig(disableTransformingEntryExitApi = true) },
    {},
  ),
  DISABLE_TRANSFORMING_THROWING_CATCHING_API(
    { KotlinLoggingPluginConfig(disableTransformingThrowingCatchingApi = true) },
    {},
  ),
  DISABLE_COLLECTING_CALL_SITE_INFORMATION(
    { KotlinLoggingPluginConfig(disableCollectingCallSiteInformation = true) },
    { loggedEvent { callerDataFirstElement = null } },
  ),
}

data class FeatureFlagExpectationAdjuster(
  val applicableFeatureFlags: Set<FeatureFlag>,
  val expectationAdjuster: TestExecutionResultBuilder.() -> Unit,
)

class FeatureFlagExpectationAdjusterBuilder {
  private val applicableFeatureFlags: MutableSet<FeatureFlag> = mutableSetOf()
  private var expectationAdjuster: (TestExecutionResultBuilder.() -> Unit)? = null

  fun featureFlags(vararg flags: FeatureFlag) {
    applicableFeatureFlags.addAll(flags)
  }

  fun adjuster(block: TestExecutionResultBuilder.() -> Unit) {
    expectationAdjuster = block
  }

  fun build(): FeatureFlagExpectationAdjuster {
    return FeatureFlagExpectationAdjuster(
      applicableFeatureFlags = applicableFeatureFlags,
      expectationAdjuster = expectationAdjuster!!,
    )
  }
}
