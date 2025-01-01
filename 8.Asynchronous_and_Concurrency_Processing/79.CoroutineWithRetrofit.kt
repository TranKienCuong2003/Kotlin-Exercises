import kotlinx.coroutines.*
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

data class Post(val id: Int, val title: String)

interface ApiService {
    @GET("posts/1")
    suspend fun getPost(): Post
}

fun main() = runBlocking {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(ApiService::class.java)
    val post = service.getPost()
    println("Post: ${post.title}")
}
