package ScalaInDepth

// String - Collection of characters and numbers
object scalaString {
  def main(args: Array[String]): Unit = {
    val greeting: String = "Hello World!"
    println(greeting)
    val greetingNew = "Hello Uzbekistan!"
    println(greetingNew.length())
    println(greeting.concat(greetingNew))
    println((greeting + greetingNew).length())
    println(greeting.charAt(4))
    println(greeting.equals(greetingNew))
    println(greeting == greetingNew)
    println("".isBlank)
    println("".isEmpty)
    val name: String = "BMW"
    val price: Double = 5000.05
    val count: Int = 15
    printf("Name of Car %s, price %f and count %d", name, price, count)
    //    MultiString
    val info =
      """
        |HEllo
        |SCala
        |WOrld!
        |"""
    val info2 =
      """
        |HEllo
        |SCala
        |WOrld!
        |""".stripMargin
    val info3 =
      """
        $HEllo
        $SCala
        $WOrld!
        """.stripMargin('$')
    println(info)
  }
}
