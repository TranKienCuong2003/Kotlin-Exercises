fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    val oddNumbers = numbers.filter { it % 2 != 0 }

    println("Even numbers: $evenNumbers")
    println("Odd numbers: $oddNumbers")
}
