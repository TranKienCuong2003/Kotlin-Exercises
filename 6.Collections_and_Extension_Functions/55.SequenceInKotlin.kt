fun main() {
    val numbers = sequenceOf(1, 2, 3, 4, 5)

    val result = numbers
        .map { it * 2 }
        .filter { it > 5 }
        .toList()

    println("Result: $result")
}
