package someting

/*Currying*/
/*Currying transforms a function that takes multiple parameters into a chain of functions,
each taking a single parameter. Curried functions are defined with multiple parameter lists*/
/*URL: https://www.tutorialspoint.com/scala/currying_functions.htm
* https://www.baeldung.com/scala/currying*/
object currying_function {
  //  Normal function
  def add(x: Int, y: Int): Int = x + y

  //  Currying function
  def add2(x: Int): Int => Int = (y: Int) => x + y

  def add3(x: Int)(y: Int): Int = x + y

  def main(args: Array[String]): Unit = {
    println(add(3, 6))
    println(add2(3)(6))
    val sum30 = add2(45)
    println(sum30(30))
    println(add3(15)(25))
    val sum40 = add3(45) _
    println(sum40(78))
  }

}
