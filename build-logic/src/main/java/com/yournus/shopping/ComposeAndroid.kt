package com.yournus.shopping

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.compose.compiler.gradle.ComposeCompilerGradlePluginExtension

internal fun Project.configureComposeAndroid() {
    with(plugins) {
        apply("org.jetbrains.kotlin.plugin.compose")
    }

    val libs = extensions.libs
    androidExtension.apply {
        dependencies {
            val bom = libs.findLibrary("androidx-compose-bom").get()
            add("implementation", platform(bom))
            add("androidTestImplementation", platform(bom))

            add("implementation", libs.findLibrary("androidx.compose.material3").get())
            add("implementation", libs.findLibrary("androidx.compose.ui").get())
            add("implementation", libs.findLibrary("androidx.compose.ui.tooling.preview").get())
//            add("androidTestImplementation", libs.findLibrary("androidx.test.ext").get())
//            add("androidTestImplementation", libs.findLibrary("androidx.test.espresso.core").get())
            add("androidTestImplementation", libs.findLibrary("androidx.compose.ui.test").get())
            add("debugImplementation", libs.findLibrary("androidx.compose.ui.tooling").get())
            add("debugImplementation", libs.findLibrary("androidx.compose.ui.testManifest").get())
        }
    }

    // Compose Compiler Customize
    extensions.getByType<ComposeCompilerGradlePluginExtension>().apply {
        enableStrongSkippingMode.set(true) // recomposition을 엄격하게 판단
        includeSourceInformation.set(true) // 컴포즈 컴파일 시 추가 정보를 디버깅에 표시
    }
}