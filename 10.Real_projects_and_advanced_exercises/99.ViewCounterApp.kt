class Article(val title: String, var views: Int)

fun main() {
    val article = Article("How to use Kotlin", 0)

    article.views += 1
    article.views += 5
    println("The article '${article.title}' has ${article.views} views.")
}
