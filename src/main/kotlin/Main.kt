package com.back

fun sayHello(name: String = "Guest", age: Int) {
    println("Hello, $name!")
}

fun main() {
    sayHello(age = 10)
    sayHello("John", age = 10)
}