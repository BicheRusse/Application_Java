plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.12.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.openjfx:javafx:24")
    implementation("org.postgresql:postgresql:42.7.5")

}

tasks.test {
    useJUnitPlatform()
}