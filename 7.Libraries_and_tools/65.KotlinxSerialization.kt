import kotlinx.serialization.*
import kotlinx.serialization.json.Json

@Serializable
data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Alice", 30)
    val jsonString = Json.encodeToString(person)
    println("JSON: $jsonString")
}
