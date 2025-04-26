plugins {
    java
    id("maven-publish")    // required
    id("signing")          // optional, for Maven Central
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}
publishing {
    publications {
        create<MavenPublication>("release") {
            from(components["java"])
            groupId = "io.github.ronenfe"
            artifactId = "material-color-utilities"
            version = "1.0.0"
            pom {
                name.set("Material Color Utilities")
                description.set("A library for color utilities, ported for Android and Java.")
                url.set("https://github.com/ronenfe/material-color-utilities")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0")
                    }
                }
                developers {
                    developer {
                        id.set("ronenfe")
                        name.set("Ronen Festinger")
                        email.set("ronenfes@gmail.com") // <- put your real email
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/ronenfe/material-color-utilities.git")
                    developerConnection.set("scm:git:ssh://github.com/ronenfe/material-color-utilities.git")
                    url.set("https://github.com/ronenfe/material-color-utilities")
                }
            }
        }
    }
}
