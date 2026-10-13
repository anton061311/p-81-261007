package com.back

fun main() {
    val length = "Hello".also {
        println("Before: $it")
    }.uppercase().also {
        println("After: $it")
    }.length

    println("Length: $length")

}
