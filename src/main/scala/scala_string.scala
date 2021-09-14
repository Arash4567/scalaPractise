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
    //    Create multiline String
    val foo =
    """This is
      a multiline
      String"""
    println(foo)

    val sss =
      """Uzbekistan
        |kelajagi
        |buyuk
        |davlat!""".stripMargin
    println(sss)
    val sss1 =
      """Uzbekistan
        #kelajagi
        #buyuk
        #davlat!""".stripMargin('#')
    println(sss1)
    val speech = """Four score and
                   |seven years ago
                   |our fathers""".stripMargin.replaceAll("\n", " ")
    println(speech)
    val s = """This is known as a
              |"multiline" string
              |or 'heredoc' syntax.""". stripMargin.replaceAll("\n", " ")
    println(s)
    val sd = "hello world".split(" ")
    println(sd.foreach(println))
  }
}
