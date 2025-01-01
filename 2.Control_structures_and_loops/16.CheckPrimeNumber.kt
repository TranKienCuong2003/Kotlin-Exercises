fun main() {
    val n = 7
    var isPrime = true
    for (i in 2..n / 2) {
        if (n % i == 0) {
            isPrime = false
            break
        }
    }
    if (isPrime && n > 1) {
        println("$n is a prime number")
    } else {
        println("$n is not a prime number")
    }
}
