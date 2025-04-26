plugins {
    java
    id("maven-publish")    // required
    id("signing")          // optional, for Maven Central
}

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