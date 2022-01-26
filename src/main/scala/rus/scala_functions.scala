object scala_functions extends App {
// Anonymus function
(x:Int) => x * x
(x:Int, y:Int) => x + y

val kvadrat = (x:Int) => x * x
val summa = (x:Int, y:Int) => x + y

println(kvadrat(5))
println(summa(5, 4))

val kvadrat1:Int => Int = (x:Int) => x * x
val summa1:(Int, Int) => Int = (x:Int, y:Int) => x + y
// Alternative
val kvadrat2:Int => Int = (x:Int) => _ * _
val summa2:(Int, Int) => Int = (x:Int, y:Int) => _ + _

val sqr2:Int => Int = (x:Int) => _ * _
val add2 = (_:Int) + (_:Int)

// Function1 and Function2
val sqr1 = new Function1[Int, Int]{
    override def apply(v1:Int):Int = v1 * v1
}
println(sqr1(15))

val add1 = new Function2[Int, Int, Int]{
    override def apply(v1:Int, v2:Int):Int = {
        v1 + v2
    }
}
println(add1(1,2))

// Factorial (chegaralangan)
val factorial:Int => Int = 
    n => if (n <= 0) 1 else n * factorial(n - 1)

val addSqr: (Int, Int) => Int = { (x, y) => 
    val f = (a: Int) => a * a
    val x2 = f(x)
    val y2 = f(y)
    add1(x2, y2)
}
println(addSqr(3, 6))

}