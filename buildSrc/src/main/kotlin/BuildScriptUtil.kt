import gradle.kotlin.dsl.accessors._285dcef16d8875fee0ec91e18e07daf9.processResources
import org.gradle.api.Project
import org.gradle.kotlin.dsl.invoke

fun Project.configureProcessResourcesFor(fileName: String, props: Map<String, Any> = mapOf("version" to version)) {
    tasks.processResources {
        inputs.properties(props)
        filteringCharset = "UTF-8"
        filesMatching(fileName) {
            expand(props)
        }
    }
}