import kotlinx.coroutines.*

fun main() = runBlocking {
    val job1 = launch {
        delay(1000L)
        println("Task 1 completed")
    }

    val job2 = async {
        delay(500L)
        "Task 2 completed"
    }

    job1.join()
    println(job2.await())
}
