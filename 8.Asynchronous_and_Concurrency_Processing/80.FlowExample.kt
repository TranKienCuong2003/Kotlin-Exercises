import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val flow = flow {
        for (i in 1..5) {
            delay(1000L)
            emit(i)
        }
    }

    flow.collect { value ->
        println("Received: $value")
    }
}
