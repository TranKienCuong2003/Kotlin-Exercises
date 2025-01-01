import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

data class Person(val name: String, val age: Int)

fun main() {
    val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
    val jsonAdapter = moshi.adapter(Person::class.java)

    val person = Person("Alice", 30)
    val json = jsonAdapter.toJson(person)

    println("JSON: $json")
}
