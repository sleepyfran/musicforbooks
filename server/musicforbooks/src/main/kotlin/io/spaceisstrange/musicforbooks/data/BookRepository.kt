package io.spaceisstrange.musicforbooks.data

import io.spaceisstrange.musicforbooks.model.Book
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BookRepository : MongoRepository<Book, String> {
    fun findByGoodReadsId(bookId: String): Optional<Book>
    fun findBySpotifyIds(spotifyId: String): List<Book>
}