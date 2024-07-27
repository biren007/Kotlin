class myClass {
    private var name: String = "Kamani Science College"
    fun printMe() {
        print("You are at the best College Named-" + name)
    }
}

fun main() {
    val obj = myClass() // create obj object of myClass class
    obj.printMe()
}
