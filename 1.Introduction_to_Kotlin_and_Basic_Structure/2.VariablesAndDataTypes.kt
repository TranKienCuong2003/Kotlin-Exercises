fun main() {
    var mutableVariable: Int = 10
    println("Gia tri ban dau cua mutableVariable: $mutableVariable")
    mutableVariable = 20
    println("Gia tri sau khi thay doi cua mutableVariable: $mutableVariable")

    val immutableVariable: String = "Kotlin"
    println("Gia tri cua immutableVariable: $immutableVariable")

    val intVar: Int = 123
    val doubleVar: Double = 3.14
    val charVar: Char = 'A'
    val booleanVar: Boolean = true
    val stringVar: String = "Hello Kotlin"

    println("So nguyen: $intVar")
    println("So thuc: $doubleVar")
    println("Ky tu: $charVar")
    println("Boolean: $booleanVar")
    println("Chuoi: $stringVar")

    val inferredTypeVariable = 42
    println("Bien suy luan kieu: $inferredTypeVariable")
}
