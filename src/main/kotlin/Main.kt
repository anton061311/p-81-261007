package com.back

fun main() {
    val names = listOf("Alics", "Bob", "Charlie")

    names.map {
    "Hello, $it"
    }
        .forEach(::println)
}