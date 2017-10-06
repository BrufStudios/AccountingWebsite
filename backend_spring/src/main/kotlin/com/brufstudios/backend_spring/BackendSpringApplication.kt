package com.brufstudios.backend_spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BackendSpringApplication

fun main(args: Array<String>) {
    SpringApplication.run(BackendSpringApplication::class.java, *args)
}
