import com.yournus.shopping.setNamespace

plugins {
    id("yournus.android.library")
    id("kotlinx-serialization")
}

android {
    setNamespace("core.data.api")
}

dependencies {
    implementation(projects.core.model)
}