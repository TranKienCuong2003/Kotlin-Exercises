fun countWords(text: String): Int {
    return text.split("\\s+".toRegex()).size
}

fun main() {
    val text = "Kotlin is a great language for mobile development."
    println("Word count: ${countWords(text)}")
}
