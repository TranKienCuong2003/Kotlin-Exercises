abstract class Animal(val name: String) {
    abstract fun sound()
}

class Dog(name: String) : Animal(name) {
    override fun sound() {
        println("$name barks")
    }
}

fun main() {
    val dog = Dog("Buddy")
    dog.sound()
}
