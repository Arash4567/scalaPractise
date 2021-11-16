package someting.abstract_class

abstract class Polygon1 {
  def area: Double
}

object Polygon1 {
  def main(args: Array[String]): Unit = {
    val rect = new Rectangle1(2.5,3.5)
    printArea(rect)
    val triangle = new Triangle1(2.5,3.5)
    printArea(triangle)
  }
def printArea(p: Polygon1): Unit ={
    println(p.area)
  }
}