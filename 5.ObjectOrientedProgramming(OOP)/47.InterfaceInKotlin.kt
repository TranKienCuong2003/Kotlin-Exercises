interface Animal {
    fun sound()
}

class Dog : Animal {
    override fun sound() {
        println("Woof")
    }
}

fun main() {
    val dog = Dog()
    dog.sound()
}
