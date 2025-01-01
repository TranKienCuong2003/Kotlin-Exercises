fun main() {
    val str = "123a"

    try {
        val number = str.toInt()
        println("Chuyen doi thanh cong: $number")
    } catch (e: NumberFormatException) {
        println("Loi: Khong the chuyen doi \"$str\" thanh so")
    }
}
