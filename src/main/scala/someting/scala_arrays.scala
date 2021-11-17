package someting

object scala_arrays {
  val arr: Array[Int] = new Array[Int](4)
  val arr2: Array[Int] = new Array[Int](6)
  val arr3: Array[String] = new Array[String](6)
  val arr4: Array[Double] = new Array[Double](6)
  val arr5: Array[Boolean] = new Array[Boolean](6)
  val arr6: Array[Int] = Array(6, 1, 2, 132, 23, 3, 21, 32, 312)

  def main(args: Array[String]): Unit = {
    arr(0) = 15
    arr(1) = 45
    arr(2) = 5
    arr(3) = 35
    //    println(arr)
    //    for (i <- arr) println(i)
    //    arr.indices <-> 0 to (arr.length - 1)
    //    println(arr.indices) // range [0,4)
    //    for (i <- arr.indices) println(arr(i))
    //    for (j <- arr2) println(j) //Automatic fill 0 if array type Int
    //    for (j <- arr3) println(j) //Automatic fill null if array type String
    //    for (j <- arr4) println(j) //Automatic fill 0.0 if array type Double
    //    for (j <- arr5) println(j) //Automatic fill false if array type Boolean
    for (j <- arr6) print(s"$j ")
    /*Merge two array*/
    val result: Array[Int] = Array.concat(arr6, arr)
    println(result.mkString("Array(", ", ", ")"))
    for (j <- result) print(s"$j ")
  }
}
