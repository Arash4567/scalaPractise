import scala.io.StdIn._
// import java.util.Date
import java.lang.String

object scalaTutorials {
  // object Math {
  //   def divide(x: Int, y: Int) = x / y
  //   def **(x: Int) = x * x
  // }
  // def add(x: Int, y: Int): Int = {
  //   return x + y
  // }
  // def log(date: Date, message: String) {
  //   println(date + " " + message)
  // }
  def main(args: Array[String]) {
    // var x = 0
    // while (x < 10) {
    //   x += 1
    //   println(x)
    // }
    // for (i <- 1 to 5){
    //     println(i)
    // }
    // for (i <- 1 until 5){
    //     println(i)
    // }
    // for (i<- 1.to(5)){
    //     println(i)
    // }
    // for (i <- 1 to 9; j <- 1 to 9){
    //     if (i == j) println(i,j)
    // }
    // var lst = List(1, 5, 6, 232, 8, 6487, 9)
    // for (i <- lst) {
    //   println(i)
    // }
    // for (i <- lst; if i < 6) {
    //   println(i)
    // }
    // val result = for (i <- lst; if i < 6) yield {
    //   i * i * i
    // }
    // println(result)
    // var age = 12
    // age match {
    //   case 12 => println("yes")
    //   case 13 => println("no")

    //   case _ => println("default")
    // }
    // val result = age match {
    //   case 12 => "yes"
    //   case 13 => "no"

    //   case _ => "default"
    // }
    // println(result)
    // val num = 7
    // num match {
    //   case 1|3|5|7|9 => println("odd")
    //   case 2|4|6|8 => println("even")
    // }
    // println(add(2, 4))
    // println(Math.divide(4, 2))
    // println(Math.**(5))

    /*Anonymus function*/
    // var add = (x: Int, y: Int) => x+y
    // println(add(100,500))
    // val sum = (a: Int, b: Int, c: Int) => a + b + c
    // var j = sum(45, 32, _: Int)
    // println(j(12))
    // val date = new Date
    // val newLog= log(date, _:String)
    // newLog("Uzbekistan")

    /*Sting*/
    val str1 = "Hello Scala"
    // val str2 = " World!"
    // val num1 = 456
    // val num2 = 321323.13123
    // println(str1.length())
    // println(str1.concat(str2))
    // println(str1 + str2)
    
    // val result = printf("(%d -- %f -- %s)", num1, num2, str1)
    // println(result)
    // println("(%d -- %f -- %s)".format(num1, num2, str1))

    // println(str1.hashCode())
    println(str1.charAt(0))

  }
}
