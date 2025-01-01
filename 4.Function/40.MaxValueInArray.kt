fun main() {
    fun findMax(numbers: IntArray): Int {
        return numbers.maxOrNull() ?: Int.MIN_VALUE
    }
    val numbers = intArrayOf(10, 20, 30, 40, 50)
    val max = findMax(numbers)
    println("Gia tri lon nhat trong mang la: $max")
}
