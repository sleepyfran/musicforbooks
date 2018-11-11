package io.spaceisstrange.musicforbooks

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MusicForBooksApplication

fun main(args: Array<String>) {
    runApplication<MusicForBooksApplication>(*args)
}
