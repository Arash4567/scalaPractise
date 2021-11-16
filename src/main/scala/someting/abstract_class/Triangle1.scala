package someting.abstract_class

// someting.Inheritance
class Triangle1(var width: Double, var height: Double) extends Polygon1 {
  override def area: Double = width * height / 2
}
