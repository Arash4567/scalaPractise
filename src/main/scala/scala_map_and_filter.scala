/*map and filter*/
object scala_map_and_filter {
  val list = List(1, 2, 3, 123, 1, 231, 231, 4, 4, 545, 23)
  val map = Map(1 -> "Tom", 2 -> "Jack", 3 -> "Mark")

  def main(args: Array[String]): Unit = {
    println(list.map(_ * 2))
    //    => - Rocket symbol
    println(list.map(x => x * 2))
    println(list.map(x => "hello" + x))
    println(map.map(x => "hi" + x))
    println("hello".map(_.toUpper))
    println(List(List(1, 2, 3), List(4, 5, 6, 7)).flatten)
    println(list.flatMap(x => List(x, x + 1)))
    println(list.map(x => List(x, x + 1)))
    //    filter
    println(list.filter(x => x % 2 == 0))
    println(list.filter(x => x % 2 != 0))
  }
}
