plugins {
    id("java")
    id("maven-publish")
}
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])  // Using the default Java component
        }
    }
    repositories {
        maven {
            url = uri("https://jitpack.io")  // JitPack repository URL
        }
    }
}
dependencies {
    implementation("org.jetbrains:annotations:24.0.1")
    testImplementation("junit:junit:4.13.2")
}