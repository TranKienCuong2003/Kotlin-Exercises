import java.net.URI
import org.java-websocket.client.WebSocketClient
import org.java-websocket.handshake.ServerHandshake

fun main() {
    val client = object : WebSocketClient(URI("ws://example.com/chat")) {
        override fun onOpen(handshakedata: ServerHandshake?) {
            println("Connection established")
            send("Hello from Kotlin!")
        }

        override fun onMessage(message: String?) {
            println("Received: $message")
        }

        override fun onClose(code: Int, reason: String?, remote: Boolean) {
            println("Closed: $reason")
        }

        override fun onError(ex: Exception?) {
            ex?.printStackTrace()
        }
    }
    client.connect()
}
