println("build-logic settings.gradle.kts call")

// implementation("com.squareup.okhttp3:okhttp:4.9.3") -> implementation(libs.okhttp)
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS") // 타입 안전성 있게 접근 가능하게 함

@Suppress("UnstableApiUsage")
dependencyResolutionManagement { // 모든 하위 프로젝트의 의존성 리포지토리나 버전 관리 정책 통일
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs { // 버전 카탈로그 추가
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}