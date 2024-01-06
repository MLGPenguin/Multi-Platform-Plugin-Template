plugins {
    id("com.example.kotlin")
    id("com.github.johnrengelman.shadow")
}

repositories {
    maven("https://repo.flyte.gg/releases")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("gg.flyte:twilight:1.0.33")
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    shadowJar {
        minimize()
    }
}