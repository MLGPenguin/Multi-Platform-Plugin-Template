plugins {
    id("com.github.mlgpenguin.kotlin")
}

group = "com.github.mlgpenguin"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    // IF the downstream modules (spigot/velocity/bungee) need access to KTOR dependency,
    // change 'implementation' to 'api'. But for better build performance try to abstract KTOR methods.

    // implementation("/* KTOR */")
}