plugins {
    java
    id("maven-publish")    // required
    id("signing")          // optional, for Maven Central
}
group = "com.github.ronenfe"
version = "1.0.1"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
dependencies {
    testImplementation("junit:junit:4.13.2")
}