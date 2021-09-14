package scala_trait

// Inheritance
class Triangle2(var width: Double, var height: Double) extends Polygon2 with Shape {
  override def area: Double = width * height / 2

  override def color: String = "green"
}
