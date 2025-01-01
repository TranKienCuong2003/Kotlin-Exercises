open class Animal(val name: String) {
    fun speak() {
        println("$name makes a sound")
    }
}

class Dog(name: String) : Animal(name)

fun main() {
    val dog = Dog("Buddy")
    dog.speak()
}
