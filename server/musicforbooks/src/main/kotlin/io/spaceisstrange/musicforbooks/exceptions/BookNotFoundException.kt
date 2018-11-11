package io.spaceisstrange.musicforbooks.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No book found with this ID")
class BookNotFoundException : RuntimeException()