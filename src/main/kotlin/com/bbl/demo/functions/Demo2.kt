package com.bbl.demo.functions

//Use functions
fun main() {
    val ints = listOf(7, 8, 9, 6, 4, 3)

    val evens = ints.filter { it % 2 == 0 }

    val odds = ints.filter { it % 2 == 1 }

}