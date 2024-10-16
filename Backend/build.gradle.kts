plugins {
    id("com.github.mlgpenguin.plugin")
}

group = "com.github.mlgpenguin"
version = "1.0.0"

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
}

configureProcessResourcesFor("plugin.yml")