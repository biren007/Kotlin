fun main() {
    println("Enter Arithmatic Operator")
    var op=readLine()
    var res=when(op)
    {
        "+"->10+10
        "-"->10-10
        "*"->10*10
        "/"->10/10
        else->"invalid operator"
    }
    println(res)
}