plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "MultiPlatformTemplate"

include("Backend", "Bungee", "Velocity", "SharedLogic")
