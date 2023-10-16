// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.0.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        val nav_version = "2.5.3"
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.48")
        classpath ("com.google.gms:google-services:4.4.0")
        classpath ("com.google.firebase:firebase-crashlytics-gradle:2.9.9")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files

    }
}
