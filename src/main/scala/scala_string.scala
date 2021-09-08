object scala_string {
  val test1: String = "Hello "
  val test2: String = "Uzbekistan!"

  def main(args: Array[String]): Unit = {
     println(test1.length())
     println(test1.concat(test2))
     println(test1 + test2)
    /* print fString using any parameter*/
    /* %d -> for Integer number
    * %f -> for Double number
    * %s -> for String */

    // val num1 = 456
    // val num2 = 23.131
    // val result = printf("(%d -- %f -- %s)", num1, num2, test1)
    // println(result)
    // println("(%d -- %f -- %s)".format(num1, num2, test1))
  }
}
