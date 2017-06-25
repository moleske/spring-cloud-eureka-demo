package com.oleske

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringCloudEurekaDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudEurekaDemoApplication::class.java, *args)
}
