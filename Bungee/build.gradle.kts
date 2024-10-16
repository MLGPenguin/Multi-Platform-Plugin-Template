plugins {
    id("com.github.mlgpenguin.plugin")
}

group = "com.github.mlgpenguin"
version = "1.0.0"

repositories {
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    compileOnly("net.md-5:bungeecord-api:1.18-R0.1-SNAPSHOT")
}

configureProcessResourcesFor("bungee.yml")


