import com.yournus.shopping.configureComposeFeature
import com.yournus.shopping.setNamespace

plugins {
    alias(libs.plugins.yournus.android.library)
    alias(libs.plugins.yournus.android.hilt)
    alias(libs.plugins.yournus.kotlin.library.serialization)
}

setNamespace("core.router")
configureComposeFeature()

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.navigation)
    implementation(libs.hilt.navigation.compose)

    implementation(projects.core.router.routerApi)
}
