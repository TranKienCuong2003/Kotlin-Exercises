fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val sum = numbers.sum()
    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()

    println("Sum: $sum, Max: $max, Min: $min")
}
