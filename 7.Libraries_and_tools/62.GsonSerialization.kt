import com.google.gson.Gson

data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Tran Kien Cuong", 21)
    val gson = Gson()
    val json = gson.toJson(person)

    println("JSON: $json")
}
