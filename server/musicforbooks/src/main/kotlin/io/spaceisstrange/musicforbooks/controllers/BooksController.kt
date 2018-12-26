package io.spaceisstrange.musicforbooks.controllers

import io.spaceisstrange.musicforbooks.data.BookRepository
import io.spaceisstrange.musicforbooks.exceptions.BookNotFoundException
import io.spaceisstrange.musicforbooks.model.Book
import io.spaceisstrange.musicforbooks.services.interfaces.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/api/books")
class BooksController {
    @Autowired
    lateinit var bookRepository: BookRepository

    @Autowired
    lateinit var bookService: BookService

    @GetMapping("/{id}")
    @ResponseBody
    fun getBookByGoodReadsId(@PathVariable id: Int): Book {
        return bookRepository
            .findByGoodReadsId(id)
            .orElseThrow { BookNotFoundException() }
    }

    @PostMapping("/{id}")
    @ResponseBody
    fun createBook(@RequestBody songs: List<String>, @PathVariable id: Int): Book {
        val book = Book(goodReadsId = id, spotifyIds = songs)
        return bookService.createOrUpdateBook(book)
    }

    @PutMapping("/{id}")
    @ResponseBody
    fun updateBook(@RequestBody songs: List<String>, @PathVariable id: Int): Book {
        val book = Book(goodReadsId = id, spotifyIds = songs)
        return bookService.createOrUpdateBook(book)
    }
}