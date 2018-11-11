package io.spaceisstrange.musicforbooks.controllers

import io.spaceisstrange.musicforbooks.data.BookRepository
import io.spaceisstrange.musicforbooks.model.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

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
}