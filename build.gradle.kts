import com.adrianrafo.kotlin_dsl_hello.Greeting

plugins {
  kotlin("jvm") version "1.3.11"
  id("com.adrianrafo.kotlin_dsl_hello")
}

repositories {
  mavenCentral()
}

group = "com.adrianrafo"
version = "0.0.1-SNAPSHOT"

dependencies {
  implementation(kotlin("stdlib-jdk8"))
}

tasks.getByName<Greeting>("greet") {
  message = "Kotlin"
}