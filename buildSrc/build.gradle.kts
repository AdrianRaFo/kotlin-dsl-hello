plugins {
  `kotlin-dsl`
  `java-gradle-plugin`
}

repositories {
  jcenter()
}

gradlePlugin {
  plugins {
    register("kotlin_dsl_hello-plugin") {
      id = "com.adrianrafo.kotlin_dsl_hello"
      implementationClass = "com.adrianrafo.kotlin_dsl_hello.GreetPlugin"
    }
  }
}