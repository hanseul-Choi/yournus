import com.yournus.shopping.setNamespace

plugins {
    id("yournus.android.library")
    id("yournus.android.compose")
    alias(libs.plugins.kotlin.serialization)
}

android {
    setNamespace("core.navigation")
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}