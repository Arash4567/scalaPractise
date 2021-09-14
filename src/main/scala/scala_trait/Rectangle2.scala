package scala_trait

class Rectangle2(var width: Double, var height: Double)
  extends Polygon2 with Shape {
  override def area: Double = width * height

  def color: String = "red"
}
