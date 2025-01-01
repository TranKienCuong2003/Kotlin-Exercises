import kotlinx.coroutines.*

fun main() = runBlocking {
    val chatRoom = ChatRoom()

    launch { chatRoom.receiveMessage("Hello!") }
    launch { chatRoom.receiveMessage("Hi, how are you?") }
    launch { chatRoom.sendMessage("I'm good, thanks!") }

    delay(1000L)
}

class ChatRoom {
    suspend fun sendMessage(message: String) {
        delay(500L)
        println("Sent: $message")
    }

    suspend fun receiveMessage(message: String) {
        delay(500L)
        println("Received: $message")
    }
}
