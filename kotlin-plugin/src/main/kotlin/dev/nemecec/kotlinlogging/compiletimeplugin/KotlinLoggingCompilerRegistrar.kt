/*
 * Copyright (C) 2020 Brian Norman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:OptIn(ExperimentalCompilerApi::class)

package dev.nemecec.kotlinlogging.compiletimeplugin

import com.google.auto.service.AutoService
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.cli.common.messages.MessageCollector
import org.jetbrains.kotlin.compiler.plugin.CompilerPluginRegistrar
import org.jetbrains.kotlin.compiler.plugin.ExperimentalCompilerApi
import org.jetbrains.kotlin.config.CommonConfigurationKeys
import org.jetbrains.kotlin.config.CompilerConfiguration

// Based on https://github.com/bnorm/kotlin-ir-plugin-template
@AutoService(CompilerPluginRegistrar::class)
class KotlinLoggingCompilerRegistrar(
  private val defaultConfig: dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingPluginConfig
) : CompilerPluginRegistrar() {
  override val supportsK2 = true

  @Suppress("unused") // Used by service loader
  constructor() : this(dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingPluginConfig())

  override fun ExtensionStorage.registerExtensions(configuration: CompilerConfiguration) {
    val messageCollector =
      configuration[CommonConfigurationKeys.MESSAGE_COLLECTOR_KEY] ?: MessageCollector.NONE
    val config =
      dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingPluginConfig(
        disableAll =
          configuration[
            dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingCommandLineProcessor.Companion
              .ARG_DISABLE_ALL] ?: defaultConfig.disableAll,
        disableTransformingDeprecatedApi =
          configuration[
            dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingCommandLineProcessor.Companion
              .ARG_DISABLE_TRANSFORMING_DEPRECATED_API]
            ?: defaultConfig.disableTransformingDeprecatedApi,
        disableTransformingNotImplementedApi =
          configuration[
            dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingCommandLineProcessor.Companion
              .ARG_DISABLE_TRANSFORMING_NOT_IMPLEMENTED_API]
            ?: defaultConfig.disableTransformingNotImplementedApi,
        disableTransformingEntryExitApi =
          configuration[
            dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingCommandLineProcessor.Companion
              .ARG_DISABLE_TRANSFORMING_ENTRY_EXIT_API]
            ?: defaultConfig.disableTransformingEntryExitApi,
        disableTransformingThrowingCatchingApi =
          configuration[
            dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingCommandLineProcessor.Companion
              .ARG_DISABLE_TRANSFORMING_THROWING_CATCHING_API]
            ?: defaultConfig.disableTransformingThrowingCatchingApi,
        disableCollectingCallSiteInformation =
          configuration[
            dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingCommandLineProcessor.Companion
              .ARG_DISABLE_COLLECTING_CALL_SITE_INFORMATION]
            ?: defaultConfig.disableCollectingCallSiteInformation,
      )
    IrGenerationExtension.registerExtension(
      dev.nemecec.kotlinlogging.compiletimeplugin.KotlinLoggingIrGenerationExtension(
        messageCollector,
        config,
      )
    )
  }
}
