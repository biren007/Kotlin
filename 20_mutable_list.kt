fun main() {
    val theMutableList = mutableListOf("one", "two", "three", "four")
    println(theMutableList)
    theMutableList.add(0, "zero") // will add new element at 0th index
    theMutableList.add("five") // will add new element at last index
    println(theMutableList)
    theMutableList.remove("three")
    println(theMutableList)
    theMutableList.removeAt(0)
    println(theMutableList)
}
