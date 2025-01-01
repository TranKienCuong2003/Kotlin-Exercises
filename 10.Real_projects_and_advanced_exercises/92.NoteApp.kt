data class Note(val title: String, val content: String)

fun main() {
    val notes = mutableListOf(
        Note("Shopping List", "Milk, Bread, Eggs"),
        Note("Meeting Notes", "Discuss project roadmap")
    )

    notes.forEach { note ->
        println("Title: ${note.title}, Content: ${note.content}")
    }
}
