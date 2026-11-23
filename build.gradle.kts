import org.jetbrains.intellij.platform.gradle.TestFrameworkType

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.changelog")
    id("org.jetbrains.intellij.platform")
    id("org.jetbrains.intellij.platform.grammarkit")
}

// Read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
dependencies {
    testImplementation(libs.junit)

    // IntelliJ Platform Gradle Plugin Dependencies Extension - read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin-dependencies-extension.html
    intellijPlatform {
        intellijIdea("2026.2.4")
        testFramework(TestFrameworkType.Platform)

        // Add plugin dependencies for compilation here, for example:
        // bundledPlugin("com.intellij.java")
    }
}

version = providers.environmentVariable("PLUGIN_VERSION")
    .getOrElse("0.1.0")

intellijPlatform {
    pluginConfiguration {
        version = provider { project.version.toString() }
    }

    publishing {
        token = providers.environmentVariable("PUBLISH_TOKEN")
        channels = emptyList()
    }

    signing {
        certificateChain = providers.environmentVariable("CERTIFICATE_CHAIN")
        privateKey = providers.environmentVariable("PRIVATE_KEY")
        password = providers.environmentVariable("PRIVATE_KEY_PASSWORD")
            .orElse("")
    }
}

tasks {
    generateLexer {
        sourceFile = file("src/main/grammar/Dbc.flex")
    }

    generateParser {
        sourceFile = file("src/main/grammar/Dbc.bnf")
    }
}

sourceSets {
    main {
        java {
            srcDir(tasks.generateLexer)
            srcDir(tasks.generateParser)
        }
    }
}