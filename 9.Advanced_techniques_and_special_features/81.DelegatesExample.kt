import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("Unknown") { prop, old, new ->
        println("Name changed from $old to $new")
    }
}

fun main() {
    val user = User()
    user.name = "Alice"
    user.name = "Bob"
}
