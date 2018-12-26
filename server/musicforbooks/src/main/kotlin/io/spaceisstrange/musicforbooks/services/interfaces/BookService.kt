package io.spaceisstrange.musicforbooks.services.interfaces

import io.spaceisstrange.musicforbooks.model.Book

interface BookService {
    fun createOrUpdateBook(book: Book): Book
}