plugins {
    id("org.jetbrains.intellij") version "1.15.0"
    kotlin("jvm") version "1.9.10"
}

group = "com.mimoccc"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.10")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
    // Compose UI dependencies for IntelliJ plugin
    implementation("org.jetbrains.compose.compose-gradle-plugin:1.6.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("io.mockk:mockk:1.13.9")
}

intellij {
    version.set("2023.2")
    type.set("IC") // Community Edition
    plugins.set(listOf("Kotlin", "org.jetbrains.compose"))
}

tasks {
    patchPluginXml {
        changeNotes.set("""
            Initial version - modular AI plugin with providers and helpers
        """.trimIndent())
    }
    runIde {
        jvmArgs = listOf("-Dsun.io.useCanonCaches=false")
    }
}
