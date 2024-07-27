fun main() {
    var x=50
    var y=30

    //arithmatics operators
    println("\n---Arithmetic operators---\n")
    println("sum :"+ (x+y))
    println("sub :"+ (x-y))
    println("mul :"+ (x*y))
    println("div :"+ (x/y))
    println("mod :"+ (x%y))
    
    //relational operators
    println("\n---relational operators---\n")
    println("x > y :"+ (x>y))
    println("x < y :"+ (x<y))
    println("x >= y :"+ (x>=y))
    println("x <= y :"+ (x<=y))
    println("x == y :"+ (x==y))
    println("x != y :"+ (x!=y))

    //assignment operators
    println("\n---assignment operators---\n")
    x=10
    println("= :"+x)
    x+=10
    println("+= :"+x)
    x-=10
    println("-= :"+x)
    x*=10
    println("*= :"+x)
    x/=10
    println("/= :"+x)
    x%=10
    println("%= :"+x)

    //unary operators
    println("\n---unary operators---\n")
    x=20
    println("+ :"+ +x)
    println("- :"+ -x)
    println("++ :"+ ++x)
    println("-- :"+ --x)
    
    //logical operators
    println("\n---logical operators---\n")
    x=10
    y=20
    println("x>10 && y<10 :"+( x>10 && y>10))
    println("x>10 || y<10 :"+( x>10 || y>10))
    var bool=true
    println("bool :"+(!bool))

}