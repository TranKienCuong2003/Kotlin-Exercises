fun main() {
    val target = (1..10).random()
    var guess: Int
    println("Guess the number between 1 and 10")

    do {
        print("Enter your guess: ")
        guess = readLine()?.toIntOrNull() ?: 0
        when {
            guess < target -> println("Too low!")
            guess > target -> println("Too high!")
            else -> println("You guessed it!")
        }
    } while (guess != target)
}
