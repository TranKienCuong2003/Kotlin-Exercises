fun main() {
    println("Welcome to the Intelligence Game!")
    val answer = 7
    var guess: Int

    do {
        print("Guess the number between 1 and 10: ")
        guess = readLine()?.toIntOrNull() ?: 0

        when {
            guess < answer -> println("Too low!")
            guess > answer -> println("Too high!")
            else -> println("Correct! You guessed the right number.")
        }
    } while (guess != answer)
}
