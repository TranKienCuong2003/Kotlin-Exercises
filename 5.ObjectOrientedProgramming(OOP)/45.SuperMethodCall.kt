open class Animal(val name: String) {
    fun speak() {
        println("$name makes a sound")
    }
}

class Dog(name: String) : Animal(name) {
    fun bark() {
        super.speak()
        println("$name barks!")
    }
}

fun main() {
    val dog = Dog("Buddy")
    dog.bark()
}
