fun main() {
    val n = 5
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    println("Factorial of $n is: $factorial")
}
