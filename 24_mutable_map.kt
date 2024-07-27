fun main() {
  
    val mmap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(mmap)
    mmap.put("five", 5) // will add new element
    println(mmap)
    mmap.remove("three") 
    println(mmap)

    }