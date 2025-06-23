import com.yournus.shopping.setNamespace

plugins {
    id("yournus.android.feature")
}

android {
    setNamespace("feature.main")

//    defaultConfig
}

dependencies {
    implementation(projects.core.dataApi)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.lifecycle.viewModelCompose)
    implementation(libs.kotlinx.immutable)
}