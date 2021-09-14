/*Reduce, fold and scan (Right/Left)*/
object reduce_fold_and_scan {
  val lst = List(1, 2, 45, 254, 651, 7)
  val lst2 = List("A", "B", "C", "D")

  def main(args: Array[String]): Unit = {
    //    reduce
    println(lst.reduceLeft(_ + _))
    println(lst.reduceLeft((x, y) => {
      println(x + "," + y)
      x + y
    }))
    println(lst.reduceRight(_ + _))
    println(lst.reduceRight((x, y) => {
      println(x + "," + y)
      x + y
    }))
    println(lst2.reduceLeft(_ + _))
    //    fold
    println(lst.foldLeft(0)(_ + _))
    println(lst.foldLeft(100)(_ + _))
    println(lst2.foldLeft("")(_ + _))
    println(lst.foldLeft("z")(_ + _))
    //    scan
    println(lst.scanLeft(100)(_ + _))
    println(lst2.scanLeft("z")(_ + _))

  }
}
