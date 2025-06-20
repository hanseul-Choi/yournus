println("build-logic build.gradle.kts call")

plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.compiler.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "yournus.android.hilt"
            implementationClass = "com.yournus.shopping.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "yournus.kotlin.hilt"
            implementationClass = "com.yournus.shopping.HiltKotlinPlugin"
        }
    }
}