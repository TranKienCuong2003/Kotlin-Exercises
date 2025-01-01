class Student(val id: Int, val name: String, val age: Int) {
    fun displayInfo() {
        println("Ma sinh vien: $id, Ten: $name, Tuoi: $age")
    }
}

fun main() {
    val student1 = Student(1, "Tran Kien Cuong", 21)
    val student2 = Student(2, "Nguyen Thanh Dat", 20)

    student1.displayInfo()
    student2.displayInfo()
}
