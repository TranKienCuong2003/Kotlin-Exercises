fun main() {
    val array = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    for (i in array) {
        for (j in i) {
            print("$j ")
        }
        println()
    }
}
