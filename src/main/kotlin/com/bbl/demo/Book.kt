package com.bbl.demo

import com.bbl.demo.external.Book as BookDTO
import java.util.*

data class Book(val isbn: String, val title: String, var price: Number=-1){

    val capitalizedTitle: String
    var availability: Boolean
    get() = Random().nextBoolean()
    set(value) {
        availability = value
     }

    constructor(book: BookDTO): this(book.isbn, book.name)

    init {
        capitalizedTitle = title.capitalize()
    }

    fun isAvailable(): Boolean {
        return Random().nextBoolean()
    }

    operator fun invoke(): Book{
        return Book(isbn, title)
    }


}
