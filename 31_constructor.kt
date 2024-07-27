fun main() {
    val Human = per("KSC", 25)
    println(
            Human.message +
                    Human.firstName +
                    " Welcome , Your Age is-" +
                    Human.age
    )
}

class per(val firstName: String, var age: Int) {
    var message: String = "Hey!!!"
    constructor(name: String, age: Int, message: String) : this(name, age) {
        this.message = message
    }
    init {
        println("this is init")
    }
}
