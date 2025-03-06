plugins {
}

allprojects {
    plugins.apply("java") // Apply the common 'java' plugin to all projects (including the root)
    repositories {
        mavenCentral()
    }
}

tasks.named<Jar>("jar") {
    enabled = false
}

repositories {
    mavenCentral()
}

buildscript {
    repositories {
        mavenCentral() // or gradlePluginPortal()
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}