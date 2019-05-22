package com.bbl.demo

class Library {
    companion object {
        private val books: List<Book> = emptyList()
        fun findBookByIsbn(isbn: String): BookResult {
            val result = books.firstOrNull { it.isbn == isbn }
            return when (result) {
                null -> BookResult.BookNotFound
                else -> BookResult.BookFound(isbn)
            }
        }
    }

}
