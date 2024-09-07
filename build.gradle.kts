plugins {
    java
}

group = "ru.vagapov"
version = "0.0.1"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
}

dependencies {
    implementation("org.springframework:spring-core:5.3.14")
    implementation("org.springframework:spring-context:5.3.14")
    testImplementation("org.springframework:spring-test:5.3.14")
    testImplementation("junit:junit:4.13.2")
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    withType<Test> {
        systemProperty("file.encoding", "UTF-8")
    }

    test {
        useJUnit()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }
}
