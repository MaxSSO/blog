package com.maxsso.blog

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogApplication : CommandLineRunner {
	override fun run(vararg args: String?) {
	    println("START!")
	}
}

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
}
