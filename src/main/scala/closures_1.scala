object closures_1 {
  /*Closures*/
  var number = 10
  val add: Int => Int = (x:Int) => {
    number = x + number
    number
  }
  def main(args: Array[String]): Unit = {
    number = 100
    println(add(30))
    println(number)
  }
}
