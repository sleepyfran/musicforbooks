package io.spaceisstrange.musicforbooks.services

import io.spaceisstrange.musicforbooks.model.Book

interface BookService {
    fun createOrUpdateBook(book: Book): Book
}