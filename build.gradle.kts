plugins {
    alias(libs.plugins.androidLibrary)
}

android {
    namespace = "me.teble.xposed.stub"
    compileSdk = libs.versions.compileSdk.get().toInt()
    buildToolsVersion = libs.versions.buildTool.get()
    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
    }


    lint {
        abortOnError = false
    }
}

dependencies {
    // androidx nullability stubs
    compileOnly(libs.androidx.annotation)
}
