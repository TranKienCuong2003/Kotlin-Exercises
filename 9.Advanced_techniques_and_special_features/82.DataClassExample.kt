data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Alice", 25)
    val person2 = person1.copy(age = 26)
    println(person1)
    println(person2)
}
