class Person(
    val name: String = ""
) {
}

fun main() {
    val p = Person("Alice")
    println(p.name)
}