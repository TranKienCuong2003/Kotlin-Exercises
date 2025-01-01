fun main() {
    val immutableList = listOf(1, 2, 3)
    val mutableList = mutableListOf(4, 5, 6)

    println("Immutable list: $immutableList")
    println("Mutable list before modification: $mutableList")

    mutableList.add(7)
    println("Mutable list after modification: $mutableList")
}
