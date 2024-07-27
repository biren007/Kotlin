class A {
    public val int = 10
    fun display() {
        println(int) // we can access int in the same class
        println("Accessing int successful")
    }
}

fun main() {
    var a = A()
    a.display() // can not access 'int': it is private in class A
    println(a.int)
}
