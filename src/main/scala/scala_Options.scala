/*Options (Some or None)*/
object scala_Options {
  val list = List(1, 2, 3)
  val map = Map(1 -> "Tom", 2 -> "Jack", 3 -> "Mark")
  val opt: Option[Int] = None;
  val opt2: Option[Int] = Some(45);
  def main(args: Array[String]): Unit = {
    println(list.find(_ > 6))
    println(list.find(_ > 2))
    println(list.find(_ > 2).get)
    println(map.getOrElse(1, "No name found"))
    println(opt.isEmpty)
    println(opt2.isEmpty)
  }
}
