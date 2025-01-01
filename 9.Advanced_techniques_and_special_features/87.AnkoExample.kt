import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            button("Click me") {
                setOnClickListener { toast("Button clicked!") }
            }
        }
    }
}
