package com.bbl.demo

fun main() {

/*    // Declare variables
    //val kotlinBook = Book("ISBNTEST1", "Programming Kotlin")


    // Type inference: function increment
    fun increment(i: Int): Int {
        return i+1
    }

    val j = increment(5)

    // String quote and Triple Quotes

    val text =
            """
            Hello
            World
            """


    // String templates
    //println("Hello $text ")


    // Import renaming //dtoBook

    val kotlinBook = Book("ISBNTEST1", "Programming Kotlin")
    val rustBook = BookDTO("ISBNTEST2", "Programming Rust")


    // Ranges, step, reversed //myRangeReversedbyTwo
    //val ints = 1..10
    val ints = 1 until 9
    val myRangeReversedbyTwo = ints.step(2).reversed()
         myRangeReversedbyTwo.forEach{
       println(it)
   }



    // Loops //myRange
    val myIntsList = 1 until 9
    for (n in myIntsList){
        println(n)
    }*/


    // Instanciating classes


    // Equality
    /*val kotlinBook = Book("ISBNTEST1", "Programming Kotlin")
    val kotlinBook2 = Book("ISBNTEST1", "Programming Kotlin")
    println(kotlinBook===kotlinBook2)*/


    // Control flow as expressions //book isAvailable
   /* val kotlinBook = Book("ISBNTEST1", "Programming Kotlin")
    val result = kotlinBook.isAvailable()
    val state = if(result) "Cool" else  "May be next time !"
    println(state)*/


    // Null safety - Safe Null access ?. //findBookByIsbn
    // Elvis operator ?:
    /*val kotlinBook = Book("ISBNTEST1", "Programming Kotlin")
    val dddBook = Book("ISBNTEST2", "DDD")
    val result = Library(listOf(kotlinBook)).findBookByIsbn("TOTO") ?: dddBook
    println("result :: ${result}")*/


    // Smarts casts, explicits casts //printStringLength

    /*fun printStringLength(any: Any): Int{
        if(any is String){
           return any.length
        }
        return -1
    }*/


    // When expression with argument

    /*fun state(): String {
        val kotlinBook = Book("ISBNTEST1", "Programming Kotlin")
        val result = Library(listOf(kotlinBook)).findBookByIsbn("ISBNTEST1")
        return when(result){
            is BookResult.BookNotFound -> "May be next time"
            is BookResult.BookFound -> "Cool"
        }
    }

    val state = state()
    println("state :: $state")*/



    // When expression without argument // compare(x,y) or find another example
    /*fun compare(x: Int, y: Int): String = when{
        x > y -> "$x is greater than $y"
        x < y -> "$x is less than $y"
        x == y -> "$x is equalto $y"
        else -> "Unknown case"
    }

    val result = compare(5, 7)
    println("result :: $result")*/

    /*val defaultBook = Book("RUST")
    println(defaultBook)*/

    // Declaring classes with constructors


    // init keyword


    // data classes


    // copy method
    /*val kotlinBook = Book("ISBNTEST1", "Programming Kotlin")
    val rustBook = kotlinBook.copy(isbn="ISBNTEST2", title = "Programming RUST")
    println("rustBook :: $rustBook")*/

    // enum classes


    // Static methods, singleton and companion objects


    // Inheritance // Payment, CardPayment(amount)


    // Sealed classes //BookResult


    // Properties
   /* val kotlinBook = Book("ISBNTEST1")
    kotlinBook.isAvailable = true
    val result = kotlinBook.isAvailable
    println("result :: $result")*/


    // Names parameters


    // Default parameters


    // Extension functions: rate book
    /*val kotlinBook = Book("ISBNTEST1", "TEST")
    val result = kotlinBook.rate(5)

    println("result :: $result")



    // Functions/ single expressions functions //reverse
    fun transform(text: String, fn: (String) -> String): String{
        return fn(text)
    }

    val reverse = transform("Kotlin") {it.reversed()}
    println("result :: $reverse")*/



    // Infix Functions //book plus

    val kotlinBook = Book("ISBNTEST1", "TEST", 30)
    val rustBook = Book("ISBNTEST2", "TEST", 40)
    println(kotlinBook + rustBook)

    // Multiple return values: Pair getBookAndStatus


    // Operator overloading


    // Invoke


    // Functions literals //reverseCustom


    // Varargs and Spread operator //intArrayOf //*ints


    // Standard library functions //apply, let, with, run, lazy, use (try-with-resources), repeat --> book price


    // High order functions - function as a parameter //transform


    // High order functions - return a function //reverse


}