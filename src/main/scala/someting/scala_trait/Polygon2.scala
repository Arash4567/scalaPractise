package someting.scala_trait

trait Shape {
  def color: String
}

abstract class Polygon2 {
  def area: Double
}

object Polygon2 {
  def main(args: Array[String]): Unit = {
    val rect = new Rectangle2(2.5, 3.5)
    printArea(rect)
    println(rect.color)
    val triangle = new Triangle2(2.5, 3.5)
    printArea(triangle)
    println(triangle.color)
  }

  def printArea(p: Polygon2): Unit = {
    println(p.area)
  }
}