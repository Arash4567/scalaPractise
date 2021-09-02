package rus

//object hello extends App{
//  println("Hello Scala!")
//
//}
object hello {
  def main(args: Array[String]): Unit ={
    println("Hello Scala!")
  }
}
//1
//2.132
//"hello"
//true
//1 + 5 * 5
//1.+(12)

//Anonymus function
//(x: Int) => x * x
//(x: Int, y: Int) => x + y
//
//res0(4)
//res1(3,7)
//
//val sqr: Int => Int = (x: Int) => x * x
//val sqr1: Int => Int = x => x * x
//val add = (x: Int, y: Int) => x + y
//val add1: (Int, Int) => Int = _ + _
//sqr(5)
//add(4,6)
//val add2 = (_:Int) + (_:Int)
//add2(3, 6)

//sqr.isInstanceOf[Any]
//sqr.isInstanceOf[AnyRef]

//val sqr1 = new Function[Int, Int] {
//  override def apply(v1: Int) = v1 * v1
//}
//sqr1(5)
//
//val add1 = new Function2[Int, Int, Int] {
//  override def apply(v1: Int, v2: Int) = {
//    v1 + v2
//  }
//}
//add1(5, 6)
//add1.apply(4, 7)

//val factorial: Int => Int =
//  n => if (n == 0) 1 else n * factorial(n - 1)
//factorial(5)

//val addSqr: (Int, Int) => Int = { (x,y) =>
// val f = (a: Int) => a * a
// val x2 = f(x)
// val y2 = f(y)
// val add = x2 + y2
// add
//}
//addSqr(3, 5)

//val add3: (Int, Int) => Int = (a, b) => a + b
//def max(a: Int, b: Int): Int = if (a > b) a else b
//
//add3(3, 6)
//max(1, 2)

//def sumSqr(a: Int, b: Int): Int = {
//  def sqr(x: Int) = x * x
//
//  if (a + b > 100) return -1
//  sqr(a) + sqr(b)
//}
//sumSqr(2, 5)
//sumSqr(30, 80)
//
//def sumSqr2(a: Int, b: Int): Int = {
//  def sqr(x: Int) = x * x
//
//  if (a + b > 100) -1
//  else {
//    sqr(a) + sqr(b)
//  }
//}

//Check bug
//class MyInt(val value: Int) extends AnyVal {
//  override def toString: String = s"MyInt($value)"
//}
//val a = new MyInt(10)
//val b = new MyInt(20)


//class MyInt(val value: Int) extends AnyVal {
//  def minus(other: MyInt) = new MyInt(value - other.value)
//  def add(other: MyInt) = new MyInt(value + other.value)
//  def multiply(other: MyInt) = new MyInt(value * other.value)
//  def div(other: MyInt) = new MyInt(value / other.value)
//}
//
//val a = new MyInt(10)
//val b = new MyInt(10)
//val c = new MyInt(5)
//
//a div b add c

//empty list
//val a = Nil
//println(a)

//Add element right in list
//val result: List[Int] = a :+ 3 :+ 5

//Add element left in list
//12 +: result :+ 51

//val list = 1::2::3::Nil
//println(list)

//list.+:(3).+:(2)
//val result1 = "a123@@@".toList
//println(result1)

//import scala.util.Random

//val result = if (Random.nextBoolean()) 1 else 2
//get variable type
//result.getClass

//val result2 = Random.nextInt()
//for (i <- 0 to 10){
////  i -> is val
//  println(i)
//}
//
//for (i <- 0 until 10){
//  println(i)
//}
// +2 shag
//for (i <- 0 to (10, 2)){
//  println(i)
//}
//
//val a = Array(1,2,3,4,5)
//val s = Set(1,2,3,4,5)
//val l = List(1,2,3,4,5)

//for (i <- a){
//  println(i)
//}
//
//for (i <- s){
//  println(i)
//}

//for (i <- l){
//  println(i)
//}
