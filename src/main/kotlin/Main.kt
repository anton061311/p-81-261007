package com.back

import Person

fun main() {

    val p1 = Person("John")
    val p2 = Person("John")

    print(p1 == p2)
    print(p1.toString())
}