import com.yournus.shopping.setNamespace

plugins {
    id("yournus.android.library")
    id("yournus.android.compose")
}

android {
    setNamespace("core.ui")
}

dependencies {
    implementation(projects.core.model)
    implementation(projects.core.designsystem)
}