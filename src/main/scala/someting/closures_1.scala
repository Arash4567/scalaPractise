package someting

object closures_1 {
  /*Closures*/

  /*A closure is a function, whose return value depends on the value
  of one or more variables declared outside this function.
  [The free variables are defined outside of the Closure Function and is not included as a parameter
  of this function. So the difference between a closure function and a normal function
  is the free variable. A free variable is any kind of variable which is not defined within the
  function and not passed as the parameter of the function. A free variable is not bound to a
  function with a valid value. The function does not contain any values for the free variable.]*/

  /*Closure - bu funktsiya, uning qaytaradigan  qiymati bu funktsiyadan tashqarida e'lon qilingan
  bir yoki bir nechta o'zgaruvchilar qiymatiga bog'liq.*/

  /*URL: https://www.tutorialspoint.com/scala/scala_closures.htm*/

  var number = 10
  val add: Int => Int = (x: Int) => {
    number = x + number
    number
  }

  class Cafe(val serviceCharge: Double) {
    val finalBill: Double => Double = (netBill: Double) => netBill * (1 + serviceCharge / 100)
  }

  def main(args: Array[String]): Unit = {
    number = 100
    println(add(30))
    println(number)
    val cityCafe = new Cafe(15)
    val bookCafe = new Cafe(20)
    println(cityCafe.finalBill(10))
    println(bookCafe.finalBill(45))
  }
}
