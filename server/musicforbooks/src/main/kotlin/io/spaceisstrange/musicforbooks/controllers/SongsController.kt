package io.spaceisstrange.musicforbooks.controllers

import io.spaceisstrange.musicforbooks.data.BookRepository
import io.spaceisstrange.musicforbooks.model.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/api/songs")
class SongsController {
    @Autowired
    lateinit var bookRepository: BookRepository

    @GetMapping("/{id}")
    @ResponseBody
    fun getBySpotifyId(@PathVariable id: String): List<Book> {
        return bookRepository
                .findBySpotifyIds(id)
    }

    @GetMapping
    @ResponseBody
    fun getMultipleBySpotifyIds(@RequestParam("ids") ids: String): List<Book> {
        val splitIds = ids.split(",")
        var result = listOf<Book>()

        for (id in splitIds) {
            val associatedBooks = bookRepository.findBySpotifyIds(id)
            result = result.plus(associatedBooks)
        }

        return result
    }
}