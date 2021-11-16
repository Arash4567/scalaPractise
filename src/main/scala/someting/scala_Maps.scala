package someting

/*Maps*/
/*1. -> Contains key value pairs*/
/*2. -> The same as Python dict*/
object scala_Maps {
  val map1: Map[Int, String] = Map(201 -> "Mark", 202 -> "Tom", 203 -> "Jack")
  val map2: Map[Int, String] = Map(204 -> "Mark2", 205 -> "Tom2", 206 -> "Jack2")

  //                                |        |
  //                               key     value
  def main(args: Array[String]): Unit = {
    println(map1)
    //    Get one value in Map
    println(map1(201))
    //    Get all keys in Map
    println(map1.keys) // return Set contains Map keys
    //  Get all values in Map
    println(map1.values) // return Iterable contains Map values
    println(map1.isEmpty)
    //  Get all keys and values in Map
    map1.keys.foreach { key =>
      print(s"$key - ")
      println(s"${map1(key)}")
    }
    //    Check key have or not
    println(map1.contains(204))
    // Concatenating two Map
    println(map1 ++ map2)
    println(map1.head)
    println(map1.tail)
    println(map1.size)

  }
}
