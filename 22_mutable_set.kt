fun main() {
    val mset = mutableSetOf("one", "two", "three", "four")
    println(mset)
    mset.add("five") // will add new element at last
    println(mset)
    mset.remove("one")
    println(mset)

}
