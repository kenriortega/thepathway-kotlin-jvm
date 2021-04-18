import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
    kotlin("plugin.serialization") version "1.4.32"
    application
}

group = "qva.kenri"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    val ktxCoroutines = "1.4.3"
    val ktorVersion = "1.5.3"
    val logbackVersion = "1.2.3"
    val koinVersion = "3.0.1"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$ktxCoroutines")
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-cio:$ktorVersion")
    implementation("io.ktor:ktor-client-serialization:$ktorVersion")
    implementation("io.ktor:ktor-client-logging:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    implementation("io.insert-koin:koin-core-ext:$koinVersion")
    // testing
    testImplementation(kotlin("test-junit"))
    testImplementation("io.insert-koin:koin-test-junit4:$koinVersion")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}