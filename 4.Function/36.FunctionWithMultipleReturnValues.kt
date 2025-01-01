fun main() {
    fun getMinMax(numbers: IntArray): Pair<Int, Int> {
        val min = numbers.minOrNull() ?: 0
        val max = numbers.maxOrNull() ?: 0
        return Pair(min, max)
    }
    val result = getMinMax(intArrayOf(1, 3, 2, 5, 4))
    println("Gia tri nho nhat: ${result.first}, Gia tri lon nhat: ${result.second}")
}
