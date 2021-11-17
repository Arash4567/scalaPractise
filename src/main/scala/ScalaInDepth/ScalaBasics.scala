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
  /*println("Hello Scala!")
  println("Hello\nScala!")
  println("Hello\tScala!")
  println("Hello\bScala!")
  println("Hello \"Scala\" world!")
  println("Hello \'Scala\' world!")
  println("https:\\\\www.scala-lang.org")*/
  /*
  * var -> Variable
  * val -> Constanta*/
  var a: Int = 5
  a += 5
  val b: Int = 5
  //  b += 5
  // val --> Can not reassignment to a value
  /*Function Or Method*/
  /*
   method name      parameter    returned type
        |               |          |
  def calc(start: Int, now: Int): Int = {
    val age = start - now
    age //<-- return value
  }
  age(12, 34)
      |   |
   arguments
  */

  /*------------------------------|Class & Objects|------------------------------*/
  // Class => { Collection of variables and methods }
  // Object => { Instance of Class } //Instance -> namuna, misol, example
  class Car {
    var topClassExtraCost = 0
    var roadTax = 100
    private val roadTaxA = 100
    protected var model = "bugatti"

    def cost(basicCost: Int): Int = basicCost + topClassExtraCost + roadTax + roadTaxA
//
//    def checkTax(): Int = {
//      roadTax
//    }
    def checkTax: Int = roadTax
  }

  val bmw = new Car
  println(bmw.topClassExtraCost)
  println(bmw.roadTax)
  bmw.roadTax = 200
  println(bmw.roadTax)
  println(bmw.cost(12))

  val nissan = new Car
  println(nissan.roadTax)
  // Not access model variable because this variable is protected
  //  println(nissan.model)

  // Protected variable using in subclass
  class smallCar extends Car {
    //    Private variable using only main Class do not use subclass
    //    println(roadTaxA)
    println(model)
  }
  println(s"Road Tax: ${nissan.checkTax}")
  val result = nissan.cost(150)
  println("Total cost of Road Tax: " + result)

}
