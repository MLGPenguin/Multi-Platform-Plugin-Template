plugins {
    id("com.github.mlgpenguin.plugin")
    id("net.kyori.blossom") version "2.1.0"
}

group = "com.github.mlgpenguin"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.papermc.io/repository/maven-releases/")
    maven("https://repo.papermc.io/repository/maven-snapshots/")
}

dependencies {
    compileOnly("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
    annotationProcessor("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
}

sourceSets {
    main {
        blossom {
            resources {
                property("version", project.version.toString())
            }
        }
    }
}
