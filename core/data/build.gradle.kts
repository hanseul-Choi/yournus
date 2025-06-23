import com.yournus.shopping.setNamespace

plugins {
    id("yournus.android.library")
    id("yournus.android.hilt")
    id("kotlinx-serialization")
}

android {
    setNamespace("core.data")
}

dependencies {
    implementation(projects.core.model)
}