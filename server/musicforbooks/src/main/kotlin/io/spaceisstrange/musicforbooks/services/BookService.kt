package io.spaceisstrange.musicforbooks.services

import io.spaceisstrange.musicforbooks.data.BookRepository
import io.spaceisstrange.musicforbooks.model.Book
import io.spaceisstrange.musicforbooks.services.interfaces.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookService : BookService {
    @Autowired
    lateinit var bookRepository: BookRepository

    override fun createOrUpdateBook(book: Book): Book {
        return bookRepository
            .findByGoodReadsId(book.goodReadsId)
            .map {
                val updatedSongs = it
                    .spotifyIds
                    .plus(book.spotifyIds)
                    .distinct()

                val modifiedBook = Book(it.id, it.goodReadsId, updatedSongs)
                bookRepository.save(modifiedBook)
            }
            .orElseGet {
                bookRepository.save(book)
            }
    }
}