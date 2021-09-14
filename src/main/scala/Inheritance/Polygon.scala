package Inheritance

// Inheritance
class Polygon {
  def area: Double = 0.0
}

object Polygon {
  def main(args: Array[String]): Unit = {
    val poly = new Polygon
    printArea(poly)
    val rect = new Rectangle(2.5,3.5)
    printArea(rect)
    val triangle = new Triangle(2.5,3.5)
    printArea(triangle)
  }
def printArea(p: Polygon): Unit ={
    println(p.area)
  }
}