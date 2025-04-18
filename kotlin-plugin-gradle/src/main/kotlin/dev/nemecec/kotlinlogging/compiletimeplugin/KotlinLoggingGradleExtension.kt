/*
 * Copyright (C) 2025 Neeme Praks
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

package dev.nemecec.kotlinlogging.compiletimeplugin

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property

// Based on https://github.com/bnorm/kotlin-ir-plugin-template
open class KotlinLoggingGradleExtension(objects: ObjectFactory) {
  val disableAll: Property<Boolean> = objects.property(Boolean::class.java).convention(false)
  val disableTransformingDeprecatedApi: Property<Boolean> =
    objects.property(Boolean::class.java).convention(false)
  val disableTransformingEntryExitApi: Property<Boolean> =
    objects.property(Boolean::class.java).convention(false)
  val disableTransformingThrowingCatchingApi: Property<Boolean> =
    objects.property(Boolean::class.java).convention(false)
  val disableCollectingCallSiteInformation: Property<Boolean> =
    objects.property(Boolean::class.java).convention(false)
}
