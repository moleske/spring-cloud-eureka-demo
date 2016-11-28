package com.oleske

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
open class SpringCloudEurekaDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudEurekaDemoApplication::class.java, *args)
}
