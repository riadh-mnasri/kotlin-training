package com.bbl.demo

import kotlin.random.Random

data class Book(val isbn: String, val title: String, val price: Int=-1) {
    /*var isAvailable: Boolean = false
    get() = isAvailable
    set(value) {
        isAvailable = true
    }*/

    operator fun plus(book: Book): Book{
        return Book(isbn + book.isbn, title + " " + book.title, price + book.price)
    }

}
