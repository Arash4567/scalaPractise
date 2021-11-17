package ScalaInDepth

object ScalaBasics extends App {
  // This is one line comment
  /* This
  * is
  * multiline
  * comment */
  /* Keywords {Reserved Words}
  * Internally used by Scala!*/
  /* \n -> Enter
  * \t -> Tab
  * \b -> Backspace
  * */
  println("Hello Scala!")
  println("Hello\nScala!")
  println("Hello\tScala!")
  println("Hello\bScala!")
  println("Hello \"Scala\" world!")
  println("Hello \'Scala\' world!")
  println("https:\\\\www.scala-lang.org")
  /*
  * var -> Variable
  * val -> Constanta*/
  var a: Int = 5
  a += 5
  val b: Int = 5
  //  b += 5
  // val --> Can not reassignment to a value

}
