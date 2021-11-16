package someting

/*Sets vs Lists*/
/*1. -> Set don't use duplicate element*/
/*2. -> Set by default immutable*/
/*3. -> Set change mutable mode*/
object scala_sets {
  val aa: Set[Int] = Set(1, 24, 5, 21, 51, 31, 1) //Immutable set
  val ac: Set[Int] = Set(12, 2, 5, 19, 56, 43, 7) //Immutable set
  var ab: scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1, 24, 54, 21548, 451, 321, 1) //Immutable set

  def main(args: Array[String]): Unit = {
    println(aa)
    println(ab)
    println(aa + 15 + 48)
    println(aa(21)) //Check contains element yes or not
    println(aa.head)
    println(aa.tail)
    println(aa.isEmpty)
    println(aa ++ ac)
    println(aa.++(ac))
    println(aa.&(ac)) //intersection {Kesishma}
    println(aa.sum)
    println(aa.max)
    println(aa.min)
    aa.foreach(println)

    for (item <- aa) print(s"$item ")
  }
}
