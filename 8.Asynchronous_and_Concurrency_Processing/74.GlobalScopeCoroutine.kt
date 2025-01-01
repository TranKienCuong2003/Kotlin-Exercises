import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("Hello from GlobalScope!")
    }
    Thread.sleep(2000L)
}
