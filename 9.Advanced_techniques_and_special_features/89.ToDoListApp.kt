data class Task(val name: String, val completed: Boolean)

fun main() {
    val tasks = mutableListOf<Task>(
        Task("Buy groceries", false),
        Task("Clean the house", true),
        Task("Finish Kotlin homework", false)
    )

    tasks.forEach { task ->
        println("${task.name} - ${if (task.completed) "Completed" else "Pending"}")
    }
}
