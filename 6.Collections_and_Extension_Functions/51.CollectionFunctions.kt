fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val doubled = numbers.map { it * 2 }
    println("Doubled numbers: $doubled")

    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")

    val sum = numbers.reduce { acc, number -> acc + number }
    println("Sum of numbers: $sum")
}
