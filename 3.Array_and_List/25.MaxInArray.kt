fun main() {
    val array = intArrayOf(10, 20, 30, 40, 50)
    var max = array[0]
    for (i in array) {
        if (i > max) {
            max = i
        }
    }
    println("Gia tri lon nhat trong mang: $max")
}
