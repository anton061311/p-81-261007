package com.back

fun main() {
    val num = 5

    val rst = num.run {
        this * 2 + 10
    }

    println(rst)
}
