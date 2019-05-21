package com.bbl.demo

import com.bbl.demo.external.Book as BookDTO
import java.util.*

data class Book(val isbn: String, val title: String, var price: Number=-1){

    val capitalizedTitle: String

    constructor(book: BookDTO): this(book.isbn, book.name)

    init {
        capitalizedTitle = title.capitalize()
    }

    fun isAvailable(): Boolean {
        return Random().nextBoolean()
    }
}
