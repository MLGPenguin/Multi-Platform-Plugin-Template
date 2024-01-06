plugins {
    id("com.example.kotlin")
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
    implementation("com.github.Revxrsal.Lamp:common:3.1.8")
    implementation("com.github.Revxrsal.Lamp:bukkit:3.1.8")
    implementation("com.github.Revxrsal.Lamp:brigadier:3.1.8")
}