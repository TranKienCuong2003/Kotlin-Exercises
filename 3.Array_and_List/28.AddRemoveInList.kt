fun main() {
    val mutableList = mutableListOf(10, 20, 30)
    mutableList.add(40)
    mutableList.remove(20)
    for (item in mutableList) {
        println(item)
    }
}
