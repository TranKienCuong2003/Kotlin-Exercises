class CustomException(message: String) : Exception(message)

fun testException() {
    throw CustomException("This is a custom exception!")
}

fun main() {
    try {
        testException()
    } catch (e: CustomException) {
        println("Caught: ${e.message}")
    }
}
