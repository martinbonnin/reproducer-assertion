import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("maven-publish")
}

kotlin {
    jvm()
    macosArm64()
    macosX64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":module1"))
            }
        }
    }
}

tasks.withType(KotlinCompile::class.java).configureEach {
    kotlinOptions {
        allWarningsAsErrors = true
    }
}

