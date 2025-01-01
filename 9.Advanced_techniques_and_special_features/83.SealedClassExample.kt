sealed class Result
data class Success(val data: String) : Result()
data class Error(val message: String) : Result()

fun fetchData(success: Boolean): Result {
    return if (success) {
        Success("Data fetched successfully!")
    } else {
        Error("Failed to fetch data")
    }
}

fun main() {
    val result = fetchData(true)
    when (result) {
        is Success -> println(result.data)
        is Error -> println(result.message)
    }
}
