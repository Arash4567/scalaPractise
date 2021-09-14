class strict {
  val e: Int = {
    println("strict")
    89
  }
}
class lazyEval {
  lazy val l: Int ={
    println("lazy")
    45
  }
}
object lazy_evaluation {
  def method1(n: Int): Unit ={
    println("Method 1")
    println(n)
  }
  def method2(n: => Int): Unit ={
    println("Method 2")
    println(n)
  }
  def main(args: Array[String]): Unit = {
//    val x = new strict
//    val y = new lazyEval
//    println(x.e)
//    println(y.l)
    def add: (Int, Int) => Int = (a: Int, b: Int) => {
      println("Add")
      a + b
    }
    method1(add(5, 15))
    method2(add(10, 15))
  }
}
