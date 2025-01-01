import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        val job = launch {
            throw Exception("Error in Coroutine")
        }
        job.join()
    } catch (e: Exception) {
        println("Caught exception: ${e.message}")
    }
}
