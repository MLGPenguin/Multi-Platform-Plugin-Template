plugins {
    id("com.github.mlgpenguin.kotlin")
    id("com.github.johnrengelman.shadow")
}

group = "com.github.mlgpenguin.multiplatformtemplate"
version = "1.0.0"

dependencies {
    implementation(project(":Backend"))
    implementation(project(":Velocity"))
    implementation(project(":Bungee"))
}

tasks {
     jar {
        enabled = false
     }

    build {
        dependsOn(shadowJar)
    }

    shadowJar {
        destinationDirectory.set(file("$rootDir/build"))
    }

    clean {
        dependsOn(
            project(":Velocity").tasks.clean,
            project(":Bungee").tasks.clean,
            project(":Backend").tasks.clean,
            project(":SharedLogic").tasks.clean,
        )
    }
}

