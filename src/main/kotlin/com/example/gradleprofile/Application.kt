package com.example.gradleprofile

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradleProfileApplication

fun main(args: Array<String>) {
    runApplication<GradleProfileApplication>(*args)
}