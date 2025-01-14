import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun main() {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/posts/1")
    println("Response: ${response.readText()}")
    client.close()
}
