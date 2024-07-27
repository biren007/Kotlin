fun main() {
    val demo = Outer.Nested().foo() // calling nested class method
    print(demo)
}

class Outer {
    class Nested {
        fun foo() = "Welcome to The Kamani Science College"
    }
}
