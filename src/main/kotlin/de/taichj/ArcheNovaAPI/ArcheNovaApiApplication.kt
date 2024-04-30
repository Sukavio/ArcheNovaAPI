package de.taichj.archeNovaAPI

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ArcheNovaApiApplication

fun main(args: Array<String>) {
	val context = runApplication<ArcheNovaApiApplication>(*args)
}
