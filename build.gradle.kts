plugins {
    id("org.sonarqube") version "6.0.1.5171"
}

allprojects {
    plugins.apply("java") // Apply the common 'java' plugin to all projects (including the root)
    repositories {
        mavenCentral()
    }
}

sonar {
    properties {
        property("sonar.projectKey", "MacMasch_template")
        property("sonar.organization", "macmasch")
        property("sonar.host.url", "https://sonarcloud.io")
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