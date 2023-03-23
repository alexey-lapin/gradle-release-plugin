plugins {
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("release") {
            id = "com.github.alexey-lapin.gradle-release-plugin"
            implementationClass = "com.github.alexeylapin.gradle.release.ReleasePlugin"
        }
    }
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    annotationProcessor("org.projectlombok:lombok:1.18.26")
    compileOnly("org.projectlombok:lombok:1.18.26")

    implementation("org.eclipse.jgit:org.eclipse.jgit:5.13.1.202206130422-r")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}