/*Options (Some or None)*/
object scala_Options {
  val list = List(1, 2, 3)
  val map = Map(1 -> "Tom", 2 -> "Jack", 3 -> "Mark")

  def main(args: Array[String]): Unit = {
    println(list.find(_ > 6))
    println(list.find(_ > 2))
  }
}
