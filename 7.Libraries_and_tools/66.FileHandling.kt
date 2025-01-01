import java.io.File

fun main() {
    val file = File("example.txt")
    file.writeText("Hello, Kotlin!")

    val content = file.readText()
    println("File content: $content")
}
