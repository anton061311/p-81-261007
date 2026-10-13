package com.back

fun main() {
    val name: String? = "hello"

    val len = name?.length ?: 0
    println(len)

    var rst = name?.let {
        println(it.length)
        10
    }

    println(rst)
}
