// open class Phone() {
//     var color = "Rose Gold"
//     fun displayCompany(name: String) {
//         println("Company is: $name")
//     }
// }
// // derived class
// class iphone : Phone() {
//     fun displayColor() {
//         // calling the base class property color
//         println("Color is: " + super.color)
//         // calling the base class member function
//         super.displayCompany("Apple")
//     }
// }

// fun main() {
//     val p = iphone()
//     p.displayColor()
// }


//this

class Counter {
    var count = 0
    fun incrementCount() {
        this.count += 2
    }
}

fun main() {
    var c: Counter = Counter()
    var count = 50
    c.incrementCount()
    println("count in main " + count)
    println("count in counter " + c.count)
}
