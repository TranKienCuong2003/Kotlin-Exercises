data class Contact(val name: String, val phoneNumber: String)

fun main() {
    val contacts = mutableListOf(
        Contact("Alice", "123456789"),
        Contact("Bob", "987654321"),
        Contact("Charlie", "555555555")
    )

    contacts.forEach { contact ->
        println("Name: ${contact.name}, Phone: ${contact.phoneNumber}")
    }
}
