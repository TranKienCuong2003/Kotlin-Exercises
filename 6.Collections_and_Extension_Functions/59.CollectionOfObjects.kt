data class Student(val name: String, val age: Int)

fun main() {
    val students = listOf(
        Student("Tran Kien Cuong", 21),
        Student("Nguyen Thanh Dat", 20),
        Student("Nguyen Thi Dung", 21)
    )

    students.forEach { println("Name: ${it.name}, Age: ${it.age}") }
}
