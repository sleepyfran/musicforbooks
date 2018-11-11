package io.spaceisstrange.musicforbooks.services

import io.spaceisstrange.musicforbooks.data.BookRepository
import io.spaceisstrange.musicforbooks.model.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DefaultBookService : BookService {
    @Autowired
    lateinit var bookRepository: BookRepository

    override fun createOrUpdateBook(book: Book): Book {
        return bookRepository
            .findByGoodReadsId(book.goodReadsId)
            .map {
                val modifiedBook = Book(it.id, it.goodReadsId, book.spotifyIds)
                bookRepository.save(modifiedBook)
            }
            .orElseGet {
                bookRepository.save(book)
            }
    }
}