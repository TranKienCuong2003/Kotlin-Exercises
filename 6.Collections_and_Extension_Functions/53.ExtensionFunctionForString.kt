fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun main() {
    val word = "madam"
    println(word.isPalindrome())
}
