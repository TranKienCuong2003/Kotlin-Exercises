class HtmlBuilder {
    private val content = StringBuilder()

    fun html(init: HtmlBuilder.() -> Unit) {
        content.append("<html>")
        this.init()
        content.append("</html>")
    }

    fun body(init: HtmlBuilder.() -> Unit) {
        content.append("<body>")
        this.init()
        content.append("</body>")
    }

    fun h1(text: String) {
        content.append("<h1>$text</h1>")
    }

    fun getHtml(): String = content.toString()
}

fun main() {
    val html = HtmlBuilder().apply {
        html {
            body {
                h1("Hello, Kotlin DSL!")
            }
        }
    }
    println(html.getHtml())
}
