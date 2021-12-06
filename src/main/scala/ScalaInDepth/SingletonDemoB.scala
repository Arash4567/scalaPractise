package ScalaInDepth

object ObjectA {
  val a: Int = 2
  val b: Double = 2.4

  def addValue(): Double = a + b

  println(s"a = $a, b = $b")
}
object SingletonDemoB {
  def main(args: Array[String]):Unit = {
    println("Hello World!")
    println(ObjectA.a)
    println(ObjectA.b)
    println(ObjectA.addValue())
  }
}
