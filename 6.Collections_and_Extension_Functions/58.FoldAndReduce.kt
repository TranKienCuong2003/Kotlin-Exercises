fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val sumUsingReduce = numbers.reduce { acc, number -> acc + number }
    val sumUsingFold = numbers.fold(0) { acc, number -> acc + number }

    println("Sum using reduce: $sumUsingReduce")
    println("Sum using fold: $sumUsingFold")
}
