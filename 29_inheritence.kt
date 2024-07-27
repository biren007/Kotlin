open class ParentClass {
    fun think() {
        print("Parent Class is thinking")
    }
}

class ChildClass : ParentClass() {}

fun main() {
    var a = ChildClass()
    a.think()
}
