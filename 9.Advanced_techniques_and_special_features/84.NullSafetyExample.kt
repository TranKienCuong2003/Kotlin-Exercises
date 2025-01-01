fun getLength(str: String?): Int {
    return str?.length ?: 0
}

fun main() {
    val message: String? = "Hello"
    println(getLength(message))
    println(getLength(null))
}
