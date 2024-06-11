group = "com.mocoding.geometryapp"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.org.jetbrains.kotlin.android) version libs.versions.kotlin apply false
    alias(libs.plugins.jetbrainsCompose) version libs.versions.compose.plugin apply false
    alias(libs.plugins.composeCompiler) version libs.versions.kotlin apply false
    alias(libs.plugins.kotlinMultiplatform) version libs.versions.kotlin apply false
    alias(libs.plugins.androidApplication) version libs.versions.agp apply false
    alias(libs.plugins.androidLibrary) version libs.versions.agp apply false
}
