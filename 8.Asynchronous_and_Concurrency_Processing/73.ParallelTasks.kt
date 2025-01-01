import kotlinx.coroutines.*

fun main() = runBlocking {
    val deferred = async {
        delay(1000L)
        "Hello, Async!"
    }
    println("Result: ${deferred.await()}")
}
