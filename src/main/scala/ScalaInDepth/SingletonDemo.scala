package ScalaInDepth

class ClassA {
  val a: Int = 2
  val b: Double = 2.4

  def addValue(): Double = a + b

  println(s"a = $a, b = $b")
}
object SingletonDemo {
  def main(args: Array[String]):Unit = {
    println("Hello World!")
    val demoA = new ClassA
    println(demoA.a)
    println(demoA.b)
    println(demoA.addValue())
  }
}
