fun main() {
    val array = intArrayOf(10, 20, 30, 40, 50)
    val value = 30
    if (value in array) {
        println("$value co ton tai trong mang")
    } else {
        println("$value khong ton tai trong mang")
    }
}
