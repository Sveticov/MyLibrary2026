plugins {
    kotlin("jvm") version "2.3.0"
    `java-library`
    `maven-publish`
}

group = "org.svetikov"
version = "1.0.1"

repositories {
    mavenCentral()

}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(23)
}

tasks.test {
    useJUnitPlatform()
}

publishing {

    publications {

        create<MavenPublication>("maven") {

            groupId = "com.svetikov"
            artifactId = "MyLibrary2026"
            version = "1.0.1"

            from(components["java"])
        }
    }
}