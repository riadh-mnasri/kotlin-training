package com.bbl.demo

sealed class BookResult {

    class BookFound(isbn: String): BookResult()
    object BookNotFound : BookResult()

}
