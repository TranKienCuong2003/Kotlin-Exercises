import java.sql.Connection
import java.sql.DriverManager

fun main() {
    val url = "jdbc:mysql://localhost:3306/mydatabase"
    val username = "root"
    val password = "password"

    val connection: Connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("SELECT * FROM users")

    while (resultSet.next()) {
        println("ID: ${resultSet.getInt("id")}, Name: ${resultSet.getString("name")}")
    }

    connection.close()
}
