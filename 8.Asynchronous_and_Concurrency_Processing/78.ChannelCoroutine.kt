import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun main() = runBlocking {
    val channel = Channel<Int>()

    launch {
        for (x in 1..5) {
            channel.send(x)
            delay(500L)
        }
        channel.close()
    }

    for (y in channel) {
        println("Received: $y")
    }
}
