import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement

fun main() {
    val url = "jdbc:sqlite:tasks.db"
    val conn: Connection = DriverManager.getConnection(url)
    val statement: Statement = conn.createStatement()

    statement.execute("CREATE TABLE IF NOT EXISTS tasks (id INTEGER PRIMARY KEY, task TEXT)")
    statement.execute("INSERT INTO tasks (task) VALUES ('Finish Kotlin homework')")
    val resultSet = statement.executeQuery("SELECT * FROM tasks")

    while (resultSet.next()) {
        println("Task: ${resultSet.getString("task")}")
    }

    conn.close()
}
