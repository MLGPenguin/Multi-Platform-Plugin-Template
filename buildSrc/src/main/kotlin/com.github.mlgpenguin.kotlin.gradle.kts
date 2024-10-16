plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

val targetJavaVersionNumber = 17
val targetJavaVersion = JavaVersion.toVersion(targetJavaVersionNumber)

kotlin {
    jvmToolchain(targetJavaVersionNumber)
}

java {
    sourceCompatibility = targetJavaVersion
    targetCompatibility = targetJavaVersion

    if (JavaVersion.current() < targetJavaVersion) {
        toolchain.languageVersion.set(JavaLanguageVersion.of(targetJavaVersionNumber))
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"

    if (targetJavaVersionNumber >= 10 || JavaVersion.current().isJava10Compatible) {
        options.release.set(targetJavaVersionNumber)
    }
}