package com.back

class Test {

}

object Singleton {
    fun showMessgae() {
        println("Hello, World!")
    }
}

fun main() {
    val s1 = Singleton
    val s2 = Singleton

    println(s1 == s2) //싱글톤이므로 항상 같은 인스턴스가 반환

    val t1 = Test()
    val t2 = Test()

    println(t1 == t2)
}