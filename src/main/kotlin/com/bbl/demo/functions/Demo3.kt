package com.bbl.demo.functions

// Return functions
fun main() {
val reverse = reverse()
val result = reverse("RIADH")

println("result :: $result")

}

fun reverse(): (String) -> String = { it.reversed()}
