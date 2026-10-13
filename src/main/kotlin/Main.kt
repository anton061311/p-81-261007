// 부모 클래스 (코틀린에서는 기본적으로 상속 불가 → open 필요)
open class Animal {
    open fun makeSound() {
        println("Some generic animal sound")
    }
}

// 자식 클래스 (상속)
class Dog : Animal() {
    override fun makeSound() {
        println("Bark! Bark!")
    }
}