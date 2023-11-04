pluginManagement {
    repositories {
        google()
        maven ( "https://jitpack.io" )
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "WisdomWing"
include(":app")
 