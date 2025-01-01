fun main() {
    fun isPrime(n: Int): Boolean {
        if (n <= 1) return false
        for (i in 2..n / 2) {
            if (n % i == 0) return false
        }
        return true
    }
    val number = 7
    if (isPrime(number)) {
        println("$number la so nguyen to")
    } else {
        println("$number khong phai la so nguyen to")
    }
}
