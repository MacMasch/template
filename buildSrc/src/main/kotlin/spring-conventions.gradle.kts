plugins {
    id("java-conventions")
    id("org.springframework.boot")
}

apply(plugin = "io.spring.dependency-management")

dependencies {
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    developmentOnly("org.springframework.boot:spring-boot-devtools")
}
