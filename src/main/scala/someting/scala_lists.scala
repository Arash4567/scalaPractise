package someting

/*Arrays vs Lists*/
/* 1. Array is mutable */
/* 2. List is immutable */
/* Immutable - means don't change one assigned value */
object scala_lists {
  val item: List[Int] = List(1, 2, 3, 23, 2, 423, 3)
  val itemClone: List[Int] = List(1, 231, 32, 23, 21, 423, 3)
  val item2: List[String] = List("423", "hello", "tom", "mark")
  val item3: List[Boolean] = List(true, false, true, true)
  val item4: List[Double] = List(1.2123, 2.1556, 3.6)
  val item5: List[Any] = List(1.2123, 56, true, "Bye!")
  val item6: List[String] = "Jan" :: "Feb" :: "Mar" :: Nil

  //  Creating empty List
  val emptyList: List[Nothing] = Nil

  //  Creating Number List
  val numList: List[Int] = List.range(1, 11)
  val numList2: List[Int] = List.range(1, 11, 3)

  def main(args: Array[String]): Unit = {
    val result = 111 :: item
    println(result)
    println(item)
    println(item.size)
    println(item.length)
    println(item.head)
    println(item.tail)
    println(item.isEmpty)
    println(item.max)
    println(item.min)
    println(item.contains(1))
    println(item.reverse)
    println(item.sorted)
    println(item.sum)
    println(item.intersect(itemClone))
    val item5 = List.fill(5)(3)
    //                    |  |
    //               repeat argument
    println(item5)
    var yig: Int = 0
    item.foreach(yig += _)
    println(yig)
    println(item6)
    println(emptyList)
    println(numList)
    println(numList2)
    println(item6.zipWithIndex)
    println(item6.zip(numList2))
  }
}
