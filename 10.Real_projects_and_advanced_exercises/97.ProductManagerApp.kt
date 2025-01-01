data class Product(val name: String, val quantity: Int, val price: Double)

fun main() {
    val products = mutableListOf(
        Product("Laptop", 10, 1000.0),
        Product("Smartphone", 20, 500.0),
        Product("Headphones", 30, 100.0)
    )

    products.forEach { product ->
        println("${product.name} - Quantity: ${product.quantity}, Price: \$${product.price}")
    }
}
