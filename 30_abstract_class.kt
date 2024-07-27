abstract class Person() {
    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }
    abstract fun displayJob(description: String)
}

class Teacher : Person() {
    override fun displayJob(description: String) {
        println(description)
    }
    fun displayName(name: String) {
        println("My name is $name.")
    }
}

fun main() {
    val str = Teacher()
    str.displayName("unknown")
    str.displayJob("I work at KSC.")
    str.displaySSN(123)
}
