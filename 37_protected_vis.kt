open class parentc {
    // protected variable
    protected val int = 10
}

class childc : parentc() { // derived class
    fun getvalue(): Int {
        return int // accessed from the subclass
    }
}

fun main() {
    var a = childc()
    println("The value of integer is: " + a.getvalue())
}
