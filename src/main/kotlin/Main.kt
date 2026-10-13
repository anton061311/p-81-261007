package com.back

fun main() {

    val obj: Any = "Hello"

    if (obj is String) {
        println(obj.length)
    }
}