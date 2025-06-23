import com.yournus.shopping.setNamespace

plugins {
    id("yournus.android.library")
}

android {
    setNamespace("core.domain")
}

dependencies {
    implementation(projects.core.model) // dsl 때문에 가능

    implementation(libs.inject) // hilt inject 어노테이션 사용
}