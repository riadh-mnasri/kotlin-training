package com.bbl.demo

import com.bbl.demo.external.Book as BookDTO

fun main() {
    // Declare variables

    /* val kotlinBook: Book = Book("ISBNTEST1", "Programming Kotlin") */
    //kotlinBook = null


    // Type inference
    /* val price: Number = 100
    fun increment(i: Int) = i+1 */

    // String quote and Triple Quotes

    /* val text = "Hello"
     val paragraph = """
                    Hello
                    World
                    """
     println("paragraph $paragraph") */

    // String templates

    // Import renaming

    /* val book = Book("ISBNTEST1", "Programming Kotlin")
    val dtoBook = BookDTO(book.isbn, book.title)*/


    // Ranges, step, reversed

    /* val myRange = 1..10
    val myRangeReversedbyTwo = (1..10).step(2).reversed()
    myRangeReversedbyTwo.forEach {
        println(">>>> $it")
    }*/

    // Loops

    /*val myRange = 1..10
    for(i in myRange){
        println(i)
    }*/


    // Instanciating classes
    // Done

    // Equality
    /*val kotlinBook: Book = Book("ISBNTEST1", "Programming Kotlin")
    val kotlinBook2: Book = Book("ISBNTEST1", "Programming Kotlin")
    println(kotlinBook==kotlinBook2)*/


    // Control flow as expressions
    /* val kotlinBook: Book = Book("ISBNTEST1", "Programming Kotlin")
    val result = if(kotlinBook.isAvailable()) "cool" else "may be next time !"
    println("result :: $result")*/

    // Null safety - Safe Null access
    /*val kotlinBook: Book = Book("ISBNTEST1", "Programming Kotlin")
    val result = Library(listOf(kotlinBook)).findBookByIsbn("ISBNTEST1")
    println("result :: ${result?.isbn}")*/


    // Elvis operator
    /*val kotlinBook: Book = Book("ISBNTEST1", "Programming Kotlin")
    val myDefaultFavoriteBook: Book = Book("ISBNTEST2", "Domain Driven Design")
    val result = Library(listOf(kotlinBook)).findBookByIsbn("ISBNTEST1") ?: myDefaultFavoriteBook
    println("result :: $result")*/

    // Force operation
    /*val kotlinBook: Book = Book("ISBNTEST1", "Programming Kotlin")
    val result = Library(listOf(kotlinBook)).findBookByIsbn("TOTO")
    println("result :: ${result!!.isbn}")*/

    // Smarts casts, explicits casts
    /* fun printStringLenght(any: Any){
        if(any is String){
            println("any = [${any.length}]")
        }
    }
    printStringLenght("Hello")
     */

    // When expression with argument



    // When expression without argument


    // Declaring classes with constructors


    // init keyword


    // data classes


    // copy method
    /*
    val kotlinBook: Book = Book("ISBNTEST1", "Programming Kotlin")
    val copiedBook = kotlinBook.copy("ISBNTEST2", "Programming RUST")
    println("copied book :: $copiedBook")

     */


    // enum classes


    // Static methods, singleton and companion objects


    // Inheritance // Payment, CardPayment(amount)


    // Sealed classes


    // Functions/ single expressions functions


    // Names parameters


    // Default parameters


    // Extension functions


    // Multiple return values


    // Infix Functions


    // Operator overloading


    // Invoke


    // Functions literals


    // Varargs and Spread operator

    /*
    val ints = intArrayOf(1,6,7,8,3)
    fun displayInts(vararg ints: Int){
        ints.asSequence().forEach {
            println("$it")
        }
    }

    displayInts(*ints, 5, 7, 8)
    */



    // Standard library functions //apply, let, with, run, lazy, use (try-with-resources), repeat

    /* val kotlinBook: Book = Book("ISBNTEST1", "Programming Kotlin")
    kotlinBook.apply { price = 30 }
    kotlinBook.let { it.price=30  }
    with(kotlinBook){
        price = 30
    }
    val rustBook = lazy { newBook("ISBN3", "Programming rust")}
    println("test")
    println("result : ${rustBook.value.title}") */


    // High order functions - function as a parameter

    /*

    fun transform(text: String, fn: (String) -> String): String{
        return fn(text)
    }

    val result = transform("RIADH", {it.reversed()})
    println("result :: $result")

    */

    // High order functions - return a function

    /* fun reverse(): (String) -> String = {it.reversed()}
    val myReverse = reverse()
    val result = myReverse("RIADH")
    println("result :: $result")

     */




    // Properties


}

fun newBook(isbn: String, title: String): Book {
    return Book(isbn, title)
}


