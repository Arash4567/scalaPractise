/*Tuples*/
object scala_Tuples {
  val myTuple: (Int, Int, Double, Boolean, String) = (1, 2, 0.34, true, "hello")
  //  create new tuple
  val myTuple3: (Double, Int, String) = Tuple3(1.23, 2, "mark")

  def main(args: Array[String]): Unit = {
    println(myTuple.getClass)
    println(myTuple3.getClass)
    //    get element in Tuple
    println(myTuple._1)
    println(myTuple._2)
    println(myTuple._3)
    println(myTuple._4)
    println(myTuple._5)
//    get all value in Tuple
    myTuple.productIterator.foreach{
      i => println(i)
    }
//    Create a Tuple new way
    println(2 -> "Jack")
  }
}
