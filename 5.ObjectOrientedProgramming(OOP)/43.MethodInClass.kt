fun main() {
    class Dog(val name: String) {
        fun bark() {
            println("$name is barking!")
        }
    }

    val dog = Dog("Buddy")
    dog.bark()
}
