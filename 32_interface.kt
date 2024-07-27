interface ExInterface {
    var myVar: Int // abstract property
    fun absMethod(): String // abstract method
    fun hello() {
        println("Hello there, Welcome to KSC!")
    }
}

class InterImp : ExInterface {
    override var myVar: Int = 25
    override fun absMethod() = "Happy Learning "
}

fun main() {
    val obj = InterImp()
    println("My Variable Value is = " + obj.myVar)
    print("Calling hello(): ")
    obj.hello()
    print("Message from the KSC-- ")
    println(obj.absMethod())
}
