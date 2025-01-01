data class Product(val name: String, val price: Double)

fun main() {
    val products = listOf(
        Product("Laptop", 1000.0),
        Product("Smartphone", 500.0),
        Product("Headphones", 100.0)
    )

    products.forEach { product ->
        println("${product.name}: \$${product.price}")
    }
}
