println("application settings.gradle.kts call")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
@Suppress("UnstableApiUsage") // incubate 처리
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Yournus"

include(":app")

// core
include(
    ":core:model",
    ":core:data",
    ":core:domain",
    ":core:data-api",
    ":core:designsystem",
    ":core:navigation",
    ":core:ui",
)
include(
    ":feature:main",

)
include(":core:router:router")
include(":core:router:router-api")
