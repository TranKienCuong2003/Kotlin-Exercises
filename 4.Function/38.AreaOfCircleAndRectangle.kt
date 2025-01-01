fun main() {
    fun areaOfCircle(radius: Double): Double {
        return Math.PI * radius * radius
    }
    fun areaOfRectangle(length: Double, width: Double): Double {
        return length * width
    }

    val circleArea = areaOfCircle(5.0)
    val rectangleArea = areaOfRectangle(4.0, 6.0)

    println("Dien tich hinh tron: $circleArea")
    println("Dien tich hinh chu nhat: $rectangleArea")
}
