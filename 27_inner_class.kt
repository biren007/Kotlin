

fun main() {
    val demo = parent().Nested().foo() // calling nested class method
    print(demo)
}

class parent {
    private val welcomeMessage = "Welcome to The Kamani Science College"
    inner class Nested {
        fun foo() = welcomeMessage
    }
}
