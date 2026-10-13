package com.back

class Person {
    var name: String = ""
    var age: Int = 0

    fun printInfo() {
        println("$name is $age years old.")
    }
}

    fun main() {
        val person1 = Person()
        person1.name = "Alice"
        person1.age = 25

        person1.printInfo()

        val person2 = Person().apply {
            name = "Alice"
            age = 25
        }

        person2.printInfo()
    }
