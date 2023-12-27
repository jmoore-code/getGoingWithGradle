plugins {
    java
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "main.java.com.gradleHero.languageApp.SayHello"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
