package com.bbl.demo.functions

// Pass a function as parameter
fun main() {
    val text = transform("RIADH", { it.reversed()})
    println("text :: $text")

}

fun transform(text: String, fn: (String) -> String){
    val result = fn(text)
    println("result = [$result]")

}
