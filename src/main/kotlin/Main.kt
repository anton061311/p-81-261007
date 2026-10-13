class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 0)
}

fun main() {
    val person1 = Person("Alice", 24)
    val person2 = Person("Bob")

}