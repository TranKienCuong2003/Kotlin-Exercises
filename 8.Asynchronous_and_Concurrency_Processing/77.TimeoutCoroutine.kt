import kotlinx.coroutines.*
import kotlinx.coroutines.TimeoutCancellationException

fun main() = runBlocking {
    try {
        withTimeout(1000L) {
            delay(1500L)
            println("This will not be printed")
        }
    } catch (e: TimeoutCancellationException) {
        println("Operation timed out")
    }
}
