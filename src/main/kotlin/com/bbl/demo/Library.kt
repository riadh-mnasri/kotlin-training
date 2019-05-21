package com.bbl.demo

class Library(val books: List<Book>) {

    fun findBookByIsbn(isbn: String): Book?{
        return books.firstOrNull() { it.isbn == isbn }
    }

}
