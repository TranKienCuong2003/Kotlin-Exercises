import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL

suspend fun fetchDataFromAPI(): String {
    val url = URL("https://jsonplaceholder.typicode.com/posts")
    val connection = url.openConnection() as HttpURLConnection
    connection.requestMethod = "GET"

    return connection.inputStream.bufferedReader().use { it.readText() }
}

fun main() = runBlocking {
    val data = fetchDataFromAPI()
    println("Fetched Data: $data")
}
