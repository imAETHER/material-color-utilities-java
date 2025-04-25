plugins {
    id("java")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation(libs.annotation.jvm)
    testImplementation("junit:junit:4.13.2")
}