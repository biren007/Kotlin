private class Second {
    private val x = 13
    internal val int = 16
    internal fun display() {
        println(x)
    }
    fun show()
    {
        println(int)
    }
}
    fun main(){
        var Second = Second()
        println("calling show")
        Second.show()
        println("calling disp")

        Second.display()
    }