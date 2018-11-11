package io.spaceisstrange.musicforbooks.controllers

import io.spaceisstrange.musicforbooks.data.BookRepository
import io.spaceisstrange.musicforbooks.exceptions.BookNotFoundException
import io.spaceisstrange.musicforbooks.model.Book
import io.spaceisstrange.musicforbooks.services.BookService
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
    fun getBookByGoodReadsId(@PathVariable id: String): Book {
        return bookRepository
            .findByGoodReadsId(id)
            .orElseThrow { BookNotFoundException() }
    }

    @PostMapping("/")
    @ResponseBody
    fun createBook(@RequestBody book: Book): Book {
        return bookService.createOrUpdateBook(book)
    }

    @PutMapping("/{id}")
    @ResponseBody
    fun updateBook(@RequestBody book: Book, @PathVariable id: String): Book {
        return bookService.createOrUpdateBook(book)
    }
}