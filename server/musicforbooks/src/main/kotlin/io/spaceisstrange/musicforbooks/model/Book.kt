package io.spaceisstrange.musicforbooks.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "books")
data class Book(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val goodReadsId: String,
    val spotifyIds: List<String>
)