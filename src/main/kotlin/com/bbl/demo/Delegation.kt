package com.bbl.demo

interface MyBook{
    fun category(): String

    fun rate(note: Int): String
}

class EBook(private val title: String): MyBook {
    override fun category(): String{
        return "EBook: $title"
    }

    override fun rate(note: Int): String{
        return "*".repeat(note)
    }


}

class KindleBook(b: MyBook): MyBook by b

fun main() {
    val paperBook = EBook("Programming Kotlin")
    val kindleBook = KindleBook(paperBook)
    println("kindleBook :: ${kindleBook.category()}")
}