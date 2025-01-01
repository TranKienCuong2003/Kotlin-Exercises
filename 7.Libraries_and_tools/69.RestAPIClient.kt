import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/posts/1")
    println("Response: ${response.readText()}")
    client.close()
}
