println("app build.gradle.kts call")

plugins {
    id("yournus.android.application")
}

android {
    namespace = "com.yournus.shopping"

    defaultConfig {
        applicationId = "com.yournus.shopping"
        versionCode = 1
        versionName = "1.0"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
//    implementation(projects.core.navigation)
//    implementation(projects.feature.main)
//    implementation(projects.feature.home)

//    implementation(projects.core.designsystem)

//    implementation(projects.widget)


//    testImplementation(projects.core.testing)
}